# Comparison
print(3 == 3)  # True
print("dog" == "dog")  # True
print("dog" != "dog")  # False
print("dog" != "cat")  # True
print("dog" == "cat")  # False
print(3 == 3.0)  # True
print(3 == 3.01)  # False
print(2 > 3)  # False
print(2 < 3)  # True
print(2 >= 2)  # True
print(2 > 2)  # False
print(3 <= 4)  # True
print(3 <= 3)  # True

# The id function will return a unique identifier for an object
print(id("hi"))
print(id(3))
print(id(3))
print(id(3.0))

print(3 is 3.0)  # False
# The 'is' operator compares to see if both sides are the same object
# The left side is an int object, while the right side is a float object
print(3 is 3)  # True
print("hi" is "hi")  # True

greeting = "hi"
print(greeting is "hi")

my_string = input("input a string: ")
print(my_string is "hi")  # False
print(my_string == "hi")  # True

# Logical Operators
print(True and True)  # True
print(True and False)  # False
print(False and True)  # False
print(False and False)  # False

print(5 > 2 and 4 < 100)  # True
print(5 > 10 and 2 < 100)  # False

print(5 == 5 or 2 == 3)  # True
print(10 == 10 or 5 == 5)  # True

print(not True)  # False
print(not False)  # True

x = 10
print(not x == 11)  # True
print(not x == 10)  # False

print((True and True) or (True and False))
# True or True and False
# True or False
# True
