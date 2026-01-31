package UncleBob.Clean_Archicteture.core.exception;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message)
    {
        super(message);
    }
}
