package net.takengo.app.entity.exception.flow;

import net.takengo.app.entity.exception.TakenGoFlowException;

/**
 * Signals that incorrect parameter was passed to method/constructor
 * @author Morenets
 *
 */
public class TakenGoInvalidParameterException extends TakenGoFlowException {

	private static final long serialVersionUID = 4990959228756992926L;

	public TakenGoInvalidParameterException(String message) {
		super(message);
	}	
}
