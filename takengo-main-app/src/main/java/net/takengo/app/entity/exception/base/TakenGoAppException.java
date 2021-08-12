package net.takengo.app.entity.exception.base;

/**
 * Base class for all application-specific exceptions
 * @author Morenets
 *
 */
public abstract class TakenGoAppException extends RuntimeException {

	private static final long serialVersionUID = 7837501112802868980L;

	public TakenGoAppException(String message, Throwable cause) {
		super(message, cause);
	}

	public TakenGoAppException(String message) {
		super(message);
	}

	public TakenGoAppException(Throwable throwable) {
		super(throwable);
	}
}
