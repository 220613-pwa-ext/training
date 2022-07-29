# Project 2
Project 2 is a group-based, full-stack application that you will be designing and implementing based on user stories of your own choosing.

- Testing
    - Test driven development
    - Test Plan document
    - Spreadsheet outlining
        - Requirements (user story, multiple acceptance criteria for each user story)
        - Test scenarios
        - Test cases
        - Defect reports
    - Requirements traceability matrix
        - Trace requirements to test cases
    - Test summary report
    - Automation
        - Should utilize BDD framework (Cucumber)
            - Test cases should be translated to feature files
            - Step definition files should contain Selenium code to interact with the webpage
        - Test automation should be performed in Java
            - Should be a separate project from the backend
            - Selenium WebDriver (Java)
            - Cucumber (BDD)
            - TestNG (test execution/assertion framework)
- Backend
    - The backend will be a RESTful API
    - Can either be developed in Python OR Java
        * Python
            - Flask
            - Psycopg
            - PyTest
        * Java
            - Javalin
            - JDBC
            - JUnit (for unit tests)
    - Unit tests
        - Have minimum service layer coverage of 80%
        - Utilize mocking as necessary
- Frontend
    - HTML, CSS, JS
    - Must consume the backend API (frontend + backend integration)
- Cloud deployment
    - Utilize AWS
    - Deploy application to AWS EC2 instance
    - Utilize AWS RDS for Postgres database hosting
- DevOps pipeline
    - Setup Jenkins pipeline for automated building and deployment of backend + frontend

# GitHub suggestion
- Create a separate repository for the backend
- Create a separate repository for the frontend

# Steps each team should complete
As a team, you must
* Decide a project idea to design and implement
* Have a name for your project (this will show up on your portfolio, so have a good name!)
* Have a description for the project (this will show up on your portfolio, so have a good description!)
* Have several user stories formatted in the format `As a <user description>, I want <functionality>, so that <benefit>`

Please create a document containing the above information and have someone from the team email it to me. After that, I can do a quick review of the project idea and give an all clear for the project or whether more clarifications need to be made

# Project Due Date
August 15th
    