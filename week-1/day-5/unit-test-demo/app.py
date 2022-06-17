from my_math_utility import addition
# Test case #1 for addition:
# Given 2 numbers, 10 and 20, the expected return value is 30
actual = addition(10, 20)  # Expected: 30
expected = 30
if actual == expected and type(actual) == type(expected):
    print("Test case #1 passed")
else:
    print("Test case #1 failed")

# Test case #2 for addition:
# Given 2 numbers, 10.0 and 20, the expected return value is 30.0
actual = addition(10.0, 20)  # Expected: 30.0
expected = 30.0
if actual == expected and type(actual) == type(expected):
    print("Test case #2 passed")
else:
    print("Test case #2 failed")
