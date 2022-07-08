from flask import Blueprint, request

from exception.registration import RegistrationError
from model.user import User
from services.user_service import UserService

uc = Blueprint("user_controller", __name__)
user_service = UserService()


@uc.route('/users', methods=['POST'])
def add_user():
    request_body_dict = request.get_json()

    username = request_body_dict.get('username')
    password = request_body_dict.get('password')
    first_name = request_body_dict.get('first_name')
    last_name = request_body_dict.get('last_name')
    gender = request_body_dict.get('gender')
    phone_number = request_body_dict.get('phone_number')
    email_address = request_body_dict.get('email_address')

    try:
        added_user = user_service.add_user(User(username, password, first_name, last_name, gender, phone_number,
                                                email_address))
    except RegistrationError as e:
        return {
            "messages": e.messages
        }

    return added_user, 201
