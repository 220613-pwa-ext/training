class Person:

    # Constructor used to populate values when an object is being created
    def __init__(self, first_name, last_name, age):
        self.__first_name = first_name  # __ is used to signify that an attribute is private
        # private means that the attribute cannot be access directly outside of the class
        self.__last_name = last_name
        self.__age = age
        self.__fullname = f"{self.__first_name} {self.__last_name}"

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
