package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.ImmutableList.C17584a;
import com.google.common.primitives.C18143c;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class ImmutableRangeSet<C extends Comparable> extends C18038k<C> implements Serializable {
    private static final ImmutableRangeSet<Comparable<?>> ALL = new ImmutableRangeSet<>(ImmutableList.m58537of(Range.all()));
    private static final ImmutableRangeSet<Comparable<?>> EMPTY = new ImmutableRangeSet<>(ImmutableList.m58536of());
    private transient ImmutableRangeSet<C> complement;
    public final transient ImmutableList<Range<C>> ranges;

    /* renamed from: com.google.common.collect.ImmutableRangeSet$a */
    final class C17615a extends ImmutableSortedSet<C> {

        /* renamed from: a */
        public final C17719ai<C> f48737a;

        /* renamed from: c */
        private transient Integer f48739c;

        /* access modifiers changed from: 0000 */
        public final ImmutableSortedSet<C> createDescendingSet() {
            return new C17716ag(this);
        }

        public final C17995dt<C> descendingIterator() {
            return new C17870c<C>() {

                /* renamed from: a */
                final Iterator<Range<C>> f48743a = ImmutableRangeSet.this.ranges.reverse().iterator();

                /* renamed from: b */
                Iterator<C> f48744b = C17782br.m59108a();

                /* access modifiers changed from: private */
                /* renamed from: c */
                public C mo45252a() {
                    while (!this.f48744b.hasNext()) {
                        if (this.f48743a.hasNext()) {
                            this.f48744b = ContiguousSet.create((Range) this.f48743a.next(), C17615a.this.f48737a).descendingIterator();
                        } else {
                            mo46191b();
                            return null;
                        }
                    }
                    return (Comparable) this.f48744b.next();
                }
            };
        }

        public final C17995dt<C> iterator() {
            return new C17870c<C>() {

                /* renamed from: a */
                final Iterator<Range<C>> f48740a = ImmutableRangeSet.this.ranges.iterator();

                /* renamed from: b */
                Iterator<C> f48741b = C17782br.m59108a();

                /* access modifiers changed from: private */
                /* renamed from: c */
                public C mo45252a() {
                    while (!this.f48741b.hasNext()) {
                        if (this.f48740a.hasNext()) {
                            this.f48741b = ContiguousSet.create((Range) this.f48740a.next(), C17615a.this.f48737a).iterator();
                        } else {
                            mo46191b();
                            return null;
                        }
                    }
                    return (Comparable) this.f48741b.next();
                }
            };
        }

        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return ImmutableRangeSet.this.ranges.isPartialView();
        }

        public final String toString() {
            return ImmutableRangeSet.this.ranges.toString();
        }

        /* access modifiers changed from: 0000 */
        public final Object writeReplace() {
            return new C17618b(ImmutableRangeSet.this.ranges, this.f48737a);
        }

        public final int size() {
            Integer num = this.f48739c;
            if (num == null) {
                long j = 0;
                C17995dt it = ImmutableRangeSet.this.ranges.iterator();
                while (it.hasNext()) {
                    j += (long) ContiguousSet.create((Range) it.next(), this.f48737a).size();
                    if (j >= 2147483647L) {
                        break;
                    }
                }
                num = Integer.valueOf(C18143c.m59970b(j));
                this.f48739c = num;
            }
            return num.intValue();
        }

        /* renamed from: a */
        private ImmutableSortedSet<C> m58637a(Range<C> range) {
            return ImmutableRangeSet.this.subRangeSet(range).asSet(this.f48737a);
        }

        public final boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return ImmutableRangeSet.this.contains((Comparable) obj);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        /* access modifiers changed from: 0000 */
        public final int indexOf(Object obj) {
            if (!contains(obj)) {
                return -1;
            }
            Comparable comparable = (Comparable) obj;
            long j = 0;
            C17995dt it = ImmutableRangeSet.this.ranges.iterator();
            while (it.hasNext()) {
                Range range = (Range) it.next();
                if (range.contains(comparable)) {
                    return C18143c.m59970b(j + ((long) ContiguousSet.create(range, this.f48737a).indexOf(comparable)));
                }
                j += (long) ContiguousSet.create(range, this.f48737a).size();
            }
            throw new AssertionError("impossible");
        }

        C17615a(C17719ai<C> aiVar) {
            super(C17896ch.m59497b());
            this.f48737a = aiVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public ImmutableSortedSet<C> tailSetImpl(C c, boolean z) {
            return m58637a(Range.downTo(c, BoundType.forBoolean(z)));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImmutableSortedSet<C> headSetImpl(C c, boolean z) {
            return m58637a(Range.upTo(c, BoundType.forBoolean(z)));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImmutableSortedSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
            if (z || z2 || Range.compareOrThrow(c, c2) != 0) {
                return m58637a(Range.range(c, BoundType.forBoolean(z), c2, BoundType.forBoolean(z2)));
            }
            return ImmutableSortedSet.m58730of();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeSet$b */
    static class C17618b<C extends Comparable> implements Serializable {

        /* renamed from: a */
        private final ImmutableList<Range<C>> f48746a;

        /* renamed from: b */
        private final C17719ai<C> f48747b;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return new ImmutableRangeSet(this.f48746a).asSet(this.f48747b);
        }

        C17618b(ImmutableList<Range<C>> immutableList, C17719ai<C> aiVar) {
            this.f48746a = immutableList;
            this.f48747b = aiVar;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeSet$c */
    public static class C17619c<C extends Comparable<?>> {

        /* renamed from: a */
        private final List<Range<C>> f48748a = C17795bu.m59142a();

        /* renamed from: a */
        public final ImmutableRangeSet<C> mo45549a() {
            C17584a aVar = new C17584a(this.f48748a.size());
            Collections.sort(this.f48748a, Range.rangeLexOrdering());
            C17897ci i = C17782br.m59134i(this.f48748a.iterator());
            while (i.hasNext()) {
                Range range = (Range) i.next();
                while (i.hasNext()) {
                    Range range2 = (Range) i.mo45998a();
                    if (!range.isConnected(range2)) {
                        break;
                    }
                    C17439m.m57977a(range.intersection(range2).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", (Object) range, (Object) range2);
                    range = range.span((Range) i.next());
                }
                aVar.mo45403b(range);
            }
            ImmutableList a = aVar.mo45418a();
            if (a.isEmpty()) {
                return ImmutableRangeSet.m58634of();
            }
            if (a.size() != 1 || !((Range) C17777bq.m59099b(a)).equals(Range.all())) {
                return new ImmutableRangeSet<>(a);
            }
            return ImmutableRangeSet.all();
        }

        /* renamed from: a */
        private C17619c<C> m58645a(Range<C> range) {
            C17439m.m57976a(!range.isEmpty(), "range must not be empty, but was %s", (Object) range);
            this.f48748a.add(range);
            return this;
        }

        /* renamed from: a */
        public final C17619c<C> mo45548a(Iterable<Range<C>> iterable) {
            for (Range a : iterable) {
                m58645a(a);
            }
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeSet$d */
    final class C17620d extends ImmutableList<Range<C>> {

        /* renamed from: b */
        private final boolean f48750b;

        /* renamed from: c */
        private final boolean f48751c;

        /* renamed from: d */
        private final int f48752d;

        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return true;
        }

        public final int size() {
            return this.f48752d;
        }

        C17620d() {
            this.f48750b = ((Range) ImmutableRangeSet.this.ranges.get(0)).hasLowerBound();
            this.f48751c = ((Range) C17777bq.m59102d(ImmutableRangeSet.this.ranges)).hasUpperBound();
            int size = ImmutableRangeSet.this.ranges.size() - 1;
            if (this.f48750b) {
                size++;
            }
            if (this.f48751c) {
                size++;
            }
            this.f48752d = size;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Range<C> get(int i) {
            C17701ad<C> adVar;
            C17701ad<C> adVar2;
            C17439m.m57960a(i, this.f48752d);
            if (!this.f48750b) {
                adVar = ((Range) ImmutableRangeSet.this.ranges.get(i)).upperBound;
            } else if (i == 0) {
                adVar = C17701ad.m58897d();
            } else {
                adVar = ((Range) ImmutableRangeSet.this.ranges.get(i - 1)).upperBound;
            }
            if (!this.f48751c || i != this.f48752d - 1) {
                adVar2 = ((Range) ImmutableRangeSet.this.ranges.get(i + (this.f48750b ^ true ? 1 : 0))).lowerBound;
            } else {
                adVar2 = C17701ad.m58898e();
            }
            return Range.create(adVar, adVar2);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeSet$e */
    static final class C17621e<C extends Comparable> implements Serializable {

        /* renamed from: a */
        private final ImmutableList<Range<C>> f48753a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            if (this.f48753a.isEmpty()) {
                return ImmutableRangeSet.m58634of();
            }
            if (this.f48753a.equals(ImmutableList.m58537of(Range.all()))) {
                return ImmutableRangeSet.all();
            }
            return new ImmutableRangeSet(this.f48753a);
        }

        C17621e(ImmutableList<Range<C>> immutableList) {
            this.f48753a = immutableList;
        }
    }

    static <C extends Comparable> ImmutableRangeSet<C> all() {
        return ALL;
    }

    /* renamed from: of */
    public static <C extends Comparable> ImmutableRangeSet<C> m58634of() {
        return EMPTY;
    }

    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public static <C extends Comparable<?>> C17619c<C> builder() {
        return new C17619c<>();
    }

    public final boolean isEmpty() {
        return this.ranges.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        return this.ranges.isPartialView();
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new C17621e(this.ranges);
    }

    public final ImmutableSet<Range<C>> asRanges() {
        if (this.ranges.isEmpty()) {
            return ImmutableSet.m58649of();
        }
        return new C17920cu(this.ranges, Range.rangeLexOrdering());
    }

    public final ImmutableSet<Range<C>> asDescendingSetOfRanges() {
        if (this.ranges.isEmpty()) {
            return ImmutableSet.m58649of();
        }
        return new C17920cu(this.ranges.reverse(), Range.rangeLexOrdering().mo46226a());
    }

    public final Range<C> span() {
        if (!this.ranges.isEmpty()) {
            return Range.create(((Range) this.ranges.get(0)).lowerBound, ((Range) this.ranges.get(this.ranges.size() - 1)).upperBound);
        }
        throw new NoSuchElementException();
    }

    public final ImmutableRangeSet<C> complement() {
        ImmutableRangeSet<C> immutableRangeSet = this.complement;
        if (immutableRangeSet != null) {
            return immutableRangeSet;
        }
        if (this.ranges.isEmpty()) {
            ImmutableRangeSet<C> all = all();
            this.complement = all;
            return all;
        } else if (this.ranges.size() != 1 || !((Range) this.ranges.get(0)).equals(Range.all())) {
            ImmutableRangeSet<C> immutableRangeSet2 = new ImmutableRangeSet<>(new C17620d(), this);
            this.complement = immutableRangeSet2;
            return immutableRangeSet2;
        } else {
            ImmutableRangeSet<C> of = m58634of();
            this.complement = of;
            return of;
        }
    }

    ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
        this.ranges = immutableList;
    }

    public final void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    public final void addAll(C17901cm<C> cmVar) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    public final /* bridge */ /* synthetic */ boolean enclosesAll(C17901cm cmVar) {
        return super.enclosesAll(cmVar);
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    public final void removeAll(C17901cm<C> cmVar) {
        throw new UnsupportedOperationException();
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> copyOf(Iterable<Range<C>> iterable) {
        return new C17619c().mo45548a(iterable).mo45549a();
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> unionOf(Iterable<Range<C>> iterable) {
        return copyOf((C17901cm<C>) TreeRangeSet.create(iterable));
    }

    public final void addAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    public final ImmutableRangeSet<C> difference(C17901cm<C> cmVar) {
        TreeRangeSet create = TreeRangeSet.create((C17901cm<C>) this);
        create.removeAll(cmVar);
        return copyOf((C17901cm<C>) create);
    }

    public final /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    public final ImmutableRangeSet<C> intersection(C17901cm<C> cmVar) {
        TreeRangeSet create = TreeRangeSet.create((C17901cm<C>) this);
        create.removeAll(cmVar.complement());
        return copyOf((C17901cm<C>) create);
    }

    public final void removeAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    public final ImmutableRangeSet<C> union(C17901cm<C> cmVar) {
        return unionOf(C17777bq.m59089a((Iterable<? extends T>) asRanges(), (Iterable<? extends T>) cmVar.asRanges()));
    }

    public static <C extends Comparable> ImmutableRangeSet<C> copyOf(C17901cm<C> cmVar) {
        C17439m.m57962a(cmVar);
        if (cmVar.isEmpty()) {
            return m58634of();
        }
        if (cmVar.encloses(Range.all())) {
            return all();
        }
        if (cmVar instanceof ImmutableRangeSet) {
            ImmutableRangeSet<C> immutableRangeSet = (ImmutableRangeSet) cmVar;
            if (!immutableRangeSet.isPartialView()) {
                return immutableRangeSet;
            }
        }
        return new ImmutableRangeSet<>(ImmutableList.copyOf((Collection<? extends E>) cmVar.asRanges()));
    }

    /* renamed from: of */
    public static <C extends Comparable> ImmutableRangeSet<C> m58635of(Range<C> range) {
        C17439m.m57962a(range);
        if (range.isEmpty()) {
            return m58634of();
        }
        if (range.equals(Range.all())) {
            return all();
        }
        return new ImmutableRangeSet<>(ImmutableList.m58537of(range));
    }

    public final ImmutableSortedSet<C> asSet(C17719ai<C> aiVar) {
        C17439m.m57962a(aiVar);
        if (isEmpty()) {
            return ImmutableSortedSet.m58730of();
        }
        Range canonical = span().canonical(aiVar);
        if (canonical.hasLowerBound()) {
            if (!canonical.hasUpperBound()) {
                try {
                    aiVar.mo45852d();
                } catch (NoSuchElementException unused) {
                    throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
                }
            }
            return new C17615a(aiVar);
        }
        throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
    }

    public final boolean encloses(Range<C> range) {
        int a = C17942dg.m59580a(this.ranges, Range.lowerBoundFn(), range.lowerBound, C17896ch.m59497b(), C17948b.ANY_PRESENT, C17944a.NEXT_LOWER);
        if (a == -1 || !((Range) this.ranges.get(a)).encloses(range)) {
            return false;
        }
        return true;
    }

    public final Range<C> rangeContaining(C c) {
        int a = C17942dg.m59580a(this.ranges, Range.lowerBoundFn(), C17701ad.m58895b(c), C17896ch.m59497b(), C17948b.ANY_PRESENT, C17944a.NEXT_LOWER);
        if (a == -1) {
            return null;
        }
        Range<C> range = (Range) this.ranges.get(a);
        if (range.contains(c)) {
            return range;
        }
        return null;
    }

    public final ImmutableRangeSet<C> subRangeSet(Range<C> range) {
        if (!isEmpty()) {
            Range span = span();
            if (range.encloses(span)) {
                return this;
            }
            if (range.isConnected(span)) {
                return new ImmutableRangeSet<>(intersectRanges(range));
            }
        }
        return m58634of();
    }

    private ImmutableList<Range<C>> intersectRanges(final Range<C> range) {
        final int i;
        int i2;
        if (this.ranges.isEmpty() || range.isEmpty()) {
            return ImmutableList.m58536of();
        }
        if (range.encloses(span())) {
            return this.ranges;
        }
        if (range.hasLowerBound()) {
            i = C17942dg.m59579a((List<E>) this.ranges, Range.upperBoundFn(), range.lowerBound, C17948b.FIRST_AFTER, C17944a.NEXT_HIGHER);
        } else {
            i = 0;
        }
        if (range.hasUpperBound()) {
            i2 = C17942dg.m59579a((List<E>) this.ranges, Range.lowerBoundFn(), range.upperBound, C17948b.FIRST_PRESENT, C17944a.NEXT_HIGHER);
        } else {
            i2 = this.ranges.size();
        }
        final int i3 = i2 - i;
        if (i3 == 0) {
            return ImmutableList.m58536of();
        }
        return new ImmutableList<Range<C>>() {
            /* access modifiers changed from: 0000 */
            public final boolean isPartialView() {
                return true;
            }

            public final int size() {
                return i3;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Range<C> get(int i) {
                C17439m.m57960a(i, i3);
                if (i == 0 || i == i3 - 1) {
                    return ((Range) ImmutableRangeSet.this.ranges.get(i + i)).intersection(range);
                }
                return (Range) ImmutableRangeSet.this.ranges.get(i + i);
            }
        };
    }

    public final boolean intersects(Range<C> range) {
        int a = C17942dg.m59580a(this.ranges, Range.lowerBoundFn(), range.lowerBound, C17896ch.m59497b(), C17948b.ANY_PRESENT, C17944a.NEXT_HIGHER);
        if (a < this.ranges.size() && ((Range) this.ranges.get(a)).isConnected(range) && !((Range) this.ranges.get(a)).intersection(range).isEmpty()) {
            return true;
        }
        if (a > 0) {
            int i = a - 1;
            if (((Range) this.ranges.get(i)).isConnected(range) && !((Range) this.ranges.get(i)).intersection(range).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private ImmutableRangeSet(ImmutableList<Range<C>> immutableList, ImmutableRangeSet<C> immutableRangeSet) {
        this.ranges = immutableList;
        this.complement = immutableRangeSet;
    }
}
