# Week 1 Review

## Tooling
* IDEs
    - Integrated development environment
        - Provides useful productivity features for development
            - Linting
            - Execution
            - Debugging
            - Running tests
            - etc.
        - Language-specific
    - Example
        - PyCharm

* Text editors
    - You can write code using text editors
    - Source code is just "plain-text"
    - Examples
        - Visual Studio Code
        - Notepad
        - Notepad++
        - Sublime Text

## Python
* Python Introduction
    - Interpreted
        - Python programs run using an interpreter
        - An interpreter is a piece of software that will read the code line by line AS THE PROGRAM IS RUNNING and translate it into something that the computer will understand
        - Compiler v. Interpreter
            - Compilers translate source code into lower-level code that will later be executed
            - Interpreters translate source code into lower-level code that gets executed while the program is running
    - High-level
        - Easy for humans to understand and read/write
        - Programming languages that are high level allow for greater productivity, more people to become developers, etc.
    - Dynamic
        - Variables are able to store many different types of data
        - You can change what type of data a variable is storing
    - Strongly-typed
        - All conversions from one datatype to another must be explicit
        - `print('number: ' + str(5))`

* Python Interpreter
    - Many different versions
        - CPython
            - Written in C
            - Official "reference" interpreter
            - Found whenever you installed Python from python.org
        - JPython
            - Written in Java
        - IronPython
            - Written in C#
    - Structure
        - Just-in-time compiler (JIT)
            - Translates Python code into "byte-code"
        - Virtual Machine
            - Executes the byte-code
            - Translates byte-code into machine code that the computer can execute

* History of Python
    - Created by Guido Van Rossum
        - Designed the idea of the Python programming language in the 1980s
        - The first implementation was created in 1991
    - Versions
        - Python 2
            - Legacy version of Python
            - A lot of companies still use Python 2 programs
            - Different syntax than Python 3
        - Python 3
            - Current version of Python
            - Not backwards compatible with Python 2
            - All existing Python 2 code would need to be updated by developers to be able to run within the Python 3 ecosystem

* Python Keywords
    - Reserved words that cannot be used as identifiers

* Python identifiers
    - Names for variables, classes, or functions
    - Rules
        - valid: a-z, A-Z, 0-9, _
        - invalid: !@#$%^&*()
        - Cannot start with a number

* Python datatypes
    - `str`
    - Numeric types
        - `int`
        - `float`
    - Boolean type
        - `bool`
    - Sequence types
        - `list`
        - `tuple`
        - `range`
    - Dictionary type
        - `dict`
    - None type
        - NoneType
            - `None`

* Arithmetic Operators
    - `+`
        - Addition
    - `-`
        - Subtraction
    - `*`
        - Multiplication
    - `/`
        - Division
    - `//`
        - Integer Division
        - Truncates the decimal places
    - `%`
        - Modulus
        - Remainder
        - ex. `11 % 3 -> 2`, 11 / 3 equals 3 remainder 2
    - `**`
        - Exponentiation

* Assignment Operators
    - `=`
    - `+=`
    - `-=`
    - `*=`
    - `/=`
    - `//=`
    - `%=`
    - `**=`

* Statement v. Expression
    - Statement: a line of code that does something
    - Expression: a piece of code that evaluates to a single value
        - ex. `2 + 2`
        - ex. `addition(2, 2)`
        - ex. `10`
        - ex. `addition(2, 3) + 5`
        - ex. `addition(addition(2, 3), addition(3, 5))`
    - All expressions can be statements, but not all statements can be expressions

* Functions
    - A block of code that can be executed over and over
        - Reusable
    - The code does not run unless you invoke the function
    - `def <function name>(): `
    - Functions can be defined with parameters
        - Parameters represent values that can be passed into the function when the function is invoked
        - "Input"
    - Functions can also return values
        - `return` keyword
        - "Output"
        - If your function has no return keyword, it will return `None`
            - `print(print("Hello world"))` -> `print(None)`
    - Parameters v. Arguments
        - Parameters are the variables that are defined for the function that maps to the inputs into the function
        - ex. `def some_func(x, y):`
            - x and y are parameters
        - Arguments: what you actually pass, or input into the function whenever you invoke the function
            - ex. `some_func(10, 20)`
                - 10 and 20 are arguments that map to the parameters x and y

* Type conversion
    - Python is strongly-typed
        - Therefore, conversion must be done explicitly in Python
    - Functions to convert values
        - `int()`
        - `float()`
        - `str()`
        - `bool()`

* Truthy v. Falsy values
    - Falsy values
        - 0 or 0.0
        - Empty strings `""`
        - None
        - Empty lists `[]`
        - Empty tuples `()`
        - Empty dictionaries `{}`
        - Empty sets `set()`
        - Empty ranges `range(0)`
    - Truthy values
        - Non-zero numbers (both negative AND positive)
        - Strings that have characters
        - Lists, tuples, dictionaries, sets, and ranges that have values

* Slicing
    - Can be performed on
        - Strings
        - Tuples
        - Lists
    - Used to retrieve a segment of a string, tuple, or list
        - Creates a brand new object
    - Syntax
        - `my_list[<start>:<end>:<step>]`
        - Examples
            - `my_list[2:5]`
            - `my_list[::]`
            - `my_list[::-1]`
            - `my_list[3:]`
            - `my_list[5:10:3]`
            - `my_list[3::2]`

* String methods
    - `len(my_string)` to get the length of the string (# of characters)
    - `my_string.upper()`
    - `my_string.lower()`
    - `my_string.replace()`
    - `my_string.count()`
    - `my_string.find()`

* Comparison Operators
    - Are used to form an expression that results in a single boolean value
    - `==` Equal
    - `!=` Not Equal
    - `>` Greater than
    - `>=` Greater than or Equal
    - `<` Less than
    - `<=` Less than or Equal
    - `is` Identity

* Logical Operators
    - Are used to operate on boolean values to produce a single boolean value
    - And
        - True and True -> True
        - True and False -> False
        - False and True -> False
        - False and False -> False
    - Or
        - True or True -> True
        - True or False -> True
        - False or True -> True
        - False or False -> False
    - Not
        - not True -> False
        - not False -> True

* Memory Management
    - Two places in random-access memory (RAM)
        - Stack
            - Where variables that are not part of an object go
            - These variables contain the memory address location of the object it the variable is referring to
        - Heap
            - Contains objects
    - Every piece of data in Python is an object
    - Automatic memory management
        - Garbage collection
            - Objects that no longer have a reference are automatically destroyed by the garbage collector

* Control Flow
    - Conditional statements / branching statements
        - if
        - elif
        - else
    - Loops
        - While loops
            - Will continue looping until specified condition is False
        - For loops
            - Used to iterate over iterable objects
                - Ranges
                - Lists
                - Tuples
                - Strings
                - Sets
                - Dictionaries

* Python collections
    - List
        - Ordered collection of elements
        - Elements can be added over time (no limit)
        - Mutable
        - Elements can be accessed by index (starting at 0)
            - ex. `my_list[0]`, `my_list[5]`
        - Methods
            - .append()
            - .clear()
            - .copy()
            - .count()
            - .extend()
            - .index()
            - .insert()
            - .pop()
            - .remove()
            - .reverse()
            - .sort()
    - Tuple
        - Ordered collection of elements
        - Immutable
        - Elements can be accessed by index (starting at 0)
            - Works similarly like a list
        - Values cannot be changed or added to a tuple once it has been created
        - Methods
            - .index()
            - .count()
    - Set
        - UNORDERED collection of elements
            - There are no indices
        - Sets can only have unique values
            - No duplicates
        - can use the `in` operator to check if a value exists in a set
            - ex. `"apple" in my_set` -> True/False
        - Methods
            - .add()
            - .clear()
            - .copy()
            - .difference()
            - .difference_update()
            - .intersection()
            - .intersection_update()
            - etc...
    - Dictionary
        - A set of key-value pairs
            - Key 
                - Unique
                - serves as an identifier for a value
                - must be immutable objects
                    - Strings
                    - Numbers
                    - Tuples
            - Values can be any object
                - Do not need to be unique
        - You can retrieve the value corresponding to a particular key
            - ex. `phone_book['john']`

* `in` Operator (membership operator)
    - Used to check whether a value exists within a given collection
        - Lists
        - Dictionaries
        - Sets
        - Tuples
    - examples
        - `"my_key" in my_dict`
        - `2 in my_list`
        - `"apple" in my_set`

* *args and **kwargs
    - *args
        - Variable arguments
        - Allows us to pass in an indefinite number of arguments when invoking the function
        - The args parameter is treated as a tuple
    - **kwargs
        - Keyword arguments
        - Allows us to specify arguments based on keyword
            - ex. `do_math(10, 20, operation="multiply")
        - The kwargs parameter is treated as a dictionary
            - The keyword is a key, the argument itself is the value
    - Functions can have a combination of all 3
        - Positional arguments (regular arguments)
        - Variable arguments (*args)
        - Keyword arguments (**kwargs)

* Python modules
    - The module system allows us to have multiple files in our Python application
    - We can "link" files together by importing them
    - Import usages
        - usage 1
            - `import my_math_utility`
            - `print(my_math_utility.addition(10, 20))`
        - usage 2
            - alias
            - `import my_math_utility as m`
            - `print(m.addition(10, 20))`
        - usage 3
            - `from my_math_utility import addition`
            - `print(addition(10, 20))`

* PyPi
    - Public repository for Python packages
    - Many packages are available for developers to make use of
    - ex. `pytest`, `numpy`, `matplotlib`, `flask`, `pandas`, `psycopg2`
    - Packages can be installed to computer using pip

* Pip
    - "Package Installer for Python"
    - Software tool used to install Python packages from PyPi
    - `pip install <package name>`

* Virtual Environment
    - Allows us to have independent versions of dependencies (packages) for each Python project
        - Solves the problem where different projects require different versions of a package
    - Can be created through
        - PyCharm
        - Command line
            - `python -m venv venv`
    - The virtual environment can be activated on the command line
        - `source venv/Scripts/activate`
        - Packages can then be installed to the virtual environment
            - `pip install <package name>`
    - `deactivate` to exit the virtual environment in the command line

## Git
* Git
    - Version control system
    - Used for managing versions of a project
        - These versions are known as commits
    - Project structure
        - Working directory
            - Containing all of the files you are actually working with in your project
        - .git folder
            - Staging area
                - Files from the working directory are added to the staging area using `git add`
            - Local repository
                - Files from the staging area are committed to the local repository using `git commit`
        - Remote repository
            - Exists in another location
                - Ex. Github, Gitlab, BitBucket, SourceForge
            - Changes from the local repository can be pushed to the remote repository using `git push`
* Git commands
    - `git init`
        - Initialize a new local repository
    - `git remote`
        - Used to configure remote repositories that the local repository should be linked to
        - ex. `git remote add origin <link>`
    - `git log`
        - Display the history of commits
    - `git reset`
        - Rollback to previous commits
    - `git clone`
        - Clones the remote repository to your computer and creates a local repository
    - `git pull`
        - "Pulls the latest changes from the remote repository to the local repository"
        - Combination of two commands
            - `git fetch`
            - `git merge`
    - `git fetch`
        - Download the changes made from the remote repository
        - Does not affect the working directory
    - `git merge`
        - Merging changes from one branch into another branch
    - `git checkout`
        - Switching the branch that you are on
    - `git branch`
        - Create a new branch
* Typical Git workflow
    - `git status`
    - `git add`
    - `git commit`
    - `git push`

## SDLC
* Software Development Lifecycle
    - Phases
        - Requirements phase
        - Design phase
        - Implementation phase
        - Testing phase
        - Deployment phase

## Testing
* Software Testing
    - Objectives
        - Assess the quality of software
        - Reduce the risk of software failure in operation
    - Not the same as test execution
        - Many activites are part of software testing
    - Types of Tests
        - Unit tests
            - Testing individual units of code
                - A single method/function or block of code
            - Performed in an automated fashion using unit testing frameworks such as `pytest`
        - Integration tests
        - End to end tests
    
* PyTest
    - A testing framework for Python
    - Test cases can be implemented in code
        - Test cases should be written in files with the filename containing `test_` at the beginning
            - ex. `test_my_math_utility.py`
        - Test cases are methods starting with `test_`
            - ex. `def test_addition_1():`
    - Tests can be executed
        - In PyCharm IDE
        - Running `pytest -v` in the command line

# Questions
## Git
* What is Git?
* What is Git Bash?
* What is the `working directory`?
* When you're inside of a directory on your computer, how can you tell that this directory is a git repository?
* What is the .git folder?
* What is the staging area and how do you add files to the staging area?
* What is the difference between a local repository and remote repository?
* How are git and Github different from each other?
* What command can you use to create a local copy on your computer of a repository that you found on Github?
* What command can you use to create a brand new local repository on your computer?
* What command can you use to view the history of commits?
* What 4 commands are part of the typical Git workflow?

## Programming
* What is a programming language?
* What is the difference between a high-level language and a low-level language?
* What is bytecode?
* What is machine code?
* What is a compiler?
* What is an interpreter?
* What is the difference between a compiled and interpreted language?
* What is an IDE? Is an IDE required to write a program?
* How are IDEs different than text editors?
* What is the difference between a statement and expression?

## Python
* What is Python?
* What does it mean for Python to be a dynamically typed programming language?
* What does it mean for Python to be a strongly typed language?
* What programming language is the official "reference" interpreter for Python written in?
* Describe the structure of the Python interpreter
* What versions of Python are there? Why is it important to know that these two versions exist?
* What are keywords?
* What are Python identifiers and the rules for how identifiers can be named?
* What datatypes does Python have?
* What is the difference between the normal division operator `/` and `//`?
* What are functions?
* How do you define a function in Python?
* Will the code inside a function run by only defining the function?
* How do you invoke functions?
* What are parameters?
* How are arguments different than parameters?
* What is the purpose of the `return` keyword inside a function?
* What does the function return if there is no return keyword?
* How can you convert a str into an int?
* How can you convert a float into a str?
* What would `print(int(10.7))` output to the console?
* What Falsy values are there?
* What is slicing and what can you perform slicing on besides strings?
* What is the syntax for slicing?
* What are some examples of methods that exist for strings?
* Explain what comparison operators do
* Explain what the logical operators do
* What portion of memory are objects stored in?
* Where are variables located in memory?
* What value do variables really store "under the hood"? For example, does x in `x = 10` really store the int 10 or something else?
* Explain how if, elif, and else work
* What are while loops and their syntax?
* What are for loops and their syntax?
* What collections does Python have?
* What is the difference between a list and tuple?
* How do you access elements from a list or tuple?
* What are some methods that you can use for a list?
* How would I go about printing out all of the elements one by one from a list?
* What is mutability v. immutability?
* Are lists immutable or mutable? What about tuples?
* What are sets?
* Can you access elements from a set using an index?
* What are some methods can we use for sets?
* What are dictionaries?
* Do keys need to be unique or can we have duplicates?
* Do values need to be unique or can we have duplicates?
* How do you access the value of a particular key-value pair?
* What is the purpose of the `in` operator?
* What are *args and **kwargs each used for?
* What is the Python module system and how can we use it?
* What is PyPi?
* What is pip? How do we install packages using pip?
* What is the purpose of using a virtual environment for a Python project?
* How do we go about installing packages inside our virtual environment?

## SDLC
* What phases are there in the SDLC?
* What happens in the requirements phase?
* What happens in the design phase?
* What happens in the implementation phase?
* What happens in the testing phase?
* What happens in the deployment phase?

## Testing
* What is the purpose of software testing?
* What types of tests (functional) are there?
* What is PyTest?
* How do we install PyTest?
* How do we write test cases with PyTest?
* What is the naming convention for the .py files that contain the unit test test cases?
* What is the naming convention of the test case functions?
* How do you execute the unit tests in the command line?
