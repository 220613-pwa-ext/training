def do_math(num1, num2, *args, **kwargs):

    def addition():
        my_sum = 0
        my_sum += num1
        my_sum += num2
        for element in args:
            my_sum += element

        return my_sum

    def multiplication():
        my_product = 1
        my_product *= num1
        my_product *= num2
        for element in args:
            my_product *= element

        return my_product

    if 'operation' in kwargs:
        if kwargs['operation'] == 'add':
            return addition()
        elif kwargs['operation'] == 'multiply':
            return multiplication()
    else:
        return addition()


print(do_math(10, 20))
print(do_math(10, 20, 30))
print(do_math(10, 20, 2, 5, operation="add"))
print(do_math(10, 20, 2, 5, operation="multiply"))
