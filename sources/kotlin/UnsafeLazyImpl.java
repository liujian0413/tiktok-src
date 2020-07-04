package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

public final class UnsafeLazyImpl<T> implements Serializable, C7541d<T> {
    private Object _value = C7580m.f20897a;
    private C7561a<? extends T> initializer;

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public final boolean isInitialized() {
        if (this._value != C7580m.f20897a) {
            return true;
        }
        return false;
    }

    public final T getValue() {
        if (this._value == C7580m.f20897a) {
            C7561a<? extends T> aVar = this.initializer;
            if (aVar == null) {
                C7573i.m23580a();
            }
            this._value = aVar.invoke();
            this.initializer = null;
        }
        return this._value;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public UnsafeLazyImpl(C7561a<? extends T> aVar) {
        C7573i.m23587b(aVar, "initializer");
        this.initializer = aVar;
    }
}
