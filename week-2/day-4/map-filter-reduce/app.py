from functools import reduce

# MAP
my_fruits = ["Apple", "Banana", "Apricot", "Peach"]

# Using map, create a new list that will contain the boolean value True if the element starts with an "A"
# and False if the element does not start with "A"
new_list = list(map(lambda x: x[0] == "A", my_fruits))
print(new_list)

# Using map, create a new list that will contain the boolean value True if the length of the element is greater
# than 5, otherwise False
greater_than_5 = list(map(lambda x: len(x) > 5, my_fruits))
print(greater_than_5)

# FILTER
# Creates a new structure that keeps elements that meet a certain True condition
starts_with_A = list(filter(lambda x: x[0] == 'A', my_fruits))
print(starts_with_A)  # ["Apple", "Apricot"]

# REDUCE
# reduce(func, iterable, initial_accumulator_value)
# Get sum of elements in list
my_numbers = [1, 2, 3, 4]
print(reduce(lambda accumulator, e: accumulator + e, my_numbers, 0))  # Reduce combines things into a single value

# Get product of elements in list
print(reduce(lambda accumulator, e: accumulator * e, my_numbers, 1))
