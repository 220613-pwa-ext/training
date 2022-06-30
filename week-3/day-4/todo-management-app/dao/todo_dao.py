import psycopg
from model.todo import Todo


class TodoDao:

    def get_all_todos_by_user_id(self, user_id):
        with psycopg.connect(host="127.0.0.1", port="5432", dbname="postgres", user="postgres",
                             password="password") as conn:

            with conn.cursor() as cur:
                cur.execute("SELECT * FROM todos WHERE user_id = %s", (user_id,))

                todo_list = []

                for row in cur:
                    todo_list.append(Todo(row[0], row[1], row[2], row[3]))

                return todo_list
