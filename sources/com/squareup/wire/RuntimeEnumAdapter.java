package com.squareup.wire;

import com.squareup.wire.WireEnum;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class RuntimeEnumAdapter<E extends WireEnum> extends EnumAdapter<E> {
    private Method fromValueMethod;
    private final Class<E> type;

    public final int hashCode() {
        return this.type.hashCode();
    }

    private Method getFromValueMethod() {
        Method method = this.fromValueMethod;
        if (method != null) {
            return method;
        }
        try {
            Method method2 = this.type.getMethod("fromValue", new Class[]{Integer.TYPE});
            this.fromValueMethod = method2;
            return method2;
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    RuntimeEnumAdapter(Class<E> cls) {
        super(cls);
        this.type = cls;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RuntimeEnumAdapter) || ((RuntimeEnumAdapter) obj).type != this.type) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final E fromValue(int i) {
        try {
            return (WireEnum) getFromValueMethod().invoke(null, new Object[]{Integer.valueOf(i)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }
}
