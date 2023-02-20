# Automation Project Template

## Description
This is sample project for automation which provides two type of automation support
1. Web
2. Mobile

## Prerequisites
# Generic Installations:
1. Java 1.8+ version
2. Maven should be setup in user's system

# Mobile automation specific installations:
1. Node js
2. Appium
3. Android SDK

# Web automation specific installations:
1. Chrome, Edge and Firefox browsers should be installed


## Installation
1. Open your desired IDE
2. Import this project as maven project

## Directory structure

# src/test/java:
- base	
    - MobileObjectManager : Holds object of Mobile pages (Android/IOS)
    - ObjectCreation: Holds object of MobileObjectManager and WebObjectManager and based on its module passed(Web/Android/IOS) it will initialize page objects respectively
    - WebObjectManager: Hols objects of webpages

- dataProvider	
    - Dataprovider for xlsx and json files
- interfaces	
    - Interface which will be implemented by MobilePages 
- page	
    - android
    - ios
    - web
- pojo	
    - web
    - mobile
- test
    - web
    - mobile

# src/test/resources
- suites
- testdata

Note: Rules for json test data.
1. Create folder which having name same as TestNg test class
2. Create .json file name same as @test method name

# lib
This folder contains jar file of automation framework
Add Jar file from build path in project in your ID.

Note: Whenever new version will be released then users will get notify and they have to download jar file and update in build path.

# configurations
1. Environment specific configuration's property file (QA, Dev etc.)
2. extent-config: Extent report specific configuration

# applications
User has to add their .apk or .app files (Mobile applications) in this folder

# Execution reports

# Extent reports:
1. TestReport: This folder contains generated extent report. File name will be ExtentReport.html

# Allure reports:
1. allure-results: run command ``` allure serve ``` at directory level to generate allure report

# POM.xml
This is the core xml file where user has to set their configuration parameters

Below are the required parameters:
1. suiteXmlFile: src/test/resources/suites/yourSuite.xml
2. environment: QA/Dev etc.
3. platform: Local, Remote
4. module: Web, Android, IOS

## Author
Contact [jjanakkumar@getontop.com]
