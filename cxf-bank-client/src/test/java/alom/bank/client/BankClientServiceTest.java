package alom.bank.client;

import alom.bank.server.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

@ComponentScan(basePackages = "alom.bank.client")
public class BankClientServiceTest extends TestConfig {
    final String firstName = "Adam";
    final String lastName = "Smith";
    final String dateOfBirth = "1990-01-07";

    @Test
	public void testCreateClient() throws ClientAlreadyExistsException_Exception, InternalServiceException_Exception {
        ClientInfo response = new BankClientService().createClient(firstName, lastName, dateOfBirth);
        assertNotNull(response);
        assertNotNull(response.getId());
    }

    @Test
    public void testGetClient() throws InternalServiceException_Exception, ClientNotExistsException_Exception {
        ClientInfo response = new BankClientService().getClient(firstName, lastName, dateOfBirth);
        assertNotNull(response);
        assertTrue(response.getFirstName().equalsIgnoreCase("Adam"));
    }

    @Test
    public void testCreateAccount() throws AccountTypeNotExistsException_Exception, InternalServiceException_Exception, ClientNotExistsException_Exception, AccountAlreadyExistsException_Exception {
        Integer clientId = 26;
        String type = "YOUTH_BOOKLET";
        AccountInfo response = new BankClientService().createAccount(clientId, type);
        assertNotNull(response);
        assertTrue(response.getType().equalsIgnoreCase("YOUTH_BOOKLET"));
    }

    @Test
    public void testGetCustomerAccount() throws AccountTypeNotExistsException_Exception, InternalServiceException_Exception, ClientNotExistsException_Exception, AccountNotExistsException_Exception {
        Integer clientId = 26;
        String type = "CHECKS";
        AccountInfo response = new BankClientService().getClientAccount(clientId, type);
        assertNotNull(response);
        assertTrue(response.getClientId().equals(26));
    }

    @Test
    public void testAddAmountToAccountBalance() throws AccountNotExistsException_Exception, AmountIncorrectException_Exception {
        Integer accountId = 1;
        Float amount = 100F;
        Float newBalance = new BankClientService().addAmountToAccountBalance(accountId, amount);
        assertNotNull(newBalance);
    }

    @Test
    public void testWithdrawAmountFromBankAccount() throws WithdrawalNotAllowedException_Exception, AccountNotExistsException_Exception, AmountIncorrectException_Exception {
        Integer accountId = 1;
        Float amount = 50F;
        Float newBalance = new BankClientService().withdrawAmountFromBankAccount(accountId, amount);
        assertNotNull(newBalance);
    }

    @Test
    public void testTransferBetweenAccountOfSameClient() throws WithdrawalNotAllowedException_Exception, ClientNotExistsException_Exception, AccountNotExistsException_Exception, AmountIncorrectException_Exception {
        Integer customerId = 26;
        String debitAccountType = "CHECKS";
        String creditAccountType = "YOUTH_BOOKLET";
        Float transferAmount = 10F;
        new BankClientService().transferBetweenAccountOfSameClient(customerId, debitAccountType, creditAccountType, transferAmount);
        assertTrue(true);
    }

    @Test
    public void testTransferBetweenAccountOfDifferentClient() throws WithdrawalNotAllowedException_Exception, ClientNotExistsException_Exception, AccountNotExistsException_Exception, AmountIncorrectException_Exception {
        Integer debitClientId = 26;
        Integer creditClientId = 27;
        String debitAccountType = "CHECKS";
        String creditAccountType = "YOUTH_BOOKLET";
        Float transferAmount = 10F;
        new BankClientService().transferBetweenAccountOfDifferentClient(debitClientId, debitAccountType, creditClientId, creditAccountType, transferAmount);
        assertTrue(true);
    }

    @Test
    public void testCloseAccount() throws InternalServiceException_Exception, AccountNotExistsException_Exception {
        Integer accountId = 2;
        Float balance = new BankClientService().closeAccount(accountId);
        assertNotNull(balance);
    }

    @Test
    public void testRemoveClient() throws InternalServiceException_Exception, ClientNotExistsException_Exception, ClientAccountAvailableException_Exception {
        Integer clientId = 26;
        new BankClientService().removeClient(clientId);
        assertNotNull(true);
    }
}
