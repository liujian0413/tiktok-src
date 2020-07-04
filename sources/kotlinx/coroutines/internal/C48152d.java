package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.d */
public abstract class C48152d<T> extends C48173q {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f123001a = AtomicReferenceFieldUpdater.newUpdater(C48152d.class, Object.class, "_consensus");
    private volatile Object _consensus = C48151c.f123000a;

    /* renamed from: a */
    public abstract Object mo120353a(T t);

    /* renamed from: a */
    public abstract void mo120370a(T t, Object obj);

    /* renamed from: d */
    private final Object m149398d(Object obj) {
        if (m149397c(obj)) {
            return obj;
        }
        return this._consensus;
    }

    /* renamed from: c */
    private boolean m149397c(Object obj) {
        boolean z;
        if (obj != C48151c.f123000a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return f123001a.compareAndSet(this, C48151c.f123000a, obj);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public final Object mo120371b(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C48151c.f123000a) {
            obj2 = m149398d(mo120353a(obj));
        }
        mo120370a(obj, obj2);
        return obj2;
    }
}
