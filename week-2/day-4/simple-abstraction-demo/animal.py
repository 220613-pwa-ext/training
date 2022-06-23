from abc import ABCMeta, abstractmethod


class Animal(metaclass=ABCMeta):

    def __init__(self, num_of_legs):
        self.__num_of_legs = num_of_legs

    # Abstract classes CAN have concrete methods as well
    def get_num_of_legs(self):  # Getter
        return self.__num_of_legs

    def set_num_of_legs(self, num_of_legs):  # Setter
        self.__num_of_legs = num_of_legs

    @abstractmethod
    def make_noise(self):
        pass
