package com.google.common.collect;

import com.google.common.base.C17427g;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.ch */
public abstract class C17896ch<T> implements Comparator<T> {
    protected C17896ch() {
    }

    /* renamed from: b */
    public static <C extends Comparable> C17896ch<C> m59497b() {
        return C17891cd.f49157a;
    }

    public abstract int compare(T t, T t2);

    /* renamed from: a */
    public <S extends T> C17896ch<S> mo46226a() {
        return new C17926cx(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final <T2 extends T> C17896ch<Entry<T2, ?>> mo46251c() {
        return mo46246a(C17839bx.m59325a());
    }

    /* renamed from: b */
    public final <E extends T> ImmutableList<E> mo46249b(Iterable<E> iterable) {
        return ImmutableList.sortedCopyOf(this, iterable);
    }

    /* renamed from: a */
    public static <T> C17896ch<T> m59496a(Comparator<T> comparator) {
        if (comparator instanceof C17896ch) {
            return (C17896ch) comparator;
        }
        return new C17697ab(comparator);
    }

    /* renamed from: a */
    public final <F> C17896ch<F> mo46246a(C17427g<F, ? extends T> gVar) {
        return new C18051t(gVar, this);
    }

    /* renamed from: a */
    public final <E extends T> List<E> mo46248a(Iterable<E> iterable) {
        Object[] c = C17777bq.m59101c(iterable);
        Arrays.sort(c, this);
        return C17795bu.m59144a((Iterable<? extends E>) Arrays.asList(c));
    }

    /* renamed from: b */
    public <E extends T> E mo46250b(E e, E e2) {
        if (compare(e, e2) >= 0) {
            return e;
        }
        return e2;
    }

    /* renamed from: a */
    public <E extends T> E mo46247a(E e, E e2) {
        if (compare(e, e2) <= 0) {
            return e;
        }
        return e2;
    }
}
