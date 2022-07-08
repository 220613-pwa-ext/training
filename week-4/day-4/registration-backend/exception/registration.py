class RegistrationError(Exception):
    def __init__(self):
        super().__init__()
        self.messages = []