package kotlin;

import java.io.Serializable;

public final class InitializedLazyImpl<T> implements Serializable, C7541d<T> {
    private final T value;

    public final T getValue() {
        return this.value;
    }

    public final boolean isInitialized() {
        return true;
    }

    public final String toString() {
        return String.valueOf(getValue());
    }

    public InitializedLazyImpl(T t) {
        this.value = t;
    }
}
