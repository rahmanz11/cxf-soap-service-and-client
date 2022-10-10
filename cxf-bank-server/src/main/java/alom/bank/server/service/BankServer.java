package alom.bank.server.service;

import alom.bank.server.config.DateAdapter;
import alom.bank.server.exception.*;
import alom.bank.server.payload.AccountInfo;
import alom.bank.server.payload.ClientInfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

@WebService
public interface BankServer {

    @WebMethod
    ClientInfo createClient(@WebParam(name = "FirstName") String firstName,
                            @WebParam(name = "LastName") String lastName,
                            @WebParam(name = "DateOfBirth") @XmlJavaTypeAdapter(DateAdapter.class) Date dateOfBirth)
            throws ClientAlreadyExistsException, InternalServiceException;

    @WebMethod
    ClientInfo getClient(@WebParam(name = "FirstName") String firstName,
                         @WebParam(name = "LastName") String lastName,
                         @WebParam(name = "DateOfBirth") @XmlJavaTypeAdapter(DateAdapter.class) Date dateOfBirth)
            throws ClientNotExistsException, InternalServiceException;

    @WebMethod
    AccountInfo createAccount(@WebParam(name = "ClientId") Integer clientId,
                              @WebParam(name = "AccountType") String type)
            throws ClientNotExistsException, InternalServiceException, AccountAlreadyExistsException, AccountTypeNotExistsException;

    @WebMethod
    AccountInfo getClientAccount(@WebParam(name = "ClientId") Integer clientId,
                              @WebParam(name = "AccountType") String type)
            throws ClientNotExistsException, InternalServiceException, AccountNotExistsException, AccountTypeNotExistsException;

    @WebMethod
    Float addAmountToAccountBalance(@WebParam(name = "AccountId") Integer accountId,
                                 @WebParam(name = "Amount") Float amount)
            throws AccountNotExistsException, AmountIncorrectException;

    @WebMethod
    Float withdrawAmountFromBankAccount(@WebParam(name = "AccountId") Integer accountId,
                                    @WebParam(name = "Amount") Float amount)
            throws AccountNotExistsException, AmountIncorrectException, WithdrawalNotAllowedException;

    @WebMethod
    void transferBetweenAccountOfSameClient(@WebParam(name = "ClientId") Integer clientId,
                                        @WebParam(name = "DebitAccountType") String debitAccountType,
                                             @WebParam(name = "CreditAccountType") String creditAccountType,
                                        @WebParam(name = "TransferAmount") Float transferAmount)
            throws AccountNotExistsException, AmountIncorrectException, WithdrawalNotAllowedException, ClientNotExistsException;

    @WebMethod
    void transferBetweenAccountOfDifferentClient(@WebParam(name = "DebitClientId") Integer debitClientId,
                                            @WebParam(name = "DebitAccountType") String debitAccountType,
                                                 @WebParam(name = "CreditClientId") Integer creditClientId,
                                            @WebParam(name = "CreditAccountType") String creditAccountType,
                                            @WebParam(name = "TransferAmount") Float transferAmount)
            throws AccountNotExistsException, AmountIncorrectException, WithdrawalNotAllowedException, ClientNotExistsException;

    @WebMethod
    Float closeAccount(@WebParam(name = "AccountId") Integer accountId)
            throws InternalServiceException, AccountNotExistsException;

    @WebMethod
    void removeClient(@WebParam(name = "ClientId") Integer clientId)
            throws InternalServiceException, ClientNotExistsException, ClientAccountAvailableException;
}

