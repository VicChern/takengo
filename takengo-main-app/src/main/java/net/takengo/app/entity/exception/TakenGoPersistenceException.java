package net.takengo.app.entity.exception;

import net.takengo.app.entity.exception.base.TakenGoAppException;

/**
 * Signals about data access layer unexpected situations
 * @author Morenets
 *
 */
public class TakenGoPersistenceException extends TakenGoAppException {

	private static final long serialVersionUID = -7889716045779735512L;

	public TakenGoPersistenceException(String message, Throwable cause) {
		super(message, cause);
	}

	public TakenGoPersistenceException(String message) {
		super(message);
	}

}
