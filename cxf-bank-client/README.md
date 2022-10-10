To generate the project:
___

	1. Run: mvn archetype:generate -Dfilter=org.apache.cxf.archetype:
	2. 'Choose archetype: ' -- Enter number 3
	3. 'Choose a version: ' -- Enter for default
	4. 'Define value for property groupId:' -- Enter alom
	5. 'Define value for property artifactId:' -- Enter cxf-bank-client
	6. 'Define value for property version:' -- Leave the value as-is, and hit enter
	7. 'Define value for property package:' -- Enter alom.bank.client
	
	Maven will display all the values that have been set for the template and ask you to confirm by entering Y. Check the values and confirm. 

To build, deploy and run the project:
____
    mvn clean install tomcat:run
After running, the service will be available at:
___
    http://localhost:8080/cxf-bank-server
The WSDL can be found at:
___
    http://localhost:8080/cxf-bank-server/BankServer?wsdl

