# Find the n-th fibonacci number
# 1 1 2 3 5 8 13 21 34 ...
# 1 2 3 4 5 6 7  8  9

# O(2^n)
def fib(n):
    # Whenever you're doing recursion, you must have a base case
    # In our situation here, the base case is returning a value of 1 if n == 1 or n == 2
    if n == 1 or n == 2:
        return 1

    return fib(n - 1) + fib(n - 2)


# O(n)
def fib_fast(n):
    num1 = 1  # O(1)
    num2 = 1  # O(1)

    if n == 1 or n == 2:  # O(1)
        return 1

    for i in range(3, n + 1):  # O(n)
        temp = num1 + num2
        num1 = num2
        num2 = temp

    return num2  # O(1)


print(fib_fast(50))
