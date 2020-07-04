package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: com.google.common.collect.bd */
public abstract class C17758bd<E> extends C17757bc<E> implements SortedSet<E> {
    protected C17758bd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract SortedSet<E> delegate();

    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    public E first() {
        return delegate().first();
    }

    public E last() {
        return delegate().last();
    }

    public SortedSet<E> headSet(E e) {
        return delegate().headSet(e);
    }

    public SortedSet<E> tailSet(E e) {
        return delegate().tailSet(e);
    }

    /* access modifiers changed from: protected */
    public boolean standardContains(Object obj) {
        try {
            if (m59054a(tailSet(obj).first(), obj) == 0) {
                return true;
            }
            return false;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean standardRemove(Object obj) {
        try {
            Iterator it = tailSet(obj).iterator();
            if (!it.hasNext() || m59054a(it.next(), obj) != 0) {
                return false;
            }
            it.remove();
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public SortedSet<E> subSet(E e, E e2) {
        return delegate().subSet(e, e2);
    }

    /* renamed from: a */
    private int m59054a(Object obj, Object obj2) {
        Comparator comparator = comparator();
        if (comparator == null) {
            return ((Comparable) obj).compareTo(obj2);
        }
        return comparator.compare(obj, obj2);
    }
}
