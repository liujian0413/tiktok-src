package org.apache.harmony.beans;

public class BeansUtils {
    public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];
    private static final Class<?>[] EQUALS_PARAMETERS = {Object.class};

    public static final int getHashCode(boolean z) {
        return z ? 1 : 0;
    }

    public static final int getHashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }
}
