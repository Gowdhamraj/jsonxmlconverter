XMLJSONConverter Application
============================

Author: Gowdhamraj Ramraj
Email-Id: gowdhamramaraj@gmail.com
Github: https://github.com/Gowdhamraj
LinkedIn: https://www.linkedin.com/in/gowdham-ramaraj-06a8803b/

Last Updated: Jan 25, 2021

Intro
-----

Simple application which converts the given JSON data from an input file to XML data in desired location.
XMLJSONConverterI is the exposed service which has the API createXMLJSONConverter that does the job.

A ConverterFactory provides instances for the Converter service.
Converter is the application starter that needs to be invoked from the CLI.
Alternatively, use the test class with custom inputs to run the app using an IDE. 

 
Instructions to run the app
---------------------------

This is a maven project hence would require maven to be installed in the executing system.
Maven installation instructions - http://maven.apache.org/install.html.

This project uses picocli jar for CLI execution. 
The jar(picocli-4.6.1.jar) has to be downloaded and placed in the project root folder.
Direct download link - https://github.com/remkop/picocli/releases/download/v4.6.1/picocli-4.6.1.jar
 
1. From the root folder of the project, run the command "mvn clean compile assembly:single"
   This command ensures that the application is built and produces the JAR with required dependencies in the target folder
   
2. From the root folder of the project, run the command "pwd" to know/copy the current working directory

3. Download the picocli jar using the link, and place it in the project root folder

3. Run the following command to start the app
   'java -cp "<pwd>/picocli-4.6.1.jar:<pwd>/target/jsonxmlconverter-1.0.0.jar" com.gowdham.csw.jsonxmlconverter.main.Converter <InputJSONFile> <OutputXMLFile>'
   
   Example: If the extracted project is in the folder d/foo/bar, then run 
   java -cp "/d/foo/bar/jsonxmlconverter/picocli-4.6.1.jar:/d/foo/bar/jsonxmlconverter/target/jsonxmlconverter-1.0.0.jar" com.gowdham.csw.jsonxmlconverter.main.Converter "C:\foo\bar\examples\example.json" "C:\foo\bar\examples\foo.xml"
   
   <pwd> -> present working directory (copied in step 2)
   <InputJSONFile> -> Input Json file with location (Ex.: "/Usr/test/Input.json")
   <OutputXMLFile> -> Output XML file with location (If file doesn't exist then it will be created with the given name)
   com.gowdham.csw.jsonxmlconverter.main.Converter -> Main class that starts the app


Unit Test
---------

Currently one unit test class is included with the project which does a simple assertion of the output file creation status.
Test class -> TestXMLJSONConverter.java
Mandatory test resource -> example.json (input json file)


3PP Dependencies
----------------

The following open-source libraries have been used in this project:

1. picocli - 4.6.1 - https://picocli.info/
(https://mvnrepository.com/artifact/info.picocli/picocli)
Used for running this application in CLI.

2. org.json - 20201115 - https://github.com/stleary/JSON-java
(https://mvnrepository.com/artifact/org.json/json)
API used for JSON to XML conversion.

3. junit - 4.13 - https://junit.org/junit4/ 
(https://mvnrepository.com/artifact/junit/junit)
Unit testing framework.

4. assertj - 3.18.0 - https://assertj.github.io/doc/
(https://mvnrepository.com/artifact/org.assertj/assertj-core)
For fluent assertions in unit tests.


--------------------------------EOF-----------------------------