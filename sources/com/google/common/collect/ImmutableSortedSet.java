package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.ImmutableSet.C17622a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class ImmutableSortedSet<E> extends C17776bp<E> implements C17940de<E>, NavigableSet<E> {
    public final transient Comparator<? super E> comparator;
    transient ImmutableSortedSet<E> descendingSet;

    /* renamed from: com.google.common.collect.ImmutableSortedSet$a */
    public static final class C17636a<E> extends C17622a<E> {

        /* renamed from: e */
        private final Comparator<? super E> f48775e;

        /* renamed from: b */
        public final ImmutableSortedSet<E> mo45556a() {
            ImmutableSortedSet<E> construct = ImmutableSortedSet.construct(this.f48775e, this.f48677b, this.f48676a);
            this.f48677b = construct.size();
            this.f48678c = true;
            return construct;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C17636a<E> mo45557b(Iterable<? extends E> iterable) {
            super.mo45401a(iterable);
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public C17636a<E> mo45560c(E e) {
            super.mo45403b(e);
            return this;
        }

        public C17636a(Comparator<? super E> comparator) {
            this.f48775e = (Comparator) C17439m.m57962a(comparator);
        }

        /* renamed from: c */
        public final C17636a<E> mo45558b(Iterator<? extends E> it) {
            super.mo45404a(it);
            return this;
        }

        /* renamed from: c */
        public final C17636a<E> mo45559b(E... eArr) {
            super.mo45402a(eArr);
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSortedSet$b */
    static class C17637b<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Comparator<? super E> f48776a;

        /* renamed from: b */
        final Object[] f48777b;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return new C17636a(this.f48776a).mo45559b((E[]) this.f48777b).mo45556a();
        }

        public C17637b(Comparator<? super E> comparator, Object[] objArr) {
            this.f48776a = comparator;
            this.f48777b = objArr;
        }
    }

    /* renamed from: of */
    public static <E> ImmutableSortedSet<E> m58730of() {
        return C17920cu.f49222a;
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    /* access modifiers changed from: 0000 */
    public abstract ImmutableSortedSet<E> createDescendingSet();

    public abstract C17995dt<E> descendingIterator();

    /* access modifiers changed from: 0000 */
    public abstract ImmutableSortedSet<E> headSetImpl(E e, boolean z);

    /* access modifiers changed from: 0000 */
    public abstract int indexOf(Object obj);

    public abstract C17995dt<E> iterator();

    /* access modifiers changed from: 0000 */
    public abstract ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2);

    /* access modifiers changed from: 0000 */
    public abstract ImmutableSortedSet<E> tailSetImpl(E e, boolean z);

    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    public static <E extends Comparable<?>> C17636a<E> naturalOrder() {
        return new C17636a<>(C17896ch.m59497b());
    }

    public static <E extends Comparable<?>> C17636a<E> reverseOrder() {
        return new C17636a<>(Collections.reverseOrder());
    }

    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.descendingSet;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> createDescendingSet = createDescendingSet();
        this.descendingSet = createDescendingSet;
        createDescendingSet.descendingSet = this;
        return createDescendingSet;
    }

    public E first() {
        return iterator().next();
    }

    public E last() {
        return descendingIterator().next();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17637b(this.comparator, toArray());
    }

    ImmutableSortedSet(Comparator<? super E> comparator2) {
        this.comparator = comparator2;
    }

    public static <E> C17636a<E> orderedBy(Comparator<E> comparator2) {
        return new C17636a<>(comparator2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public ImmutableSortedSet<E> headSet(E e) {
        return headSet(e, false);
    }

    public ImmutableSortedSet<E> tailSet(E e) {
        return tailSet(e, true);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf((Comparator<? super E>) C17896ch.m59497b(), iterable);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m58731of(E e) {
        return new C17920cu(ImmutableList.m58537of(e), C17896ch.m59497b());
    }

    public E ceiling(E e) {
        return C17777bq.m59090a((Iterable<? extends T>) tailSet(e, true), null);
    }

    public E floor(E e) {
        return C17782br.m59120b((Iterator<? extends T>) headSet(e, true).descendingIterator(), null);
    }

    public E higher(E e) {
        return C17777bq.m59090a((Iterable<? extends T>) tailSet(e, false), null);
    }

    public E lower(E e) {
        return C17782br.m59120b((Iterator<? extends T>) headSet(e, false).descendingIterator(), null);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator<? super E>) C17896ch.m59497b(), collection);
    }

    public static <E> ImmutableSortedSet<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator a = C17941df.m59577a(sortedSet);
        ImmutableList copyOf = ImmutableList.copyOf((Collection<? extends E>) sortedSet);
        if (copyOf.isEmpty()) {
            return emptySet(a);
        }
        return new C17920cu(copyOf, a);
    }

    static <E> C17920cu<E> emptySet(Comparator<? super E> comparator2) {
        if (C17896ch.m59497b().equals(comparator2)) {
            return C17920cu.f49222a;
        }
        return new C17920cu<>(ImmutableList.m58536of(), comparator2);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterator<? extends E> it) {
        return copyOf((Comparator<? super E>) C17896ch.m59497b(), it);
    }

    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> copyOf(E[] eArr) {
        return construct(C17896ch.m59497b(), eArr.length, (Object[]) eArr.clone());
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator2, Collection<? extends E> collection) {
        return copyOf(comparator2, (Iterable<? extends E>) collection);
    }

    public ImmutableSortedSet<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    public ImmutableSortedSet<E> headSet(E e, boolean z) {
        return headSetImpl(C17439m.m57962a(e), z);
    }

    public ImmutableSortedSet<E> tailSet(E e, boolean z) {
        return tailSetImpl(C17439m.m57962a(e), z);
    }

    /* access modifiers changed from: 0000 */
    public int unsafeCompare(Object obj, Object obj2) {
        return unsafeCompare(this.comparator, obj, obj2);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m58732of(E e, E e2) {
        return construct(C17896ch.m59497b(), 2, e, e2);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator2, Iterable<? extends E> iterable) {
        C17439m.m57962a(comparator2);
        if (C17941df.m59578a(comparator2, iterable) && (iterable instanceof ImmutableSortedSet)) {
            ImmutableSortedSet<E> immutableSortedSet = (ImmutableSortedSet) iterable;
            if (!immutableSortedSet.isPartialView()) {
                return immutableSortedSet;
            }
        }
        Object[] c = C17777bq.m59101c(iterable);
        return construct(comparator2, c.length, c);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator2, Iterator<? extends E> it) {
        return new C17636a(comparator2).mo45558b(it).mo45556a();
    }

    static int unsafeCompare(Comparator<?> comparator2, Object obj, Object obj2) {
        return comparator2.compare(obj, obj2);
    }

    static <E> ImmutableSortedSet<E> construct(Comparator<? super E> comparator2, int i, E... eArr) {
        if (i == 0) {
            return emptySet(comparator2);
        }
        C17892ce.m59450b(eArr, i);
        Arrays.sort(eArr, 0, i, comparator2);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            E e = eArr[i3];
            if (comparator2.compare(e, eArr[i2 - 1]) != 0) {
                int i4 = i2 + 1;
                eArr[i2] = e;
                i2 = i4;
            }
        }
        Arrays.fill(eArr, i2, i, null);
        if (i2 < eArr.length / 2) {
            eArr = Arrays.copyOf(eArr, i2);
        }
        return new C17920cu(ImmutableList.asImmutableList(eArr, i2), comparator2);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m58733of(E e, E e2, E e3) {
        return construct(C17896ch.m59497b(), 3, e, e2, e3);
    }

    public ImmutableSortedSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        boolean z3;
        C17439m.m57962a(e);
        C17439m.m57962a(e2);
        if (this.comparator.compare(e, e2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C17439m.m57968a(z3);
        return subSetImpl(e, z, e2, z2);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m58734of(E e, E e2, E e3, E e4) {
        return construct(C17896ch.m59497b(), 4, e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m58735of(E e, E e2, E e3, E e4, E e5) {
        return construct(C17896ch.m59497b(), 5, e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m58736of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        Comparable[] comparableArr = new Comparable[(eArr.length + 6)];
        comparableArr[0] = e;
        comparableArr[1] = e2;
        comparableArr[2] = e3;
        comparableArr[3] = e4;
        comparableArr[4] = e5;
        comparableArr[5] = e6;
        System.arraycopy(eArr, 0, comparableArr, 6, eArr.length);
        return construct(C17896ch.m59497b(), comparableArr.length, comparableArr);
    }
}
