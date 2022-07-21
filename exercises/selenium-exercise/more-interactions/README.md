# More Interactions Exercise
Given the HTML page located [here](https://github.com/220613-pwa-ext/training/blob/main/week-6/day-4/more-selenium-interactions-frontend/index.html), perform the following tasks using Selenium WebDriver in Python:

1. Host the HTML page using liveserver
2. Set up a Python project
    - Enter the virtual env `soure venv/Scripts/activate`
    - `pip install selenium`
    - Drag and drop the appropriate web driver into your project
3. Instantiate the webdriver object in Python
4. Use the .get method on the webdriver object to go to the webpage hosted on live server
5. Perform the interactive tasks below:

* Select various options from the dropdown using all 3 methods
    - select_by_index
    - select_by_value
    - select_by_visible_text
* Print out the values of each attribute in the paragraph tag (id, class, data-testing, and name)
* Click on the "other" radio button for gender
* Select the "apple", "banana", and "dragonfruit" checkboxes
* Cause a regular alert to appear and then dismiss the alert
* Cause a confirm alert to appear and then accept the alert
* Cause a prompt alert to appear, type in the string "32", and accept the alert