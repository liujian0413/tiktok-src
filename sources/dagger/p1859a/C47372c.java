package dagger.p1859a;

import dagger.C47369a;
import javax.p1876a.C47883a;

/* renamed from: dagger.a.c */
public final class C47372c<T> implements C47369a<T>, C47883a<T> {

    /* renamed from: a */
    static final /* synthetic */ boolean f121585a = (!C47372c.class.desiredAssertionStatus());

    /* renamed from: b */
    private static final Object f121586b = new Object();

    /* renamed from: c */
    private volatile C47883a<T> f121587c;

    /* renamed from: d */
    private volatile Object f121588d = f121586b;

    public final T get() {
        T t = this.f121588d;
        if (t == f121586b) {
            synchronized (this) {
                t = this.f121588d;
                if (t == f121586b) {
                    t = this.f121587c.get();
                    this.f121588d = m147936a(this.f121588d, t);
                    this.f121587c = null;
                }
            }
        }
        return t;
    }

    /* renamed from: a */
    public static <P extends C47883a<T>, T> C47883a<T> m147937a(P p) {
        C47375f.m147939a(p);
        if (p instanceof C47372c) {
            return p;
        }
        return new C47372c(p);
    }

    private C47372c(C47883a<T> aVar) {
        if (f121585a || aVar != null) {
            this.f121587c = aVar;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public static <P extends C47883a<T>, T> C47369a<T> m147938b(P p) {
        if (p instanceof C47369a) {
            return (C47369a) p;
        }
        return new C47372c((C47883a) C47375f.m147939a(p));
    }

    /* renamed from: a */
    private static Object m147936a(Object obj, Object obj2) {
        boolean z;
        if (obj == f121586b || (obj instanceof C47374e)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || obj == obj2) {
            return obj2;
        }
        StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
        sb.append(obj);
        sb.append(" & ");
        sb.append(obj2);
        sb.append(". This is likely due to a circular dependency.");
        throw new IllegalStateException(sb.toString());
    }
}
