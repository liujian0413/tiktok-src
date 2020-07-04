package kotlin.p1879c;

import kotlin.jvm.internal.C7573i;
import kotlin.reflect.C7595j;

/* renamed from: kotlin.c.a */
public abstract class C47894a<T> implements C47895b<Object, T> {

    /* renamed from: a */
    private T f122747a;

    /* renamed from: b */
    private static boolean m148824b(C7595j<?> jVar, T t, T t2) {
        C7573i.m23587b(jVar, "property");
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo63286a(C7595j<?> jVar, T t, T t2) {
        C7573i.m23587b(jVar, "property");
    }

    public C47894a(T t) {
        this.f122747a = t;
    }

    /* renamed from: a */
    public final T mo120018a(Object obj, C7595j<?> jVar) {
        C7573i.m23587b(jVar, "property");
        return this.f122747a;
    }

    /* renamed from: a */
    public final void mo120019a(Object obj, C7595j<?> jVar, T t) {
        C7573i.m23587b(jVar, "property");
        T t2 = this.f122747a;
        m148824b(jVar, t2, t);
        this.f122747a = t;
        mo63286a(jVar, t2, t);
    }
}
