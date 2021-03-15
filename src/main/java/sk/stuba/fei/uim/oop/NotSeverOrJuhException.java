package sk.stuba.fei.uim.oop;

public class NotSeverOrJuhException extends Exception {
    public NotSeverOrJuhException() {
        super();
    }

    public NotSeverOrJuhException(String message) {
        super(message);
    }

    public NotSeverOrJuhException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotSeverOrJuhException(Throwable cause) {
        super(cause);
    }
}
