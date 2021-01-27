# UK Visa Eligibility Check

 Introduction: <br />
  This repository contains the scenarios to check the Visa eligibility status for different nationalities coming to UK for different purposes.
 
 Pre-requisites : <br />
   1. User should able to luach the GOV UK VISA website https://www.gov.uk/check-uk-visa/y
   2. To Execute user should have Java 1.8 or above version and Maven installed on his machine
   
  
Techonologies : 
  Java with Serenity BDD framework

Versions and libraries supporting are : 
  1. Serenity 2.3.12
  2. Cucumber 6.9.1
  3. Java 1.8 and higher
  4. Serenity Rest Assured - 2.3.12

Feature: <br />
   Validate Visa ElibilityCheck for Different nationalities coming to UK for Different purposes <br />
  Scenarios : <br />
    1. Check Visa eligibility status for Australian Nationality coming to UK for Tourism
    2. Check Visa eligibility status for Chile Nationality coming to UK for Work, academic visit or business and duration is more than 6 months
    3. Check Visa eligibility status for Colombian Nationality coming to UK for Join partner or family for a long stay and duration is more than 6 months
    
Starter of the Project : <br />
   The best place to start the project is download or clone the project on Github (provide github link ). This aloows you to install all the jars specified above along with the    supporting classes. <br />
   
Steps to Run the Project :  <br />

    1. Clone the Respository ( Create a folder in local machine and run git clone "respository path" ) 
    2. git pull ( should be on your main branch )
    3. Import the Project in Eclipse or Intelliji IDE
    4. If Eclipse please run with the below options - 
           * Right click on Project and copy the path 
           * Open the command prompt ( cmd ) 
            Navigate to the project path ( cd project path )
            Run  mvn clean verify 
       For Intelliji IDE please run with below options - 
           Right click on Project and copy the path 
           Go to the Terminal 
           Run mvn clean verify 
    5. If you want to run from IDE then 
         Navigate to "test runners package" -> right click on "****TestSuite.class" and select Run as "JUnit"
 
 Reports :
 
   Reports will be generated under below folder 
       "project path"/target/site/serenity/index.html 
  

The project directory structure: <br />
  The project has build scripts for both Maven and Gradle, and follows the standard directory structure used in most Serenity projects:
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ![ScreenShot](https://i.postimg.cc/3J6qLQsY/Project-Structure-Window.png)
        
 Feature File : 
   Below are the Scenarios listed for the feature mentiones
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ![ScreenShot](https://i.postimg.cc/JhQf1RrZ/Visa-Eligibility-Check-Feature-Scenarios.png)
      
  
        

          
         

   
   
    
 


