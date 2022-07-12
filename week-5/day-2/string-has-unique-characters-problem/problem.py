# Return True if input string has only unique characters
# Return False if input string has any occurrences of duplicate characters
# Time complexity of O(n^2)
# Using amortization analysis, we can mathematically
# determine that it is O(n^2)
# But just to keep it simple, we can intuitively
# see that it is O(n^2) since it has nested for loops
# (and both for loops depend on the length of the string)
def is_unique(my_string):  # O(n^2)
    for i in range(len(my_string) - 1):
        for j in range(i + 1, len(my_string)):
            if my_string[i] == my_string[j]:
                return False

    return True


# 1 + ? + n -> n -> O(n)
# O(n)
def is_unique_solution_using_set(my_string):
    my_set = set()  # O(1)

    # O(n)
    for char in my_string:
        my_set.add(char)

    # Compare to see if the set has the same number of characters as the string
    # If they do, then it means that all characters in the string are unique
    # If they don't then it means that we have duplicates
    return len(my_set) == len(my_string)


# 1 n log n + 1n + 1 -> n log n + n -> O(n log n)
# This solution is O(n log n) time complexity
def is_unique_solution_using_sorting(my_string):
    # O(n log n) <- The best "general" sorting algorithms can ONLY achieve O(n log n)
    my_list_of_sorted_characters = sorted(my_string)

    # O(n)
    for i in range(len(my_list_of_sorted_characters) - 1):
        if my_list_of_sorted_characters[i] == my_list_of_sorted_characters[i + 1]:
            return False

    # O(1)
    return True


# Input: abc
# Expected Output: True
print(is_unique_solution_using_set("abc"))

# Input: apple
# Expected Output: False
print(is_unique_solution_using_set("apple"))

# Input: banana
# Expected Output: False
print(is_unique_solution_using_set("banana"))

# Input: dog
# Expected Output: True
print(is_unique_solution_using_set("dog"))
