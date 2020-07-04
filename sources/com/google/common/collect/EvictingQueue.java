package com.google.common.collect;

import com.google.common.base.C17439m;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public final class EvictingQueue<E> extends C17756bb<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Queue<E> delegate;
    final int maxSize;

    /* access modifiers changed from: protected */
    public final Queue<E> delegate() {
        return this.delegate;
    }

    public final int remainingCapacity() {
        return this.maxSize - size();
    }

    public static <E> EvictingQueue<E> create(int i) {
        return new EvictingQueue<>(i);
    }

    public final boolean offer(E e) {
        return add(e);
    }

    public final boolean contains(Object obj) {
        return delegate().contains(C17439m.m57962a(obj));
    }

    public final boolean remove(Object obj) {
        return delegate().remove(C17439m.m57962a(obj));
    }

    private EvictingQueue(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57971a(z, "maxSize (%s) must >= 0", i);
        this.delegate = new ArrayDeque(i);
        this.maxSize = i;
    }

    public final boolean add(E e) {
        C17439m.m57962a(e);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(e);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return standardAddAll(collection);
        }
        clear();
        return C17777bq.m59095a((Collection<T>) this, C17777bq.m59087a((Iterable<T>) collection, size - this.maxSize));
    }
}
