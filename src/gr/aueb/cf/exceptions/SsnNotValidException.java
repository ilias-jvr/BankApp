package gr.aueb.cf.exceptions;

public class SsnNotValidException extends Exception{
    public static final long serialVersionUID = 1L;

    public SsnNotValidException (String ssn) {
        super("Ssn " + ssn + " is not valid" );
    }
}
