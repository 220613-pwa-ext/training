from model.user import User
# Right now, we don't have a database to connect to
# So we will store data inside of a collection
users = {
    "bachy21": User("bachy21", "512-826-0001"),
    "jane12345": User("jane12345", "512-826-0002")
}


class UserDao:
    # CRUD operations
    # Create - insert a new user into our "database"
    # Read - Retrieve a user or users from our "database"
    # Update - Update a user in our "database"
    # Delete - Delete a user in our "database"
    def get_user_by_username(self, username):
        return users[username]  # Returns a user object

    def get_all_users(self):
        user_values = []
        for value in users.values():
            user_values.append(value)

        return user_values  # Returns a list of user objects

    def add_user(self, user_object):  # user will represent a User object
        users[user_object.username] = user_object

        return user_object

    def edit_user_by_username(self, username, new_user_info_object):  # new_user_info will be a User object
        if username == new_user_info_object.username:  # If we are not updating the username, just replace the rest of the info
            users[username] = new_user_info_object
        else:  # Otherwise, delete the original key-value pair and create new key-value pair
            del users[username]
            users[new_user_info_object.username] = new_user_info_object

        return new_user_info_object
