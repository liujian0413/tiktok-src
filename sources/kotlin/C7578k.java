package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: kotlin.k */
final class C7578k<T> implements Serializable, C7541d<T> {

    /* renamed from: a */
    private C7561a<? extends T> f20894a;

    /* renamed from: b */
    private volatile Object f20895b;

    /* renamed from: c */
    private final Object f20896c;

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public final boolean isInitialized() {
        if (this.f20895b != C7580m.f20897a) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public final T getValue() {
        T t;
        T t2 = this.f20895b;
        if (t2 != C7580m.f20897a) {
            return t2;
        }
        synchronized (this.f20896c) {
            t = this.f20895b;
            if (t == C7580m.f20897a) {
                C7561a<? extends T> aVar = this.f20894a;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                t = aVar.invoke();
                this.f20895b = t;
                this.f20894a = null;
            }
        }
        return t;
    }

    private C7578k(C7561a<? extends T> aVar, Object obj) {
        C7573i.m23587b(aVar, "initializer");
        this.f20894a = aVar;
        this.f20895b = C7580m.f20897a;
        if (obj == 0) {
            obj = this;
        }
        this.f20896c = obj;
    }

    public /* synthetic */ C7578k(C7561a aVar, Object obj, int i, C7571f fVar) {
        this(aVar, null);
    }
}
