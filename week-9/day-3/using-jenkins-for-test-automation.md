# Using Jenkins for Test Automation

Jenkins is "an open source automation server. It enables the automation of the parts of software development related to building, testing, and deploying an application"

## Testing Focus
As testers, we can utilize Jenkins to create an automated E2E execution server

Automation testers create a software project known as an automation test framework that contains the necessary tools + test cases for E2E automation
- Maven
- TestNG
- Selenium

By installing Jenkins onto a machine such as an AWS EC2 instance, and by pushing the automation test framework to a Github repository, we can configure Jenkins to have a pipeline that will pull the automation test framework code from the Github repository and automatically execute the E2E test cases.

# Steps
1. Create the EC2 instance
2. Modify the security group inbound settings for the EC2 instance so that we allow all incoming connections to port 8080 (because Jenkins runs on port 8080)
3. Follow the installation guide [here](./jenkins-ec2-setup.md) for installing Maven, Git, OpenJDK 8, Jenkins, and Google Chrome to the EC2 instance
4. Start up Jenkins using `sudo systemctl start jenkins`
5. Visit the Jenkins web panel by going to `<ec2 instance domain>:8080`
6. Obtain the "initialAdminPassword" by typing `sudo cat <path that the Jenkins setup prompt tells you>`
7. Install suggested plugins
8. Create a new pipeline by going to "new item"
9. Give the pipeline a name and select "freestyle project"
10. Fill out the Git source control path (using the HTTPS link for the Github repository)
11. For "Build Triggers", check the "GitHub hook trigger for GITScm polling" option
12. Scroll down to build steps and add `mvn clean` and `mvn test` within "execute shell"
13. Click build now to run the jenkins build for the newly created pipeline
14. Setup the automated trigger by going to the Github repository -> settings -> webhooks -> Add a webhook with a link to `<ec2 domain here>/github-webhook/` (YOU NEED THE SLASH AT THE END OR IT WILL NOT WORK)

Note: You must have ChromeOptions for your WebDriver with headless mode added for the tests to actually successfully execute on the EC2 instance

```java
ChromeOptions options = new ChromeOptions();
options.addArguments("--headless");

WebDriver driver = new ChromeDriver(options);
```