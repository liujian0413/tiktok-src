package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.ImmutableList.C17584a;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public class ImmutableRangeMap<K extends Comparable<?>, V> implements C17900cl<K, V>, Serializable {
    private static final ImmutableRangeMap<Comparable<?>, Object> EMPTY = new ImmutableRangeMap<>(ImmutableList.m58536of(), ImmutableList.m58536of());
    private static final long serialVersionUID = 0;
    public final transient ImmutableList<Range<K>> ranges;
    private final transient ImmutableList<V> values;

    /* renamed from: com.google.common.collect.ImmutableRangeMap$a */
    public static final class C17612a<K extends Comparable<?>, V> {

        /* renamed from: a */
        private final List<Entry<Range<K>, V>> f48731a = C17795bu.m59142a();

        /* renamed from: a */
        public final ImmutableRangeMap<K, V> mo45513a() {
            Collections.sort(this.f48731a, Range.rangeLexOrdering().mo46251c());
            C17584a aVar = new C17584a(this.f48731a.size());
            C17584a aVar2 = new C17584a(this.f48731a.size());
            for (int i = 0; i < this.f48731a.size(); i++) {
                Range range = (Range) ((Entry) this.f48731a.get(i)).getKey();
                if (i > 0) {
                    Range range2 = (Range) ((Entry) this.f48731a.get(i - 1)).getKey();
                    if (range.isConnected(range2) && !range.intersection(range2).isEmpty()) {
                        StringBuilder sb = new StringBuilder("Overlapping ranges: range ");
                        sb.append(range2);
                        sb.append(" overlaps with entry ");
                        sb.append(range);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                aVar.mo45403b(range);
                aVar2.mo45403b(((Entry) this.f48731a.get(i)).getValue());
            }
            return new ImmutableRangeMap<>(aVar.mo45418a(), aVar2.mo45418a());
        }

        /* renamed from: a */
        public final C17612a<K, V> mo45512a(Range<K> range, V v) {
            C17439m.m57962a(range);
            C17439m.m57962a(v);
            C17439m.m57976a(!range.isEmpty(), "Range must not be empty, but was %s", (Object) range);
            this.f48731a.add(C17839bx.m59337a(range, v));
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeMap$b */
    static class C17613b<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final ImmutableMap<Range<K>, V> f48732a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            if (this.f48732a.isEmpty()) {
                return ImmutableRangeMap.m58628of();
            }
            return m58633a();
        }

        /* renamed from: a */
        private Object m58633a() {
            C17612a aVar = new C17612a();
            C17995dt it = this.f48732a.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                aVar.mo45512a((Range) entry.getKey(), entry.getValue());
            }
            return aVar.mo45513a();
        }

        C17613b(ImmutableMap<Range<K>, V> immutableMap) {
            this.f48732a = immutableMap;
        }
    }

    /* renamed from: of */
    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> m58628of() {
        return EMPTY;
    }

    public static <K extends Comparable<?>, V> C17612a<K, V> builder() {
        return new C17612a<>();
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    public String toString() {
        return asMapOfRanges().toString();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17613b(asMapOfRanges());
    }

    public ImmutableMap<Range<K>, V> asMapOfRanges() {
        if (this.ranges.isEmpty()) {
            return ImmutableMap.m58576of();
        }
        return new ImmutableSortedMap(new C17920cu(this.ranges, Range.rangeLexOrdering()), this.values);
    }

    public ImmutableMap<Range<K>, V> asDescendingMapOfRanges() {
        if (this.ranges.isEmpty()) {
            return ImmutableMap.m58576of();
        }
        return new ImmutableSortedMap(new C17920cu(this.ranges.reverse(), Range.rangeLexOrdering().mo46226a()), this.values.reverse());
    }

    public Range<K> span() {
        if (!this.ranges.isEmpty()) {
            return Range.create(((Range) this.ranges.get(0)).lowerBound, ((Range) this.ranges.get(this.ranges.size() - 1)).upperBound);
        }
        throw new NoSuchElementException();
    }

    public void putAll(C17900cl<K, V> clVar) {
        throw new UnsupportedOperationException();
    }

    public void remove(Range<K> range) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C17900cl)) {
            return false;
        }
        return asMapOfRanges().equals(((C17900cl) obj).asMapOfRanges());
    }

    public V get(K k) {
        int a = C17942dg.m59579a((List<E>) this.ranges, Range.lowerBoundFn(), C17701ad.m58895b(k), C17948b.ANY_PRESENT, C17944a.NEXT_LOWER);
        if (a != -1 && ((Range) this.ranges.get(a)).contains(k)) {
            return this.values.get(a);
        }
        return null;
    }

    public Entry<Range<K>, V> getEntry(K k) {
        int a = C17942dg.m59579a((List<E>) this.ranges, Range.lowerBoundFn(), C17701ad.m58895b(k), C17948b.ANY_PRESENT, C17944a.NEXT_LOWER);
        if (a == -1) {
            return null;
        }
        Range range = (Range) this.ranges.get(a);
        if (range.contains(k)) {
            return C17839bx.m59337a(range, this.values.get(a));
        }
        return null;
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> copyOf(C17900cl<K, ? extends V> clVar) {
        if (clVar instanceof ImmutableRangeMap) {
            return (ImmutableRangeMap) clVar;
        }
        Map asMapOfRanges = clVar.asMapOfRanges();
        C17584a aVar = new C17584a(asMapOfRanges.size());
        C17584a aVar2 = new C17584a(asMapOfRanges.size());
        for (Entry entry : asMapOfRanges.entrySet()) {
            aVar.mo45403b(entry.getKey());
            aVar2.mo45403b(entry.getValue());
        }
        return new ImmutableRangeMap<>(aVar.mo45418a(), aVar2.mo45418a());
    }

    public ImmutableRangeMap<K, V> subRangeMap(final Range<K> range) {
        if (((Range) C17439m.m57962a(range)).isEmpty()) {
            return m58628of();
        }
        if (this.ranges.isEmpty() || range.encloses(span())) {
            return this;
        }
        final int a = C17942dg.m59579a((List<E>) this.ranges, Range.upperBoundFn(), range.lowerBound, C17948b.FIRST_AFTER, C17944a.NEXT_HIGHER);
        int a2 = C17942dg.m59579a((List<E>) this.ranges, Range.lowerBoundFn(), range.upperBound, C17948b.ANY_PRESENT, C17944a.NEXT_HIGHER);
        if (a >= a2) {
            return m58628of();
        }
        final int i = a2 - a;
        final Range<K> range2 = range;
        C176112 r3 = new ImmutableRangeMap<K, V>(new ImmutableList<Range<K>>() {
            /* access modifiers changed from: 0000 */
            public final boolean isPartialView() {
                return true;
            }

            public final int size() {
                return i;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Range<K> get(int i) {
                C17439m.m57960a(i, i);
                if (i == 0 || i == i - 1) {
                    return ((Range) ImmutableRangeMap.this.ranges.get(i + a)).intersection(range);
                }
                return (Range) ImmutableRangeMap.this.ranges.get(i + a);
            }
        }, this.values.subList(a, a2)) {
            public final /* bridge */ /* synthetic */ Map asDescendingMapOfRanges() {
                return ImmutableRangeMap.super.asDescendingMapOfRanges();
            }

            public final /* bridge */ /* synthetic */ Map asMapOfRanges() {
                return ImmutableRangeMap.super.asMapOfRanges();
            }

            public final ImmutableRangeMap<K, V> subRangeMap(Range<K> range) {
                if (range2.isConnected(range)) {
                    return this.subRangeMap(range.intersection(range2));
                }
                return ImmutableRangeMap.m58628of();
            }
        };
        return r3;
    }

    ImmutableRangeMap(ImmutableList<Range<K>> immutableList, ImmutableList<V> immutableList2) {
        this.ranges = immutableList;
        this.values = immutableList2;
    }

    public void put(Range<K> range, V v) {
        throw new UnsupportedOperationException();
    }

    public void putCoalescing(Range<K> range, V v) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> m58629of(Range<K> range, V v) {
        return new ImmutableRangeMap<>(ImmutableList.m58537of(range), ImmutableList.m58537of(v));
    }
}
