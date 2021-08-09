package net.takengo.app.entity.exception.flow;

import net.takengo.app.entity.exception.FlowException;

/**
 * Signals that incorrect parameter was passed to method/constructor
 * @author Morenets
 *
 */
public class InvalidParameterException extends FlowException {

	private static final long serialVersionUID = 4990959228756992926L;

	public InvalidParameterException(String message) {
		super(message);
	}	
}