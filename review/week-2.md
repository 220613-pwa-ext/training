# Week 2 Review

## Web Services
* Web Service
    - A service provided over the web via **web servers**
    - HTTP is the protocol utilized for communication with web services
    - Two types of web services:
        - SOAP (old)
        - REST (modern)
* HTTP
    - HyperText Transfer Protocol
    - Traditionally used for web browsers to communicate with web servers
        - Web browser is an example of a client
        - Web server is an example of a server
    - Revolves around the client-server model of communication
        - Client initiates a request
            - The client is always the one that starts the communication
        - Server responds with a response
    - HTTP Request
        - Method/Verb
            - GET, POST, PUT, PATCH, DELETE
        - URI (Uniform resource identifier)
            - ex. `/users`
        - Request Body
            - Contains data that may be represented in a format such as JSON or XML
            - Optional
        - Request Headers
            - Optional
            - Provide metadata that the server may choose to use
            - ex. `Content-Type: application/json`
                - Indicates to the server that JSON is being sent in the request body
        - HTTP Version
            - Indicates which version of the HTTP protocol is being used
    - HTTP Response
        - Status Code
            - Categories
                - 1XX series: informational
                - 2XX series: Success
                - 3XX series: Website redirects
                - 4XX series: Client-side error
                    - Normal part of an application
                    - We need to anticipate what sort of things a user might do incorrectly when interacting with the application
                    - That's when we would do various checks in terms of our business logic in order to send back an appropriate 4XX status code in such an event
                - 5XX series: Server-side error
                    - In general, this is caused by not handling an exception
                    - If an exception is allowed to propagate all the way to the bottom of the callstack without being handled, then it will default to 500 Internal Server Error for the status code
                    - What might be a 4XX status code will be a 5XX status code if you're not actually thinking about handling certain situations
                    - Rule of thumb: avoid 500 internal server errors by actually thinking about different situations you might run into with a users' usage of the application
                        - You can connect this with the testing mindset where we should not only test the correct way of using the app, but also the incorrect way of using it (positive v. negative testing)
                        - In Python: **exceptions and exception handling** is important to understand
        - Response Body
            - Contains data that may be represented in a format such as JSON or XML
            - Optional
        - Response Headers
            - Optional
            - Provide metadata that the client may choose to use
        - HTTP Version
            - Indicates which version of the HTTP protocol is being used
* REST
    - Representational State Transfer
        - Data is represented in the form of resources
        - It's a standard on how we utilize the HTTP protocol to send data around within modern web communication
    - Utilized particularly for CRUD operations
        - C - Create
        - R - Read
        - U - Update
        - D - Delete
    - CRUD operations are performed on resources
    - HTTP verbs/method are used according to proper convention
        - Create - `POST`
        - Read - `GET`
        - Update - `PUT` or `PATCH`
        - Delete - `DELETE`
    - Resources can have a hierarchy (sub-collection)
        - ex. `/users/bachy21/todos`
            - Todos belong to a particular user resource
            - "One user can have many todos"
        - You can also get a single resource from a "sub-collection"
            - ex. `/users/bachy21/todos/10`
                - 10 represents an id that uniquely identifies a particular todo
    - Singleton and Collection resources
        - Singleton: GET `/users/bachy21`
        - Collection: GET `/users`
    - Best practices for naming the URI
        - Use nouns to represent resources
        - Use - instead of _ to separate words in a resource
            - ex. `/users/bachy21/bio_info` is bad
            - ex. `/users/bachy21/bio-info` is good
        - Use lowercase letters
        - Don't use CRUD function names in URIs
            - ex. POST `/createuser` is bad
            - ex. POST `/users` is good
        - Use query parameters to filter collections of resources
            - ex. GET `/users/bachy21/todos?completed=yes`
                - `completed=yes` is a query parameter
        - No trailing forward slashes
            - ex. `/users/bachy21/` is bad
            - ex. `/users/bachy21` is good
    - Path parameters v. Query parameters
        - Path parameter
            - Providing some sort of parameter such as user_id, username, etc. within the path
                - ex. `/users/<username>`: username is a path parameter
            - Should be used to identify a particular singleton (single entity of a type of resource)
        - Query parameters
            - Providing some sort of parameter after the path (denoted by a question mark to separate the path from the query parameter(s))
                - ex. `/users?birthdaymonth=november&agegreaterthan=30`: birthdaymonth and agegreaterthan are query parameters
                - Getting ALL users who were born in november and are older than 30
            - Should be used to filter a collection of resources
    - REST constraints
        - Uniform interface
            - The API should follow the same consistent format for all resources
        - Client-server
            - Client and server should be able to evolve independently from each other
            - Client should only need to know the resource URIs
                - Keep it simple
        - Stateless
            - The server will not store anything about previous HTTP requests
            - Once a request is made and a response is provided, the server will not remember that interaction
            - In other words, the server does not keep track of any state
        - Cacheable
            - If the same data is requested over and over, there should be the ability to cache the response to improve system performance
            - Instead of querying a database each time for the same info, we can cache that data on the web server directly itself
        - Layered System
            - A complex system consisting of many different layers communicating with each other should be hidden from the client
            - The client shouldn't need to know all of the complexity behind the scenes
        - Code on demand (optional)
            - Server can send executable code back to the client
            - Optional
            - Obvious security concerns
* Richardson Maturity Model
    - Describes the maturity of the API (in terms of it being RESTful)
    - 4 levels
        - Level 0: POX Swamp
            - Not really following any sort of convention
            - We're just defining random endpoints that correspond to certain operations without really thinking about the structure of our resources and operations
        - Level 1: Resources
            - We still use HTTP verbs/methods randomly and don't follow convention for those
            - But we now separate our resources into properly identified URIs
        - Level 2: HTTP Verbs
            - Utilize proper HTTP verbs/methods corresponding to the appropriate CRUD operation as well as well-defined resources from level 1
        - Level 3: Hypermedia controls
            - Introduces the concept of HATEOAS (Hypermedia as the engine of application state)
            - Within the response body, there are links to other resources that can be used to inform the client what requests it might want to send for other related resources

## Flask
* Micro-framework used to create web APIs
    - Micro: is very lightweight and simple, but extensible
        - Flask has additional packages that can be installed if you choose to do so
            - ex. `flask-restful`: adds additional features that a developer can use to simplify the development of a RESTful API
    - Flask provides a built-in web server
        - When we run our application, the web server will start up within the application itself
        - This web server is abstracted away from us behind the scenes
            - We don't need to worry about complexity of the actual web server code
    - We can define various functions that will be executed whenever a request corresponding to the endpoint that is mapped to that function is received
        - Endpoint:
            - Identified by the HTTP verb/method + URI
            - `GET /users` is one endpoint
            - `POST /users` is another endpoint
    - Flask can extract data from an HTTP request
    - Flask can send data in the HTTP response back to the client

## Python
* Procedural programming
    - To put it simply, lines of code and functions without defining any classes and instantiating objects
* Object-oriented programming
    - A style of programming that revolves around the idea of objects
    - Objects have
        - Attributes (object scoped variables)
        - Behaviors (methods)
    - Method: a function defined inside a class
        - Instance methods: a method that, when invoked, is able to modify the attributes of the particular object being interacted with through that method (an instance method is scoped to a particular object/instance)
        - Static methods: a method that does not belong to a particular object. It belongs to the class
            - Instance method approach
                - `p1.have_birthday()`: increase the person's age by 1 (instance methods)
            - Static method approach
                - `Person.average_age(my_list_of_person_objects)`: average_age is scoped to the class itself, not to an individual person object 
    - Special Dunder Methods (magic methods)
        - Dunder: Double underscore
        - `__init__(self)`
            - Constructor
            - When we instantiate/construct an object, the constructor is invoked and helps us to populate initial values for the attributes of that particular object we are creating
                - `def __init__(self, first_name, last_name, age):`
                    - `self.first_name = first_name`
                    - `self.last_name = last_name`
                    - `self.age = age`
        - `__str__(self):`
            - You can define a custom string that will be printed out whenever you print the object
                - Usually, you will define a string that contains the values of the attributes
                - ex. `return f"Person [first_name = {self.first_name}, last_name = {self.last_name}, age = {self.age}]"`
        - `__contains__(self, name):`
            - Used whenever we want to actually be able to utilize the `in` operator with that object
            - This method should return a boolean (True or False)
            - ex. `<name> in <object>`
        - `__len__(self):`
            - Used to be able to utilize the `len()` function on the object
            - This method should return an int
        - `__add__(self, other):`
            - Allows you to "add" two objects together
        - `__sub__(self, other):`
            - Allows you to "subtract" objects
        - etc.
    - Constructing an object in Python
        - Syntax
            - `<classname>(..., ...)`
            - ex. `Person("John", "Doe", 49)`
* Errors and Exceptions
    - Two types of errors:
        - Syntax errors
            - Errors caused by writing incorrect syntax (or grammar) within the programming language
                - Misspellings, lack of identation, improper usage of a keyword, etc.
        - Exceptions (logical errors)
            - These are errors that occur during the **normal operation** of a program
            - Examples
                - Trying to access the value of a key that doesn't exist in a dictionary
                    - `KeyError`
                - Trying to divide by 0
                    - `ZeroDivisionError`
                - Trying to convert a string with non numeric characters into a float
                    - ex. `float("abc")`
                        - `ValueError`
                - Custom exceptions can be "raised"
                    - ex. `raise MyCustomError("Here is our error message")`
    - Handling an exception
        - Remember we can actually raise our own exceptions in addition to what Python might already raise for certain conditions like the ones mentioned above
            - ex. `raise MyCustomError("Here is our error message")`
        - In order to handle any exception though, we need to use a `try` block and `except` block
            - `try` block
                - The code that may raise an exception should be contained in the try block
            - `except` block
                - Code that should be executed if a particular exception occurs
                - ex. `except ValueError as e:`
                - You can have multiple except blocks
                - An except block can even catch multiple different types of exceptions
                    - ex. `except (ValueError, ZeroDivisonError) as e:`
    - Creating a custom exception
        - Create a class that inherits the Exception class
            - ex. `class MyCustomError(Exception):`
                - The body of the class will not contain anything
                - Just use the `pass` keyword for the class body
* 4 Pillars of OOP
    - Encapsulation
        - Combining methods and attributes into a single unit (class)
        - Methods defined within the class should be able to interact with the data within a particular instance of that class (object)
            - Any sort of general behaviors
                - ex. `p1.have_birthday()`
            - Getters: allow for us to access the data via a method that returns that data
                - ex. `p1.get_first_name()`
            - Setters: allow for us to set the data via a parameter passed into the method
                - ex. `p1.set_first_name("John")`
        - Private attributes that can only be accessed through getters/setters instead of directly
            - Attributes should be prefixed with double underscore (__)
            - We should NOT be able to directly access attributes like this:
                - ex. `p1.first_name = "John"`
                - ex. `print(p1.first_name)`
            - Instead we should use getters/setters like this:
                - ex. `p1.set_first_name("John")`
                - ex. `print(p1.get_first_name())`
                - The first_name attribute will be defined as `self.__first_name = ...`
    - Inheritance
        - Consists of a parent class and child class
        - The child class inherits from the parent
            - Attributes of the parent
            - Methods of the parent
        - In Python, the syntax for inheritance is
            - `class Dog(Animal):`
                - Child class: Dog
                - Parent class: Animal
        - The child class will need to use super() inside of the `__init__()` method in order to set the parent attributes
            - `super().__init__(..., ...)`
            - In the child, the above code will allow it to invoke the parent's constructor (__init__)
    - Polymorphism
        - Means "many-forms"
        - Two types of polymorphism
            - Method Overriding
                - The child class has the same method name as the parent class
                - The number of parameters should also be the same
                - The thing that is different is the code defined for the child method v. the parent method
                - "We are overriding the implementation of the parent method"
                - Runtime Polymorphism (the implementation used depends on the object currently referred to at that time)
            - Method Overloading
                - Not natively supported by Python
                - We have two methods in the SAME class with the same name but different number of parameters
                - Languages that support overloading (such as Java) treat these methods as totally different methods from each other (they just happen to have the same name)
                    - We are able to distinguish which method will be executed by the number of arguments being passed when invoking the method
    - Abstraction
        - Hiding the inner workings of something you are interacting with
        - Abstract methods are defined in an abstract class (or interface)
            - Abstract method: A method without a body (no code)
            - Abstract class: A class that can contain abstract methods and cannot be instantiated
        - A child class will inherit the abstract class and provide an implementation for the inherited abstract methods
            - Concrete method: A method that contains an actual body (code)
        - The idea of abstraction in OOP is related to the idea of abstraction in the real world
            - Animal v. Dog
            - The idea of an Animal is abstract, while Dog is a concrete idea
                - What noise does an Animal make? We don't know
                - What noise does a Dog make? Bark!

## Testing Concepts
- Approaches to development
    - Write code first, write tests later
    - Write tests first, write code later
        - **Test Driven Development (TDD)**
            - We think about the requirements of the application, immediately translate those into test cases, then we create our application around those test cases
            - TDD allows us to always keep our focus on the requirements, assuming that the test cases are conforming to the requirements
- Who writes test cases?
    - 3 test levels
        - Unit testing
            - Testing the smallest units of code (methods and individual blocks of code inside a method (if statements, elif, else, different conditions that might run depending on the input to the method))
            - Done in the implementation phase of the SDLC
            - Developers write unit tests (code) for the code they write
            - Automated
        - Integration testing
            - Testing units that are combined together to see if they work together properly or not
            - Done in the implementation phase of the SDLC
            - Developers write integration tests (code) for the code they write
            - Automated
        - End-to-end testing
            - Testing the entire system as a whole working together (Frontend, backend, database, etc.)
            - Testing performed from the perspective of the end user
                - Typing into input boxes, clicking buttons, etc.
            - Manual or Automated
            - Testers will write test cases
                - Test cases can be simple entries in an Excel document (not even code)
                - It's only when you want to automate the execution of those test cases that you write code
                    - QA Automation Engineer
- Test Scenario
    - Actions that a user may perform for a particular feature in an application
    - Once we identify requirements for a particular feature, we can analyze those requirements to help guide us in creating test scenarios
    - Test scenarios are used to guide us in creating test cases
- Test Case
    - A specification of inputs, execution conditions, testing steps, and expected results
    - Test cases can be manually executed by a tester
        - Somebody can sit down at the computer and follow each test case step by step
    - Actual results are compared against the expected results
        - If they are the same, then the test case is considered PASSING
        - If they are different, then the test case is considered FAILING
- Positive v. Negative 
    - Not the same as passing or failing test cases
    - Positive test: Checking to make sure what happens when a user does something correctly is what should actually happen
        - ex. `Check if the user gets redirected to their profile page if they login with correct credentials` 
    - Negative test: Checking to make sure what happens when a user does something incorrectly is what should actually happen
        - ex. `Check if the user gets "username and/or password is incorrect" message if they login with incorrect credentials`
    - It's usually possible to write way more negative test cases than positive test cases
        - Check for edge cases where a user could do something incorrectly, or input extreme values

# Questions

## Web Services
* What two types of web services are most commonly used?
* What is the modern way of building web services?
* What communication protocol does REST use?
* What is HTTP?
* What are we using Postman for (in our training)?
* How does the process of communication using HTTP work?
* What components make up an HTTP request?
* What 5 HTTP verbs are most commonly used?
* What is the purpose of a URI?
* What is the purpose of a request body?
* What is JSON?
* What components make up an HTTP response?
* What are the categories of status codes?
* If we encounter a 500 internal server error while developing our web API, what should we do about it?
* What is the response body?
* What is REST?
* What are CRUD operations? What HTTP verbs/methods are associated with each letter in the CRUD acronym?
* What are the 6 constraints of REST?
* What are the best practices for naming your URIs in REST?
* What are examples of singleton, collection, and sub-collection URIs?
* What is the purpose of using query parameters v. path parameters?
* What are the 3 levels of the Richardson Maturity model?

## Flask
* What is Flask?
* What does flask provide us?

## Python
* What is object oriented programming?
* What is the difference between a class and object?
* If we have a class called `MyClass`, how do we create/instantiate/construct an object from that class?
* What do objects contain?
* What is the difference between a static method and an instance method?
* What is the purpose of the `__init__(self)` method?
* What is the purpose of the `__str__(self)` method?
    * `__contains__(self, name)`
    * `__len__(self)`
    - etc.
* What are the two types of errors in Python?
* What are exceptions?
* How do we handle exceptions?
* How do we raise an exception?
* How can we create a custom exeption?
* What is the purpose of the `try` block?
* What is the purpose of the `except` block?
* What is the purpose of the `finally` block?
* What are the 4 pillars of OOP?
* What is encapsulation? How do we achieve encapsulation?
* What is inheritance?
    * What is the super() function used for?
* What is polymorphism? What are the two types of polymorphism?
* What is abstraction?
* What is an abstract method?
* How do we create an abstract class?
* Are we required to implement an abstract method in the class that inherits the abstract class?

## Testing Concepts
* What is TDD?
* What is the advantage of TDD?
* Who writes unit tests?
* Who writes integration tests?
* Who writes end-to-end tests?
* Which of the 3 levels are usually always automated?
* Which of the 3 levels are either manual or automated?
* What is a test scenario?
* What is a test case?
* What is the difference between positive and negative tests? What are some examples of positive and negative tests?
