package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.C17986do.C17987a;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: com.google.common.collect.cv */
abstract class C17921cv<R, C, V> extends ImmutableTable<R, C, V> {

    /* renamed from: com.google.common.collect.cv$a */
    final class C17923a extends C17623b<C17987a<R, C, V>> {
        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return false;
        }

        public final int size() {
            return C17921cv.this.size();
        }

        private C17923a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17987a<R, C, V> mo45491a(int i) {
            return C17921cv.this.mo45835a(i);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof C17987a)) {
                return false;
            }
            C17987a aVar = (C17987a) obj;
            Object obj2 = C17921cv.this.get(aVar.mo45207a(), aVar.mo45208b());
            if (obj2 == null || !obj2.equals(aVar.mo45209c())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.common.collect.cv$b */
    final class C17924b extends ImmutableList<V> {
        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return true;
        }

        public final int size() {
            return C17921cv.this.size();
        }

        private C17924b() {
        }

        public final V get(int i) {
            return C17921cv.this.mo45836b(i);
        }
    }

    C17921cv() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C17987a<R, C, V> mo45835a(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract V mo45836b(int i);

    /* access modifiers changed from: 0000 */
    public final ImmutableSet<C17987a<R, C, V>> createCellSet() {
        if (isEmpty()) {
            return ImmutableSet.m58649of();
        }
        return new C17923a();
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableCollection<V> createValues() {
        if (isEmpty()) {
            return ImmutableList.m58536of();
        }
        return new C17924b();
    }

    /* renamed from: a */
    static <R, C, V> C17921cv<R, C, V> m59536a(List<C17987a<R, C, V>> list, final Comparator<? super R> comparator, final Comparator<? super C> comparator2) {
        C17439m.m57962a(list);
        if (!(comparator == null && comparator2 == null)) {
            Collections.sort(list, new Comparator<C17987a<R, C, V>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public int compare(C17987a<R, C, V> aVar, C17987a<R, C, V> aVar2) {
                    int i;
                    if (comparator == null) {
                        i = 0;
                    } else {
                        i = comparator.compare(aVar.mo45207a(), aVar2.mo45207a());
                    }
                    if (i != 0) {
                        return i;
                    }
                    if (comparator2 == null) {
                        return 0;
                    }
                    return comparator2.compare(aVar.mo45208b(), aVar2.mo45208b());
                }
            });
        }
        return m59535a((Iterable<C17987a<R, C, V>>) list, comparator, comparator2);
    }

    /* renamed from: a */
    static <R, C, V> C17921cv<R, C, V> m59534a(ImmutableList<C17987a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        if (((long) immutableList.size()) > (((long) immutableSet.size()) * ((long) immutableSet2.size())) / 2) {
            return new C17707ae(immutableList, immutableSet, immutableSet2);
        }
        return new C17960dl(immutableList, immutableSet, immutableSet2);
    }

    /* renamed from: a */
    private static <R, C, V> C17921cv<R, C, V> m59535a(Iterable<C17987a<R, C, V>> iterable, Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        ImmutableSet immutableSet;
        ImmutableSet immutableSet2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ImmutableList copyOf = ImmutableList.copyOf(iterable);
        for (C17987a aVar : iterable) {
            linkedHashSet.add(aVar.mo45207a());
            linkedHashSet2.add(aVar.mo45208b());
        }
        if (comparator == null) {
            immutableSet = ImmutableSet.copyOf((Collection<? extends E>) linkedHashSet);
        } else {
            immutableSet = ImmutableSet.copyOf((Collection<? extends E>) ImmutableList.sortedCopyOf(comparator, linkedHashSet));
        }
        if (comparator2 == null) {
            immutableSet2 = ImmutableSet.copyOf((Collection<? extends E>) linkedHashSet2);
        } else {
            immutableSet2 = ImmutableSet.copyOf((Collection<? extends E>) ImmutableList.sortedCopyOf(comparator2, linkedHashSet2));
        }
        return m59534a(copyOf, immutableSet, immutableSet2);
    }
}
