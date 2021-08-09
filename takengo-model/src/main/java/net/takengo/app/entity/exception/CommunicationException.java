package net.takengo.app.entity.exception;

import net.takengo.app.entity.exception.base.AppException;

/**
 * Signals about exception cases in the work of external services and API
 * @author Morenets
 *
 */
public class CommunicationException extends AppException {

	private static final long serialVersionUID = -2850898723336164866L;

	public CommunicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public CommunicationException(String message) {
		super(message);
	}

}
