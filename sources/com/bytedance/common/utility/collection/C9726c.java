package com.bytedance.common.utility.collection;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.common.utility.collection.c */
public final class C9726c<E> extends AbstractSet<E> {

    /* renamed from: a */
    private final Map<E, Boolean> f26464a;

    /* renamed from: b */
    private transient Set<E> f26465b;

    public final void clear() {
        this.f26464a.clear();
    }

    public final int hashCode() {
        return this.f26465b.hashCode();
    }

    public final boolean isEmpty() {
        return this.f26464a.isEmpty();
    }

    public final Iterator<E> iterator() {
        return this.f26465b.iterator();
    }

    public final int size() {
        return this.f26464a.size();
    }

    public final Object[] toArray() {
        return this.f26465b.toArray();
    }

    public final String toString() {
        return this.f26465b.toString();
    }

    public final boolean contains(Object obj) {
        return this.f26465b.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f26465b.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this.f26465b.equals(obj);
    }

    public final boolean retainAll(Collection<?> collection) {
        return this.f26465b.retainAll(collection);
    }

    public C9726c(Map<E, Boolean> map) {
        this.f26464a = map;
        this.f26465b = map.keySet();
    }

    public final boolean add(E e) {
        if (this.f26464a.put(e, Boolean.TRUE) == null) {
            return true;
        }
        return false;
    }

    public final boolean remove(Object obj) {
        if (this.f26464a.remove(obj) != null) {
            return true;
        }
        return false;
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.f26465b.toArray(tArr);
    }
}
