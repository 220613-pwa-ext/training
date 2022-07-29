from selenium import webdriver
from pom.login import Login
# In order to use Explicit waits, we need to import WebDriverWait
from selenium.webdriver.support.ui import WebDriverWait
# In order to specify conditions for our waits, we must import ExpectedConditions
from selenium.webdriver.support import expected_conditions as EC
import time
from selenium.webdriver.common.by import By

# You typically would specify the path of the driver, but I have actually configured my application so
# that it checks for the driver using my user's PATH variable
driver = webdriver.Chrome()

# Thus far, we haven't had any issues with locating web elements. In the real world (outside of Swag Labs
# and your small demos), element location can be tricky sometimes. For instance, sometimes elements do
# not load immediately. When this happens, your script will fail. In order to solve this problem, we
# use "Selenium Waits". Selenium Waits can create "slack" between all of the actions that your driver
# would perform. In essence, the driver will wait for some amount of time before proceeding with its
# actions. As a general note, waits should be used only when they're needed as they can slow down your
# scripts.
#
# There are two types of waits provided by Selenium Python: Implicit and Explicit Waits.

# Implicit Waits: These types of waits tell your WebDriver to poll the DOM for a certain of time
# when attempting to locate any element that are not immediately available. Please note that once you
# set an implicit wait, it is set for the life of the driver. In order to tell your driver to wait, do
# the following:

# driver.implicitly_wait(3) # 3 is the number of seconds I'm willing to wait

# Explicit Waits: These types of waits allow you to define exactly what you're waiting for. You can
# wait for certain conditions to be true AND you get to specify just how long you're willing to wait
# for those specific conditions to be true. When using an Explicit Wait, you specify the exact
# element you're waiting on to appear and you even specify what exactly needs to be true about that
# element. For example, we have applied an explicit wait to the login button on the home page of Swag Labs
# below.
#
# Even though our driver will up to 6 seconds for the element to be visible, the WebDriverWait has
# a default polling period of 500 milliseconds, meaning that it calls the ExpectedCondition every
# 500 milliseconds by default.

WebDriverWait(driver, 6).until(EC.visibility_of_element_located(By.ID, 'login-button'))

# Open the browser using the get() method, navigating to the home page for sauce demo
driver.get('https://www.saucedemo.com/')

# Create an instance of your POM (Login in this case)
login = Login(driver)

# Runthrough 1 (hitting the login button)
# login.login_by_id()
# login.click_login_button()

# Runthrough 2 (hitting the ENTER key in the password box)
login.login_by_id()
login.hit_enter_in_input_box()

# Always make sure that you close your browser after you're done.
time.sleep(2)
driver.quit()
