package alom.bank.server.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@NoArgsConstructor
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WithdrawalNotAllowedException extends RuntimeException {
    public WithdrawalNotAllowedException(String message) {
        super(String.format("%s", message));
    }
}
