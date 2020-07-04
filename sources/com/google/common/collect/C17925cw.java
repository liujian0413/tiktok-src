package com.google.common.collect;

import com.google.common.base.C17439m;
import java.io.Serializable;

/* renamed from: com.google.common.collect.cw */
final class C17925cw extends C17896ch<Comparable> implements Serializable {

    /* renamed from: a */
    static final C17925cw f49228a = new C17925cw();
    private static final long serialVersionUID = 0;

    private C17925cw() {
    }

    private Object readResolve() {
        return f49228a;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    /* renamed from: a */
    public final <S extends Comparable> C17896ch<S> mo46226a() {
        return C17896ch.m59497b();
    }

    /* renamed from: a */
    private static int m59542a(Comparable comparable, Comparable comparable2) {
        C17439m.m57962a(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    /* renamed from: b */
    private static <E extends Comparable> E m59543b(E e, E e2) {
        return (Comparable) C17891cd.f49157a.mo46250b(e, e2);
    }

    /* renamed from: c */
    private static <E extends Comparable> E m59544c(E e, E e2) {
        return (Comparable) C17891cd.f49157a.mo46247a(e, e2);
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return m59542a((Comparable) obj, (Comparable) obj2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo46247a(Object obj, Object obj2) {
        return m59543b((E) (Comparable) obj, (E) (Comparable) obj2);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo46250b(Object obj, Object obj2) {
        return m59544c((Comparable) obj, (Comparable) obj2);
    }
}
