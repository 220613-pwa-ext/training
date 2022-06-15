a = "This is a string"
b = 'This is another string'

print(a)  # This is a string

# Slicing
# Applies not only to Strings like in this example, but also lists and tuples
print(a[0])  # T
print(a[3])  # s
print(a[0:3])  # Thi

print(a[-1])  # g
print(a[15])  # g

print(a[-2])  # n
print(a[14])  # n

# print(a[20])  # IndexError
print(a[0:7:2])  # Ti<space>s

print(a[::-1])  # gnirts a si sihT
print(a[::2])  # Ti sasrn
print(a[-5:-2])  # tri

print(a[-6:])  # string # starts at -6 and goes all the way to the end including the end
print(a[-6:-1])  # strin

# String concatenation
print("Hello " + "World")
num = 10
print("Number: " + str(num))

# String methods

# upper()
print("abc".upper())  # ABC
my_string_1 = "abc"
print(my_string_1.upper())  # ABC

my_string_2 = "hi"
# the upper() method returns a brand new string object. We know this because strings are immutable, and therefore
# upper() does not modify the original "hi" string
my_string_2 = my_string_2.upper()  # my_string_2 = "HI"
print(my_string_2)  # HI

name = "Bach Tran"
print("Your name in uppercase is: " + name.upper())

# lower()
print("ABC".lower())

# strip()
# Removes whitespace before and after the string
# Leading and trailing whitespace is removed
a_string = "     abc       "
print(a_string.strip())

# replace()
my_string_3 = "Hello"
my_string_3 = my_string_3.replace("l", "p")
print(my_string_3)  # Heppo

# String formatting
first_name = input("Enter your first name: ")
last_name = input("Enter your last name: ")
age = input("Enter your age: ")

greeting_message = "Hi, my name is " + first_name + " " + last_name + ", and my age is " + age
print(greeting_message)

greeting_message_2 = "Hi, my name is {} {}, and my age is {}".format(first_name, last_name, age)
print(greeting_message_2)

# f-strings
greeting_message_3 = f"Hi, my name is {first_name} {last_name}, and my age is {age}"
print(greeting_message_3)

print("It's a great day!")
# Backslash is an escape character. It eliminates the special meaning of a character such that it only considers
# that character as part of the string literal
print('It\'s a great day!')
print("He said, \"hi there!\"")

print("1st line\n2nd line")  # newline character
print("\tNew paragraph blah blah blah")
print("This is a backlash: \\")

print("a", end=", ")
print("b", end="\n")  # a, b
print("c")

print("a", "b", "c", sep="\t")  # a     b      c

# Length of a string
my_string_4 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum"
print(len(my_string_4))  # 444 characters
print(my_string_4[0:(len(my_string_4) // 10)])

# Occurrence of a character
print(my_string_4.count("a"))  # 29 a's in the string

# Find where an occurrence is
print(my_string_4.find("amet"))  # 22 (the first occurrence of "amet" starts at index 22
