# Project Title:: Room of War

This Project is a command-line driven project and the output depends on the user input on the screen. 

### Prerequisites

JAVA8 
JRE
Command Client, If using windows and CMD.exe for execution of scripts
Maven 

## Getting Started and Installment

To run this project
1. Copy this project folder in your workspace
2. Make sure your workspace is JDK/JRE Enabled.
3. Do maven build                                  
   For maven build. 
   a)Go to cmd ->go to folder_name of project.
   b)type mvn clean install  or mvn install -Dmaven.test.skip=true (It's skip the test folder in build process)
   c)It will generate the jar file in target folder.
   note::(Need to set maven home first)
4. Go to cmd ->folder_name/target.
5. type java -jar RoomofWar.jar   note:(Check the execute permission)
6. Your development server is ready on the console.
7. Another way to generate jar.
    a)import project in IDE
	b)right click on projet->Run as->maven clean ->maven build . note:: (make sure java8 is installed)
	c)Now jar is generated in target folder
8. Repeat rule number 5
  
### Examples

You can look at the short Video Provided in the videos directory for quick idea and understanding.

## Running the tests

JUnit Test case are maintained in the test folder. 
To run the test cases:
1)In IDE, ight click on projet->Run as->maven Junit.
2)It will generate the report of JUnit.
********

## Deployment

To deploy the project on the production,
Follow same run rules mentioned above.
************

## Built With

* [CMD] Command Client
* [Maven](https://maven.apache.org/) - Dependency Management
* 

## Versioning
1.0.0

## Authors
Vaibhav Pokale

