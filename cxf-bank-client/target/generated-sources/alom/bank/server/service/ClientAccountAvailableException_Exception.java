
package alom.bank.server.service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.3
 * 2022-10-10T09:40:41.134+06:00
 * Generated source version: 3.5.3
 */

@WebFault(name = "ClientAccountAvailableException", targetNamespace = "http://service.server.bank.alom/")
public class ClientAccountAvailableException_Exception extends Exception {

    private alom.bank.server.service.ClientAccountAvailableException faultInfo;

    public ClientAccountAvailableException_Exception() {
        super();
    }

    public ClientAccountAvailableException_Exception(String message) {
        super(message);
    }

    public ClientAccountAvailableException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ClientAccountAvailableException_Exception(String message, alom.bank.server.service.ClientAccountAvailableException clientAccountAvailableException) {
        super(message);
        this.faultInfo = clientAccountAvailableException;
    }

    public ClientAccountAvailableException_Exception(String message, alom.bank.server.service.ClientAccountAvailableException clientAccountAvailableException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = clientAccountAvailableException;
    }

    public alom.bank.server.service.ClientAccountAvailableException getFaultInfo() {
        return this.faultInfo;
    }
}