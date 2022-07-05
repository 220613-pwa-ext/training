from flask import Blueprint

from exception.user_not_found import UserNotFoundError
from service.todo_service import TodoService

tc = Blueprint('todo_controller', __name__)

# GET /users/<user_id>/todos: Get all todos for a particular user
# GET /users/<user_id/todos/<todo_id>: Get a particular to-do that belongs to a particular user
# POST /users/<user_id/todos: Add a to-do for a particular user
# PUT /users/<user_id>/todos/<todo_id>: Edit a particular to-do that belongs to a particular user
# DELETE /users/<user_id>/todos/<todo_id>: Delete a particular to-do that belongs to a particular user

todo_service = TodoService()

@tc.route('/users/<user_id>/todos')
def get_all_todos_by_user_id(user_id):
    try:
        return {
            "todos": todo_service.get_all_todos_by_user_id(user_id)
        }
    except UserNotFoundError as e:
        return {
            "message": str(e)
        }, 404


@tc.route('/users/<user_id>/todos/<todo_id>')
def get_todo_by_user_id_and_todo_id(user_id, todo_id):
    pass


@tc.route('/users/<user_id>/todos', methods=['POST'])
def add_todo_for_user_by_user_id(user_id):
    pass


@tc.route('/users/<user_id>/todos/<todo_id>', methods=['PUT'])
def edit_todo_by_user_id_and_todo_id(user_id, todo_id):
    pass


@tc.route('/users/<user_id>/todos/<todo_id>', methods=['DELETE'])
def delete_todo_by_user_id_and_todo_id(user_id, todo_id):
    pass
