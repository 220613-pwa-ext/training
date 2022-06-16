# 1st way of populating key-value pairs
person_1 = {}
person_1['first_name'] = "Bach"
person_1['last_name'] = "Tran"
person_1['age'] = 24

# 2nd way of pre-populating key-value pairs
person_2 = {
            'first_name': 'Jane',
            'last_name': 'Doe',
            'age': 30,
            'phone_numbers': {'mobile': '000-000-0001', 'home': '000-000-0002'}}

print(person_1)
print(person_2)

print(person_1['first_name'])  # Bach
print(person_1['last_name'])  # Tran
print(person_1['age'])  # 24

print(person_2['first_name'])  # Jane
print(person_2['last_name'])  # Doe
print(person_2['age'])  # 30
print(person_2['phone_numbers']['mobile'])  # 000-000-0001
print(person_2['phone_numbers']['home'])  # 000-000-0002


my_tuple = (10, 20, 30)
my_dict_1 = {
    my_tuple: 'test'
}

print(my_dict_1[(10, 20, 30)])

# Iterating over a dictionary
for k in person_1:
    print(f"{k}: {person_1[k]}")

# person_1.items() -> [('first_name', 'Bach'), ('last_name', 'Tran'), ('age': 24)]
# .items() returns a list containing a tuple for the key-value pair
for k, v in person_1.items():
    print(f"{k}: {v}")

# .keys() returns a list of keys
for key in person_1.keys():
    print(key)

# .values() returns a list of all the values
for value in person_1.values():
    print(value)

# .pop() to remove a specified key-value pair for a given key
a = person_1.pop('age')
print(a)
print(person_1)

print(person_1['first_name'])
print(person_1.get('first_name'))

# print(person_1['favorite_hobby'])  # KeyError because the favorite_hobby key does not exist
print(person_1.get('favorite_hobby'))  # None
print(person_1.get('favorite_hobby', 'No favorite hobby'))  # Second argument will be returned if no key favorite_hobby
# is found
