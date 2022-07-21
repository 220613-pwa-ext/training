import time

from selenium import webdriver  # This comes from the selenium package, which we install using
# pip install selenium
from selenium.webdriver.common.by import By

from pageobject.my_page import MyPage

driver = webdriver.Chrome('./chromedriver.exe')  # Here we instantiate a webdriver object that "wraps"
# around the chromedriver executable that we downloaded

# .get(url) method is how you tell the browser to go to a particular URL
driver.get("http://127.0.0.1:5501/selenium-locator-practice/")

my_page_object = MyPage(driver)

h1_element = my_page_object.get_main_heading()
print(h1_element.text)

p_1 = my_page_object.get_first_paragraph()
print(p_1.text)

p_2 = my_page_object.get_second_paragraph()
print(p_2.text)

h2_element = my_page_object.get_second_heading()
print(h2_element.text)

p_3 = my_page_object.get_third_paragraph()
print(p_3.text)

input_element = my_page_object.get_input()
input_element.send_keys("hello world")

p_4 = my_page_object.get_first_nested_p()
print(p_4.text)

p_5 = my_page_object.get_second_nested_p()
print(p_5.text)

about_me_link = my_page_object.get_about_me_link()
about_me_link.click()

# driver.back()
driver.execute_script("window.history.go(-1)")
# driver.forward()
driver.execute_script("window.history.go(1)")
# driver.refresh()
driver.execute_script("window.location.reload()")

time.sleep(5)  # Sleep for 5 seconds
driver.quit()  # Close the driver + the browser
