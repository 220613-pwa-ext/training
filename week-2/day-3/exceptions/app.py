from operation_error import OperationError

print("Welcome to the calculator app: ")
allowed_operations = set(['+', '-', '*', '/'])
while True:
    try:
        print("Enter the operation that you would like to perform (+, -, *, /): ")
        choice = input()

        if choice not in allowed_operations:  # O(1) Time Complexity because we are using a set
            raise OperationError("Please enter a valid operation (+, -, *, /)")

        print("Enter the first number: ")
        num1 = float(input())
        print("Enter the second number: ")
        num2 = float(input())

        if choice == '+':
            print("The result is " + str(num1 + num2))
        elif choice == '-':
            print("The result is " + str(num1 - num2))
        elif choice == '*':
            print("The result is " + str(num1 * num2))
        elif choice == '/':
            print("The result is " + str(num1 / num2))

    except ValueError as e:
        print("Please enter a valid number")
    except OperationError as e:
        print(e)

    print("Enter (y or Y) if you would like to continue, otherwise program will end")
    exit_choice = input()
    if not (exit_choice == 'y' or exit_choice == 'Y'):
        break
