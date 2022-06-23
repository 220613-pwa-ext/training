from animal import Animal


class Dog(Animal):

    def __init__(self, name, num_of_legs):
        super().__init__(num_of_legs)  # This will call the parent's __init__
        self.__name = name

    def make_noise(self):
        print(f"{self.__name} says bark!")

    def get_name(self):
        return self.__name

    def set_name(self, name):
        self.__name = name
