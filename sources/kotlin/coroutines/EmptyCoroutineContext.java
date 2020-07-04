package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.C47924e.C47927b;
import kotlin.coroutines.C47924e.C47929c;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

public final class EmptyCoroutineContext implements Serializable, C47924e {
    public static final EmptyCoroutineContext INSTANCE = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    public final <R> R fold(R r, C7563m<? super R, ? super C47927b, ? extends R> mVar) {
        C7573i.m23587b(mVar, "operation");
        return r;
    }

    public final <E extends C47927b> E get(C47929c<E> cVar) {
        C7573i.m23587b(cVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final C47924e plus(C47924e eVar) {
        C7573i.m23587b(eVar, "context");
        return eVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    public final C47924e minusKey(C47929c<?> cVar) {
        C7573i.m23587b(cVar, "key");
        return this;
    }
}
