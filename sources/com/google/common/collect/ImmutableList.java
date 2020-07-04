package com.google.common.collect;

import com.google.common.base.C17439m;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    private static final C17996du<Object> EMPTY_ITR = new C17585b(C17908cp.f49186a, 0);

    /* renamed from: com.google.common.collect.ImmutableList$a */
    public static final class C17584a<E> extends C17582a<E> {
        public C17584a() {
            this(4);
        }

        /* renamed from: a */
        public final ImmutableList<E> mo45418a() {
            this.f48678c = true;
            return ImmutableList.asImmutableList(this.f48676a, this.f48677b);
        }

        C17584a(int i) {
            super(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17584a<E> mo45401a(Iterable<? extends E> iterable) {
            super.mo45401a(iterable);
            return this;
        }

        /* renamed from: c */
        public final C17584a<E> mo45403b(E e) {
            super.mo45403b(e);
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17584a<E> mo45402a(E... eArr) {
            super.mo45402a(eArr);
            return this;
        }

        /* renamed from: b */
        public final C17584a<E> mo45404a(Iterator<? extends E> it) {
            super.mo45404a(it);
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableList$b */
    static class C17585b<E> extends C17754b<E> {

        /* renamed from: a */
        private final ImmutableList<E> f48679a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final E mo45206a(int i) {
            return this.f48679a.get(i);
        }

        C17585b(ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.f48679a = immutableList;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableList$c */
    static class C17586c<E> extends ImmutableList<E> {

        /* renamed from: a */
        private final transient ImmutableList<E> f48680a;

        public final ImmutableList<E> reverse() {
            return this.f48680a;
        }

        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return this.f48680a.isPartialView();
        }

        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public final int size() {
            return this.f48680a.size();
        }

        C17586c(ImmutableList<E> immutableList) {
            this.f48680a = immutableList;
        }

        /* renamed from: a */
        private int m58560a(int i) {
            return (size() - 1) - i;
        }

        /* renamed from: b */
        private int m58561b(int i) {
            return size() - i;
        }

        public final boolean contains(Object obj) {
            return this.f48680a.contains(obj);
        }

        public final int indexOf(Object obj) {
            int lastIndexOf = this.f48680a.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return m58560a(lastIndexOf);
            }
            return -1;
        }

        public final int lastIndexOf(Object obj) {
            int indexOf = this.f48680a.indexOf(obj);
            if (indexOf >= 0) {
                return m58560a(indexOf);
            }
            return -1;
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }

        public final E get(int i) {
            C17439m.m57960a(i, size());
            return this.f48680a.get(m58560a(i));
        }

        public final ImmutableList<E> subList(int i, int i2) {
            C17439m.m57967a(i, i2, size());
            return this.f48680a.subList(m58561b(i2), m58561b(i)).reverse();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableList$d */
    static class C17587d implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f48681a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return ImmutableList.copyOf((E[]) this.f48681a);
        }

        C17587d(Object[] objArr) {
            this.f48681a = objArr;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableList$e */
    class C17588e extends ImmutableList<E> {

        /* renamed from: a */
        final transient int f48682a;

        /* renamed from: b */
        final transient int f48683b;

        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return true;
        }

        public final int size() {
            return this.f48683b;
        }

        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public final E get(int i) {
            C17439m.m57960a(i, this.f48683b);
            return ImmutableList.this.get(i + this.f48682a);
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }

        public final ImmutableList<E> subList(int i, int i2) {
            C17439m.m57967a(i, i2, this.f48683b);
            return ImmutableList.this.subList(i + this.f48682a, i2 + this.f48682a);
        }

        C17588e(int i, int i2) {
            this.f48682a = i;
            this.f48683b = i2;
        }
    }

    ImmutableList() {
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m58536of() {
        return C17908cp.f49186a;
    }

    public final ImmutableList<E> asList() {
        return this;
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m58545of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m58546of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m58547of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <E> ImmutableList<E> m58548of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        E[] eArr2 = eArr;
        C17439m.m57969a(eArr2.length <= 2147483635, (Object) "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr2.length + 12)];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr2, 0, objArr, 12, eArr2.length);
        return construct(objArr);
    }

    public static <E> C17584a<E> builder() {
        return new C17584a<>();
    }

    public C17995dt<E> iterator() {
        return listIterator();
    }

    public C17996du<E> listIterator() {
        return listIterator(0);
    }

    public ImmutableList<E> reverse() {
        if (size() <= 1) {
            return this;
        }
        return new C17586c(this);
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17587d(toArray());
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    static <E> ImmutableList<E> asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public boolean equals(Object obj) {
        return C17795bu.m59148a((List<?>) this, obj);
    }

    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public static <E> C17584a<E> builderWithExpectedSize(int i) {
        C18053v.m59700a(i, "expectedSize");
        return new C17584a<>(i);
    }

    private static <E> ImmutableList<E> construct(Object... objArr) {
        return asImmutableList(C17892ce.m59447a(objArr));
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m58537of(E e) {
        return construct(e);
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C17795bu.m59149b(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C17795bu.m59152c(this, obj);
    }

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> iterable) {
        C17439m.m57962a(iterable);
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E extends Comparable<? super E>> ImmutableList<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) C17777bq.m59097a(iterable, (T[]) new Comparable[0]);
        C17892ce.m59447a((Object[]) comparableArr);
        Arrays.sort(comparableArr);
        return asImmutableList(comparableArr);
    }

    public C17996du<E> listIterator(int i) {
        C17439m.m57978b(i, size());
        if (isEmpty()) {
            return EMPTY_ITR;
        }
        return new C17585b(this, i);
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return construct(collection.toArray());
        }
        ImmutableList<E> asList = ((ImmutableCollection) collection).asList();
        if (asList.isPartialView()) {
            asList = asImmutableList(asList.toArray());
        }
        return asList;
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m58536of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m58537of(next);
        }
        return new C17584a().mo45403b(next).mo45404a(it).mo45418a();
    }

    public static <E> ImmutableList<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return m58536of();
        }
        return construct((Object[]) eArr.clone());
    }

    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public ImmutableList<E> subListUnchecked(int i, int i2) {
        return new C17588e(i, i2 - i);
    }

    static <E> ImmutableList<E> asImmutableList(Object[] objArr, int i) {
        if (i == 0) {
            return m58536of();
        }
        return new C17908cp(objArr, i);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m58538of(E e, E e2) {
        return construct(e, e2);
    }

    /* access modifiers changed from: 0000 */
    public int copyIntoArray(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public ImmutableList<E> subList(int i, int i2) {
        C17439m.m57967a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m58536of();
        }
        return subListUnchecked(i, i2);
    }

    public static <E> ImmutableList<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C17439m.m57962a(comparator);
        Object[] c = C17777bq.m59101c(iterable);
        C17892ce.m59447a(c);
        Arrays.sort(c, comparator);
        return asImmutableList(c);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m58539of(E e, E e2, E e3) {
        return construct(e, e2, e3);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m58540of(E e, E e2, E e3, E e4) {
        return construct(e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m58541of(E e, E e2, E e3, E e4, E e5) {
        return construct(e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m58542of(E e, E e2, E e3, E e4, E e5, E e6) {
        return construct(e, e2, e3, e4, e5, e6);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m58543of(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        return construct(e, e2, e3, e4, e5, e6, e7);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m58544of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8);
    }
}
