package com.google.common.collect;

import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: com.google.common.collect.bb */
public abstract class C17756bb<E> extends C17746as<E> implements Queue<E> {
    protected C17756bb() {
    }

    /* access modifiers changed from: protected */
    public abstract Queue<E> delegate();

    /* access modifiers changed from: protected */
    public E standardPeek() {
        try {
            return element();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public E standardPoll() {
        try {
            return remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public E element() {
        return delegate().element();
    }

    public E peek() {
        return delegate().peek();
    }

    public E poll() {
        return delegate().poll();
    }

    public E remove() {
        return delegate().remove();
    }

    /* access modifiers changed from: protected */
    public boolean standardOffer(E e) {
        try {
            return add(e);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public boolean offer(E e) {
        return delegate().offer(e);
    }
}
