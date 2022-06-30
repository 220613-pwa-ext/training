class Todo:
    def __init__(self, t_id, description, completed, user_id):
        self.id = t_id
        self.description = description
        self.completed = completed
        self.user_id = user_id

    def to_dict(self):
        return {
            "id": self.id,
            "description": self.description,
            "completed": self.completed,
            "user_id": self.user_id
        }
