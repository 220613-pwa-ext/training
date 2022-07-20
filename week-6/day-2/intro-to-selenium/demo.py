import time
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome('./chromedriver.exe')  # Instantiate a Driver object
# Whenever the object is instantiated, it will open up a browser
# The Driver object represents the browser that we will interact with

driver.get("http://google.com")
print(driver.title)  # Text in the browser tab -> HTML <title>Google</title>

# find_element (no s): returns a single object that represents the first occurrence (top to bottom) in the HTML document
# that match what we're finding elements by
google_search_input_element = driver.find_element(By.NAME, "q")  # Find the first occurrence of
# elements with name attribute equal to 'q'
google_search_input_element.send_keys("python tutorials")

# find_elements (s): returns a list of elements that match what we're finding elements by
google_search_button_within_dropdown = driver.find_elements(By.NAME, "btnK")[0]  # We start at index 0, we want the first occurrence
google_search_button_within_dropdown.click()

time.sleep(5)  # Pause execution for 5 seconds
driver.quit()  # Terminate the browser
