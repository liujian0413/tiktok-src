package com.google.common.collect;

import com.google.common.collect.C17882cb.C17883a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: com.google.common.collect.dj */
final class C17956dj {

    /* renamed from: com.google.common.collect.dj$a */
    static class C17957a<E> extends C17887b<E> implements SortedSet<E> {

        /* renamed from: a */
        public final C17954dh<E> f49249a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C17882cb mo46213a() {
            return this.f49249a;
        }

        public Comparator<? super E> comparator() {
            return this.f49249a.comparator();
        }

        public E first() {
            return C17956dj.m59592a(this.f49249a.firstEntry());
        }

        public Iterator<E> iterator() {
            return C17884cc.m59426a(this.f49249a.entrySet().iterator());
        }

        public E last() {
            return C17956dj.m59592a(this.f49249a.lastEntry());
        }

        C17957a(C17954dh<E> dhVar) {
            this.f49249a = dhVar;
        }

        public SortedSet<E> headSet(E e) {
            return this.f49249a.headMultiset(e, BoundType.OPEN).elementSet();
        }

        public SortedSet<E> tailSet(E e) {
            return this.f49249a.tailMultiset(e, BoundType.CLOSED).elementSet();
        }

        public SortedSet<E> subSet(E e, E e2) {
            return this.f49249a.subMultiset(e, BoundType.CLOSED, e2, BoundType.OPEN).elementSet();
        }
    }

    /* renamed from: com.google.common.collect.dj$b */
    static class C17958b<E> extends C17957a<E> implements NavigableSet<E> {
        public final Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        public final NavigableSet<E> descendingSet() {
            return new C17958b(this.f49249a.descendingMultiset());
        }

        public final E pollFirst() {
            return C17956dj.m59593b(this.f49249a.pollFirstEntry());
        }

        public final E pollLast() {
            return C17956dj.m59593b(this.f49249a.pollLastEntry());
        }

        C17958b(C17954dh<E> dhVar) {
            super(dhVar);
        }

        public final E ceiling(E e) {
            return C17956dj.m59593b(this.f49249a.tailMultiset(e, BoundType.CLOSED).firstEntry());
        }

        public final E floor(E e) {
            return C17956dj.m59593b(this.f49249a.headMultiset(e, BoundType.CLOSED).lastEntry());
        }

        public final E higher(E e) {
            return C17956dj.m59593b(this.f49249a.tailMultiset(e, BoundType.OPEN).firstEntry());
        }

        public final E lower(E e) {
            return C17956dj.m59593b(this.f49249a.headMultiset(e, BoundType.OPEN).lastEntry());
        }

        public final NavigableSet<E> headSet(E e, boolean z) {
            return new C17958b(this.f49249a.headMultiset(e, BoundType.forBoolean(z)));
        }

        public final NavigableSet<E> tailSet(E e, boolean z) {
            return new C17958b(this.f49249a.tailMultiset(e, BoundType.forBoolean(z)));
        }

        public final NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return new C17958b(this.f49249a.subMultiset(e, BoundType.forBoolean(z), e2, BoundType.forBoolean(z2)));
        }
    }

    /* renamed from: a */
    public static <E> E m59592a(C17883a<E> aVar) {
        if (aVar != null) {
            return aVar.mo45308b();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public static <E> E m59593b(C17883a<E> aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.mo45308b();
    }
}
