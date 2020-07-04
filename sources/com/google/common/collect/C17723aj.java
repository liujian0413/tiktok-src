package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.common.collect.aj */
final class C17723aj<C extends Comparable> extends ContiguousSet<C> {

    /* renamed from: com.google.common.collect.aj$a */
    static final class C17725a<C extends Comparable> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final C17719ai<C> f48961a;

        private Object readResolve() {
            return new C17723aj(this.f48961a);
        }

        private C17725a(C17719ai<C> aiVar) {
            this.f48961a = aiVar;
        }
    }

    public final boolean contains(Object obj) {
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final ContiguousSet<C> headSetImpl(C c, boolean z) {
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final int indexOf(Object obj) {
        return -1;
    }

    public final ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet) {
        return this;
    }

    public final boolean isEmpty() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isHashCodeFast() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        return false;
    }

    public final int size() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final ContiguousSet<C> tailSetImpl(C c, boolean z) {
        return this;
    }

    public final String toString() {
        return "[]";
    }

    /* renamed from: a */
    private static C m59009a() {
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    private static C m59010b() {
        throw new NoSuchElementException();
    }

    public final ImmutableList<C> asList() {
        return ImmutableList.m58536of();
    }

    public final C17995dt<C> descendingIterator() {
        return C17782br.m59108a();
    }

    public final /* synthetic */ Object first() {
        return m59009a();
    }

    public final C17995dt<C> iterator() {
        return C17782br.m59108a();
    }

    public final /* synthetic */ Object last() {
        return m59010b();
    }

    public final Range<C> range() {
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<C> createDescendingSet() {
        return ImmutableSortedSet.emptySet(C17896ch.m59497b().mo46226a());
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new C17725a(this.domain);
    }

    C17723aj(C17719ai<C> aiVar) {
        super(aiVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    public final Range<C> range(BoundType boundType, BoundType boundType2) {
        throw new NoSuchElementException();
    }
}
