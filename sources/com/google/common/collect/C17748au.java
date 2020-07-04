package com.google.common.collect;

import java.util.Iterator;

/* renamed from: com.google.common.collect.au */
public abstract class C17748au<T> extends C17755ba implements Iterator<T> {
    protected C17748au() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Iterator<T> delegate();

    public void remove() {
        delegate().remove();
    }

    public boolean hasNext() {
        return delegate().hasNext();
    }

    public T next() {
        return delegate().next();
    }
}
