package exception;

public class IncidentNotFoundException extends Exception {
    public IncidentNotFoundException(String message) {
        super(message);
    }

    public IncidentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
