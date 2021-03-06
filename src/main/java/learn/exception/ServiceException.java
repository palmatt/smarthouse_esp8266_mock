package learn.exception;

public class ServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5426762222722269344L;

	public ServiceException() {
		super("Exception thrown while running service mock");
	}

	public ServiceException(String message) {
		super(message);
	}

}
