package alom.bank.client;

import alom.bank.server.service.*;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import javax.jws.WebService;

@WebService(targetNamespace = "http://service.server.bank.alom/",
    portName="BankServer",
    serviceName="BankServerImplService",
    endpointInterface = "alom.bank.server.service.BankServer")
public class BankClientService implements BankServer {

    final String serviceUrl = "http://localhost:8080/cxf-bank-server/BankServer";
    JaxWsProxyFactoryBean factory;
    BankServer bankServer;

    public BankClientService() {
        factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(BankServer.class);
        factory.setAddress(serviceUrl);
        bankServer = (BankServer) factory.create();
    }

    @Override
    public AccountInfo createAccount(Integer customerId, String type) throws AccountAlreadyExistsException_Exception, AccountTypeNotExistsException_Exception, InternalServiceException_Exception, ClientNotExistsException_Exception {
        AccountInfo response = bankServer.createAccount(customerId, type);
        return response;
    }

    @Override
    public ClientInfo getClient(String firstName, String lastName, String dateOfBirth) throws InternalServiceException_Exception, ClientNotExistsException_Exception {
        ClientInfo response = bankServer.getClient(firstName, lastName, dateOfBirth);
        return response;
    }

    @Override
    public Float addAmountToAccountBalance(Integer accountId, Float amount) throws AccountNotExistsException_Exception, AmountIncorrectException_Exception {
        Float response = bankServer.addAmountToAccountBalance(accountId, amount);
        return response;
    }

    @Override
    public void transferBetweenAccountOfSameClient(Integer clientId, String debitAccountType, String creditAccountType, Float transferAmount) throws WithdrawalNotAllowedException_Exception, AccountNotExistsException_Exception, ClientNotExistsException_Exception, AmountIncorrectException_Exception {
        bankServer.transferBetweenAccountOfSameClient(clientId, debitAccountType, creditAccountType, transferAmount);
    }

    @Override
    public Float withdrawAmountFromBankAccount(Integer accountId, Float amount) throws WithdrawalNotAllowedException_Exception, AccountNotExistsException_Exception, AmountIncorrectException_Exception {
        Float response = bankServer.withdrawAmountFromBankAccount(accountId, amount);
        return response;
    }

    @Override
    public Float closeAccount(Integer accountId) throws AccountNotExistsException_Exception, InternalServiceException_Exception {
        Float balance = bankServer.closeAccount(accountId);
        return balance;
    }

    @Override
    public void transferBetweenAccountOfDifferentClient(Integer debitClientId, String debitAccountType, Integer creditClientId, String creditAccountType, Float transferAmount) throws WithdrawalNotAllowedException_Exception, AccountNotExistsException_Exception, ClientNotExistsException_Exception, AmountIncorrectException_Exception {
        bankServer.transferBetweenAccountOfDifferentClient(debitClientId, debitAccountType, creditClientId, creditAccountType, transferAmount);
    }

    @Override
    public ClientInfo createClient(String firstName, String lastName, String dateOfBirth) throws ClientAlreadyExistsException_Exception, InternalServiceException_Exception {
        ClientInfo response = bankServer.createClient(firstName, lastName, dateOfBirth);
        return response;
    }

    @Override
    public void removeClient(Integer clientId) throws ClientAccountAvailableException_Exception, InternalServiceException_Exception, ClientNotExistsException_Exception {
        bankServer.removeClient(clientId);
    }

    @Override
    public AccountInfo getClientAccount(Integer clientId, String accountType) throws AccountNotExistsException_Exception, AccountTypeNotExistsException_Exception, InternalServiceException_Exception, ClientNotExistsException_Exception {
        AccountInfo response = bankServer.getClientAccount(clientId, accountType);
        return response;
    }
}

