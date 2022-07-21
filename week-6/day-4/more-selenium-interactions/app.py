import time

from selenium import webdriver
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select

driver = webdriver.Chrome('./chromedriver.exe')  # Instantiate the webdriver object

driver.get("http://127.0.0.1:5500")

# Interview question: How to select options from a dropdown?
# Find the select element first using find_element
# Instantiate a Select object based on that select element
# Use select_by_index, select_by_value, or select_by_visible_text
select_element = driver.find_element(By.ID, "vehicle")
dropdown = Select(select_element)  # Constructing a "Select" object that allow us to interact with the dropdown
dropdown.select_by_index(1)  # Sedan
time.sleep(1)
dropdown.select_by_value("suv")  # SUV
time.sleep(1)
dropdown.select_by_visible_text("Crossover")

# Getting an attribute's value from an element
p_1 = driver.find_element(By.ID, "someid")
print(p_1.get_attribute("id"))
print(p_1.get_attribute("class"))
print(p_1.get_attribute("data-testing"))
print(p_1.get_attribute("name"))

radio_buttons = driver.find_elements(By.NAME, "gender")
for radio_button in radio_buttons:
    if radio_button.get_attribute("value") == "female":
        radio_button.click()

checkboxes = driver.find_elements(By.NAME, "liked_fruits")
# checkboxes refers to a list of WebElement objects that represent each checkbox element on the HTML page
# This will select the mango and dragonfruit checkboxes
for checkbox in checkboxes:
    if checkbox.get_attribute("value") in {"mango", "dragonfruit"}:
        checkbox.click()

regular_alert_button = driver.find_element(By.ID, "regular-alert-btn")
regular_alert_button.click()  # Triggering the alert
alert_obj = Alert(driver)
alert_obj.dismiss()  # Dismissing the alert

confirm_alert_button = driver.find_element(By.ID, "confirm-alert-btn")
confirm_alert_button.click()
alert_obj.accept()  # clicks ok
# alert_obj.dismiss() # clicks cancel instead

prompt_alert_button = driver.find_element(By.ID, "prompt-alert-btn")
prompt_alert_button.click()
alert_obj.send_keys("20")
time.sleep(1)
alert_obj.accept()

time.sleep(10)
driver.quit()  # Quit the driver
