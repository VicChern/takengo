package net.takengo.app.entity.exception;

import net.takengo.app.entity.exception.base.TakenGoAppException;

/**
 * Signals about exception cases in the work of external services and API
 * @author Morenets
 *
 */
public class TakenGoCommunicationException extends TakenGoAppException {

	private static final long serialVersionUID = -2850898723336164866L;

	public TakenGoCommunicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public TakenGoCommunicationException(String message) {
		super(message);
	}

}
