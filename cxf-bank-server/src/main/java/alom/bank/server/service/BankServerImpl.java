
package alom.bank.server.service;

import alom.bank.server.dao.BankServerDao;
import alom.bank.server.exception.*;
import alom.bank.server.model.Account;
import alom.bank.server.model.Client;
import alom.bank.server.payload.AccountInfo;
import alom.bank.server.payload.AccountTypes;
import alom.bank.server.payload.ClientInfo;
import alom.bank.server.utility.Utility;
import org.apache.commons.lang3.EnumUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import java.util.Date;

@WebService(endpointInterface = "alom.bank.server.service.BankServer")
public class BankServerImpl implements BankServer {

    @Autowired
    private BankServerDao bankServerDao;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ClientInfo createClient(String firstName, String lastName, Date dateOfBirth) throws ClientAlreadyExistsException, InternalServiceException {
        try {
            ClientInfo clientInfo = new ClientInfo(firstName, lastName, dateOfBirth);
            Client client = modelMapper.map(clientInfo, Client.class);
            Integer id = bankServerDao.insertClient(client);
            clientInfo.setId(id);
            return clientInfo;
        } catch (Exception e) {
            e.printStackTrace();
            if (Utility.getStringFromStackTrace(e).contains("duplicate key value violates unique constraint")) {
                throw new ClientAlreadyExistsException("Client already exists");
            } else {
                throw new InternalServiceException("An exception occurred while saving to the database. Please check the server log for more detail.");
            }
        }
    }

    @Override
    public ClientInfo getClient(String firstName, String lastName, Date dateOfBirth) throws ClientNotExistsException, InternalServiceException {
        try {
            ClientInfo clientInfo = new ClientInfo(firstName, lastName, dateOfBirth);
            Client client = bankServerDao.getClient(clientInfo);
            if (client == null) {
                throw new ClientAlreadyExistsException("Client does not exist");
            }
            ClientInfo info = modelMapper.map(client, ClientInfo.class);
            return info;
        } catch (Exception e) {
            e.printStackTrace();
            if (Utility.getStringFromStackTrace(e).contains("java.lang.IndexOutOfBoundsException")) {
                throw new ClientAlreadyExistsException("Client does not exist");
            } else {
                throw new InternalServiceException("An exception occurred while querying to the database. Please check the server log for more detail.");
            }
        }
    }

    @Override
    public AccountInfo createAccount(Integer clientId, String type) throws ClientNotExistsException, InternalServiceException, AccountAlreadyExistsException, AccountTypeNotExistsException {
        if (!EnumUtils.isValidEnum(AccountTypes.class, type)) {
            throw new AccountTypeNotExistsException("The given account type does not exist");
        }

        AccountInfo accountInfo = new AccountInfo(clientId, type);
        Account account = modelMapper.map(accountInfo, Account.class);
        account.setBalance(0F);
        try {
            Integer id = bankServerDao.insertAccount(account);
            accountInfo.setId(id);
            return accountInfo;
        } catch (Exception e) {
            e.printStackTrace();
            if (Utility.getStringFromStackTrace(e).contains("null value in column")) {
                throw new InternalServiceException("An exception occurred while saving data. Null value in column.");
            } else if (Utility.getStringFromStackTrace(e).contains("duplicate key value violates unique constraint")) {
                throw new AccountAlreadyExistsException("Account of the given type already exists for this customer");
            } else if (Utility.getStringFromStackTrace(e).contains("violates foreign key constraint")) {
                throw new ClientNotExistsException("Client does not exist");
            } else {
                throw new InternalServiceException("An exception occurred while saving to the database. Please check the server log for more detail.");
            }
        }
    }

    @Override
    public AccountInfo getClientAccount(Integer clientId, String type) throws ClientNotExistsException, InternalServiceException, AccountNotExistsException, AccountTypeNotExistsException {
        if (!EnumUtils.isValidEnum(AccountTypes.class, type)) {
            throw new AccountTypeNotExistsException("The given account type does not exist");
        }

        try {
            Client client = bankServerDao.getClientById(clientId);
            if (client == null) {
                throw new ClientNotExistsException("Client does not exist");
            }
            Account account = bankServerDao.getClientAccount(clientId, type);
            if (account == null) {
                throw new AccountNotExistsException("Account does not exist");
            }
            AccountInfo info = modelMapper.map(account, AccountInfo.class);
            return info;
        } catch (Exception e) {
            e.printStackTrace();
            if (Utility.getStringFromStackTrace(e).contains("java.lang.IndexOutOfBoundsException")) {
                throw new AccountNotExistsException("Account does not exist");
            } else {
                throw new InternalServiceException("An exception occurred while querying to the database. Please check the server log for more detail.");
            }
        }
    }

    @Override
    public Float addAmountToAccountBalance(Integer accountId, Float amount) throws AccountNotExistsException, AmountIncorrectException {
        if (amount <= 0) {
            throw new AccountTypeNotExistsException("The amount to be added is incorrect");
        }
        Float newBalance = null;
        try {
            Account account = bankServerDao.getAccountById(accountId);
            if (account == null) {
                throw new AccountNotExistsException("Account does not exist");
            }
            Float currentBalance = account.getBalance();
            newBalance = currentBalance + amount;
            account.setBalance(newBalance);
            bankServerDao.updateAccount(account);
        } catch (Exception e) {
        }
        return newBalance;
    }

    @Override
    public Float withdrawAmountFromBankAccount(Integer accountId, Float amount) throws AccountNotExistsException, AmountIncorrectException, WithdrawalNotAllowedException {
        if (amount <= 0) {
            throw new AccountTypeNotExistsException("The amount to be withdrawn is incorrect");
        }
        Float newBalance = null;
        try {
            Account account = bankServerDao.getAccountById(accountId);
            if (account == null) {
                throw new AccountNotExistsException("Account does not exist");
            }
            Float currentBalance = account.getBalance();
            newBalance = currentBalance - amount;
            if (newBalance <= 0) {
                throw new WithdrawalNotAllowedException("No overdraft allowed");
            }
            account.setBalance(newBalance);
            bankServerDao.updateAccount(account);
        } catch (Exception e) {
        }
        return newBalance;
    }

    @Override
    public void transferBetweenAccountOfSameClient(Integer clientId, String debitAccountType, String creditAccountType, Float transferAmount) throws AccountNotExistsException, AmountIncorrectException, WithdrawalNotAllowedException, ClientNotExistsException {
        if (transferAmount <= 0) {
            throw new AccountTypeNotExistsException("The amount to be transferred is incorrect");
        }
        if (!EnumUtils.isValidEnum(AccountTypes.class, debitAccountType)) {
            throw new AccountTypeNotExistsException("The given debit account type does not exist");
        }
        if (!EnumUtils.isValidEnum(AccountTypes.class, creditAccountType)) {
            throw new AccountTypeNotExistsException("The given credit account type does not exist");
        }
        Client client = bankServerDao.getClientById(clientId);
        if (client == null) {
            throw new ClientNotExistsException("Client does not exist");
        }
        Account debitAccount = bankServerDao.getClientAccount(clientId, debitAccountType);
        if (debitAccount == null) {
            throw new AccountNotExistsException("Account does not exist with debit account type");
        }
        Account creditAccount = bankServerDao.getClientAccount(clientId, creditAccountType);
        if (creditAccount == null) {
            throw new AccountNotExistsException("Account does not exist with credit account type");
        }
        if (debitAccount.getBalance() < transferAmount) {
            throw new WithdrawalNotAllowedException("No overdraft allowed");
        }
        try {
            debitAccount.setBalance(debitAccount.getBalance() - transferAmount);
            creditAccount.setBalance(creditAccount.getBalance() + transferAmount);
            bankServerDao.updateAccount(debitAccount);
            bankServerDao.updateAccount(creditAccount);
        } catch (Exception e) {
        }
    }

    @Override
    public void transferBetweenAccountOfDifferentClient(Integer debitClientId, String debitAccountType, Integer creditClientId, String creditAccountType, Float transferAmount) throws AccountNotExistsException, AmountIncorrectException, WithdrawalNotAllowedException, ClientNotExistsException {
        if (transferAmount <= 0) {
            throw new AccountTypeNotExistsException("The amount to be transferred is incorrect");
        }
        if (!EnumUtils.isValidEnum(AccountTypes.class, debitAccountType)) {
            throw new AccountTypeNotExistsException("The given debit account type does not exist");
        }
        if (!EnumUtils.isValidEnum(AccountTypes.class, creditAccountType)) {
            throw new AccountTypeNotExistsException("The given credit account type does not exist");
        }
        Client debitClient = bankServerDao.getClientById(debitClientId);
        if (debitClient == null) {
            throw new ClientNotExistsException("Debit client does not exist");
        }
        Client creditClient = bankServerDao.getClientById(creditClientId);
        if (creditClient == null) {
            throw new ClientNotExistsException("Credit client does not exist");
        }
        Account debitAccount = bankServerDao.getClientAccount(debitClientId, debitAccountType);
        if (debitAccount == null) {
            throw new AccountNotExistsException("Debit account does not exist with debit account type");
        }
        Account creditAccount = bankServerDao.getClientAccount(creditClientId, creditAccountType);
        if (creditAccount == null) {
            throw new AccountNotExistsException("Credit account does not exist with credit account type");
        }
        if (debitAccount.getBalance() < transferAmount) {
            throw new WithdrawalNotAllowedException("No overdraft allowed");
        }
        try {
            debitAccount.setBalance(debitAccount.getBalance() - transferAmount);
            creditAccount.setBalance(creditAccount.getBalance() + transferAmount);
            bankServerDao.updateAccount(debitAccount);
            bankServerDao.updateAccount(creditAccount);
        } catch (Exception e) {
        }
    }

    @Override
    public Float closeAccount(Integer accountId) throws InternalServiceException, AccountNotExistsException {
        Float balance = null;
        try {
            Account account = bankServerDao.getAccountById(accountId);
            if (account == null) {
                throw new AccountNotExistsException("Account does not exist");
            }
            balance = account.getBalance();
            bankServerDao.deleteAccount(account);
        } catch (Exception e) {
        }
        return balance;
    }

    @Override
    public void removeClient(Integer clientId) throws InternalServiceException, ClientNotExistsException, ClientAccountAvailableException {
        try {
            Client client = bankServerDao.getClientById(clientId);
            if (client == null) {
                throw new ClientNotExistsException("Client does not exist");
            }
            Integer noOfAccount = bankServerDao.getClientAccount(clientId);
            if (noOfAccount != null && noOfAccount > 0) {
                throw new ClientAccountAvailableException("Client account is still available");
            }
            bankServerDao.deleteClient(client);
        } catch (Exception e) {
        }
    }


}

