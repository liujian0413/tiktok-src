package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.common.collect.cb */
public interface C17882cb<E> extends Collection<E> {

    /* renamed from: com.google.common.collect.cb$a */
    public interface C17883a<E> {
        /* renamed from: a */
        int mo45307a();

        /* renamed from: b */
        E mo45308b();

        String toString();
    }

    int add(E e, int i);

    boolean contains(Object obj);

    boolean containsAll(Collection<?> collection);

    int count(Object obj);

    Set<E> elementSet();

    Set<C17883a<E>> entrySet();

    boolean equals(Object obj);

    int hashCode();

    int remove(Object obj, int i);

    boolean remove(Object obj);

    int setCount(E e, int i);

    boolean setCount(E e, int i, int i2);

    int size();
}
