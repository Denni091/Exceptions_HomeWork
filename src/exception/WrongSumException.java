package exception;

import java.io.IOException;

public class WrongSumException extends IOException {

    public WrongSumException(String message) {
        super(message);
    }
}
