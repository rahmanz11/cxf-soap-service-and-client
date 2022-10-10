package alom.bank.server.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@NoArgsConstructor
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalServiceException extends RuntimeException {

    public InternalServiceException(String message) {
        super(String.format("%s", message));
    }
}
