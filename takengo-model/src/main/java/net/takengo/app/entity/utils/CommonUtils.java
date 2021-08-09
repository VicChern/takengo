package net.takengo.app.entity.utils;


import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class CommonUtils {
    public static <T> Set<T> getSafeSet(Set<T> source) {
        return Collections.unmodifiableSet(Optional.ofNullable(source).orElse( Collections.emptySet()));
    }

    public static <T> List<T> getSafeList(List<T> source) {
        return Collections.unmodifiableList(Optional.ofNullable(source).orElse(Collections.emptyList()));
    }
}
