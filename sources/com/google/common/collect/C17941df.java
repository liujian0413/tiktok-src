package com.google.common.collect;

import com.google.common.base.C17439m;
import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: com.google.common.collect.df */
final class C17941df {
    /* renamed from: a */
    public static <E> Comparator<? super E> m59577a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        if (comparator == null) {
            return C17896ch.m59497b();
        }
        return comparator;
    }

    /* renamed from: a */
    public static boolean m59578a(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        C17439m.m57962a(comparator);
        C17439m.m57962a(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m59577a((SortedSet) iterable);
        } else if (!(iterable instanceof C17940de)) {
            return false;
        } else {
            comparator2 = ((C17940de) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
