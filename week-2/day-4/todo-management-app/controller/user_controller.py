from flask import Blueprint, request
from dao.user_dao import UserDao

uc = Blueprint('user_controller', __name__)
user_dao = UserDao()


@uc.route('/users')
def get_all_users():
    return {
        "users": user_dao.get_all_users()  # This method returns a list of dictionaries containing each
        # users' information
    }


@uc.route('/users/<username>')
def get_user_by_username(username):
    return user_dao.get_user_by_username(username)  # This method returns a dictionary containing a single
    # user's information


@uc.route('/users', methods=['POST'])
def add_user():
    user_json_dictionary = request.get_json()
    return user_dao.add_user(user_json_dictionary)


@uc.route('/users/<username>', methods=['PUT'])
def edit_user_by_username(username):
    user_json_dictionary = request.get_json()
    return user_dao.edit_user_by_username(username, user_json_dictionary)
