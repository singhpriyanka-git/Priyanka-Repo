For code setup and running through maven using command prompt:

Prerequisites:
firefox version>= 79, because geckodriver.exe which i have used is compatible with browser version greater or equals 79.
Note: Chrome Observations-> While executing with chrome browser,otp functionality is not working as per the requirement, working all fine on firefox.(might be an issue with given website)
I have tried manually as well but looks like its an issue with website itself. Kindly check it once.

Download Maven, set path variables
Running through command prompt
i) Under project structure, goto the path where your pom is placed
ii) perform below commands:
a> mvn clean
b> mvn compile
c> mvn test

Cucumber Reports
After every successful completion, go inside your Project folder. Check under target--> cucumber-reports--> report.html
