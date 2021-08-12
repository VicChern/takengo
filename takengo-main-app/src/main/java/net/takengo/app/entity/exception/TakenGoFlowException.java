package net.takengo.app.entity.exception;

import net.takengo.app.entity.exception.base.TakenGoAppException;

/**
 * Signals about exceptional cases in the application logic
 * @author Morenets
 *
 */
public class TakenGoFlowException extends TakenGoAppException {

	private static final long serialVersionUID = -2889607185988464072L;

	public TakenGoFlowException(String message, Throwable cause) {
		super(message, cause);
	}

	public TakenGoFlowException(String message) {
		super(message);
	}
}
