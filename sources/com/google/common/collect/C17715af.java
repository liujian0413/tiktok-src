package com.google.common.collect;

import com.google.common.collect.C17882cb.C17883a;

/* renamed from: com.google.common.collect.af */
final class C17715af<E> extends ImmutableSortedMultiset<E> {

    /* renamed from: a */
    private final transient ImmutableSortedMultiset<E> f48952a;

    public final ImmutableSortedMultiset<E> descendingMultiset() {
        return this.f48952a;
    }

    public final C17883a<E> firstEntry() {
        return this.f48952a.lastEntry();
    }

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        return this.f48952a.isPartialView();
    }

    public final C17883a<E> lastEntry() {
        return this.f48952a.firstEntry();
    }

    public final int size() {
        return this.f48952a.size();
    }

    public final ImmutableSortedSet<E> elementSet() {
        return this.f48952a.elementSet().descendingSet();
    }

    C17715af(ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.f48952a = immutableSortedMultiset;
    }

    public final int count(Object obj) {
        return this.f48952a.count(obj);
    }

    /* access modifiers changed from: 0000 */
    public final C17883a<E> getEntry(int i) {
        return (C17883a) this.f48952a.entrySet().asList().reverse().get(i);
    }

    public final ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType) {
        return this.f48952a.tailMultiset(e, boundType).descendingMultiset();
    }

    public final ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        return this.f48952a.headMultiset(e, boundType).descendingMultiset();
    }
}
