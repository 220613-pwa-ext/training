from animal import Animal
from dog import Dog

# The line of code below will not work, because you cannot instantiate abstract classes
# a1 = Animal(4)
a1 = Dog("Fido", 4)
a1.make_noise()

print(a1.get_name())
print(a1.get_num_of_legs())

a1.set_name("Sparky")
a1.set_num_of_legs(3)

a1.make_noise()

print(a1.get_name())
print(a1.get_num_of_legs())


# Attributes for objects in Python is dynamic
# You can just add attributes on the fly at any time to an object
a1.color = 'blue'
print(a1.color)
a1.yet_another_attribute = 'testing123'
print(a1.yet_another_attribute)
