# Week 5 + 6 Review

# Week 5
* HTML
    - HyperText Markup Language
    - Current version is HTML5
        - `<!DOCTYPE html>` used to define that a particular document is HTML5
    - Defines the structure of a webpage
    - Consists of HTML elements
        - Elements are defined using `tags`
        - Elements can be nested inside of other elements (parent - child relationships)
    - Two types of tags
        1. Non self-closing tags
            - Opening tag
                - `<p>`
            - Closing tag
                - `</p>`
        2. Self-closing tags
            - `<img src="http://mywebsite.com/cat.jpg">`
    - HTML Attributes
        - Define the metadata for a particular HTML element
        - Key-value pairs
        - Global attributes
            - `style`
            - `class`
                - A particular value can be used for multiple elements
            - `id`
                - A particular value can be used for only a single element (unique)
        - Other attributes
            - `src`
            - `rel`
            - etc.
    - Common HTML elements
        - Heading
            - `h1` through `h6`
        - Paragraph
            - `p`
        - Image
            - `img`
        - Boilerplate elements
            - `html`
            - `body`
            - `head`
        - General elements
            - `div`
                - Block element
            - `span`
                - Inline element
    - Block element
        - Takes up the entire width of the parent's content space
    - Inline element
        - Only takes up as much width as necessary
    - Semantic v. Nonsemantic elements
        - Semantic: clearly communicates its meaning to the browser AND developers reading the HTML
            - `article`
            - `aside`
            - `details`
            - `footer`
            - `header`
            - `main`
            - `nav`
            - `section`
            - Are typically block level elements and behave the same as a div
        - Non-semantic: does not clearly communicate what the element's meaning/purpose is
            - `div`
            - `span`
* CSS
    - Ways to include CSS
        - Inline
            - style attribute of an HTML element
                - `<p style="color: red;">`
        - Internal
            - `<style></style>` element nested in `head` tag
            - Define CSS using same syntax as external
        - External
            - External .css file
            - Use `<link rel="stylesheet" href="mycssfile.css" />` to utilize a .css file
    - Syntax
        - `#my-id p { color: red; background-color: blue; }`
            - `<selector> { <css property>: <property value>; <css property 2>: <property value> }`
        - Consists of "declarations"
            - `<css property>: value`
        - The curly braces `{}` is a declaration block
        - `#my-id p` is an example of a combination selector (descendant selector)
            - "Select p tags that are children of an element with an id of my-id"
    - Selectors
        - `*`: universal
        - `#id`: id
        - `.class`: class
        - `div p`: descendant selector
    - CSS Precedence (highest to lowest)
        - Inline (style attribute)
        - #id
        - .class
        - Tag name
        - Universal
    - CSS inheritance
        - Some properties are inherited from parent element, but not all
        - Typically, it's the text related styling that is inherited such as `color` or `font-size`
    - CSS Box Model
        - Content
            - The actual content itself
                - Text
                - Child elements
        - Padding
            - Space between content and border
        - Border
            - The section that demarcates where the element "ends"
        - Margin
            - The space between the element and other elements
        - Note: Content + Padding are part of the "fill-area", or the area where background color and background images can be applied
    * CSS Flexbox
        - A way to produce layouts for the webpage
        - 1 Dimensional (1D)
        - Elements are aligned along the main axis
            - By default, the main axis is horizontal but can be made vertical
    * CSS Grid
        - A way to produce layouts for the webpage
        - 2 Dimensional (2D)
        - Elements can be placed within the 2D grid
* JavaScript
    - A programming language that can be used in
        1. Servers (usually with node.js)
        2. Web browsers
            - DOM Manipulation to add/remove/modify HTML elements from the DOM
            - Fetch API to send HTTP requests and receive data back
            - Chrome uses the V8 engine to run JavaScript
    - Traditionally interpreted, but also has some ability to be compiled
    - High-level, multi-paradigm, interpreted language
    - Including JS
        - Internal
            - Put JS code between `<script></script>` tags
        - External
            - Use `<script src="myjsfile.js></script>`
                - `src` attribute to specify external js file
        - Script tag should either be placed at the BOTTOM of the `body` element or in the `head` with a `defer` attribute
    - Variable declaration types
        - `var`
            - Two possible scopes
                - global
                - function
            - hoisted
        - `let`
            - Three possible scopes
                - global
                - function
                - block
            - NOT hoisted
        - `const`
            - Is a constant (cannot be given a new value)
            - Three possible scopes
                - global
                - function
                - block
            - NOT hoisted
    - Datatypes
        - number
        - string
        - boolean
        - null
        - undefined
        - object
    - Functions
        - Reusable blocks of code that can be executed over and over again
        - Take inputs (parameters)
        - Produce outputs (return)
        - 3 types
            - Named functions
                - `function myFunc() {}`
            - Anonymous functions
                - Don't have a name
                - `function() {}`
            - Arrow functions
                - Don't have a name
                - `() => {}`
                - The `this` keyword is based on the `this` keyword's value within the lexical scope that the arrow function was defined within
    - Objects
        - Similar to dictionaries in Python
        - Composed of key-value pairs
        - Ways to create an object
            - `{}` Object literal syntax
            - Function constructors
            - Classes (ES6)
    - JS Arrays
        - Similar to lists in Python
        - Indexed starting at 0
        - Length of a list can be retrieved using `.length` property
        - Methods
            - `push` to add to end of an array
            - `pop` to remove from end of an array
            - `unshift` to add to the beginning of an array
            - `shift` to remove from the beginning of an array
    - DOM Manipulation
        - DOM: Document object model
            - HTML elements are modelled as `nodes` in a tree
            - Parent nodes connect to child nodes
            - The root element of the tree is the `document` object
        - Selecting elements
            - `document.getElementById('myid')`
            - `document.getElementsByName('myname')`
            - `document.getElementsByTagName('p')`
            - `document.getElementsByClassName('myclass')`
            - `document.querySelector('#myid p')`
                - Provides ability to use CSS selectors to select elements from DOM
                - Gets the first occurrence
            - `document.querySelectorAll('#myid p')`
                - Provides ability to use CSS selectors to select elements from DOM
                - Returns a collection of elements that match
    - Events
        - "Things" that happen to HTML elements
            - `click`
            - `load`
            - `keydown`
            - `keyup`
            - `mouseover`
            - `mouseout`
            - etc
        - Can select an element from the DOM and add an event listener to it
            - `let myElement = document.getElementById('myelementid')`
            - `myElement.addEventListener('click', myCallbackFunction)`
        - Event listener: is attached to a particular element and listens for events to occur on that element
            - When event occurs, callback function is invoked
        - Callback function: A function that is passed into a function as an argument and called at a later point in the future
        - Bubbling and Capturing
            - Events are not isolated to the target element on which a particular event occurred
            - Two phases
                1. Capturing: first phase
                2. Bubbling: second phase
            - An event starts out at the root element (`html`) and works its way down to the target element (capturing phase)
            - Once event reaches the target element, it works its way back up to each parent until it reaches the `html` element again (bubbling phase)
            - By default, event listeners listen for events while they're in the **bubbling** phase
    - Promise
        - Introduced in ES6
        - Is a "promise" that a value will be "produced" in the future
        - 3 states
            - Pending
            - Fulfilled: value is successfully produced
            - Rejected: error value is produced
        - A promise either moves from `pending to fulfilled` or `pending to rejected`
        - Handling promises
            - `.then((data) => {})` amd `.catch((err) => {})`
                - Both accept a callback function with a defined parameter
                - If promise succeeds, .then()'s callback function is executed and the value provided to that function
                - If promise rejects, .catch()'s callback function is executed and the error value provided to that function  
            - `async-await`
                - `async function myAsyncFunc() {}`
                    - Async function can utilize `await`
                    - Async functions wrap their return value into a promise as well if needed to return something
                - Await
                    - Used to wait on a promise for its `fulfilled` value
                    - ex. `let res = await fetch(...)` 
                    - `let data = await res.json()`
                    - Pauses the async function until promise that it is awaiting is fulfilled or rejected
    - Fetch API
        - Browser API to send HTTP requests
        - Utilizes `fetch()` function

## Testing concepts expanded
* Defect Lifecycle
    - Series of steps that are performed when a defect is found
    - Steps/phases
        1. A new defect is created (new)
        2. The defect is then assigned to a developer to be fixed (assigned)
        3. Defect is now open (open)
        4. Developer fixes defect (fixed)
        5. Wait for tester to retest (pending retest)
        6. Tester retests to make sure defect is gone (retest)
        7. If defect is still there, go back to step 3
        8. If defect is fixed, verify with manager for sign-off (verify)
        9. Close defect (closed)
* Defect report
    - Defect ID
    - Defect description
    - Steps to replicate
    - Detected by
    - Status
    - Date closed
    - Severity
    - Priority
* Severity and Priority
    - Severity
        - Impact that a defect has on the operation of a component or system
        - Levels
            - Critical
                - A defect that blocks other functionalities from being tested
                - Ex: if users can't log in, can't test features that require being logged in
            - Major
                - A defect that prevents major functionalities from working, but is not blocking other functionalities
                - Ex: about me page is not working
            - Minor
                - Something that isn't working as expected, but doesn't really affect functionality
                - Ex: login error message not showing
            - Low
                - Cosmetic issues
                - Ex: typos, alignment issues
    - Priority
        - How important fixing the defect is
        - Business considerations
        - Levels
            - High
                - Affects revenue and reputation of company
            - Medium
                - Don't affect customer systems but rather internal systems
            - Low
                - What is fixed after all high and medium priority defects are addressed or additional labor/resources are available
    - Severity v. Priority
        - Often correlated, but not always
        - Examples
            - Users cannot log in
                - Critical severity, High priority
            - Company name on homepage is misspelled
                - Low severity, High priority
            - Admin is unable to add new employees to the reimbursement system
                - Critical severity, low priority (because hiring freeze)

# Week 6
* User Story
    - Features/functionality written from the perspective of an end user
        - Format: `As a <user description>, I want <some functionality>, so that <benefit>`
    - Acceptance criteria serve as the details of the user story and as part of the metrics used to determine if a user story is considered complete or not
        - Format: `Given <precondition>, When <something occurs>, Then <result>`
        - Can be utilized to design test scenarios and test cases
* Behavior Driven Development (BDD)
    - A superset of TDD that includes additional processes/tools to better facilitate development
    - Features are described from the perspective of stakeholders
    - Assumption: stakeholders lack technical knowledge
    - BDD helps to bridge the gap between non-technical and technical team members and stakeholders
    - Three Amigos
        - Product owner/Business analysts
            - What is the problem/feature we are solving/implementing?
        - Developers
            - How are we solving/implementing the problem/feature?
        - Testers
            - Are we solving/implementing the problem/feature correctly?
    - BDD process
        1. The "three amigos" get together and collaborate to document expected behaviors in plain "English-like" syntax (Gherkin)
        2. Test Automation engineers write tests that validate the described behaviors
        3. Developers implement the application with the objective of passing the test cases
    - Behave
        - A framework for Python in which 2 types of files exist:
            - Feature files
            - Step definition files
        - Feature file
            - `.feature` extension
            - Uses Gherkin syntax
            - Lists out various scenarios that belong to a feature
            - Scenario: a concrete example of the behavior of the system
                - Each scenario has a series of steps
            - Steps
                - Keywords
                    - Given: specifies a precondition
                    - When: specifies the occurrence of an event
                    - Then: specifies the expected outcome after the event
                    - And
                    - But
        - Step definition
            - Contains methods that are linked to particular "steps"
            - These methods contain actual automation code (such as Selenium related code) that will automate a particular set of actions
    - Benefits of BDD
        - Encourages development and maintenance of system documentation understandable to both technical and non-technical team members -> "living documentation"
        - Emphasizes effective communication between all members of a team
        - Aids in development AND testing of a system by providing a framework in which test driven development (TDD) can proceed
* Selenium
    - A set of different software that faciliates browser automation
    - 3 tools
        - Selenium WebDriver: a tool that enables the writing of automation scripts using various programming languages
            - Python
            - Java
            - C#
            - Ruby
            - etc.
        - Selenium IDE: a tool that enables "record-and-playback" of interactions with the browser to easily create scripts
        - Selenium Grid: a tool that enables the distribution of automation scripts to many different machines from a central location
    - **Focus is on Selenium WebDriver**
    - Setting up and using Selenium WebDriver
        1. Download the appropriate webdriver for a particular browser that is being used (ChromeDriver, GeckoDriver (firefox), SafariDriver, etc.) and place it into the project directory
        2. Install the Selenium WebDriver API into the software project 
            - Python: `pip install selenium`
        3. Write code that will instantiate a WebDriver object
            - Python: `driver = webdriver.Chrome('./chromedriver.exe')`
        4. Use the .get method to go to a webpage
            - `Python`: `driver.get('http://google.com')`
        5. Locate elements using `driver.find_element(..., ...)` or `driver.find_elements(..., ...)`
        6. Perform various actions on those elements
    - Finding elements
        - `driver.find_element(<locator>, <value>)`
            - Returns a WebElement object that represents the first occurrence that matches the locator in the HTML document
        - `driver.find_elements(<locator>, <value>)`
            - Returns a list of WebElement objects that represent all locator matches in the HTML document 
    - Selenium Locators
        - By.ID: id attribute
        - By.CLASS_NAME: class attribute
        - By.NAME: name attribute
        - By.TAG_NAME: element name
        - By.LINK_TEXT: full match of `<a>` tag text
        - By.PARTIAL_LINK_TEXT: partial match of `<a>` tag text
        - By.XPATH: XPath
        - By.CSS_SELECTOR: CSS selector
    - XPath
        - A set of syntax/rules that allows for traversal through nodes in a document
        - Most powerful way to locate elements
        - More flexible than CSS selectors
        - HTML elements can be modelled as "nodes"
        - Parent-child traversal is possible
        - Two types of XPath
            - Relative XPath
                - `//`
                - Allows for skipping to elements that match the condition
                    - ex. `//*[@class='class-a']`
            - Absolute XPath
                - `/`
                - Specifies traversal from parent to children
                - `/html/body/div[1]/p`
        - General rule of thumb: be as specific as possible when writing XPath to select elements
        - XPath position
            - Elements can be selected according to position
            - Starts at 1 and goes up
            - `[]` syntax
            - `//div[2]`
                - Select every second div within all parent elements
        - XPath functions
            - `last()`
            - `text()`
            - `contains()`
            - `position()`
            - `not()`
            - etc.
        - XPath operators
            - `!=`
            - `=`
            - `<`
            - `>`
            - `<=`
            - `>=`
            - `and`
            - `or`
        - XPath attribute
            - Refer to attributes using `@<attribute name>`
            - ex. `@id`, `@class`, `@name`
        - Axes
            - Used to traverse from parent-child, etc.
            - Powerful way to move up and down the levels in the tree of nodes
                - `parent`
                    - `//td[text()='Westview Middle']/parent::tr`
                    - Selects the parent tr element of any td with the text "Westville Middle"
                - `following-sibling`
                - `following`
                - `preceding`
                - `preceding-sibling`
                - `child`
                - `ancestor`
                - `descendant`


        

