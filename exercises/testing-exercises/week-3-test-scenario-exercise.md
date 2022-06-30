# Week 3 Test Scenario Creation

Situation: Imagine you are working as QA engineer at company XYZ. The company is implementing a registration system for customers to be able to log in and use the software. Your job is to first draft the test scenarios that will later be passed off and developed into test cases. These test cases will then later be automated by yourself by writing code.

### Exercise: Create as many test scenarios as you can think of based on the listed requirements for registration functionality

---
# Registration requirements
The system will require that users register by providing a first name, last name, username, password, email, and gender that matches specific requirements
for each field. 

* Fields: 
    - All fields must be provided (not blank)
    - First name
    - Last name
    - Username
    - Password
    - Email
    - Gender
* First name:
    - Must contain only alphabetical characters with a minimum length of 2 and a maximum length of 100. Spaces are not allowed
* Last name:
    - Must contain only alphabetical characters with a minimum length of 2 and a maximum length of 100. Spaces are not allowed
* Username
    - Must have at least 6 characters. Alphabetical `[a-zA-Z]` and numeric characters `[0-9]` as well as special characters 
`[!@#$%^&*()_]` are the characters permitted
* Password
    - Must have at least 6 characters, contain at least 1 special character `[!@#$%^&*()_]`, contain at least 1 lowercase letter `[a-z]`,
contain at least 1 uppercase letter `[A-Z]`, and contain at least 1 number `[0-9]`
* Email
    - Must follow the proper format of `<username>@<domain>`