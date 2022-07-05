from flask import Blueprint, request
from model.user import User
from service.user_service import UserService
from exception.invalid_parameter import InvalidParameterError
from exception.user_not_found import UserNotFoundError

uc = Blueprint('user_controller', __name__)

# Instantiate a UserService object
user_service = UserService()

# Get all users (READ)
# Get user by id (READ)
# Add users (CREATE)
# Delete user by id (DELETE)
# Update user by id (UPDATE)


@uc.route('/users')  # GET /users
def get_all_users():
    return {
        "users": user_service.get_all_users()  # a list of dictionaries
    }


@uc.route('/users/<user_id>')  # GET /users/<user_id>
def get_user_by_id(user_id):
    try:
        return user_service.get_user_by_id(user_id)  # dictionary
    except UserNotFoundError as e:
        return {
            "message": str(e)
        }, 404


@uc.route('/users/<user_id>', methods=['DELETE'])
def delete_user_by_id(user_id):
    try:
        user_service.delete_user_by_id(user_id)

        return {
            "message": f"User with id {user_id} deleted successfully"
        }
    except UserNotFoundError as e:
        return {
            "message": str(e)
        }, 404


@uc.route('/users/<user_id>', methods=['PUT'])
def update_user_by_id(user_id):
    try:
        json_dictionary = request.get_json()
        return user_service.update_user_by_id(User(user_id, json_dictionary['username'], json_dictionary['mobile_phone'],
                                                   json_dictionary['active']))
    except UserNotFoundError as e:

        return {
            "message": str(e)
        }, 404


@uc.route('/users', methods=['POST'])  # POST /users
def add_user():
    user_json_dictionary = request.get_json()
    user_object = User(None, user_json_dictionary['username'], user_json_dictionary['mobile_phone'], None)
    try:
        return user_service.add_user(user_object), 201  # Dictionary representation of the newly added user
        # 201 created
    except InvalidParameterError as e:
        return {
            "message": str(e)
        }, 400
