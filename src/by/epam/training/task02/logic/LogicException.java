package by.epam.training.task02.logic;

/**
 * Created by Higgs on 08.04.2015.
 */
public class LogicException extends Exception {

    public LogicException() {
        super();
    }
    public LogicException(String message) {
        super(message);
    }
    public LogicException(String message, Throwable cause) {
        super(message, cause);
    }
    public LogicException(Throwable cause) {
        super(cause);
    }

}
