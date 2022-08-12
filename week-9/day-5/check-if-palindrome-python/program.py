my_string = "racecar"


def check_if_palindrome(s):
    left = 0
    right = len(s) - 1

    while left < right:

        if (s[left] != s[right]):
            return False

        left = left + 1
        right = right - 1

    return True


print(check_if_palindrome(my_string))

print(check_if_palindrome("car"))
