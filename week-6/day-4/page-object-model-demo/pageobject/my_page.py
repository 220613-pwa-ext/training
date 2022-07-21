from selenium.webdriver.common.by import By


class MyPage:

    def __init__(self, driver):
        self.driver = driver

    def get_main_heading(self):
        return self.driver.find_element(By.TAG_NAME, "h1")

    def get_first_paragraph(self):
        return self.driver.find_element(By.CLASS_NAME, "someclass")

    def get_second_paragraph(self):
        return self.driver.find_element(By.XPATH, "//p[text()='Second paragraph element']")
        # return self.driver.find_elements(By.TAG_NAME, "p")[1]
        # return self.driver.find_elements(By.CLASS_NAME, "someclass")[1]

    def get_second_heading(self):
        # return self.driver.find_element(By.TAG_NAME, "h2")
        # return self.driver.find_element(By.CSS_SELECTOR, "h2.someclass")
        # return self.driver.find_element(By.XPATH, "//h2[@class='someclass']")
        return self.driver.find_elements(By.CLASS_NAME, "someclass")[2]

    def get_third_paragraph(self):
        return self.driver.find_element(By.ID, "third")
        # return self.driver.find_element(By.CSS_SELECTOR, "p#third")
        # return self.driver.find_element(By.XPATH, "//p[@id='third']")

    def get_input(self):
        return self.driver.find_element(By.NAME, "somename")
        # return self.driver.find_element(By.CSS_SELECTOR, "input[name='somename']")
        # return self.driver.find_element(By.XPATH, "//input[@name='somename']")

    def get_first_nested_p(self):
        return self.driver.find_element(By.XPATH, "//div[@id='someid']/div[1]/p")

    def get_second_nested_p(self):
        return self.driver.find_element(By.XPATH, "//div[@id='someid']/div[2]/p")

    def get_about_me_link(self):
        return self.driver.find_element(By.LINK_TEXT, "About Me")
        # return self.driver.find_element(By.PARTIAL_LINK_TEXT, "out")
        # return self.driver.find_element(By.CSS_SELECTOR, "a[href='./about-me.html']")
        # return self.driver.find_element(By.XPATH, "//a[@href='./about-me.html']")
        # return self.driver.find_element(By.XPATH, "//a[text()='About Me']")
        # return self.driver.find_element(By.XPATH, "//a[contains(text(), 'out')]")
        # return self.driver.find_element(By.TAG_NAME, "a")

