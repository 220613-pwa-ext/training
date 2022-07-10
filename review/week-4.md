# Week 4 Review

## Software environments
1. Development Environment
    - A shared server that developers use while working on the same project
    - Changes are constantly being made and deployed to the dev environment so that developers can get quick feedback on changes they are making seemingly working or not
2. Test Environment
    - Allows QA engineers/testers to do automated/manual E2E testing
    - Regression testing will be performed as well
    - Changes made by developers are deployed here once they have met certain criteria for the development of a particular feature/requirement
3. Staging/pre-prod environment
    - Nearly an exact copy of the production environment
        - Used to make sure that the software will work correctly based on production environment configurations/infrastructure
4. Production environment
    - This is the environment that actual live end-users utilize
    - Example: if you access Facebook.com, you are accessing the production environment

## Software Development Lifecycle (SDLC)
* Describes the process for developing software
* Phases
    1. Requirements Phase
        - Define the requirements of the system / what functionality should exist
        - What the development team should be working to develop
    2. Design Phase
        - Design documents are created based on the requirements
            - Examples
                1. Database diagrams
                2. Module functionality
                3. Architecture diagrams
                4. Functional logic of modules
                5. Inputs and outputs of each module
    3. Implementation Phase
        - Developers will write code
        - Longest phase of SDLC
        - Unit tests and integration tests may be written
    4. Testing Phase
        - QA team/testers test the software
        - Functional and non-functional testing occurs
        - Defects that are detected are reported to developers to be fixed and then re-tested
    5. Deployment + Maintenance Phase
        - The application is released to the customer / deployed to the production server
        - Application is monitored and any bugs reported by the customer are fixed, software is upgraded, enhanced, etc.
* Philosophies
    1. Waterfall
    2. Agile
    
### Waterfall Philosophy
* Philosophy of SDLC
* Progress moves "downwards" and not back up
    - Once you move to the next phase, there's no going back
* Cons:
    - Users may not know what they really want from the software without first trying it out
    - Progression through phases occur without testing along the entire way, so problems may not be detected until the testing phase or even later
    - Innovation can be stifled by following a strict plan
* Pros:
    - Easier for project managers to handle
        - If a particular phase takes longer than expected, a PM might choose to shorten the length of another phase
    - Good for projects that must be completed in one go instead of iteratively

## Agile Philosophy
* Philosophy of SDLC
* Progress occurs iteratively through many iterations
    - Iteration: A single cycle of the SDLC
        - Every iteration has small changes that are made
        - At the end of each iteration, software is released to the customer
* Core values of Agile
    1. Individuals and interactions over processes and tools
        - People's skills should be recognized and utilized
        - Face to face conversations are highly encouraged
    2. Working software over comprehensive documentation
        - Documentation can be important, but you want to make sure software is working first and foremast
        - Working software is the primary measure of progress
    3. Customer collaboration over contract negotiation
        - Stakeholders should give input in all stages of the development process to show what should be prioritized and to evaluate progress of the iteration
        - Stakeholder suggestions can be taken into account for future iterations
    4. Responding to change over following a plan
        - Change is inevitable
        - Plans may not last
        - The way in which a team works should be adaptive and minimize potential stress caused by change
* User Stories
    - User story: A requirement of an application (feature) written from the perspective of a user
        - Format: As a <>, I want to <>, so that <>
    - The details of the user story are laid out in acceptance criteria
        - Acceptance criteria: a set of predefined requirements that are part of the **definition of done** required to mark a user story as complete
            - Typically follow Given, When, Then format
    - Example: As a user, I want to register, so that I can login
        - Given that a user is at the registration page, when they enter a valid, untaken username and other valid information, then they should be able to register successfully
        - Given that a user is at the registration page, when they enter a valid password and other valid information, then they should be able to register sucessfully
    - Advantages of user stories
        1. Give context and why something is being created
        2. Helps to keep the customer in mind by seeing features from a perspective of a user
        3. Acceptance criteria associated with a user story can help the development team to define what it means to be done
    - Definition of Done
        - Defines what it means to be done with development of a user story
        - Criteria can vary by team. It is up to the team what their definition is
            - Example criteria
                - All acceptance criteria are met
                - Product owner accepts the work that was produced
                - Unit tests, integration tests, and E2E tests are written
                - All tests are passing
                - Code peer review performed
                - Documentation updated

## Scrum Framework (Agile)
* Scrum is a framework for Agile that contains more details on how to actually be Agile
* Scrum revolves around **sprints**
    - Sprint: A period of 1 - 4 weeks (usually 2 weeks) where work is completed
    - At the beginning of a sprint, a **sprint planning meeting** where the team determines what work (user stories) to accomplish
    - Every day, there is a **daily scrum / daily standup meeting** where everyone on the team gives status updates. They let the team know what blockers they have that must be resolved to move forward with progress
    - At the end of the sprint, there is a **sprint review meeting** where work is showcased by the team to various stakeholders and feedback is provided about the work. There is also a **sprint retrospective meeting** where the team gets together to see how they can improve for the next sprint
* Scrum Team
    1. Scrum Master
        - One person
        - Organizes the various Scrum meetings
        - Helps team members the best they can with resolving impediments / blockers
        - Servant leader mindset
            - Scrum Master should not be the "boss"
            - "What can I do to make the team more effective?"
        - Makes sure the team and organization as a whole adheres to Scrum values, principles, and practices
        - May be a developer that takes on this role or be a standalone role
    2. Product Owner
        - One person
        - Serves as point of contact between customers and scrum team
        - They don't own the product, they "own" the responsibility for the product's success
            - The product owner is the one who gets credit/blame for the product's failure/success
        - The product owner develops **user stories** for the product
        - They are responsible for adding/removing/modifying user story items in the **product backlog**
            - Product Backlog: collection of user stories that are to be assigned in future sprints
                - Contains the vision for future features/developments to the product
    3. Development team
        - Software Engineers + Testers
        - Responsible for developing the software
        - Responsible for the **sprint backlog**
            - Sprint backlog: a subset of items assigned during the **sprint planning meeting** from the product backlog to be completed in the current sprint
                - Items cannot be removed from the sprint backlog without negotation with the product owner
                - More items can be added if the team feels they can take on more work, however
* Scrum Artifacts
    1. Product backlog
        - Collection of user stories to be tackled in future sprints
        - Managed by product owner
        - Vision of future developments to the product
    2. Sprint backlog
        - Subset of items assigned from the product backlog to be completed in current sprint
        - Sprint planning meeting is where user stories to be added to the sprint backlog are decided upon
        - Development team will perform story point estimation to gauge how long each user story will take to complete
    3. Potentially shippable increment
        - The state of the software at the end of each sprint
        - Software should be working and deployable after each sprint
        - Software should not be left in a non-functional, un-deployable state
* Scrum ceremonies
    1. Sprint planning meeting
        - Determine what needs to be accomplished for the current sprint
        - Determine which user stories from the product backlog will be assigned to the sprint backlog
        - Story point estimation occurs (estimation of how long each user story will take to accomplish)
        - No more than 8 hours
    2. Daily scrum / daily standup meeting
        - Typically happens first thing in the morning
        - Often called daily standup since people actually stand during the meeting
        - Team members discuss what they did the previous day, what they plan to do for the current day, and if they have any impediments/blockers
        - No longer than 15 minutes
    3. Sprint review meeting
        - Showcase work to that was accomplished in current sprint to stakeholders
        - Scrum master, product owner, dev team, and stakeholders participate
        - Feedback can be received on the showcased work
    4. Sprint retrospective meeting
        - Discuss what went well, what didn't go well, and improvements that can be made for future sprints
        - Scrum Master, product owner, and dev team participate
        - Important part of improving team effectiveness
    5. Product backlog refinement
        - Review and clean up product backlog
            - Large user stories are split into smaller user stories
            - Details are added to user stories
            - Clarifications are made to user stories
            - Ambiguous or unclear user stories are modified or removed
        - Product owner meets with dev team to ask for feedback regarding product backlog items
* Story point estimation
    - Story point: a metric used to measure how long a user story will take to complete
        - Fibonacci sequence (1, 2, 3, 5, 8, 13, 21, ...) is often used
    - User stories are assigned a story point value based on the time estimated for its completion
    - Team velocity (how many story points the team completes per day/week/sprint) can be determined and help with future estimation of product timelines

## Software Testing
* Testing Mindset
    1. Start testing EARLY
        - Testing isn't necessarily on the implemented software itself
        - Testing starts with requirements
            - Do the requirements have ambiguities, fallacies, or contradictions?
            - If the requirements have errors, they could show up as defects/bugs in the application later
        - Proactive collaboration with other members of the development team during earlier phases of the SDLC
    2. Test software to find defects
        - You should NOT test software to avoid finding defects
        - You SHOULD test software so that you can find defects that can then be fixed
    3. 100% bug free is impossible
        - A tester should never say an application is "bug-free"
            - Upper managment or the stakeholders might want to hear "bug-free", but resist that urge
        - A more appropriate statement would be "we conducted testing on X, Y, and Z, but did not find any defects"
    4. Exhaustive testing is impossible
        - Exhaustive testing: testing many different combinations of inputs, sequences of button presses, etc.
            - All permutations are tested
        - Realistically impossible if there's many different inputs, buttons, sequences of events, etc.
            - Ex. 10 buttons -> 10! = 3628800 possible combinations
        - "Work smart, not hard"
            - Test scenarios that are the most common a user would take
            - Establish positive test cases first, then move to negative test cases
            - Utilize **black box testing techniques** such as equivalence partioning, boundary value analysis, decision tables, state transition diagrams, etc.
    5. Testing is context-based
        - What type of application? What company?
        - Ex. banking application
            - Government regulations
            - Subject to audits
    6. Beware of the pesticide paradox
        - As software matures and becomes more stable in the long run, the same test cases being executed over and over again as part of **regression testing** are less likely to fail over time and uncover defects
        - Test cases must be continuously updated with different input data or new test cases designed
        - Analogy to pesticides comes from bugs evolving resistance = new pesticide required
    7. Defects tend to cluster
        - 80% of the defects come from 20% of the modules (Pareto principle 80/20 rule)
            - Usually newer modules will have more defects
            - Save time by focusing on the most defect prone modules
* Testing Lifecycle
    1. Requirements analysis phase
        - Gather and analyze requirements
        - Review project documents, project structure, code, etc.
        - Analyze anything that gives a better understanding of the system/application
    2. Test planning phase
        - Answer the questions
            - What to test?
            - How to test?
            - When to test?
        - Activities
            - Identifying what resources are available
            - Cost/time estimation
            - Team structure
            - Test plan document creation
        - Inputs
            - Requirements
            - Project documents
        - Output
            - Test plan document
    3. Test design phase
        - Activities
            - Prepare test scenarios
            - Prepare test cases
                - Contained in test case document
            - Review test cases
            - Create traceability matrix
        - Input
            - Requirements
            - Project documents
            - Test plan document
        - Output
            - Test case document
            - Traceability matrix
    4. Test execution
        - Activities
            - Execute test cases
                - Manual or
                - Automated
            - Identify defects
            - Preparation of test report / test log
        - Input 
            - Requirements
            - Test plan document
            - Test case document
            - Software to be tested
        - Output
            - Test report
                - How many tests succeeded
                - How many tests failed
    5. Defect reporting/tracking
        - Activities
            - Preparation of defect report
        - Inputs
            - Test cases
            - Test report
        - Output
            - Defect report
    6. Test cycle closure
        - Activities
            - Analyze test reports
            - Analyze defect reports
            - Evaluate exit criteria
        - Inputs
            - Test report
            - Defect report
        - Output
            - Test summary report
* Test Documents
    1. Test plan document
        - Detailed document that describes
            - Objectives
            - Test strategy
            - Schedule
            - Time/cost estimations
            - Deliverables
            - Available resources
    2. Test case document
        - Document that contains test cases
        - Test case: a set of actions to be taken to validate functionality of an application
        - Each test case contains information such as
            - Test case ID
            - Test case description
            - Test data
            - Expected result
            - Actual result
            - Pass/Fail?
    3. Requirements Traceability matrix
        - Document that relates the requirements with test scenarios + test cases
        - Helps to keep track of what test cases exist for a particular feature and to determine whether additional test cases are required
    4. Test report
        - Document containing the results of test execution
        - What tests passed or failed?
    5. Defect report
        - Document/documents or records containing information about each defect discovered
        - Information may include for each defect, a
            - Defect ID 
            - Defect description
            - Steps to replicate
            - Date raised
            - Supporting documentation
            - Detected by
            - Status
            - Fixed by
            - Date closed
            - Severity
            - Priority
    6. Test summary report
        - Document that summarizes the results of the testing lifecycle
        - Contains a summary of test suites planned/implemented/executed
        - Contains a summary of test cases planned/implemented/executed/passed/failed
        - Contains a summary of defects found
* Types of testing
    1. Verification testing
        - Are we building the correct product?
        - Check if requirements are correct in accordance with customer wants/needs
        - Also known as static testing
        - Focus on documentation to make sure there are not any mistakes or miscommunication
        - Catch issues early before they make their way into the software being built
    2. Validation testing
        - Are we building the product correctly?
        - Testing to see if the product meets the requirements
        - Actual software is tested
        - Two broad categories
            - Functional testing
            - Non-functional testing
* Non-functional testing
    - Category of validation testing
    - Validating that performance, usability, and reliability of an application are acceptable
    - Cannot be answered with a yes/no question
        - Will be a qualitative or quantitative metric
    - Subcategories
        - Performance testing
            - Load testing: examining how an application performs under certain loads
                - Stress testing
                    - See how the application behaves under high load
                - Spike testing
                    - See what happens if there's a sudden spike in load
                - Ramp up/down testing
                    - See what happens as load is gradually ramped up and ramped down
        - Usability testing
            - Is the application realistically usable?
            - UX (user experience) testing
            - Ex. can the user actually read the text?
                - White background w/ white text
                    - A human cannot read the text
                    - An automated tool like Selenium may be able to
* Functional testing
    - Category of validation testing
    - Testing to see if software functions as specified by the requirements
    - Can be answered with yes/no
        - Passing/failing?
    - Functional testing levels
        1. Unit test
            - Fastest
            - Least comprehensive
            - Testing is performed on a single unit (method, conditional block of codes, etc. inside the method)
            - Any dependencies are mocked
            - Interacts directly with code
                - Methods are directly invoked
                - Contributes to code coverage
            - PyTest (Python), JUnit (Java) typically used
            - Automated
        2. Integration test
            - Fast
            - Fairly comprehensive
            - Testing is performed with modules connected (integrated) together
                - Ex. Backend
                    - Controller -> Service -> Dao -> in-memory database
            - Interacts directly with code
                - Methods are directly invoked
                - Contributes to code coverage
            - Automated
        3. End-to-end (E2E) test
            - Slower
            - Covers a path from end to end
                - Frontend -> Backend -> Database
            - Tests are performed with interaction being the same as what a user would do when interacting with the application
            - Manual or automated
            - Does not interact directly with the code
                - Does not contribute to code coverage
        4. User acceptance test (UAT)
            - Slowest
            - Actual users test the software to determine if the software is acceptable for real-world usage
            - Software is good in theory, but is it good in practice?
            - Alpha testing
                - In-house testing
            - Beta testing
                - Open beta (released to entire public)
                - Closed beta (limited sign-ups for public)
* Functional testing concepts
    - Regression testing
        - Testing to ensure that a recent change to the application did not affect existing features
        - Full or partial execution of existing test cases that were already previously developed to ensure existing functionalities are working
        - Can be expensive and time consuming
            - Test cases may need to be selectively chosen for execution
            - Manual test cases are a main contributor to cost
                - You're paying people to spend time executing manual test cases
        - Cost of regression testing can be reduced by automating test cases
    - Smoke testing
        - Testing the most critical functionalities of an application to make sure the build is stable enough for further testing
        - Smoke testing should be performed before regression testing
            - "Where there's smoke, there's fire"
            - If the most critical functionalities are not working, the application is likely "on fire"
            - Should be fixed before moving forward with extensive regression testing
        - Subset of smoke testing called sanity testing
            - Sanity testing is testing to make sure recent code changes are working as expected
    - Whitebox v. blackbox testing
        - Whitebox test
            - Tests that interact directly with code
            - Require direct knowledge of the code
        - Blackbox test
            - Tests that do not interact directly with code
            - Do not require knowledge of the code
        - Testing levels
            - Unit (whitebox)
            - Integration (whitebox)
            - E2E tests (blackbox)
            - User acceptance tests (blackbox)
    - Positive v. negative testing
        - Positive test: test case that acts on a scenario in which a user is utilizing an application's functionality "correctly"
        - Negative test: test case that acts on a scenario in which a user is utilizing an application's functionality "incorrectly"
        - Example: login
            - User enters valid credentials (positive scenario)
            - User enters invalid credentials (negative scenario)
    - Exploratory testing
        - An approach to testing that relies on the skills/talent of the tester to explore and uncover defects
        - Simultaneously learning, designing, and executing test cases
        - Can be used in situations where the system's requirements may not be well defined
    - Exhaustive testing
        - Testing every possible combination
        - Not feasible
        - "Exhaustive testing is impossible" <- testing mindset
        - Utilize blackbox testing techniques to establish a baseline for test cases that must be developed
    - Manual testing
        - Test cases being executed by hand
        - A tester will use the application and see if its functionalities are working
    - Automation testing
        - A programming language is utilized to automate the steps that should be taken for a particular test case
        - The test cases are codified as a scripted series of steps using a programming language and then from that point on, the computer can perform execution of the test case at the "push of a button" over and over
        - Especially useful in reducing the cost of regression testing
* Blackbox testing techniques
    - Equivalence partitioning
        - Divide test values into smaller intervals
    - Boundary value analysis
        - Choose test values at the boundaries
    - Decision table testing
        - Decision table: tabular representation of inputs and conditions
        - Helps in covering possible scenarios for a feature
    - State transition testing
        - State transition diagram: visualization of the flow of transitioning from one state to another
        - Useful in covering possible scenarios for a feature that depends on state
            - Ex. Limited number of login attempts may impact what the expected conditions are