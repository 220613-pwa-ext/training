import re

from dao.user_dao import UserDao
from exception.registration import RegistrationError


class UserService:
    def __init__(self):
        self.user_dao = UserDao()

    def add_user(self, user_obj):

        # At the end, check if the messages property (list of strings) belonging to the RegistrationError instance
        # has any messages (len > 0) and raise if it does
        registration_error = RegistrationError()

        # Username validation
        if not user_obj.username.isalnum():
            registration_error.messages.append("Username must only contain alphanumeric characters")

        if len(user_obj.username) < 6 or len(user_obj.username) > 20:
            registration_error.messages.append("Username must be between 6 and 20 characters in length inclusive")

        if self.user_dao.get_user_by_username(user_obj.username) is not None:
            registration_error.messages.append("Username is already taken")

        # Password validation
        alphabetical_characters = "abcdefghijklmnopqrstuvwxyz"
        special_characters = "!@#$%^&*"
        numeric_characters = "0123456789"

        lower_alpha_count = 0
        upper_alpha_count = 0
        special_character_count = 0
        numeric_character_count = 0
        for char in user_obj.password:
            if char in alphabetical_characters:
                lower_alpha_count += 1

            if char in alphabetical_characters.upper():
                upper_alpha_count += 1

            if char in special_characters:
                special_character_count += 1

            if char in numeric_characters:
                numeric_character_count += 1

        if lower_alpha_count == 0:
            registration_error.messages.append("Password must have at least 1 lowercase character")

        if upper_alpha_count == 0:
            registration_error.messages.append("Password must have at least 1 uppercase character")

        if special_character_count == 0:
            registration_error.messages.append("Password must have at least 1 special (!@#$%^&*) character")

        if numeric_character_count == 0:
            registration_error.messages.append("Password must have at least 1 numeric character")

        if len(user_obj.password) < 6 or len(user_obj.password) > 20:
            registration_error.messages.append("Password must be between 6 and 20 characters in length inclusive")

        if len(user_obj.password) != lower_alpha_count + upper_alpha_count + special_character_count + numeric_character_count:
            registration_error.messages.append("Password must contain only alphanumeric and special characters")

        # First Name validation
        if not user_obj.first_name.isalpha():
            registration_error.messages.append("First name must contain only alphabetical characters")

        if len(user_obj.first_name) < 2 or len(user_obj.first_name) > 100:
            registration_error.messages.append("Length of first name must be between 2 and 100 characters inclusive")

        # Last Name validation
        if not user_obj.last_name.isalpha():
            registration_error.messages.append("Last name must contain only alphabetical characters")

        if len(user_obj.last_name) < 2 or len(user_obj.last_name) > 100:
            registration_error.messages.append("Length of last name must be between 2 and 100 characters inclusive")

        # Gender validation
        if not (user_obj.gender == "male" or user_obj.gender == "female" or user_obj.gender == "other"):
            registration_error.messages.append("Gender must be male, female, or other")

        # Phone number validation
        if not re.fullmatch("\d{3}-\d{3}-\d{4}", user_obj.phone_number):
            registration_error.messages.append("Phone number must match the format XXX-XXX-XXXX")

        # Email address validation
        if not re.fullmatch(r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Z|a-z]{2,}\b', user_obj.email_address):
            registration_error.messages.append("Email address must match format username@domain")

        if self.user_dao.get_user_by_email(user_obj.email_address) is not None:
            registration_error.messages.append("Email address is already taken")

        # If error messages exist in the exception object, raise the exception
        if len(registration_error.messages) > 0:
            raise registration_error  # Raise will immediately terminate the currently executing function
            # and pass the exception back to the function that called this function

        added_user_obj = self.user_dao.add_user(user_obj)

        return added_user_obj.to_dict()
