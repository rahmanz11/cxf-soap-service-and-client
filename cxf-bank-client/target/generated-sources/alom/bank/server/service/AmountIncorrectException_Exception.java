
package alom.bank.server.service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.3
 * 2022-10-10T09:40:41.123+06:00
 * Generated source version: 3.5.3
 */

@WebFault(name = "AmountIncorrectException", targetNamespace = "http://service.server.bank.alom/")
public class AmountIncorrectException_Exception extends Exception {

    private alom.bank.server.service.AmountIncorrectException faultInfo;

    public AmountIncorrectException_Exception() {
        super();
    }

    public AmountIncorrectException_Exception(String message) {
        super(message);
    }

    public AmountIncorrectException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public AmountIncorrectException_Exception(String message, alom.bank.server.service.AmountIncorrectException amountIncorrectException) {
        super(message);
        this.faultInfo = amountIncorrectException;
    }

    public AmountIncorrectException_Exception(String message, alom.bank.server.service.AmountIncorrectException amountIncorrectException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = amountIncorrectException;
    }

    public alom.bank.server.service.AmountIncorrectException getFaultInfo() {
        return this.faultInfo;
    }
}
