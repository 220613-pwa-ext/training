from flask import Blueprint, request
from model.user import User
from service.user_service import UserService
from exception.invalid_parameter import InvalidParameterError

uc = Blueprint('user_controller', __name__)
user_service = UserService()


@uc.route('/users')
def get_all_users():
    return {
        "users": user_service.get_all_users()  # a list of dictionaries
    }


@uc.route('/users/<username>')
def get_user_by_username(username):
    try:
        return user_service.get_user_by_username(username)  # dictionary
    except KeyError as e:
        return {
            "message": f"User with username {username} was not found!"
        }, 404


@uc.route('/users', methods=['POST'])
def add_user():
    user_json_dictionary = request.get_json()
    user_object = User(user_json_dictionary['username'], user_json_dictionary['mobile_phone'])
    try:
        return user_service.add_user(user_object), 201  # Dictionary representation of the newly added user
        # 201 created
    except InvalidParameterError as e:
        return {
            "message": str(e)
        }, 400


@uc.route('/users/<username>', methods=['PUT'])
def edit_user_by_username(username):
    user_json_dictionary = request.get_json()
    user_object = User(user_json_dictionary['username'], user_json_dictionary['mobile_phone'])
    return user_service.edit_user_by_username(username, user_object)
