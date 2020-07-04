package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class awf<E> extends AbstractList<E> implements ayc<E> {

    /* renamed from: a */
    private boolean f41125a = true;

    awf() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean add(E e) {
        mo40096c();
        return super.add(e);
    }

    public void add(int i, E e) {
        mo40096c();
        super.add(i, e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo40096c();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo40096c();
        return super.addAll(i, collection);
    }

    public void clear() {
        mo40096c();
        super.clear();
    }

    /* renamed from: a */
    public boolean mo40090a() {
        return this.f41125a;
    }

    /* renamed from: b */
    public final void mo40095b() {
        this.f41125a = false;
    }

    public E remove(int i) {
        mo40096c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        mo40096c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo40096c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo40096c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo40096c();
        return super.set(i, e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo40096c() {
        if (!this.f41125a) {
            throw new UnsupportedOperationException();
        }
    }
}
