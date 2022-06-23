from animal import Animal


class Cat(Animal):

    def __init__(self, name, num_of_legs):
        super().__init__(num_of_legs)
        self.name = name

    def make_noise(self):
        print(f"{self.name} says meow!")
