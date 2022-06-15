name = input("Enter a name: ")
birth_year = input("Enter your year of birth: ")  # The input function returns a string

age = 2022 - int(birth_year)

# String concatenation: the process of taking two strings and combining them together into a new combined string
# In Python, strings are immutable. You cannot change the value of a string once it has been created
# Whenever string concatenation is performed, a new string is actually created with the characters from the original
# 2 strings
print("Hello my name is " + name)  # str + str -> str
print("I am " + str(age) + " years old")  # we are using the str function to convert an int into a string

# Type conversion functions
# int(...)
# str(...)
# float(...)
# bool(...)

print(float(10))  # 10.0

# Truthy / Falsy values
# For numbers, 0 is Falsy, while every other number is Truthy
print(bool(0))  # False
print(bool(-1))  # True
print(bool(10))  # True
print(bool(0.0))  # False
print(bool(0.12))  # True

# For strings, empty strings are Falsy, all other strings are Truthy
print(bool("hi"))  # True
print(bool(""))  # False
print(bool("    "))  # True

# NoneType
print(bool(None))  # False
