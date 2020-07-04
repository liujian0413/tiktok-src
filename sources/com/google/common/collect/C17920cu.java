package com.google.common.collect;

import com.google.common.base.C17439m;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.common.collect.cu */
final class C17920cu<E> extends ImmutableSortedSet<E> {

    /* renamed from: a */
    static final C17920cu<Comparable> f49222a = new C17920cu<>(ImmutableList.m58536of(), C17896ch.m59497b());

    /* renamed from: b */
    final transient ImmutableList<E> f49223b;

    public final ImmutableList<E> asList() {
        return this.f49223b;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        return this.f49223b.isPartialView();
    }

    public final C17995dt<E> iterator() {
        return this.f49223b.iterator();
    }

    public final int size() {
        return this.f49223b.size();
    }

    public final C17995dt<E> descendingIterator() {
        return this.f49223b.reverse().iterator();
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> createDescendingSet() {
        Comparator reverseOrder = Collections.reverseOrder(this.comparator);
        if (isEmpty()) {
            return emptySet(reverseOrder);
        }
        return new C17920cu(this.f49223b.reverse(), reverseOrder);
    }

    public final E first() {
        if (!isEmpty()) {
            return this.f49223b.get(0);
        }
        throw new NoSuchElementException();
    }

    public final E last() {
        if (!isEmpty()) {
            return this.f49223b.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private int m59530a(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.f49223b, obj, this.comparator);
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (m59530a(obj) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    public final E ceiling(E e) {
        int b = mo46273b(e, true);
        if (b == size()) {
            return null;
        }
        return this.f49223b.get(b);
    }

    public final E floor(E e) {
        int a = mo46271a(e, true) - 1;
        if (a == -1) {
            return null;
        }
        return this.f49223b.get(a);
    }

    public final E higher(E e) {
        int b = mo46273b(e, false);
        if (b == size()) {
            return null;
        }
        return this.f49223b.get(b);
    }

    /* access modifiers changed from: 0000 */
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int binarySearch = Collections.binarySearch(this.f49223b, obj, this.comparator);
            if (binarySearch >= 0) {
                return binarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public final E lower(E e) {
        int a = mo46271a(e, false) - 1;
        if (a == -1) {
            return null;
        }
        return this.f49223b.get(a);
    }

    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof C17882cb) {
            collection = ((C17882cb) collection).elementSet();
        }
        if (!C17941df.m59578a(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C17995dt it = iterator();
        Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int unsafeCompare = unsafeCompare(next2, next);
                if (unsafeCompare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (unsafeCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (unsafeCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!C17941df.m59578a(this.comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            C17995dt it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                if (next2 != null) {
                    if (unsafeCompare(next, next2) != 0) {
                    }
                }
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        } catch (NoSuchElementException unused2) {
            return false;
        }
    }

    C17920cu(ImmutableList<E> immutableList, Comparator<? super E> comparator) {
        super(comparator);
        this.f49223b = immutableList;
    }

    /* access modifiers changed from: 0000 */
    public final int copyIntoArray(Object[] objArr, int i) {
        return this.f49223b.copyIntoArray(objArr, i);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> headSetImpl(E e, boolean z) {
        return mo46272a(0, mo46271a(e, z));
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> tailSetImpl(E e, boolean z) {
        return mo46272a(mo46273b(e, z), size());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo46271a(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.f49223b, C17439m.m57962a(e), comparator());
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        if (z) {
            binarySearch++;
        }
        return binarySearch;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo46273b(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.f49223b, C17439m.m57962a(e), comparator());
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        if (z) {
            return binarySearch;
        }
        return binarySearch + 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17920cu<E> mo46272a(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new C17920cu<>(this.f49223b.subList(i, i2), this.comparator);
        }
        return emptySet(this.comparator);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2) {
        return tailSetImpl(e, z).headSetImpl(e2, z2);
    }
}
