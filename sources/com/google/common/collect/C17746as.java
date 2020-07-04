package com.google.common.collect;

import com.google.common.base.C17434j;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.common.collect.as */
public abstract class C17746as<E> extends C17755ba implements Collection<E> {
    protected C17746as() {
    }

    /* access modifiers changed from: protected */
    public abstract Collection<E> delegate();

    public void clear() {
        delegate().clear();
    }

    /* access modifiers changed from: protected */
    public void standardClear() {
        C17782br.m59133h(iterator());
    }

    /* access modifiers changed from: protected */
    public String standardToString() {
        return C18054w.m59705a((Collection<?>) this);
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Iterator<E> iterator() {
        return delegate().iterator();
    }

    public int size() {
        return delegate().size();
    }

    /* access modifiers changed from: protected */
    public boolean standardIsEmpty() {
        if (!iterator().hasNext()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Object[] standardToArray() {
        return toArray(new Object[size()]);
    }

    public Object[] toArray() {
        return delegate().toArray();
    }

    /* access modifiers changed from: protected */
    public boolean standardContainsAll(Collection<?> collection) {
        return C18054w.m59711a((Collection<?>) this, collection);
    }

    /* access modifiers changed from: protected */
    public <T> T[] standardToArray(T[] tArr) {
        return C17892ce.m59446a((Collection<?>) this, tArr);
    }

    public boolean add(E e) {
        return delegate().add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return delegate().addAll(collection);
    }

    public boolean contains(Object obj) {
        return delegate().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    public boolean remove(Object obj) {
        return delegate().remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    /* access modifiers changed from: protected */
    public boolean standardAddAll(Collection<? extends E> collection) {
        return C17782br.m59113a((Collection<T>) this, collection.iterator());
    }

    /* access modifiers changed from: protected */
    public boolean standardContains(Object obj) {
        return C17782br.m59115a(iterator(), obj);
    }

    /* access modifiers changed from: protected */
    public boolean standardRemoveAll(Collection<?> collection) {
        return C17782br.m59116a(iterator(), collection);
    }

    /* access modifiers changed from: protected */
    public boolean standardRetainAll(Collection<?> collection) {
        return C17782br.m59122b(iterator(), collection);
    }

    /* access modifiers changed from: protected */
    public boolean standardRemove(Object obj) {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (C17434j.m57955a(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public <T> T[] toArray(T[] tArr) {
        return delegate().toArray(tArr);
    }
}
