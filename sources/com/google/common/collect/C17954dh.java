package com.google.common.collect;

import com.google.common.collect.C17882cb.C17883a;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* renamed from: com.google.common.collect.dh */
public interface C17954dh<E> extends C17940de<E>, C17955di<E> {
    Comparator<? super E> comparator();

    C17954dh<E> descendingMultiset();

    NavigableSet<E> elementSet();

    Set<C17883a<E>> entrySet();

    C17883a<E> firstEntry();

    C17954dh<E> headMultiset(E e, BoundType boundType);

    C17883a<E> lastEntry();

    C17883a<E> pollFirstEntry();

    C17883a<E> pollLastEntry();

    C17954dh<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2);

    C17954dh<E> tailMultiset(E e, BoundType boundType);
}
