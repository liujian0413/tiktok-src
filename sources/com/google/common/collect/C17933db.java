package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.base.C17440n;
import com.google.common.base.C17441o;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.common.collect.db */
public final class C17933db {

    /* renamed from: com.google.common.collect.db$a */
    static class C17934a<E> extends C18055a<E> implements Set<E> {
        public int hashCode() {
            return C17933db.m59564a((Set<?>) this);
        }

        public boolean equals(Object obj) {
            return C17933db.m59571a((Set<?>) this, obj);
        }

        C17934a(Set<E> set, C17440n<? super E> nVar) {
            super(set, nVar);
        }
    }

    /* renamed from: com.google.common.collect.db$b */
    static class C17935b<E> extends C17934a<E> implements SortedSet<E> {
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.f49355a).comparator();
        }

        public final E first() {
            return C17782br.m59127d(this.f49355a.iterator(), this.f49356b);
        }

        public final E last() {
            SortedSet sortedSet = (SortedSet) this.f49355a;
            while (true) {
                E last = sortedSet.last();
                if (this.f49356b.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        public final SortedSet<E> headSet(E e) {
            return new C17935b(((SortedSet) this.f49355a).headSet(e), this.f49356b);
        }

        public final SortedSet<E> tailSet(E e) {
            return new C17935b(((SortedSet) this.f49355a).tailSet(e), this.f49356b);
        }

        C17935b(SortedSet<E> sortedSet, C17440n<? super E> nVar) {
            super(sortedSet, nVar);
        }

        public final SortedSet<E> subSet(E e, E e2) {
            return new C17935b(((SortedSet) this.f49355a).subSet(e, e2), this.f49356b);
        }
    }

    /* renamed from: com.google.common.collect.db$c */
    static abstract class C17936c<E> extends AbstractSet<E> {
        C17936c() {
        }

        public boolean removeAll(Collection<?> collection) {
            return C17933db.m59572a((Set<?>) this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) C17439m.m57962a(collection));
        }
    }

    /* renamed from: com.google.common.collect.db$d */
    static final class C17937d<E> extends C17758bd<E> implements Serializable, NavigableSet<E> {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final NavigableSet<E> f49231a;

        /* renamed from: b */
        private final SortedSet<E> f49232b;

        /* renamed from: c */
        private transient C17937d<E> f49233c;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final SortedSet<E> delegate() {
            return this.f49232b;
        }

        public final E pollFirst() {
            throw new UnsupportedOperationException();
        }

        public final E pollLast() {
            throw new UnsupportedOperationException();
        }

        public final Iterator<E> descendingIterator() {
            return C17782br.m59111a(this.f49231a.descendingIterator());
        }

        public final NavigableSet<E> descendingSet() {
            C17937d<E> dVar = this.f49233c;
            if (dVar != null) {
                return dVar;
            }
            C17937d<E> dVar2 = new C17937d<>(this.f49231a.descendingSet());
            this.f49233c = dVar2;
            dVar2.f49233c = this;
            return dVar2;
        }

        public final E ceiling(E e) {
            return this.f49231a.ceiling(e);
        }

        public final E floor(E e) {
            return this.f49231a.floor(e);
        }

        public final E higher(E e) {
            return this.f49231a.higher(e);
        }

        public final E lower(E e) {
            return this.f49231a.lower(e);
        }

        C17937d(NavigableSet<E> navigableSet) {
            this.f49231a = (NavigableSet) C17439m.m57962a(navigableSet);
            this.f49232b = Collections.unmodifiableSortedSet(navigableSet);
        }

        public final NavigableSet<E> headSet(E e, boolean z) {
            return C17933db.m59568a(this.f49231a.headSet(e, z));
        }

        public final NavigableSet<E> tailSet(E e, boolean z) {
            return C17933db.m59568a(this.f49231a.tailSet(e, z));
        }

        public final NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return C17933db.m59568a(this.f49231a.subSet(e, z, e2, z2));
        }
    }

    /* renamed from: a */
    static boolean m59573a(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* renamed from: a */
    public static <E> HashSet<E> m59565a() {
        return new HashSet<>();
    }

    /* renamed from: c */
    private static <E> LinkedHashSet<E> m59575c() {
        return new LinkedHashSet<>();
    }

    /* renamed from: b */
    public static <E> Set<E> m59574b() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* renamed from: a */
    public static <E> HashSet<E> m59566a(int i) {
        return new HashSet<>(C17839bx.m59342b(i));
    }

    /* renamed from: a */
    static int m59564a(Set<?> set) {
        int i;
        int i2 = 0;
        for (Object next : set) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = ((i2 + i) ^ -1) ^ -1;
        }
        return i2;
    }

    /* renamed from: a */
    public static <E> LinkedHashSet<E> m59567a(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>(C18054w.m59707a(iterable));
        }
        LinkedHashSet<E> c = m59575c();
        C17777bq.m59095a((Collection<T>) c, iterable);
        return c;
    }

    /* renamed from: a */
    public static <E> NavigableSet<E> m59568a(NavigableSet<E> navigableSet) {
        if ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof C17937d)) {
            return navigableSet;
        }
        return new C17937d(navigableSet);
    }

    /* renamed from: a */
    public static <E> Set<E> m59569a(Set<E> set, C17440n<? super E> nVar) {
        if (set instanceof SortedSet) {
            return m59570a((SortedSet) set, nVar);
        }
        if (!(set instanceof C17934a)) {
            return new C17934a((Set) C17439m.m57962a(set), (C17440n) C17439m.m57962a(nVar));
        }
        C17934a aVar = (C17934a) set;
        return new C17934a((Set) aVar.f49355a, C17441o.m57991a(aVar.f49356b, nVar));
    }

    /* renamed from: a */
    private static <E> SortedSet<E> m59570a(SortedSet<E> sortedSet, C17440n<? super E> nVar) {
        if (!(sortedSet instanceof C17934a)) {
            return new C17935b((SortedSet) C17439m.m57962a(sortedSet), (C17440n) C17439m.m57962a(nVar));
        }
        C17934a aVar = (C17934a) sortedSet;
        return new C17935b((SortedSet) aVar.f49355a, C17441o.m57991a(aVar.f49356b, nVar));
    }

    /* renamed from: a */
    static boolean m59571a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                return false;
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: a */
    static boolean m59572a(Set<?> set, Collection<?> collection) {
        C17439m.m57962a(collection);
        if (collection instanceof C17882cb) {
            collection = ((C17882cb) collection).elementSet();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m59573a(set, collection.iterator());
        }
        return C17782br.m59116a(set.iterator(), collection);
    }
}
