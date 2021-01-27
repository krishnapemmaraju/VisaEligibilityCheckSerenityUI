## UK Visa Eligibility Check 

 ## Description <br />
  This repository contains the scenarios to check the Visa eligibility status for different nationalities coming to UK for different purposes.
 
 # Pre-requisites : <br />
   1. User should able to luach the GOV UK VISA website https://www.gov.uk/check-uk-visa/y
   2. To Execute user should have Java 1.8 or above version and Maven installed on his machine
   
  
# Techonologies : 
  Java with Serenity BDD framework

# Versions and libraries supporting are : 
  1. Serenity 2.3.12
  2. Cucumber 6.9.1
  3. Java 1.8 and higher
  4. Serenity Rest Assured - 2.3.12

# Feature: <br />
   Validate Visa ElibilityCheck for Different nationalities coming to UK for Different purposes <br />
  Scenarios : <br />
  
     1. Check Visa eligibility status for Australian Nationality coming to UK for Tourism
     
     2. Check Visa eligibility status for Chile Nationality coming to UK for Work, academic visit or business and duration is more than 6 months
     
     3. Check Visa eligibility status for Colombian Nationality coming to UK for Join partner or family for a long stay and duration is more than 6 months
     
# Starter of the Project : <br />
   The best place to start the project is download or clone the project on Github (provide github link ). This aloows you to install all the jars specified above along with the    supporting classes. <br />
   
   
# Project directory structure: <br />
  The project has build scripts for both Maven and Gradle, and follows the standard directory structure used in most Serenity projects:
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ![ScreenShot](https://i.postimg.cc/nLRGpWD0/Running-From-Test-Runner-Class.png)
   
 # Feature File : 
   Below are the Scenarios listed for the feature mentioned
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ![ScreenShot](https://i.postimg.cc/JhQf1RrZ/Visa-Eligibility-Check-Feature-Scenarios.png)
      
# Steps to Run the Project : 
    Clone the Respository ( Create a folder in local machine and run git clone respository path ) 
       git pull [ should be on your main branch ]
       Import the Project in Eclipse or Intelliji IDE
       If Eclipse please run with the below options - 
             Right click on Project and copy the path 
             Open the command prompt ( cmd ) 
             Navigate to the project path ( cd project path )
             Run  mvn clean verify 
       For Intelliji IDE please run with below options - 
             Right click on Project and copy the path 
             Go to the Terminal 
             Run mvn clean verify 
      If you want to run from IDE :
         Navigate to "test runners package" -> right click on "****TestSuite.class" and select Run as "JUnit"        

# Command Line
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ![ScreenShot](https://i.postimg.cc/kgk7zJjc/Command-Line-MVN-Run.png)

# Test Runner 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ![ScreenShot](https://i.postimg.cc/nLRGpWD0/Running-From-Test-Runner-Class.png)

# Buil Success
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ![ScreenShot](https://i.postimg.cc/FFggK13Y/Buildsuccessmsg.png)

# Reports :
 
   Reports will be generated under below folder 
       "project path"/target/site/serenity/index.html  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ![ScreenShot](https://i.postimg.cc/Hx3xqG8k/Cucumber-Serenity-Reports.png)


 
