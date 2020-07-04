package p346io.reactivex.internal.operators.maybe;

import org.p361a.C7704b;
import p346io.reactivex.C7491p;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeToPublisher */
public enum MaybeToPublisher implements C7327h<C7491p<Object>, C7704b<Object>> {
    INSTANCE;

    public static <T> C7327h<C7491p<T>, C7704b<T>> instance() {
        return INSTANCE;
    }

    public final C7704b<Object> apply(C7491p<Object> pVar) throws Exception {
        return new C47768n(pVar);
    }
}
