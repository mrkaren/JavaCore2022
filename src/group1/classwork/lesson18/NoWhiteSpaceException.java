package group1.classwork.lesson18;

public class NoWhiteSpaceException extends RuntimeException {

    public NoWhiteSpaceException() {
    }

    public NoWhiteSpaceException(String message) {
        super(message);
    }

    public NoWhiteSpaceException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoWhiteSpaceException(Throwable cause) {
        super(cause);
    }

    public NoWhiteSpaceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
