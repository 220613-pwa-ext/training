my_list = []  # This creates an empty list

my_list.append(10)

print(my_list)  # [10]
print(type(my_list))  # <class 'list'>

print(my_list[0])  # 10
print(type(my_list[0]))  # <class 'int'>

my_list.append("abc")
my_list.append(12)
my_list.append(25)
my_list.append("def")

print(my_list)

print(my_list[0])
print(my_list[1])
print(my_list[2])  # 12
print(my_list[3])  # 25
print(my_list[4])

print(my_list[4 // 2])  # 12
a = 3
print(my_list[a])  # 25

print()
# Challenge: using a while loop, iterate over and print out each element individually from the list
#  0     1     2   3    4
# [10, 'abc', 12, 25, 'def']
# len(my_list) -> 5
i = 0
while i < len(my_list):
    print(my_list[i])
    i += 1

print()
# Challenge: using a for loop, iterate over the elements of a list and print them out individually
for e in my_list:
    print(e)

# Challenge: using a for loop, iterate over the elements of a list and print out both the index and the element

# Solution 1
index = 0
for e in my_list:
    print(f"{index}: {e}")
    index += 1

# Solution 2 (better solution)
for idx, e in enumerate(my_list):
    print(f"{idx}: {e}")

my_2d_list = [[10, 20], [30, 40]]
print(my_2d_list[0][1])  # 20
print(my_2d_list[1][0])  # 30
# Nested for loops
for l in my_2d_list:
    for element in l:
        print(element, end=" ")
    print()

# Unpacking
my_list_2 = ['Bach', 'Tran', 24]
first_name, last_name, age = my_list_2
print(first_name)
print(last_name)
print(age)

fruits = ['apple', 'banana', 'peach', 'pear']
x, y, *other_fruits = fruits  # * is used when unpacking to put all remaining elements into a list

print(x)  # apple
print(y)  # banana
print(other_fruits)  # ['peach', 'pear']
print(type(other_fruits))  # <class 'list'>

people = [['Bach', 'Tran'], ['John', 'Doe'], ['Jane', 'Doe']]
for first_name, last_name in people:  # Unpacking
    print(f"{first_name} {last_name}")

# Lists are Mutable
my_list_3 = [1, 2, 3, 4, 5]  # You can also pre-populate elements in a list instead of using
# .append() over and over

print(my_list_3)
my_list_3.append(1000)  # The append method actually modifies (mutates) the list object
# .append() changes the list "in-place"
print(my_list_3)

my_list_3[0] = 99999
print(my_list_3)

# List methods
# .append()
# .clear(): remove all elements from the list
# .copy(): return a copy of the list (a brand new object)
# .count(): returns number of elements with specified value
# .extend(): add the elements from another list (or iterable) to the current list
# .index(): returns the index of the first occurrence of a specified value
# .insert(): insert an element at a particular index
# .pop(): remove an element at specified position (or end of list if no position is given)
# .remove(): removes the first element with a specified value
# .reverse(): reverse the list (in-place)
# .sort(): sort the list

my_list_4 = [3, 10, -10, 10, 20, 25, 4, 100, 9, 63, 78]
print(my_list_4)
my_list_4.append(1000)
print(my_list_4)

print(my_list_4.pop())  # 1000
print(my_list_4)

print(my_list_4.pop(5))  # 25
print(my_list_4)

my_list_4.remove(10)
print(my_list_4)

my_list_4.insert(2, 800)  # 800 will be inserted at index 2, and all elements will be shifted right
print(my_list_4)

my_list_4.extend([10, 20, 30])
print(my_list_4)

print()

print(my_list_4)  # [3, -10, 800, 10, 20, 4, 100, 9, 63, 78, 10, 20, 30]
x = my_list_4  # There is only 1 list object. Both the x and my_list_4 variables are pointing to the same object
x[0] = 9999999999
print(my_list_4)  # [9999999999, -10, 800, 10, 20, 4, 100, 9, 63, 78, 10, 20, 30]

# x and my_list_4 are pointing to the same list object
y = my_list_4.copy()  # y is pointing to a second list object
y[0] = 888
print(y)
print(my_list_4)

# How do we make a copy of a list without using .copy()?
# Slicing
a = [1, 2, 3, 4, 5, 6, 7, 8]
b = a[::]  # Slicing creates a copy of the segment in which you are slicing
b[0] = 1000
print(a)  # [1, 2, 3, 4, 5, 6, 7, 8] <- a remains unchanged

print(a[0:5:2])  # [1, 2]
print(a[::-1])  # [8, 7, 6, 5, 4, 3, 2, 1]
