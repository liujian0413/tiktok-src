package com.google.common.collect;

import com.google.common.collect.C17882cb.C17883a;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.common.collect.az */
public abstract class C17753az<E> extends C17746as<E> implements C17882cb<E> {
    protected C17753az() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C17882cb<E> delegate();

    public Set<E> elementSet() {
        return delegate().elementSet();
    }

    public Set<C17883a<E>> entrySet() {
        return delegate().entrySet();
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    /* access modifiers changed from: protected */
    public void standardClear() {
        C17782br.m59133h(entrySet().iterator());
    }

    /* access modifiers changed from: protected */
    public String standardToString() {
        return entrySet().toString();
    }

    /* access modifiers changed from: protected */
    public boolean standardAddAll(Collection<? extends E> collection) {
        return C17884cc.m59431a((C17882cb<E>) this, collection);
    }

    /* access modifiers changed from: protected */
    public boolean standardRemoveAll(Collection<?> collection) {
        return C17884cc.m59433b(this, collection);
    }

    /* access modifiers changed from: protected */
    public boolean standardRetainAll(Collection<?> collection) {
        return C17884cc.m59434c(this, collection);
    }

    public int count(Object obj) {
        return delegate().count(obj);
    }

    /* access modifiers changed from: protected */
    public boolean standardContains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean standardRemove(Object obj) {
        if (remove(obj, 1) > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this || delegate().equals(obj)) {
            return true;
        }
        return false;
    }

    public int add(E e, int i) {
        return delegate().add(e, i);
    }

    public int remove(Object obj, int i) {
        return delegate().remove(obj, i);
    }

    public int setCount(E e, int i) {
        return delegate().setCount(e, i);
    }

    public boolean setCount(E e, int i, int i2) {
        return delegate().setCount(e, i, i2);
    }
}
