package com.google.common.collect;

import java.util.ListIterator;

/* renamed from: com.google.common.collect.dr */
abstract class C17993dr<F, T> extends C17992dq<F, T> implements ListIterator<T> {
    /* renamed from: a */
    private ListIterator<? extends F> m59637a() {
        return C17782br.m59135j(this.f49293c);
    }

    public final boolean hasPrevious() {
        return m59637a().hasPrevious();
    }

    public final int nextIndex() {
        return m59637a().nextIndex();
    }

    public final T previous() {
        return mo45666a(m59637a().previous());
    }

    public final int previousIndex() {
        return m59637a().previousIndex();
    }

    C17993dr(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
