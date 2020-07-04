package com.google.common.collect;

import com.google.common.base.C17430i;
import com.google.common.base.C17439m;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

public class TreeRangeSet<C extends Comparable<?>> extends C18038k<C> implements Serializable {
    private transient Set<Range<C>> asDescendingSetOfRanges;
    private transient Set<Range<C>> asRanges;
    private transient C17901cm<C> complement;
    final NavigableMap<C17701ad<C>, Range<C>> rangesByLowerBound;

    /* renamed from: com.google.common.collect.TreeRangeSet$a */
    final class C17677a extends C17746as<Range<C>> implements Set<Range<C>> {

        /* renamed from: a */
        final Collection<Range<C>> f48879a;

        /* access modifiers changed from: protected */
        public final Collection<Range<C>> delegate() {
            return this.f48879a;
        }

        public final int hashCode() {
            return C17933db.m59564a((Set<?>) this);
        }

        public final boolean equals(Object obj) {
            return C17933db.m59571a((Set<?>) this, obj);
        }

        C17677a(Collection<Range<C>> collection) {
            this.f48879a = collection;
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$b */
    final class C17678b extends TreeRangeSet<C> {
        public final C17901cm<C> complement() {
            return TreeRangeSet.this;
        }

        public final void add(Range<C> range) {
            TreeRangeSet.this.remove(range);
        }

        public final void remove(Range<C> range) {
            TreeRangeSet.this.add(range);
        }

        C17678b() {
            super(new C17679c(TreeRangeSet.this.rangesByLowerBound));
        }

        public final boolean contains(C c) {
            if (!TreeRangeSet.this.contains(c)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$c */
    static final class C17679c<C extends Comparable<?>> extends C18035j<C17701ad<C>, Range<C>> {

        /* renamed from: a */
        public final Range<C17701ad<C>> f48882a;

        /* renamed from: b */
        private final NavigableMap<C17701ad<C>, Range<C>> f48883b;

        /* renamed from: c */
        private final NavigableMap<C17701ad<C>, Range<C>> f48884c;

        public final Comparator<? super C17701ad<C>> comparator() {
            return C17896ch.m59497b();
        }

        public final int size() {
            return C17782br.m59118b(mo45214b());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Iterator<Entry<C17701ad<C>, Range<C>>> mo45214b() {
            Collection collection;
            final C17701ad<C> adVar;
            boolean z;
            if (this.f48882a.hasLowerBound()) {
                NavigableMap<C17701ad<C>, Range<C>> navigableMap = this.f48884c;
                Comparable lowerEndpoint = this.f48882a.lowerEndpoint();
                if (this.f48882a.lowerBoundType() == BoundType.CLOSED) {
                    z = true;
                } else {
                    z = false;
                }
                collection = navigableMap.tailMap(lowerEndpoint, z).values();
            } else {
                collection = this.f48884c.values();
            }
            final C17897ci i = C17782br.m59134i(collection.iterator());
            if (this.f48882a.contains(C17701ad.m58897d()) && (!i.hasNext() || ((Range) i.mo45998a()).lowerBound != C17701ad.m58897d())) {
                adVar = C17701ad.m58897d();
            } else if (!i.hasNext()) {
                return C17782br.m59108a();
            } else {
                adVar = ((Range) i.next()).upperBound;
            }
            return new C17870c<Entry<C17701ad<C>, Range<C>>>() {

                /* renamed from: a */
                C17701ad<C> f48885a = adVar;

                /* access modifiers changed from: private */
                /* renamed from: c */
                public Entry<C17701ad<C>, Range<C>> mo45252a() {
                    Range range;
                    if (C17679c.this.f48882a.upperBound.mo45821a(this.f48885a) || this.f48885a == C17701ad.m58898e()) {
                        mo46191b();
                        return null;
                    }
                    if (i.hasNext()) {
                        Range range2 = (Range) i.next();
                        range = Range.create(this.f48885a, range2.lowerBound);
                        this.f48885a = range2.upperBound;
                    } else {
                        range = Range.create(this.f48885a, C17701ad.m58898e());
                        this.f48885a = C17701ad.m58898e();
                    }
                    return C17839bx.m59337a(range.lowerBound, range);
                }
            };
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Iterator<Entry<C17701ad<C>, Range<C>>> mo45765a() {
            C17701ad adVar;
            boolean z;
            C17701ad<C> adVar2;
            if (this.f48882a.hasUpperBound()) {
                adVar = (C17701ad) this.f48882a.upperEndpoint();
            } else {
                adVar = C17701ad.m58898e();
            }
            if (!this.f48882a.hasUpperBound() || this.f48882a.upperBoundType() != BoundType.CLOSED) {
                z = false;
            } else {
                z = true;
            }
            final C17897ci i = C17782br.m59134i(this.f48884c.headMap(adVar, z).descendingMap().values().iterator());
            if (i.hasNext()) {
                if (((Range) i.mo45998a()).upperBound == C17701ad.m58898e()) {
                    adVar2 = ((Range) i.next()).lowerBound;
                } else {
                    adVar2 = (C17701ad) this.f48883b.higherKey(((Range) i.mo45998a()).upperBound);
                }
            } else if (!this.f48882a.contains(C17701ad.m58897d()) || this.f48883b.containsKey(C17701ad.m58897d())) {
                return C17782br.m59108a();
            } else {
                adVar2 = (C17701ad) this.f48883b.higherKey(C17701ad.m58897d());
            }
            final C17701ad adVar3 = (C17701ad) C17430i.m57945a(adVar2, C17701ad.m58898e());
            return new C17870c<Entry<C17701ad<C>, Range<C>>>() {

                /* renamed from: a */
                C17701ad<C> f48889a = adVar3;

                /* access modifiers changed from: private */
                /* renamed from: c */
                public Entry<C17701ad<C>, Range<C>> mo45252a() {
                    if (this.f48889a == C17701ad.m58897d()) {
                        mo46191b();
                        return null;
                    }
                    if (i.hasNext()) {
                        Range range = (Range) i.next();
                        Range create = Range.create(range.upperBound, this.f48889a);
                        this.f48889a = range.lowerBound;
                        if (C17679c.this.f48882a.lowerBound.mo45821a(create.lowerBound)) {
                            return C17839bx.m59337a(create.lowerBound, create);
                        }
                    } else if (C17679c.this.f48882a.lowerBound.mo45821a(C17701ad.m58897d())) {
                        Range create2 = Range.create(C17701ad.m58897d(), this.f48889a);
                        this.f48889a = C17701ad.m58897d();
                        return C17839bx.m59337a(C17701ad.m58897d(), create2);
                    }
                    mo46191b();
                    return null;
                }
            };
        }

        C17679c(NavigableMap<C17701ad<C>, Range<C>> navigableMap) {
            this(navigableMap, Range.all());
        }

        public final boolean containsKey(Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private NavigableMap<C17701ad<C>, Range<C>> m58844a(Range<C17701ad<C>> range) {
            if (!this.f48882a.isConnected(range)) {
                return ImmutableSortedMap.m58683of();
            }
            return new C17679c(this.f48883b, range.intersection(this.f48882a));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Range<C> get(Object obj) {
            if (obj instanceof C17701ad) {
                try {
                    C17701ad adVar = (C17701ad) obj;
                    Entry firstEntry = tailMap(adVar, true).firstEntry();
                    if (firstEntry != null && ((C17701ad) firstEntry.getKey()).equals(adVar)) {
                        return (Range) firstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                    return null;
                }
            }
            return null;
        }

        private C17679c(NavigableMap<C17701ad<C>, Range<C>> navigableMap, Range<C17701ad<C>> range) {
            this.f48883b = navigableMap;
            this.f48884c = new C17682d(navigableMap);
            this.f48882a = range;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public NavigableMap<C17701ad<C>, Range<C>> headMap(C17701ad<C> adVar, boolean z) {
            return m58844a(Range.upTo(adVar, BoundType.forBoolean(z)));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public NavigableMap<C17701ad<C>, Range<C>> tailMap(C17701ad<C> adVar, boolean z) {
            return m58844a(Range.downTo(adVar, BoundType.forBoolean(z)));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public NavigableMap<C17701ad<C>, Range<C>> subMap(C17701ad<C> adVar, boolean z, C17701ad<C> adVar2, boolean z2) {
            return m58844a(Range.range(adVar, BoundType.forBoolean(z), adVar2, BoundType.forBoolean(z2)));
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$d */
    static final class C17682d<C extends Comparable<?>> extends C18035j<C17701ad<C>, Range<C>> {

        /* renamed from: a */
        public final Range<C17701ad<C>> f48893a;

        /* renamed from: b */
        private final NavigableMap<C17701ad<C>, Range<C>> f48894b;

        public final Comparator<? super C17701ad<C>> comparator() {
            return C17896ch.m59497b();
        }

        public final int size() {
            if (this.f48893a.equals(Range.all())) {
                return this.f48894b.size();
            }
            return C17782br.m59118b(mo45214b());
        }

        public final boolean isEmpty() {
            if (this.f48893a.equals(Range.all())) {
                return this.f48894b.isEmpty();
            }
            if (!mo45214b().hasNext()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Iterator<Entry<C17701ad<C>, Range<C>>> mo45214b() {
            final Iterator it;
            if (!this.f48893a.hasLowerBound()) {
                it = this.f48894b.values().iterator();
            } else {
                Entry lowerEntry = this.f48894b.lowerEntry(this.f48893a.lowerEndpoint());
                if (lowerEntry == null) {
                    it = this.f48894b.values().iterator();
                } else if (this.f48893a.lowerBound.mo45821a(((Range) lowerEntry.getValue()).upperBound)) {
                    it = this.f48894b.tailMap(lowerEntry.getKey(), true).values().iterator();
                } else {
                    it = this.f48894b.tailMap(this.f48893a.lowerEndpoint(), true).values().iterator();
                }
            }
            return new C17870c<Entry<C17701ad<C>, Range<C>>>() {
                /* access modifiers changed from: private */
                /* renamed from: c */
                public Entry<C17701ad<C>, Range<C>> mo45252a() {
                    if (!it.hasNext()) {
                        mo46191b();
                        return null;
                    }
                    Range range = (Range) it.next();
                    if (!C17682d.this.f48893a.upperBound.mo45821a(range.upperBound)) {
                        return C17839bx.m59337a(range.upperBound, range);
                    }
                    mo46191b();
                    return null;
                }
            };
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Iterator<Entry<C17701ad<C>, Range<C>>> mo45765a() {
            Collection collection;
            if (this.f48893a.hasUpperBound()) {
                collection = this.f48894b.headMap(this.f48893a.upperEndpoint(), false).descendingMap().values();
            } else {
                collection = this.f48894b.descendingMap().values();
            }
            final C17897ci i = C17782br.m59134i(collection.iterator());
            if (i.hasNext() && this.f48893a.upperBound.mo45821a(((Range) i.mo45998a()).upperBound)) {
                i.next();
            }
            return new C17870c<Entry<C17701ad<C>, Range<C>>>() {
                /* access modifiers changed from: private */
                /* renamed from: c */
                public Entry<C17701ad<C>, Range<C>> mo45252a() {
                    if (!i.hasNext()) {
                        mo46191b();
                        return null;
                    }
                    Range range = (Range) i.next();
                    if (C17682d.this.f48893a.lowerBound.mo45821a(range.upperBound)) {
                        return C17839bx.m59337a(range.upperBound, range);
                    }
                    mo46191b();
                    return null;
                }
            };
        }

        C17682d(NavigableMap<C17701ad<C>, Range<C>> navigableMap) {
            this.f48894b = navigableMap;
            this.f48893a = Range.all();
        }

        public final boolean containsKey(Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private NavigableMap<C17701ad<C>, Range<C>> m58855a(Range<C17701ad<C>> range) {
            if (range.isConnected(this.f48893a)) {
                return new C17682d(this.f48894b, range.intersection(this.f48893a));
            }
            return ImmutableSortedMap.m58683of();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Range<C> get(Object obj) {
            if (obj instanceof C17701ad) {
                try {
                    C17701ad adVar = (C17701ad) obj;
                    if (!this.f48893a.contains(adVar)) {
                        return null;
                    }
                    Entry lowerEntry = this.f48894b.lowerEntry(adVar);
                    if (lowerEntry != null && ((Range) lowerEntry.getValue()).upperBound.equals(adVar)) {
                        return (Range) lowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                    return null;
                }
            }
            return null;
        }

        private C17682d(NavigableMap<C17701ad<C>, Range<C>> navigableMap, Range<C17701ad<C>> range) {
            this.f48894b = navigableMap;
            this.f48893a = range;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public NavigableMap<C17701ad<C>, Range<C>> headMap(C17701ad<C> adVar, boolean z) {
            return m58855a(Range.upTo(adVar, BoundType.forBoolean(z)));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public NavigableMap<C17701ad<C>, Range<C>> tailMap(C17701ad<C> adVar, boolean z) {
            return m58855a(Range.downTo(adVar, BoundType.forBoolean(z)));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public NavigableMap<C17701ad<C>, Range<C>> subMap(C17701ad<C> adVar, boolean z, C17701ad<C> adVar2, boolean z2) {
            return m58855a(Range.range(adVar, BoundType.forBoolean(z), adVar2, BoundType.forBoolean(z2)));
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$e */
    final class C17685e extends TreeRangeSet<C> {

        /* renamed from: b */
        private final Range<C> f48900b;

        public final void clear() {
            TreeRangeSet.this.remove(this.f48900b);
        }

        public final void add(Range<C> range) {
            C17439m.m57977a(this.f48900b.encloses(range), "Cannot add range %s to subRangeSet(%s)", (Object) range, (Object) this.f48900b);
            TreeRangeSet.super.add(range);
        }

        public final boolean contains(C c) {
            if (!this.f48900b.contains(c) || !TreeRangeSet.this.contains(c)) {
                return false;
            }
            return true;
        }

        public final Range<C> rangeContaining(C c) {
            if (!this.f48900b.contains(c)) {
                return null;
            }
            Range rangeContaining = TreeRangeSet.this.rangeContaining(c);
            if (rangeContaining == null) {
                return null;
            }
            return rangeContaining.intersection(this.f48900b);
        }

        public final void remove(Range<C> range) {
            if (range.isConnected(this.f48900b)) {
                TreeRangeSet.this.remove(range.intersection(this.f48900b));
            }
        }

        public final boolean encloses(Range<C> range) {
            if (this.f48900b.isEmpty() || !this.f48900b.encloses(range)) {
                return false;
            }
            Range rangeEnclosing = TreeRangeSet.this.rangeEnclosing(range);
            if (rangeEnclosing == null || rangeEnclosing.intersection(this.f48900b).isEmpty()) {
                return false;
            }
            return true;
        }

        public final C17901cm<C> subRangeSet(Range<C> range) {
            if (range.encloses(this.f48900b)) {
                return this;
            }
            if (range.isConnected(this.f48900b)) {
                return new C17685e(this.f48900b.intersection(range));
            }
            return ImmutableRangeSet.m58634of();
        }

        C17685e(Range<C> range) {
            super(new C17686f(Range.all(), range, TreeRangeSet.this.rangesByLowerBound));
            this.f48900b = range;
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$f */
    static final class C17686f<C extends Comparable<?>> extends C18035j<C17701ad<C>, Range<C>> {

        /* renamed from: a */
        public final Range<C17701ad<C>> f48901a;

        /* renamed from: b */
        public final Range<C> f48902b;

        /* renamed from: c */
        private final NavigableMap<C17701ad<C>, Range<C>> f48903c;

        /* renamed from: d */
        private final NavigableMap<C17701ad<C>, Range<C>> f48904d;

        public final Comparator<? super C17701ad<C>> comparator() {
            return C17896ch.m59497b();
        }

        public final int size() {
            return C17782br.m59118b(mo45214b());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Iterator<Entry<C17701ad<C>, Range<C>>> mo45214b() {
            boolean z;
            Comparable comparable;
            NavigableMap<C17701ad<C>, Range<C>> navigableMap;
            if (this.f48902b.isEmpty()) {
                return C17782br.m59108a();
            }
            if (this.f48901a.upperBound.mo45821a(this.f48902b.lowerBound)) {
                return C17782br.m59108a();
            }
            if (this.f48901a.lowerBound.mo45821a(this.f48902b.lowerBound)) {
                navigableMap = this.f48904d;
                comparable = this.f48902b.lowerBound;
            } else {
                navigableMap = this.f48903c;
                comparable = this.f48901a.lowerBound.mo45827c();
                if (this.f48901a.lowerBoundType() == BoundType.CLOSED) {
                    z = true;
                    final Iterator it = navigableMap.tailMap(comparable, z).values().iterator();
                    final C17701ad adVar = (C17701ad) C17896ch.m59497b().mo46247a(this.f48901a.upperBound, C17701ad.m58895b(this.f48902b.upperBound));
                    return new C17870c<Entry<C17701ad<C>, Range<C>>>() {
                        /* access modifiers changed from: private */
                        /* renamed from: c */
                        public Entry<C17701ad<C>, Range<C>> mo45252a() {
                            if (!it.hasNext()) {
                                mo46191b();
                                return null;
                            }
                            Range range = (Range) it.next();
                            if (adVar.mo45821a(range.lowerBound)) {
                                mo46191b();
                                return null;
                            }
                            Range intersection = range.intersection(C17686f.this.f48902b);
                            return C17839bx.m59337a(intersection.lowerBound, intersection);
                        }
                    };
                }
            }
            z = false;
            final Iterator it2 = navigableMap.tailMap(comparable, z).values().iterator();
            final C17701ad adVar2 = (C17701ad) C17896ch.m59497b().mo46247a(this.f48901a.upperBound, C17701ad.m58895b(this.f48902b.upperBound));
            return new C17870c<Entry<C17701ad<C>, Range<C>>>() {
                /* access modifiers changed from: private */
                /* renamed from: c */
                public Entry<C17701ad<C>, Range<C>> mo45252a() {
                    if (!it2.hasNext()) {
                        mo46191b();
                        return null;
                    }
                    Range range = (Range) it2.next();
                    if (adVar2.mo45821a(range.lowerBound)) {
                        mo46191b();
                        return null;
                    }
                    Range intersection = range.intersection(C17686f.this.f48902b);
                    return C17839bx.m59337a(intersection.lowerBound, intersection);
                }
            };
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Iterator<Entry<C17701ad<C>, Range<C>>> mo45765a() {
            boolean z;
            if (this.f48902b.isEmpty()) {
                return C17782br.m59108a();
            }
            C17701ad adVar = (C17701ad) C17896ch.m59497b().mo46247a(this.f48901a.upperBound, C17701ad.m58895b(this.f48902b.upperBound));
            NavigableMap<C17701ad<C>, Range<C>> navigableMap = this.f48903c;
            Comparable c = adVar.mo45827c();
            if (adVar.mo45822b() == BoundType.CLOSED) {
                z = true;
            } else {
                z = false;
            }
            final Iterator it = navigableMap.headMap(c, z).descendingMap().values().iterator();
            return new C17870c<Entry<C17701ad<C>, Range<C>>>() {
                /* access modifiers changed from: private */
                /* renamed from: c */
                public Entry<C17701ad<C>, Range<C>> mo45252a() {
                    if (!it.hasNext()) {
                        mo46191b();
                        return null;
                    }
                    Range range = (Range) it.next();
                    if (C17686f.this.f48902b.lowerBound.compareTo(range.upperBound) >= 0) {
                        mo46191b();
                        return null;
                    }
                    Range intersection = range.intersection(C17686f.this.f48902b);
                    if (C17686f.this.f48901a.contains(intersection.lowerBound)) {
                        return C17839bx.m59337a(intersection.lowerBound, intersection);
                    }
                    mo46191b();
                    return null;
                }
            };
        }

        public final boolean containsKey(Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private NavigableMap<C17701ad<C>, Range<C>> m58866a(Range<C17701ad<C>> range) {
            if (!range.isConnected(this.f48901a)) {
                return ImmutableSortedMap.m58683of();
            }
            return new C17686f(this.f48901a.intersection(range), this.f48902b, this.f48903c);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Range<C> get(Object obj) {
            if (obj instanceof C17701ad) {
                try {
                    C17701ad adVar = (C17701ad) obj;
                    if (this.f48901a.contains(adVar) && adVar.compareTo(this.f48902b.lowerBound) >= 0) {
                        if (adVar.compareTo(this.f48902b.upperBound) < 0) {
                            if (adVar.equals(this.f48902b.lowerBound)) {
                                Range range = (Range) C17839bx.m59345b(this.f48903c.floorEntry(adVar));
                                if (range != null && range.upperBound.compareTo(this.f48902b.lowerBound) > 0) {
                                    return range.intersection(this.f48902b);
                                }
                            } else {
                                Range range2 = (Range) this.f48903c.get(adVar);
                                if (range2 != null) {
                                    return range2.intersection(this.f48902b);
                                }
                            }
                        }
                    }
                    return null;
                } catch (ClassCastException unused) {
                    return null;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public NavigableMap<C17701ad<C>, Range<C>> headMap(C17701ad<C> adVar, boolean z) {
            return m58866a(Range.upTo(adVar, BoundType.forBoolean(z)));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public NavigableMap<C17701ad<C>, Range<C>> tailMap(C17701ad<C> adVar, boolean z) {
            return m58866a(Range.downTo(adVar, BoundType.forBoolean(z)));
        }

        private C17686f(Range<C17701ad<C>> range, Range<C> range2, NavigableMap<C17701ad<C>, Range<C>> navigableMap) {
            this.f48901a = (Range) C17439m.m57962a(range);
            this.f48902b = (Range) C17439m.m57962a(range2);
            this.f48903c = (NavigableMap) C17439m.m57962a(navigableMap);
            this.f48904d = new C17682d(navigableMap);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public NavigableMap<C17701ad<C>, Range<C>> subMap(C17701ad<C> adVar, boolean z, C17701ad<C> adVar2, boolean z2) {
            return m58866a(Range.range(adVar, BoundType.forBoolean(z), adVar2, BoundType.forBoolean(z2)));
        }
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
        return new TreeRangeSet<>(new TreeMap());
    }

    public C17901cm<C> complement() {
        C17901cm<C> cmVar = this.complement;
        if (cmVar != null) {
            return cmVar;
        }
        C17678b bVar = new C17678b();
        this.complement = bVar;
        return bVar;
    }

    public Set<Range<C>> asDescendingSetOfRanges() {
        Set<Range<C>> set = this.asDescendingSetOfRanges;
        if (set != null) {
            return set;
        }
        C17677a aVar = new C17677a(this.rangesByLowerBound.descendingMap().values());
        this.asDescendingSetOfRanges = aVar;
        return aVar;
    }

    public Set<Range<C>> asRanges() {
        Set<Range<C>> set = this.asRanges;
        if (set != null) {
            return set;
        }
        C17677a aVar = new C17677a(this.rangesByLowerBound.values());
        this.asRanges = aVar;
        return aVar;
    }

    public Range<C> span() {
        Entry firstEntry = this.rangesByLowerBound.firstEntry();
        Entry lastEntry = this.rangesByLowerBound.lastEntry();
        if (firstEntry != null) {
            return Range.create(((Range) firstEntry.getValue()).lowerBound, ((Range) lastEntry.getValue()).upperBound);
        }
        throw new NoSuchElementException();
    }

    public /* bridge */ /* synthetic */ void addAll(C17901cm cmVar) {
        super.addAll(cmVar);
    }

    public /* bridge */ /* synthetic */ void removeAll(C17901cm cmVar) {
        super.removeAll(cmVar);
    }

    private TreeRangeSet(NavigableMap<C17701ad<C>, Range<C>> navigableMap) {
        this.rangesByLowerBound = navigableMap;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(C17901cm<C> cmVar) {
        TreeRangeSet<C> create = create();
        create.addAll((C17901cm) cmVar);
        return create;
    }

    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
        super.addAll(iterable);
    }

    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    public /* bridge */ /* synthetic */ boolean enclosesAll(C17901cm cmVar) {
        return super.enclosesAll(cmVar);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
        super.removeAll(iterable);
    }

    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> iterable) {
        TreeRangeSet<C> create = create();
        create.addAll((Iterable) iterable);
        return create;
    }

    private void replaceRangeWithSameLowerBound(Range<C> range) {
        if (range.isEmpty()) {
            this.rangesByLowerBound.remove(range.lowerBound);
        } else {
            this.rangesByLowerBound.put(range.lowerBound, range);
        }
    }

    public boolean encloses(Range<C> range) {
        C17439m.m57962a(range);
        Entry floorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        if (floorEntry == null || !((Range) floorEntry.getValue()).encloses(range)) {
            return false;
        }
        return true;
    }

    public C17901cm<C> subRangeSet(Range<C> range) {
        if (range.equals(Range.all())) {
            return this;
        }
        return new C17685e(range);
    }

    public Range<C> rangeContaining(C c) {
        C17439m.m57962a(c);
        Entry floorEntry = this.rangesByLowerBound.floorEntry(C17701ad.m58895b(c));
        if (floorEntry == null || !((Range) floorEntry.getValue()).contains(c)) {
            return null;
        }
        return (Range) floorEntry.getValue();
    }

    public Range<C> rangeEnclosing(Range<C> range) {
        C17439m.m57962a(range);
        Entry floorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        if (floorEntry == null || !((Range) floorEntry.getValue()).encloses(range)) {
            return null;
        }
        return (Range) floorEntry.getValue();
    }

    public void add(Range<C> range) {
        C17439m.m57962a(range);
        if (!range.isEmpty()) {
            C17701ad<C> adVar = range.lowerBound;
            C17701ad<C> adVar2 = range.upperBound;
            Entry lowerEntry = this.rangesByLowerBound.lowerEntry(adVar);
            if (lowerEntry != null) {
                Range range2 = (Range) lowerEntry.getValue();
                if (range2.upperBound.compareTo(adVar) >= 0) {
                    if (range2.upperBound.compareTo(adVar2) >= 0) {
                        adVar2 = range2.upperBound;
                    }
                    adVar = range2.lowerBound;
                }
            }
            Entry floorEntry = this.rangesByLowerBound.floorEntry(adVar2);
            if (floorEntry != null) {
                Range range3 = (Range) floorEntry.getValue();
                if (range3.upperBound.compareTo(adVar2) >= 0) {
                    adVar2 = range3.upperBound;
                }
            }
            this.rangesByLowerBound.subMap(adVar, adVar2).clear();
            replaceRangeWithSameLowerBound(Range.create(adVar, adVar2));
        }
    }

    public boolean intersects(Range<C> range) {
        C17439m.m57962a(range);
        Entry ceilingEntry = this.rangesByLowerBound.ceilingEntry(range.lowerBound);
        if (ceilingEntry != null && ((Range) ceilingEntry.getValue()).isConnected(range) && !((Range) ceilingEntry.getValue()).intersection(range).isEmpty()) {
            return true;
        }
        Entry lowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        if (lowerEntry == null || !((Range) lowerEntry.getValue()).isConnected(range) || ((Range) lowerEntry.getValue()).intersection(range).isEmpty()) {
            return false;
        }
        return true;
    }

    public void remove(Range<C> range) {
        C17439m.m57962a(range);
        if (!range.isEmpty()) {
            Entry lowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
            if (lowerEntry != null) {
                Range range2 = (Range) lowerEntry.getValue();
                if (range2.upperBound.compareTo(range.lowerBound) >= 0) {
                    if (range.hasUpperBound() && range2.upperBound.compareTo(range.upperBound) >= 0) {
                        replaceRangeWithSameLowerBound(Range.create(range.upperBound, range2.upperBound));
                    }
                    replaceRangeWithSameLowerBound(Range.create(range2.lowerBound, range.lowerBound));
                }
            }
            Entry floorEntry = this.rangesByLowerBound.floorEntry(range.upperBound);
            if (floorEntry != null) {
                Range range3 = (Range) floorEntry.getValue();
                if (range.hasUpperBound() && range3.upperBound.compareTo(range.upperBound) >= 0) {
                    replaceRangeWithSameLowerBound(Range.create(range.upperBound, range3.upperBound));
                }
            }
            this.rangesByLowerBound.subMap(range.lowerBound, range.upperBound).clear();
        }
    }
}
