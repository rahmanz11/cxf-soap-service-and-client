
package alom.bank.server.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the alom.bank.server.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ClientInfo_QNAME = new QName("http://service.server.bank.alom/", "ClientInfo");
    private final static QName _AddAmountToAccountBalance_QNAME = new QName("http://service.server.bank.alom/", "addAmountToAccountBalance");
    private final static QName _AddAmountToAccountBalanceResponse_QNAME = new QName("http://service.server.bank.alom/", "addAmountToAccountBalanceResponse");
    private final static QName _CloseAccount_QNAME = new QName("http://service.server.bank.alom/", "closeAccount");
    private final static QName _CloseAccountResponse_QNAME = new QName("http://service.server.bank.alom/", "closeAccountResponse");
    private final static QName _CreateAccount_QNAME = new QName("http://service.server.bank.alom/", "createAccount");
    private final static QName _CreateAccountResponse_QNAME = new QName("http://service.server.bank.alom/", "createAccountResponse");
    private final static QName _CreateClient_QNAME = new QName("http://service.server.bank.alom/", "createClient");
    private final static QName _CreateClientResponse_QNAME = new QName("http://service.server.bank.alom/", "createClientResponse");
    private final static QName _GetClient_QNAME = new QName("http://service.server.bank.alom/", "getClient");
    private final static QName _GetClientAccount_QNAME = new QName("http://service.server.bank.alom/", "getClientAccount");
    private final static QName _GetClientAccountResponse_QNAME = new QName("http://service.server.bank.alom/", "getClientAccountResponse");
    private final static QName _GetClientResponse_QNAME = new QName("http://service.server.bank.alom/", "getClientResponse");
    private final static QName _RemoveClient_QNAME = new QName("http://service.server.bank.alom/", "removeClient");
    private final static QName _RemoveClientResponse_QNAME = new QName("http://service.server.bank.alom/", "removeClientResponse");
    private final static QName _TransferBetweenAccountOfDifferentClient_QNAME = new QName("http://service.server.bank.alom/", "transferBetweenAccountOfDifferentClient");
    private final static QName _TransferBetweenAccountOfDifferentClientResponse_QNAME = new QName("http://service.server.bank.alom/", "transferBetweenAccountOfDifferentClientResponse");
    private final static QName _TransferBetweenAccountOfSameClient_QNAME = new QName("http://service.server.bank.alom/", "transferBetweenAccountOfSameClient");
    private final static QName _TransferBetweenAccountOfSameClientResponse_QNAME = new QName("http://service.server.bank.alom/", "transferBetweenAccountOfSameClientResponse");
    private final static QName _WithdrawAmountFromBankAccount_QNAME = new QName("http://service.server.bank.alom/", "withdrawAmountFromBankAccount");
    private final static QName _WithdrawAmountFromBankAccountResponse_QNAME = new QName("http://service.server.bank.alom/", "withdrawAmountFromBankAccountResponse");
    private final static QName _AccountNotExistsException_QNAME = new QName("http://service.server.bank.alom/", "AccountNotExistsException");
    private final static QName _InternalServiceException_QNAME = new QName("http://service.server.bank.alom/", "InternalServiceException");
    private final static QName _WithdrawalNotAllowedException_QNAME = new QName("http://service.server.bank.alom/", "WithdrawalNotAllowedException");
    private final static QName _ClientNotExistsException_QNAME = new QName("http://service.server.bank.alom/", "ClientNotExistsException");
    private final static QName _AmountIncorrectException_QNAME = new QName("http://service.server.bank.alom/", "AmountIncorrectException");
    private final static QName _ClientAlreadyExistsException_QNAME = new QName("http://service.server.bank.alom/", "ClientAlreadyExistsException");
    private final static QName _ClientAccountAvailableException_QNAME = new QName("http://service.server.bank.alom/", "ClientAccountAvailableException");
    private final static QName _AccountAlreadyExistsException_QNAME = new QName("http://service.server.bank.alom/", "AccountAlreadyExistsException");
    private final static QName _AccountTypeNotExistsException_QNAME = new QName("http://service.server.bank.alom/", "AccountTypeNotExistsException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: alom.bank.server.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClientInfo }
     * 
     */
    public ClientInfo createClientInfo() {
        return new ClientInfo();
    }

    /**
     * Create an instance of {@link AddAmountToAccountBalance }
     * 
     */
    public AddAmountToAccountBalance createAddAmountToAccountBalance() {
        return new AddAmountToAccountBalance();
    }

    /**
     * Create an instance of {@link AddAmountToAccountBalanceResponse }
     * 
     */
    public AddAmountToAccountBalanceResponse createAddAmountToAccountBalanceResponse() {
        return new AddAmountToAccountBalanceResponse();
    }

    /**
     * Create an instance of {@link CloseAccount }
     * 
     */
    public CloseAccount createCloseAccount() {
        return new CloseAccount();
    }

    /**
     * Create an instance of {@link CloseAccountResponse }
     * 
     */
    public CloseAccountResponse createCloseAccountResponse() {
        return new CloseAccountResponse();
    }

    /**
     * Create an instance of {@link CreateAccount }
     * 
     */
    public CreateAccount createCreateAccount() {
        return new CreateAccount();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link CreateClient }
     * 
     */
    public CreateClient createCreateClient() {
        return new CreateClient();
    }

    /**
     * Create an instance of {@link CreateClientResponse }
     * 
     */
    public CreateClientResponse createCreateClientResponse() {
        return new CreateClientResponse();
    }

    /**
     * Create an instance of {@link GetClient }
     * 
     */
    public GetClient createGetClient() {
        return new GetClient();
    }

    /**
     * Create an instance of {@link GetClientAccount }
     * 
     */
    public GetClientAccount createGetClientAccount() {
        return new GetClientAccount();
    }

    /**
     * Create an instance of {@link GetClientAccountResponse }
     * 
     */
    public GetClientAccountResponse createGetClientAccountResponse() {
        return new GetClientAccountResponse();
    }

    /**
     * Create an instance of {@link GetClientResponse }
     * 
     */
    public GetClientResponse createGetClientResponse() {
        return new GetClientResponse();
    }

    /**
     * Create an instance of {@link RemoveClient }
     * 
     */
    public RemoveClient createRemoveClient() {
        return new RemoveClient();
    }

    /**
     * Create an instance of {@link RemoveClientResponse }
     * 
     */
    public RemoveClientResponse createRemoveClientResponse() {
        return new RemoveClientResponse();
    }

    /**
     * Create an instance of {@link TransferBetweenAccountOfDifferentClient }
     * 
     */
    public TransferBetweenAccountOfDifferentClient createTransferBetweenAccountOfDifferentClient() {
        return new TransferBetweenAccountOfDifferentClient();
    }

    /**
     * Create an instance of {@link TransferBetweenAccountOfDifferentClientResponse }
     * 
     */
    public TransferBetweenAccountOfDifferentClientResponse createTransferBetweenAccountOfDifferentClientResponse() {
        return new TransferBetweenAccountOfDifferentClientResponse();
    }

    /**
     * Create an instance of {@link TransferBetweenAccountOfSameClient }
     * 
     */
    public TransferBetweenAccountOfSameClient createTransferBetweenAccountOfSameClient() {
        return new TransferBetweenAccountOfSameClient();
    }

    /**
     * Create an instance of {@link TransferBetweenAccountOfSameClientResponse }
     * 
     */
    public TransferBetweenAccountOfSameClientResponse createTransferBetweenAccountOfSameClientResponse() {
        return new TransferBetweenAccountOfSameClientResponse();
    }

    /**
     * Create an instance of {@link WithdrawAmountFromBankAccount }
     * 
     */
    public WithdrawAmountFromBankAccount createWithdrawAmountFromBankAccount() {
        return new WithdrawAmountFromBankAccount();
    }

    /**
     * Create an instance of {@link WithdrawAmountFromBankAccountResponse }
     * 
     */
    public WithdrawAmountFromBankAccountResponse createWithdrawAmountFromBankAccountResponse() {
        return new WithdrawAmountFromBankAccountResponse();
    }

    /**
     * Create an instance of {@link AccountNotExistsException }
     * 
     */
    public AccountNotExistsException createAccountNotExistsException() {
        return new AccountNotExistsException();
    }

    /**
     * Create an instance of {@link InternalServiceException }
     * 
     */
    public InternalServiceException createInternalServiceException() {
        return new InternalServiceException();
    }

    /**
     * Create an instance of {@link WithdrawalNotAllowedException }
     * 
     */
    public WithdrawalNotAllowedException createWithdrawalNotAllowedException() {
        return new WithdrawalNotAllowedException();
    }

    /**
     * Create an instance of {@link ClientNotExistsException }
     * 
     */
    public ClientNotExistsException createClientNotExistsException() {
        return new ClientNotExistsException();
    }

    /**
     * Create an instance of {@link AmountIncorrectException }
     * 
     */
    public AmountIncorrectException createAmountIncorrectException() {
        return new AmountIncorrectException();
    }

    /**
     * Create an instance of {@link ClientAlreadyExistsException }
     * 
     */
    public ClientAlreadyExistsException createClientAlreadyExistsException() {
        return new ClientAlreadyExistsException();
    }

    /**
     * Create an instance of {@link ClientAccountAvailableException }
     * 
     */
    public ClientAccountAvailableException createClientAccountAvailableException() {
        return new ClientAccountAvailableException();
    }

    /**
     * Create an instance of {@link AccountAlreadyExistsException }
     * 
     */
    public AccountAlreadyExistsException createAccountAlreadyExistsException() {
        return new AccountAlreadyExistsException();
    }

    /**
     * Create an instance of {@link AccountTypeNotExistsException }
     * 
     */
    public AccountTypeNotExistsException createAccountTypeNotExistsException() {
        return new AccountTypeNotExistsException();
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "ClientInfo")
    public JAXBElement<ClientInfo> createClientInfo(ClientInfo value) {
        return new JAXBElement<ClientInfo>(_ClientInfo_QNAME, ClientInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAmountToAccountBalance }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAmountToAccountBalance }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "addAmountToAccountBalance")
    public JAXBElement<AddAmountToAccountBalance> createAddAmountToAccountBalance(AddAmountToAccountBalance value) {
        return new JAXBElement<AddAmountToAccountBalance>(_AddAmountToAccountBalance_QNAME, AddAmountToAccountBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAmountToAccountBalanceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAmountToAccountBalanceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "addAmountToAccountBalanceResponse")
    public JAXBElement<AddAmountToAccountBalanceResponse> createAddAmountToAccountBalanceResponse(AddAmountToAccountBalanceResponse value) {
        return new JAXBElement<AddAmountToAccountBalanceResponse>(_AddAmountToAccountBalanceResponse_QNAME, AddAmountToAccountBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CloseAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "closeAccount")
    public JAXBElement<CloseAccount> createCloseAccount(CloseAccount value) {
        return new JAXBElement<CloseAccount>(_CloseAccount_QNAME, CloseAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CloseAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "closeAccountResponse")
    public JAXBElement<CloseAccountResponse> createCloseAccountResponse(CloseAccountResponse value) {
        return new JAXBElement<CloseAccountResponse>(_CloseAccountResponse_QNAME, CloseAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "createAccount")
    public JAXBElement<CreateAccount> createCreateAccount(CreateAccount value) {
        return new JAXBElement<CreateAccount>(_CreateAccount_QNAME, CreateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "createAccountResponse")
    public JAXBElement<CreateAccountResponse> createCreateAccountResponse(CreateAccountResponse value) {
        return new JAXBElement<CreateAccountResponse>(_CreateAccountResponse_QNAME, CreateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "createClient")
    public JAXBElement<CreateClient> createCreateClient(CreateClient value) {
        return new JAXBElement<CreateClient>(_CreateClient_QNAME, CreateClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "createClientResponse")
    public JAXBElement<CreateClientResponse> createCreateClientResponse(CreateClientResponse value) {
        return new JAXBElement<CreateClientResponse>(_CreateClientResponse_QNAME, CreateClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "getClient")
    public JAXBElement<GetClient> createGetClient(GetClient value) {
        return new JAXBElement<GetClient>(_GetClient_QNAME, GetClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClientAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "getClientAccount")
    public JAXBElement<GetClientAccount> createGetClientAccount(GetClientAccount value) {
        return new JAXBElement<GetClientAccount>(_GetClientAccount_QNAME, GetClientAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClientAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "getClientAccountResponse")
    public JAXBElement<GetClientAccountResponse> createGetClientAccountResponse(GetClientAccountResponse value) {
        return new JAXBElement<GetClientAccountResponse>(_GetClientAccountResponse_QNAME, GetClientAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "getClientResponse")
    public JAXBElement<GetClientResponse> createGetClientResponse(GetClientResponse value) {
        return new JAXBElement<GetClientResponse>(_GetClientResponse_QNAME, GetClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "removeClient")
    public JAXBElement<RemoveClient> createRemoveClient(RemoveClient value) {
        return new JAXBElement<RemoveClient>(_RemoveClient_QNAME, RemoveClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "removeClientResponse")
    public JAXBElement<RemoveClientResponse> createRemoveClientResponse(RemoveClientResponse value) {
        return new JAXBElement<RemoveClientResponse>(_RemoveClientResponse_QNAME, RemoveClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferBetweenAccountOfDifferentClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferBetweenAccountOfDifferentClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "transferBetweenAccountOfDifferentClient")
    public JAXBElement<TransferBetweenAccountOfDifferentClient> createTransferBetweenAccountOfDifferentClient(TransferBetweenAccountOfDifferentClient value) {
        return new JAXBElement<TransferBetweenAccountOfDifferentClient>(_TransferBetweenAccountOfDifferentClient_QNAME, TransferBetweenAccountOfDifferentClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferBetweenAccountOfDifferentClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferBetweenAccountOfDifferentClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "transferBetweenAccountOfDifferentClientResponse")
    public JAXBElement<TransferBetweenAccountOfDifferentClientResponse> createTransferBetweenAccountOfDifferentClientResponse(TransferBetweenAccountOfDifferentClientResponse value) {
        return new JAXBElement<TransferBetweenAccountOfDifferentClientResponse>(_TransferBetweenAccountOfDifferentClientResponse_QNAME, TransferBetweenAccountOfDifferentClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferBetweenAccountOfSameClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferBetweenAccountOfSameClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "transferBetweenAccountOfSameClient")
    public JAXBElement<TransferBetweenAccountOfSameClient> createTransferBetweenAccountOfSameClient(TransferBetweenAccountOfSameClient value) {
        return new JAXBElement<TransferBetweenAccountOfSameClient>(_TransferBetweenAccountOfSameClient_QNAME, TransferBetweenAccountOfSameClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferBetweenAccountOfSameClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferBetweenAccountOfSameClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "transferBetweenAccountOfSameClientResponse")
    public JAXBElement<TransferBetweenAccountOfSameClientResponse> createTransferBetweenAccountOfSameClientResponse(TransferBetweenAccountOfSameClientResponse value) {
        return new JAXBElement<TransferBetweenAccountOfSameClientResponse>(_TransferBetweenAccountOfSameClientResponse_QNAME, TransferBetweenAccountOfSameClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawAmountFromBankAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WithdrawAmountFromBankAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "withdrawAmountFromBankAccount")
    public JAXBElement<WithdrawAmountFromBankAccount> createWithdrawAmountFromBankAccount(WithdrawAmountFromBankAccount value) {
        return new JAXBElement<WithdrawAmountFromBankAccount>(_WithdrawAmountFromBankAccount_QNAME, WithdrawAmountFromBankAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawAmountFromBankAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WithdrawAmountFromBankAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "withdrawAmountFromBankAccountResponse")
    public JAXBElement<WithdrawAmountFromBankAccountResponse> createWithdrawAmountFromBankAccountResponse(WithdrawAmountFromBankAccountResponse value) {
        return new JAXBElement<WithdrawAmountFromBankAccountResponse>(_WithdrawAmountFromBankAccountResponse_QNAME, WithdrawAmountFromBankAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountNotExistsException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountNotExistsException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "AccountNotExistsException")
    public JAXBElement<AccountNotExistsException> createAccountNotExistsException(AccountNotExistsException value) {
        return new JAXBElement<AccountNotExistsException>(_AccountNotExistsException_QNAME, AccountNotExistsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalServiceException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InternalServiceException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "InternalServiceException")
    public JAXBElement<InternalServiceException> createInternalServiceException(InternalServiceException value) {
        return new JAXBElement<InternalServiceException>(_InternalServiceException_QNAME, InternalServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawalNotAllowedException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WithdrawalNotAllowedException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "WithdrawalNotAllowedException")
    public JAXBElement<WithdrawalNotAllowedException> createWithdrawalNotAllowedException(WithdrawalNotAllowedException value) {
        return new JAXBElement<WithdrawalNotAllowedException>(_WithdrawalNotAllowedException_QNAME, WithdrawalNotAllowedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientNotExistsException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientNotExistsException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "ClientNotExistsException")
    public JAXBElement<ClientNotExistsException> createClientNotExistsException(ClientNotExistsException value) {
        return new JAXBElement<ClientNotExistsException>(_ClientNotExistsException_QNAME, ClientNotExistsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountIncorrectException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AmountIncorrectException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "AmountIncorrectException")
    public JAXBElement<AmountIncorrectException> createAmountIncorrectException(AmountIncorrectException value) {
        return new JAXBElement<AmountIncorrectException>(_AmountIncorrectException_QNAME, AmountIncorrectException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientAlreadyExistsException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientAlreadyExistsException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "ClientAlreadyExistsException")
    public JAXBElement<ClientAlreadyExistsException> createClientAlreadyExistsException(ClientAlreadyExistsException value) {
        return new JAXBElement<ClientAlreadyExistsException>(_ClientAlreadyExistsException_QNAME, ClientAlreadyExistsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientAccountAvailableException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientAccountAvailableException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "ClientAccountAvailableException")
    public JAXBElement<ClientAccountAvailableException> createClientAccountAvailableException(ClientAccountAvailableException value) {
        return new JAXBElement<ClientAccountAvailableException>(_ClientAccountAvailableException_QNAME, ClientAccountAvailableException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountAlreadyExistsException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountAlreadyExistsException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "AccountAlreadyExistsException")
    public JAXBElement<AccountAlreadyExistsException> createAccountAlreadyExistsException(AccountAlreadyExistsException value) {
        return new JAXBElement<AccountAlreadyExistsException>(_AccountAlreadyExistsException_QNAME, AccountAlreadyExistsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountTypeNotExistsException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountTypeNotExistsException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "AccountTypeNotExistsException")
    public JAXBElement<AccountTypeNotExistsException> createAccountTypeNotExistsException(AccountTypeNotExistsException value) {
        return new JAXBElement<AccountTypeNotExistsException>(_AccountTypeNotExistsException_QNAME, AccountTypeNotExistsException.class, null, value);
    }

}
