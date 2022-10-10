package alom.bank.server.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class AccountInfo implements Serializable {

    private Integer id;
    private Integer clientId;
    private String type;
    private Float balance;

    public AccountInfo(Integer clientId, String type) {
        this.clientId = clientId;
        this.type = type;
    }
}
