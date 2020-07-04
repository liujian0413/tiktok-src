package com.google.common.collect;

/* renamed from: com.google.common.collect.ag */
final class C17716ag<E> extends ImmutableSortedSet<E> {

    /* renamed from: a */
    private final ImmutableSortedSet<E> f48953a;

    public final ImmutableSortedSet<E> descendingSet() {
        return this.f48953a;
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> createDescendingSet() {
        throw new AssertionError("should never be called");
    }

    public final C17995dt<E> descendingIterator() {
        return this.f48953a.iterator();
    }

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        return this.f48953a.isPartialView();
    }

    public final C17995dt<E> iterator() {
        return this.f48953a.descendingIterator();
    }

    public final int size() {
        return this.f48953a.size();
    }

    public final E ceiling(E e) {
        return this.f48953a.floor(e);
    }

    public final boolean contains(Object obj) {
        return this.f48953a.contains(obj);
    }

    public final E floor(E e) {
        return this.f48953a.ceiling(e);
    }

    public final E higher(E e) {
        return this.f48953a.lower(e);
    }

    public final E lower(E e) {
        return this.f48953a.higher(e);
    }

    C17716ag(ImmutableSortedSet<E> immutableSortedSet) {
        super(C17896ch.m59496a(immutableSortedSet.comparator()).mo46226a());
        this.f48953a = immutableSortedSet;
    }

    /* access modifiers changed from: 0000 */
    public final int indexOf(Object obj) {
        int indexOf = this.f48953a.indexOf(obj);
        if (indexOf == -1) {
            return indexOf;
        }
        return (size() - 1) - indexOf;
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> headSetImpl(E e, boolean z) {
        return this.f48953a.tailSet(e, z).descendingSet();
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> tailSetImpl(E e, boolean z) {
        return this.f48953a.headSet(e, z).descendingSet();
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2) {
        return this.f48953a.subSet(e2, z2, e, z).descendingSet();
    }
}
