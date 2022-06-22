class Person:

    # Constructor used to populate values when an object is being created
    def __init__(self, fn, ln, a):
        self.__first_name = fn  # __ is used to signify that an attribute is private
        # private means that the attribute cannot be access directly outside of the class
        self.__last_name = ln
        self.__age = a
        self.__fullname = f"{self.__first_name} {self.__last_name}"

    # This dunder method will replace the original string representation when printing out the object
    # The default behavior is <person.Person object at <memory address>>
    def __str__(self):
        return f"Person object [first_name = {self.__first_name}, last_name = {self.__last_name}, age = {self.__age}]"

    # The length of a person object is defined as the len of their full name
    def __len__(self):
        return len(self.__fullname)

    def __contains__(self, name):
        if name in self.__fullname:
            return True

        return False

    def say_hi(self):
        print(f"Hi, my name is {self.__first_name} {self.__last_name} and my age is {self.__age}")

    # Getters
    def get_first_name(self):
        return self.__first_name

    def get_last_name(self):
        return self.__last_name

    def get_age(self):
        return self.__age

    def get_fullname(self):
        return self.__fullname

    # Setters
    def set_first_name(self, first_name):
        self.__first_name = first_name
        self.__fullname = f"{self.__first_name} {self.__last_name}"

    def set_last_name(self, last_name):
        self.__last_name = last_name
        self.__fullname = f"{self.__first_name} {self.__last_name}"

    def set_age(self, age):
        self.__age = age
