from dao.todo_dao import TodoDao
from dao.user_dao import UserDao
from exception.user_not_found import UserNotFoundError


class TodoService:

    def __init__(self):
        # In TodoService, we are actually utilizing two daos
        self.todo_dao = TodoDao()
        self.user_dao = UserDao()


    def get_all_todos_by_user_id(self, user_id):
        # Check if user actually exists
        if self.user_dao.get_user_by_id(user_id) is None:
            raise UserNotFoundError(f"User with id {user_id} was not found")

        return list(map(lambda a: a.to_dict(), self.todo_dao.get_all_todos_by_user_id(user_id)))
