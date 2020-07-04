package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: kotlin.j */
final class C7558j<T> implements Serializable, C7541d<T> {

    /* renamed from: a */
    public static final C7559a f20883a = new C7559a(null);

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater<C7558j<?>, Object> f20884e = AtomicReferenceFieldUpdater.newUpdater(C7558j.class, Object.class, "c");

    /* renamed from: b */
    private volatile C7561a<? extends T> f20885b;

    /* renamed from: c */
    private volatile Object f20886c = C7580m.f20897a;

    /* renamed from: d */
    private final Object f20887d = C7580m.f20897a;

    /* renamed from: kotlin.j$a */
    public static final class C7559a {
        private C7559a() {
        }

        public /* synthetic */ C7559a(C7571f fVar) {
            this();
        }
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public final boolean isInitialized() {
        if (this.f20886c != C7580m.f20897a) {
            return true;
        }
        return false;
    }

    public final T getValue() {
        T t = this.f20886c;
        if (t != C7580m.f20897a) {
            return t;
        }
        C7561a<? extends T> aVar = this.f20885b;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (f20884e.compareAndSet(this, C7580m.f20897a, invoke)) {
                this.f20885b = null;
                return invoke;
            }
        }
        return this.f20886c;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public C7558j(C7561a<? extends T> aVar) {
        C7573i.m23587b(aVar, "initializer");
        this.f20885b = aVar;
    }
}
