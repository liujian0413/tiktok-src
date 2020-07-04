package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.C17882cb.C17883a;
import com.google.common.collect.ImmutableList.C17584a;
import com.google.common.collect.ImmutableMultiset.C17607a;
import com.google.common.math.C18119c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public abstract class ImmutableSortedMultiset<E> extends C17775bo<E> implements C17954dh<E> {
    transient ImmutableSortedMultiset<E> descendingMultiset;

    /* renamed from: com.google.common.collect.ImmutableSortedMultiset$a */
    public static class C17634a<E> extends C17607a<E> {

        /* renamed from: d */
        E[] f48767d = ((Object[]) new Object[4]);

        /* renamed from: e */
        private final Comparator<? super E> f48768e;

        /* renamed from: f */
        private int[] f48769f = new int[4];

        /* renamed from: g */
        private int f48770g;

        /* renamed from: h */
        private boolean f48771h;

        /* renamed from: c */
        private void m58714c() {
            if (this.f48770g == this.f48767d.length) {
                m58711a(true);
            } else if (this.f48771h) {
                this.f48767d = Arrays.copyOf(this.f48767d, this.f48767d.length);
            }
            this.f48771h = false;
        }

        /* renamed from: d */
        private void m58715d() {
            m58711a(false);
            int i = 0;
            for (int i2 = 0; i2 < this.f48770g; i2++) {
                if (this.f48769f[i2] > 0) {
                    E[] eArr = this.f48767d;
                    eArr[i] = eArr[i2];
                    int[] iArr = this.f48769f;
                    iArr[i] = iArr[i2];
                    i++;
                }
            }
            Arrays.fill(this.f48767d, i, this.f48770g, null);
            Arrays.fill(this.f48769f, i, this.f48770g, 0);
            this.f48770g = i;
        }

        /* renamed from: b */
        public final ImmutableSortedMultiset<E> mo45487a() {
            m58715d();
            if (this.f48770g == 0) {
                return ImmutableSortedMultiset.emptyMultiset(this.f48768e);
            }
            C17920cu cuVar = (C17920cu) ImmutableSortedSet.construct(this.f48768e, this.f48770g, this.f48767d);
            long[] jArr = new long[(this.f48770g + 1)];
            int i = 0;
            while (i < this.f48770g) {
                int i2 = i + 1;
                jArr[i2] = jArr[i] + ((long) this.f48769f[i]);
                i = i2;
            }
            this.f48771h = true;
            return new C17919ct(cuVar, jArr, 0, this.f48770g);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C17634a<E> mo45403b(E e) {
            return mo45486a(e, 1);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C17634a<E> mo45490b(E... eArr) {
            for (E c : eArr) {
                mo45403b(c);
            }
            return this;
        }

        public C17634a(Comparator<? super E> comparator) {
            super(true);
            this.f48768e = (Comparator) C17439m.m57962a(comparator);
        }

        /* renamed from: c */
        public final C17634a<E> mo45488b(Iterable<? extends E> iterable) {
            if (iterable instanceof C17882cb) {
                for (C17883a aVar : ((C17882cb) iterable).entrySet()) {
                    mo45486a(aVar.mo45308b(), aVar.mo45307a());
                }
            } else {
                for (Object c : iterable) {
                    mo45403b((E) c);
                }
            }
            return this;
        }

        /* renamed from: c */
        public final C17634a<E> mo45489b(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo45403b((E) it.next());
            }
            return this;
        }

        /* renamed from: a */
        private void m58711a(boolean z) {
            if (this.f48770g != 0) {
                E[] copyOf = Arrays.copyOf(this.f48767d, this.f48770g);
                Arrays.sort(copyOf, this.f48768e);
                int i = 1;
                for (int i2 = 1; i2 < copyOf.length; i2++) {
                    if (this.f48768e.compare(copyOf[i - 1], copyOf[i2]) < 0) {
                        copyOf[i] = copyOf[i2];
                        i++;
                    }
                }
                Arrays.fill(copyOf, i, this.f48770g, null);
                if (z && i * 4 > this.f48770g * 3) {
                    copyOf = Arrays.copyOf(copyOf, C18119c.m59890b(this.f48770g, (this.f48770g / 2) + 1));
                }
                int[] iArr = new int[copyOf.length];
                for (int i3 = 0; i3 < this.f48770g; i3++) {
                    int binarySearch = Arrays.binarySearch(copyOf, 0, i, this.f48767d[i3], this.f48768e);
                    if (this.f48769f[i3] >= 0) {
                        iArr[binarySearch] = iArr[binarySearch] + this.f48769f[i3];
                    } else {
                        iArr[binarySearch] = this.f48769f[i3] ^ -1;
                    }
                }
                this.f48767d = copyOf;
                this.f48769f = iArr;
                this.f48770g = i;
            }
        }

        /* renamed from: b */
        public final C17634a<E> mo45486a(E e, int i) {
            C17439m.m57962a(e);
            C18053v.m59700a(i, "occurrences");
            if (i == 0) {
                return this;
            }
            m58714c();
            this.f48767d[this.f48770g] = e;
            this.f48769f[this.f48770g] = i;
            this.f48770g++;
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSortedMultiset$b */
    static final class C17635b<E> implements Serializable {

        /* renamed from: a */
        final Comparator<? super E> f48772a;

        /* renamed from: b */
        final E[] f48773b;

        /* renamed from: c */
        final int[] f48774c;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            int length = this.f48773b.length;
            C17634a aVar = new C17634a(this.f48772a);
            for (int i = 0; i < length; i++) {
                aVar.mo45486a(this.f48773b[i], this.f48774c[i]);
            }
            return aVar.mo45487a();
        }

        C17635b(C17954dh<E> dhVar) {
            this.f48772a = dhVar.comparator();
            int size = dhVar.entrySet().size();
            this.f48773b = (Object[]) new Object[size];
            this.f48774c = new int[size];
            int i = 0;
            for (C17883a aVar : dhVar.entrySet()) {
                this.f48773b[i] = aVar.mo45308b();
                this.f48774c[i] = aVar.mo45307a();
                i++;
            }
        }
    }

    ImmutableSortedMultiset() {
    }

    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m58704of() {
        return C17919ct.f49216a;
    }

    public abstract ImmutableSortedSet<E> elementSet();

    public abstract ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType);

    public abstract ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType);

    public final C17883a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    public final C17883a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17635b(this);
    }

    public static <E extends Comparable<?>> C17634a<E> naturalOrder() {
        return new C17634a<>(C17896ch.m59497b());
    }

    public static <E extends Comparable<?>> C17634a<E> reverseOrder() {
        return new C17634a<>(C17896ch.m59497b().mo46226a());
    }

    public final Comparator<? super E> comparator() {
        return elementSet().comparator();
    }

    public ImmutableSortedMultiset<E> descendingMultiset() {
        ImmutableSortedMultiset<E> immutableSortedMultiset;
        ImmutableSortedMultiset<E> immutableSortedMultiset2 = this.descendingMultiset;
        if (immutableSortedMultiset2 != null) {
            return immutableSortedMultiset2;
        }
        if (isEmpty()) {
            immutableSortedMultiset = emptyMultiset(C17896ch.m59496a(comparator()).mo46226a());
        } else {
            immutableSortedMultiset = new C17715af<>(this);
        }
        this.descendingMultiset = immutableSortedMultiset;
        return immutableSortedMultiset;
    }

    public static <E> C17634a<E> orderedBy(Comparator<E> comparator) {
        return new C17634a<>(comparator);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf((Comparator<? super E>) C17896ch.m59497b(), iterable);
    }

    public static <E> ImmutableSortedMultiset<E> copyOfSorted(C17954dh<E> dhVar) {
        return copyOfSortedEntries(dhVar.comparator(), C17795bu.m59144a((Iterable<? extends E>) dhVar.entrySet()));
    }

    static <E> ImmutableSortedMultiset<E> emptyMultiset(Comparator<? super E> comparator) {
        if (C17896ch.m59497b().equals(comparator)) {
            return C17919ct.f49216a;
        }
        return new C17919ct(comparator);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m58705of(E e) {
        return new C17919ct((C17920cu) ImmutableSortedSet.m58731of(e), new long[]{0, 1}, 0, 1);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterator<? extends E> it) {
        return copyOf((Comparator<? super E>) C17896ch.m59497b(), it);
    }

    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> copyOf(E[] eArr) {
        return copyOf((Comparator<? super E>) C17896ch.m59497b(), (Iterable<? extends E>) Arrays.asList(eArr));
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        C17439m.m57962a(comparator);
        return new C17634a(comparator).mo45489b(it).mo45487a();
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableSortedMultiset) {
            ImmutableSortedMultiset<E> immutableSortedMultiset = (ImmutableSortedMultiset) iterable;
            if (comparator.equals(immutableSortedMultiset.comparator())) {
                if (immutableSortedMultiset.isPartialView()) {
                    return copyOfSortedEntries(comparator, immutableSortedMultiset.entrySet().asList());
                }
                return immutableSortedMultiset;
            }
        }
        return new C17634a(comparator).mo45488b(iterable).mo45487a();
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m58706of(E e, E e2) {
        return copyOf((Comparator<? super E>) C17896ch.m59497b(), (Iterable<? extends E>) Arrays.asList(new Comparable[]{e, e2}));
    }

    private static <E> ImmutableSortedMultiset<E> copyOfSortedEntries(Comparator<? super E> comparator, Collection<C17883a<E>> collection) {
        if (collection.isEmpty()) {
            return emptyMultiset(comparator);
        }
        C17584a aVar = new C17584a(collection.size());
        long[] jArr = new long[(collection.size() + 1)];
        int i = 0;
        for (C17883a aVar2 : collection) {
            aVar.mo45403b(aVar2.mo45308b());
            int i2 = i + 1;
            jArr[i2] = jArr[i] + ((long) aVar2.mo45307a());
            i = i2;
        }
        return new C17919ct(new C17920cu(aVar.mo45418a(), comparator), jArr, 0, collection.size());
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m58707of(E e, E e2, E e3) {
        return copyOf((Comparator<? super E>) C17896ch.m59497b(), (Iterable<? extends E>) Arrays.asList(new Comparable[]{e, e2, e3}));
    }

    public ImmutableSortedMultiset<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        boolean z;
        if (comparator().compare(e, e2) <= 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57977a(z, "Expected lowerBound <= upperBound but %s > %s", (Object) e, (Object) e2);
        return tailMultiset(e, boundType).headMultiset(e2, boundType2);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m58708of(E e, E e2, E e3, E e4) {
        return copyOf((Comparator<? super E>) C17896ch.m59497b(), (Iterable<? extends E>) Arrays.asList(new Comparable[]{e, e2, e3, e4}));
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m58709of(E e, E e2, E e3, E e4, E e5) {
        return copyOf((Comparator<? super E>) C17896ch.m59497b(), (Iterable<? extends E>) Arrays.asList(new Comparable[]{e, e2, e3, e4, e5}));
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m58710of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        ArrayList a = C17795bu.m59143a(eArr.length + 6);
        Collections.addAll(a, new Comparable[]{e, e2, e3, e4, e5, e6});
        Collections.addAll(a, eArr);
        return copyOf((Comparator<? super E>) C17896ch.m59497b(), (Iterable<? extends E>) a);
    }
}
