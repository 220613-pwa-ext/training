# Right now, we don't have a database to connect to
# So we will store data inside of a collection
users = {
    "bachy21": {
        "username": "bachy21",
        "mobile_phone": "512-826-0001"
    },
    "jane12345": {
        "username": "jane12345",
        "mobile_phone": "512-826-0002"
    }
}


class UserDao:
    # CRUD operations
    # Create - insert a new user into our "database"
    # Read - Retrieve a user or users from our "database"
    # Update - Update a user in our "database"
    # Delete - Delete a user in our "database"
    def get_user_by_username(self, username):
        return users[username]

    def get_all_users(self):
        user_values = []
        for value in users.values():
            user_values.append(value)

        return user_values

    def add_user(self, user):
        users[user['username']] = user

        return user

    def edit_user_by_username(self, username, new_user_info):
        if username == new_user_info['username']:  # If we are not updating the username, just replace the rest of the info
            users[username] = new_user_info
        else:  # Otherwise, delete the original key-value pair and create new key-value pair
            del users[username]
            users[new_user_info['username']] = new_user_info

        return new_user_info
