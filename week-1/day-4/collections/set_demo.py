my_set_1 = {10, 20}  # Creating a set pre-populated with values 10 and 20

# Creating an empty set
my_set_2 = set()  # We cannot do my_set_2 = {}, because that will actually create an empty dict
print(type(my_set_2))  # <class 'set'>

my_string = "abbbaaacccdddddeeefss"

# We want to retrieve all of the unique characters in the string
for char in my_string:
    my_set_2.add(char)  # If you try to add a value that already exists in the set, it will not add it a second time

for char in my_set_2:
    print(char)

# Set Methods
# .add()
# .clear()
# .copy()
# .difference()
# .intersection()
# .union()

# .discard(): remove a specified value (if it exists)
# .pop(): removes a random value from the set

my_set_3 = {1, 2, 3, 4}
my_set_4 = {3, 4, 5, 6}

# Intersection
print(my_set_3.intersection(my_set_4))  # intersection does not mutate the set, it will create a brand new set
# intersection_update does mutate

# Difference
print(my_set_3.difference(my_set_4))  # difference does not mutate the set, it will create a brand new set
# difference_update does mutate

# Union
print(my_set_3.union(my_set_4))
