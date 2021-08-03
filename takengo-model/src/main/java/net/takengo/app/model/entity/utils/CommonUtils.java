package net.takengo.app.model.entity.utils;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

public class CommonUtils {
    public static <T> Set <T> getSafeSet(Set<T> source) {
        return Collections.unmodifiableSet(Optional.ofNullable(source).orElse( Collections.emptySet()));
    }
}
