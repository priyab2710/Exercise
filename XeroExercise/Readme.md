Exercise

This Automation Framework is designed using Selenium Webdriver with Java programming language, page object model and uses cucumber for BDD.
The project is built using Maven and only set to run on chrome currently but can be customized to add other browsers.
This code assumes that a valid user with correct credentials logs in to an account where organization is already present.
The User selects an already existing organization and clicks on Connect to your bank account to add a bank.
Once all required details are filled, the bank account is successfully created, the code verifies if the given account is added with correct details and takes the screenshot.
Then the added account is deleted at the end of the test to reuse the test data.

Prerequisite to run the project:
- Java installed
- Maven 3.6.3 installed (Use this link to install maven if not installed: https://maven.apache.org/install.html)
- Chrome browser version 83 or above to be compatible with added chromeDriver
- If chrome browser is other than above version then use below link to download compatible chromedriver for your chrome browser version
 (http://chromedriver.chromium.org/downloads)
 - Download chromedriver and place it in XeroExercise/resources folder

Steps:
1. Create local folder (Example: TestExercise folder created on desktop)
2. Open gitbash or terminal
3. Navigate to above folder with command: cd Desktop/TestExercise/
4. Run the command from the above folder: git clone https://github.com/priyab2710/Exercise.git
5. Exercise/XeroExercise folder will be created in TestExercise
6. Open folder XeroExercise (Example: cd Exercise/XeroExercise)
7. Run command: mvn clean
8. Run command: mvn compile
9. Run command: mvn test -Dbrowser=chrome
10. Test will run
11. Logs are printed on conso
12. HTML Results are available in XeroExercise/target/cucumber-html-report/index.html and can be viewed in browser.
13. Screenshots are available in XeroExercise/Screenshots in case of failure