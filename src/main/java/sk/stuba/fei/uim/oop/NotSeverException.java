package sk.stuba.fei.uim.oop;

public class NotSeverException extends Exception {

    public NotSeverException() {
        super();
    }

    public NotSeverException(String message) {
        super(message);
    }

    public NotSeverException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotSeverException(Throwable cause) {
        super(cause);
    }
}
