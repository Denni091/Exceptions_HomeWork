package exception;

public class UserExpectedError extends IllegalArgumentException {

    public UserExpectedError(String s) {
        super(s);
    }
}
