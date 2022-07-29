from selenium.webdriver.common.by import By
# If you wish to simulate a user hitting a keyboard key, you can use "Keys"
from selenium.webdriver.common.keys import Keys

# We'll be creating a Page Object Model (POM) within this module. We use Page Object Models to
# reduce the redundancy. Instead of writing the same code to identify locators for web elements,
# we can create a module or a class within a module that takes care of locating the elements.
# When you create a POM, the idea is that you're modeling a web page. That model will serve as
# a repository of all of the elements on the web page.

# So let's say that this POM is modeling our login page. What do we need here?

class Login:
    # It's not a bad idea to put all of your locators inside of your POM, so our POM becomes a repository
    # of all of the locators we'd like to use AND handy methods for interacting with elements.
    username_input_id = 'user-name'
    password_input_id = 'password'
    login_button = 'login-button'

    def __init__(self, driver):
        self.driver = driver

# Defining a method for finding an element by its id

    def login_by_id(self):
        # We want to simulate logging into Swag Labs. You've stated that you want to locate the username textbox
        # by using the element's id. That said, there are various locators in Selenium:

        # ID
        # Class
        # Tag Name
        # Link Text
        # Partial Link Text
        # CSS Selector
        # XPath
        # Name

        # Grabbing the username and password input boxes by their id:

        username_input = self.driver.find_element(By.ID, self.username_input_id)
        password_input = self.driver.find_element(By.ID, self.password_input_id)

        # Attempt to input the text. We'll use the sendkeys() method to simulate a user typing into the input boxes.

        username_input.send_keys('standard_user')
        password_input.send_keys('secret_sauce')

    # We'll explore two different ways of submitting the form: by clicking the login button AND by hitting the
    # enter key in the password box
    def click_login_button(self):
        # Option 1: Click the login button. This requires that we locate the button and click it.
        login_button = self.driver.find_element(By.ID, 'login-button')
        login_button.click()

    def hit_enter_in_input_box(self):
        # Option 2: Hitting the "ENTER" key in the password box:
        password_input = self.driver.find_element(By.ID, self.password_input_id)
        password_input.send_keys(Keys.ENTER)

