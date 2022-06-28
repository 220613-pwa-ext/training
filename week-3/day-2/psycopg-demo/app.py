import psycopg

# Make sure you're using the password for your database whenever you installed Postgres onto your machine
conn = psycopg.connect(host="localhost", port="5432", dbname="postgres", user="postgres", password="password")

cur = conn.cursor()  # Retrieve a cursor object from our connection object
# Cursor objects allow us to send queries to the Postgres database

cur.execute("SELECT * FROM users")  # Send query to the database

# (1, 'bachy21', '512-826-0001', True) <- tuple
# (2, 'jane_doe', '512-826-0002', True) <- tuple
# (3, 'bob123', '512-826-0003', False) <- tuple

# print(cur.fetchone())  # (1, 'bachy21', '512-826-0001', True) <- tuple
# print(cur.fetchone())  # (2, 'jane_doe', '512-826-0002', True) <- tuple
# print(cur.fetchone())  # (3, 'bob123', '512-826-0003', False) <- tuple

my_users = cur.fetchall()  # This will return a list of tuples
print(my_users)

# You can also directly iterate over the cursor as well to retrieve the records from a query
# for record in cur:
#     print(record[1])  # Username

# %s serves as a placeholder for values you would like to utilize inside of your query
# We create a query "template" and then provide values for each of those %s placeholders as a second argument
# in the .execute() method
sql_query_template = "INSERT INTO users (username, mobile_phone) VALUES (%s, %s) RETURNING id"
cur.execute(sql_query_template, ('testing123', '512-826-0008'))
print(f"The id of the users record we just inserted is: {cur.fetchone()[0]}")

cur.close()

conn.commit()  # Notice we commit using the connection object and not the cursor object
# We need to commit because psycopg by default does not automatically commit DML commands
# Autocommit is turned off for psycopg (we can turn it on if we want to)

conn.close()  # Close the connection
