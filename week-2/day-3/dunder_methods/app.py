from person import Person

p1 = Person("Bach", "Tran", 24)  # Construct a person object
# When we construct the object __init__() is invoked
print(p1)

p2 = Person("John", "Doe", 25)
print(p2)

print(len([1, 2, 3]))  # 3
print(len("a string"))  # 8

print(len(p1))  # 9
print(len(p2))  # 8

print("Ba" in p1)  # the in operator can be used via defining what it means for something to be "in" the object
# This is defined via the __contains__(self, name) method
