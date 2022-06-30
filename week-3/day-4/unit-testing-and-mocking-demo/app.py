import psycopg

def a():
    print("Function a() invoked!!!!")
    return b() + 100  # Function a depends on function b


def b():
    print("Function b() invoked!!!!")
    return 10000


class UserDao:

    # Pretend this is calling the database itself
    def get_all_users(self):
        print("TESTING123123123123123")

        with psycopg.connect(host="127.0.0.1", port="5433", dbname="postgres", user="postgres", password="password") as conn:
            with conn.cursor() as cur:
                cur.execute("SELECT * FROM users")

                user_data = []
                for row in cur:
                    user_data.append(row)

                return user_data


def c():
    user_dao = UserDao()
    return user_dao.get_all_users()  # user_dao.get_all_users() is a dependency that we want to mock
    # We only want to unit test the c() function


if __name__ == '__main__':
    print(c())
