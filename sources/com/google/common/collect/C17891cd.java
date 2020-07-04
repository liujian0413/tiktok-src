package com.google.common.collect;

import com.google.common.base.C17439m;
import java.io.Serializable;

/* renamed from: com.google.common.collect.cd */
final class C17891cd extends C17896ch<Comparable> implements Serializable {

    /* renamed from: a */
    static final C17891cd f49157a = new C17891cd();
    private static final long serialVersionUID = 0;

    private C17891cd() {
    }

    private Object readResolve() {
        return f49157a;
    }

    /* renamed from: a */
    public final <S extends Comparable> C17896ch<S> mo46226a() {
        return C17925cw.f49228a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    /* renamed from: a */
    private static int m59441a(Comparable comparable, Comparable comparable2) {
        C17439m.m57962a(comparable);
        C17439m.m57962a(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return m59441a((Comparable) obj, (Comparable) obj2);
    }
}
