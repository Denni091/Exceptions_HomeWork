package exception;

import java.io.IOException;

public class WrongFieldException extends IOException {

    public WrongFieldException(String message) {
        super(message);
    }
}
