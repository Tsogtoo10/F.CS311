package F.CS311_Lab4;
/**
 * Exception that should be thrown if an invalid grade is passed in.
 *
 */
public class InvalidGradeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidGradeException(String errorMessage) {
		super(errorMessage);
	}
}