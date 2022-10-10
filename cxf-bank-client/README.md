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

To build, deploy and run the tests:
____
    mvn clean install tomcat:run

The WSDL file of the server is manually placed at src/main/webapp/WEB-INF/wsdl directory. The following maven plugin (used in the plugin section of pom.xml) works in generation of the web service proxy classes.
```
<plugin>
    <groupId>org.apache.cxf</groupId>
    <artifactId>cxf-codegen-plugin</artifactId>
    <version>3.5.3</version>
    <executions>
        <execution>
            <configuration>
                <sourceRoot>
                    target/generated-sources
                </sourceRoot>
                <wsdlOptions>
                    <wsdlOption>
                        <wsdl>
                            src/main/webapp/WEB-INF/wsdl/BankServer.wsdl
                        </wsdl>
                        <wsdlLocation>classpath:BankServer.wsdl</wsdlLocation>
                    </wsdlOption>
                </wsdlOptions>
            </configuration>
            <goals>
                <goal>wsdl2java</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```
In the above block, the WSDL file location is mentioned in two way:

    1. Inside <wsdlOption><wsdl> section
    2. Inside <wsdlOption><wsdlLocation> section
And in the ```<goals>``` section, it is mentioned that the plugin will use ```wsdl2java``` to generate the Java web service proxy codes from the WSDL

In the ```<configuration><sourceRoot>``` section the location of the generated sources are mentioned. In this project, the generated source codes from WSDL will be placed at ```target/generated-sources``` directory

The test codes can be run individually using the following maven commands.

Tests methods are in the same sequence that is mentioned in the requirement document.
1. To create a client (customer):
___
    mvn test -Dtest="alom.bank.client.BankClientServiceTest#testCreateClient"
2. To get the client information:
___
    mvn test -Dtest="alom.bank.client.BankClientServiceTest#testGetClient"
3. To create an account:
___
    mvn test -Dtest="alom.bank.client.BankClientServiceTest#testCreateAccount"
4. To retrieve client's account information:
___
    mvn test -Dtest="alom.bank.client.BankClientServiceTest#testGetCustomerAccount"
5. To add amount to account balance:
___
    mvn test -Dtest="alom.bank.client.BankClientServiceTest#testAddAmountToAccountBalance"
6. To withdraw amount from account:
___
    mvn test -Dtest="alom.bank.client.BankClientServiceTest#testWithdrawAmountFromBankAccount"
7. To transfer amount between the accounts of the same client:
___
    mvn test -Dtest="alom.bank.client.BankClientServiceTest#testTransferBetweenAccountOfSameClient"
8. To transfer amount between the accounts of different clients:
___
    mvn test -Dtest="alom.bank.client.BankClientServiceTest#testTransferBetweenAccountOfDifferentClient"
9. To close an account:
___
    mvn test -Dtest="alom.bank.client.BankClientServiceTest#testCloseAccount"
10. To remove a client:
___
    mvn test -Dtest="alom.bank.client.BankClientServiceTest#testRemoveClient"