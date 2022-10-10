
package alom.bank.server.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transferBetweenAccountOfDifferentClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transferBetweenAccountOfDifferentClient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DebitClientId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DebitAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditClientId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CreditAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransferAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferBetweenAccountOfDifferentClient", propOrder = {
    "debitClientId",
    "debitAccountType",
    "creditClientId",
    "creditAccountType",
    "transferAmount"
})
public class TransferBetweenAccountOfDifferentClient {

    @XmlElement(name = "DebitClientId")
    protected Integer debitClientId;
    @XmlElement(name = "DebitAccountType")
    protected String debitAccountType;
    @XmlElement(name = "CreditClientId")
    protected Integer creditClientId;
    @XmlElement(name = "CreditAccountType")
    protected String creditAccountType;
    @XmlElement(name = "TransferAmount")
    protected Float transferAmount;

    /**
     * Gets the value of the debitClientId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDebitClientId() {
        return debitClientId;
    }

    /**
     * Sets the value of the debitClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDebitClientId(Integer value) {
        this.debitClientId = value;
    }

    /**
     * Gets the value of the debitAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAccountType() {
        return debitAccountType;
    }

    /**
     * Sets the value of the debitAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAccountType(String value) {
        this.debitAccountType = value;
    }

    /**
     * Gets the value of the creditClientId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditClientId() {
        return creditClientId;
    }

    /**
     * Sets the value of the creditClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditClientId(Integer value) {
        this.creditClientId = value;
    }

    /**
     * Gets the value of the creditAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAccountType() {
        return creditAccountType;
    }

    /**
     * Sets the value of the creditAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAccountType(String value) {
        this.creditAccountType = value;
    }

    /**
     * Gets the value of the transferAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTransferAmount() {
        return transferAmount;
    }

    /**
     * Sets the value of the transferAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTransferAmount(Float value) {
        this.transferAmount = value;
    }

}
