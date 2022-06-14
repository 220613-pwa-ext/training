# This is how you define a function
# The block of code should be indented
def greet():
    print("Hi!")
    print("Hello!")
    print("Greetings!")


# Invoking/calling/executing the greet function 3 times
greet()
greet()
greet()


def some_func(x, y):
    value = x + y
    return value


# Whenever you call a function, the invocation of that function is
# an expression, because it gives you a single value
# addition(5, 4.5) is an expression, because it gives you 9.5
print(some_func(5, 4.5))  # 9.5

# Reminder: expressions can be assigned to variables, passed as arguments,
# or returned inside functions
a = some_func(2, 2.5)
print(a)  # 4.5

print(some_func(some_func(2, 2), some_func(3.5, 4.34)))  # 11.84


def some_func2(x, y):
    return x * y


print(some_func2(2, 3))


# Scope
# The context in which a variable exists
# In Python there's 2 scopes
# 1. Global scope
# 2. Function scope
b = 10  # b is a global scoped variable


def some_func3():
    b = 20  # b is a function scoped variable
    print(b)


def some_func4():
    print(b)

print(b)  # 10
some_func3()  # 20

some_func4()  # This function will print out b in the global scope