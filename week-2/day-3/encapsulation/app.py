from person import Person

p1 = Person("John", "Doe", 25)
print(p1)

# print(p1.__first_name)
p1.say_hi()

print(p1.get_first_name())
print(p1.get_last_name())
print(p1.get_age())
print(p1.get_fullname())  # John Doe

p1.set_last_name("Tran")  # set_last_name will change the last_name property and also the fullname property
print(p1.get_fullname())  # John Tran

p1.set_first_name("Bach")
print(p1.get_fullname())
