package Question2;

public class negativeValueException extends RuntimeException{
	public negativeValueException() {
		super("Negative value found ");
	}
}
