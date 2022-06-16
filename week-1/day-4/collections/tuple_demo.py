my_tuple = ("abc", 5, True, 10, 25, 1.2)

print(my_tuple[0])  # abc
print(my_tuple[1])  # 5
print(my_tuple[2])  # True
print(my_tuple[3])  # 10
print(my_tuple[4])  # 25
print(my_tuple[5])  # 1.2

person_1 = ('Bach', 'Tran', 24)
first_name, last_name, age = person_1
print(first_name)
print(last_name)
print(age)

for element in my_tuple:
    print(element)

# This DOES NOT WORK!!
# Tuples are immutable, therefore you cannot change the elements inside a tuple to something else
# my_tuple[2] = "test"

for idx, e in enumerate([10, 15, "abc"]):  # For each iteration, we are unpacking a tuple into variables idx and e
    print(f"{idx} {e}")

# Tuple methods
# .count()
# .index()

my_tuple_2 = (1, 2, 2, 1, 3, 3, 3, 3, 4, 3, 5, 10)

# .count() example
# Get the # of occurrences of int 3
three_count = my_tuple_2.count(3)
print(f"my_tuple_2 has {three_count} 3's")

# .index() example
# return the index of the first occurrence of a particular value
print(my_tuple_2.index(5))  # index 10

# We want to create a tuple with a single element
my_tuple_3 = (50,)  # if you want to create a tuple with only 1 element, put a comma at the end of the element
print(type(my_tuple_3))
