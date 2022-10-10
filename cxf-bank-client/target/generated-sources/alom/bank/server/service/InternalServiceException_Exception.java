
package alom.bank.server.service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.3
 * 2022-10-10T21:06:40.699+06:00
 * Generated source version: 3.5.3
 */

@WebFault(name = "InternalServiceException", targetNamespace = "http://service.server.bank.alom/")
public class InternalServiceException_Exception extends Exception {

    private alom.bank.server.service.InternalServiceException faultInfo;

    public InternalServiceException_Exception() {
        super();
    }

    public InternalServiceException_Exception(String message) {
        super(message);
    }

    public InternalServiceException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public InternalServiceException_Exception(String message, alom.bank.server.service.InternalServiceException internalServiceException) {
        super(message);
        this.faultInfo = internalServiceException;
    }

    public InternalServiceException_Exception(String message, alom.bank.server.service.InternalServiceException internalServiceException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = internalServiceException;
    }

    public alom.bank.server.service.InternalServiceException getFaultInfo() {
        return this.faultInfo;
    }
}
