# Challenge: print out the numbers from 1 to 100

# While loop
num = 1
while num <= 100:
    print(num, end=" ")
    num = num + 1

print()  # print out a newline

# For loop
print(type(range(1, 101)))  # <class 'range'>
# range is what is known as an iterable
# meaning we can iterate over that object using a for loop

for num in range(1, 101):
    print(num, end=" ")

print()

# Challenge: print out multiples of 3 from 0 to 100
for num in range(0, 100, 3):
    print(num, end=" ")

print()

# Challenge: print out the first 10 numbers
# Will print out 0 1 2 3 4 5 6 7 8 9
for num in range(10):
    print(num, end=" ")

print()

# Challenge: print out hello 1000 times
for _ in range(1000):  # By convention, we use an underscore _ if we do not use the iterator variable for anything
    # inside of our code block
    print("hello")

# Challenge: print out numbers from 10 to 1 in reverse
for num in range(10, 0, -1):
    print(num)

# Challenge: print out the characters in a string one by one
for char in "hello":  # ranges are iterable, but strings are also iterable
    print(char)

# break
while True:
    print("Welcome to the calculator app ")
    num1 = int(input("Enter the first number you would like to add: "))
    num2 = int(input("Enter the second number you would like to add: "))

    result = num1 + num2
    print(f"The result of {num1} + {num2} is {result}")

    should_continue = input("Would you like to continue? (Y/N): ")
    if should_continue.upper() == 'N':
        break  # Break will terminate the loop that we are currently inside of
