package alom.bank.server.payload;

import alom.bank.server.config.DateAdapter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@XmlRootElement(name="ClientInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClientInfo implements Serializable {
    private Integer id;
    private String firstName;
    private String lastName;

    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date dateOfBirth;

    public ClientInfo(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
}
