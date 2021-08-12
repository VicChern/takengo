package net.takengo.app.utils;

import net.takengo.app.entity.exception.flow.TakenGoInvalidParameterException;

public class Checks {
    private Checks() {
    }

    /**
     * Verifies that specified check passed and throws exception otherwise
     * @param check
     * @param message
     * @throws TakenGoInvalidParameterException
     */
    public static void checkParameter(boolean check, String message)
            throws TakenGoInvalidParameterException {
        if (!check) {
            throw new TakenGoInvalidParameterException(message);
        }
    }
}
