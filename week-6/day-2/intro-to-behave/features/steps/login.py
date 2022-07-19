@when(u'I click login')
def step_impl(context):
    print("FOUR")
    # Insert Selenium WebDriver code here that will click on the login button


@given(u'that I am at the login page')
def step_impl(context):
    print("ONE")
    # INSERT Selenium WebDriver code here that will open the web browser and go to the login page

@when(u'I type in a valid username of john_doe')
def step_impl(context):
    pass
    # INSERT Selenium WebDriver code that will type in john_doe in the username input


@when(u'a valid password of password12345')
def step_impl(context):
    pass
    # INSERT Selenium WebDriver code that will type in password12345 in the password input


@then(u'I should be redirected to the student homepage')
def step_impl(context):
    pass
    # INSERT Selenium WebDriver code that will check if we are on the student homepage


@when(u'I type in a valid username of jane_doe')
def step_impl(context):
    pass
    # INSERT Selenium WebDriver code that will type in jane_doe in the username input


@when(u'a valid password of pass123')
def step_impl(context):
    pass
    # INSERT Selenium WebDriver code that will type in pass123 in the password input


@when(u'I type in a valid username of bachy21')
def step_impl(context):
    pass
    # INSERT Selenium WebDriver code that will type in bachy21 in the username input


@when(u'a valid password of password123')
def step_impl(context):
    pass
    # INSERT Selenium WebDriver code that will type in password123 in the password input


@then(u'I should be redirected to the teacher homepage')
def step_impl(context):
    pass
    # INSERT Selenium WebDriver code that will check if we are on the teacher homepage

@when(u'I type an invalid username of "user123"')
def step_impl(context):
    pass


@when(u'I type an invalid password of "32423#$#$#lkjf"')
def step_impl(context):
    pass


@then(u'I should see an error message of "Invalid username and/or password"')
def step_impl(context):
    pass


@when(u'I type a valid username of "bachy21"')
def step_impl(context):
    pass


@when(u'I type an invalid password of "12345"')
def step_impl(context):
    pass


@when(u'I type a valid password of "password123"')
def step_impl(context):
    pass
