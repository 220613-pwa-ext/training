import time

from selenium import webdriver  # This comes from the selenium package, which we install using
# pip install selenium
from selenium.webdriver.common.by import By

driver = webdriver.Chrome('./chromedriver.exe')  # Here we instantiate a webdriver object that "wraps"
# around the chromedriver executable that we downloaded

# .get(url) method is how you tell the browser to go to a particular URL
driver.get("http://127.0.0.1:5501/selenium-locator-practice/")

# find_element: first occurrence of an element
# find_elements: collection of elements

# ========= class locator ============
p1 = driver.find_element(By.CLASS_NAME, "someclass")
print(p1.text)  # First paragraph element

list_of_elements_with_class_someclass = driver.find_elements(By.CLASS_NAME, "someclass")
p2 = list_of_elements_with_class_someclass[1]
print(p2.text)  # Second paragraph element

# ========== id locator ================
p3 = driver.find_element(By.ID, "third")
print(p3.text)

# ========= name locator ===============
input_element = driver.find_element(By.NAME, "somename")
input_element.send_keys("hello world")

# ======= XPath locator ================
variable_1 = driver.find_element(By.XPATH, "//div[@id='someid']/div[2]/p[1]")
print(variable_1.text)

# ========= link text locator ===========
about_me_link = driver.find_element(By.LINK_TEXT, "About Me")  # Requires full link text
print(about_me_link.text)

# ========= partial link text locator =========
about_me_link = driver.find_element(By.PARTIAL_LINK_TEXT, "out M")  # Only requires a partial match
print(about_me_link.text)
about_me_link.click()

time.sleep(5)  # Sleep for 5 seconds
driver.quit()  # Close the driver + the browser
