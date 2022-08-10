# Jenkins EC2 Setup
Once you have your EC2 instance up and running, you will want to install the following software
- JDK 8
- Git
- Maven
- Jenkins

# Initial commands
```bash
sudo yum -y update
```

# Install JDK 8
```bash
sudo yum install -y java-1.8.0-openjdk-devel

java -version
```

# Install Git
```bash
sudo yum install git -y
```

# Install Maven
```bash
sudo wget http://repos.fedorapeople.org/repos/dchen/apache-maven/epel-apache-maven.repo -O /etc/yum.repos.d/epel-apache-maven.repo

sudo sed -i s/\$releasever/6/g /etc/yum.repos.d/epel-apache-maven.repo

sudo yum install -y apache-maven

mvn -version
```

# Install Google Chrome
```bash
sudo curl https://intoli.com/install-google-chrome.sh | bash

sudo mv /usr/bin/google-chrome-stable /usr/bin/google-chrome

google-chrome --version && which google-chrome
```

# Install Jenkins
```bash
sudo wget -O /etc/yum.repos.d/jenkins.repo \
    https://pkg.jenkins.io/redhat-stable/jenkins.repo

sudo rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io.key

sudo yum upgrade

sudo amazon-linux-extras install epel

sudo yum install jenkins -y
```

# Starting and Stopping Jenkins

Starting Jenkins:

```bash
sudo systemctl start jenkins
```

Stopping Jenkins:

```bash
sudo systemctl stop jenkins
```

Checking on the status of Jenkins:

```bash
sudo systemctl status jenkins
```

# Accessing Jenkins
Jenkins will be running on port 8080. You just need the <EC2 Address>:8080 in the browser to access the "control panel" for Jenkins.

# Initial Password
```bash
sudo cat /var/lib/jenkins/secrets/initialAdminPassword
```

Copy and paste the password that the command outputs

# Swapfile configuration
Because our EC2 instance is the free tier instance with not a lot of RAM, it is very easy to exceed the memory usage of 1GB and crash the entire EC2 instance. However, we can make use of the harddrive space to substitute for RAM. Although the hard-drive will be slower than RAM memory, it will allow for us to have a more stable EC2 instance while using Jenkins.

So, what you would need to do is upload the bash script, `swapspace.sh` to the EC2 instance and then run it.

```bash
chmod +x ./swapspace.sh
./swapspace.sh
```