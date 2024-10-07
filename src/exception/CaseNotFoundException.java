package exception;


public class CaseNotFoundException extends Exception {
    public CaseNotFoundException(String message) {
        super(message);
    }

    public CaseNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
