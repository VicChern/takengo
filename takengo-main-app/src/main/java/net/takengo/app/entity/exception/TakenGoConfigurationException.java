package net.takengo.app.entity.exception;

import net.takengo.app.entity.exception.base.TakenGoAppException;

/**
 * Signals about incorrect configuration settings/parameters
 * @author Morenets
 *
 */
public class TakenGoConfigurationException extends TakenGoAppException {

	private static final long serialVersionUID = -2177284893894040026L;

	public TakenGoConfigurationException(String message, Throwable cause) {
		super(message, cause);
	}

	public TakenGoConfigurationException(String message) {
		super(message);
	}

	public TakenGoConfigurationException(Throwable throwable) {
		super(throwable);
	}

}
