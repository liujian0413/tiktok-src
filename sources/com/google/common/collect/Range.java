package com.google.common.collect;

import com.google.common.base.C17427g;
import com.google.common.base.C17439m;
import com.google.common.base.C17440n;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

public final class Range<C extends Comparable> extends C17899ck implements C17440n<C>, Serializable {
    private static final Range<Comparable> ALL = new Range<>(C17701ad.m58897d(), C17701ad.m58898e());
    private static final long serialVersionUID = 0;
    final C17701ad<C> lowerBound;
    final C17701ad<C> upperBound;

    /* renamed from: com.google.common.collect.Range$a */
    static class C17660a implements C17427g<Range, C17701ad> {

        /* renamed from: a */
        static final C17660a f48844a = new C17660a();

        C17660a() {
        }

        /* renamed from: a */
        private static C17701ad m58791a(Range range) {
            return range.lowerBound;
        }

        /* renamed from: b */
        public final /* synthetic */ Object mo44914b(Object obj) {
            return m58791a((Range) obj);
        }
    }

    /* renamed from: com.google.common.collect.Range$b */
    static class C17661b extends C17896ch<Range<?>> implements Serializable {

        /* renamed from: a */
        static final C17896ch<Range<?>> f48845a = new C17661b();
        private static final long serialVersionUID = 0;

        private C17661b() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m58793a((Range) obj, (Range) obj2);
        }

        /* renamed from: a */
        private static int m58793a(Range<?> range, Range<?> range2) {
            return C17698ac.m58887a().mo45814a(range.lowerBound, range2.lowerBound).mo45814a(range.upperBound, range2.upperBound).mo45815b();
        }
    }

    /* renamed from: com.google.common.collect.Range$c */
    static class C17662c implements C17427g<Range, C17701ad> {

        /* renamed from: a */
        static final C17662c f48846a = new C17662c();

        C17662c() {
        }

        /* renamed from: a */
        private static C17701ad m58794a(Range range) {
            return range.upperBound;
        }

        /* renamed from: b */
        public final /* synthetic */ Object mo44914b(Object obj) {
            return m58794a((Range) obj);
        }
    }

    public static <C extends Comparable<?>> Range<C> all() {
        return ALL;
    }

    static <C extends Comparable<?>> C17427g<Range<C>, C17701ad<C>> lowerBoundFn() {
        return C17660a.f48844a;
    }

    static <C extends Comparable<?>> C17896ch<Range<C>> rangeLexOrdering() {
        return C17661b.f48845a;
    }

    static <C extends Comparable<?>> C17427g<Range<C>, C17701ad<C>> upperBoundFn() {
        return C17662c.f48846a;
    }

    public final BoundType lowerBoundType() {
        return this.lowerBound.mo45817a();
    }

    public final C lowerEndpoint() {
        return this.lowerBound.mo45827c();
    }

    public final BoundType upperBoundType() {
        return this.upperBound.mo45822b();
    }

    public final C upperEndpoint() {
        return this.upperBound.mo45827c();
    }

    public final boolean hasLowerBound() {
        if (this.lowerBound != C17701ad.m58897d()) {
            return true;
        }
        return false;
    }

    public final boolean hasUpperBound() {
        if (this.upperBound != C17701ad.m58898e()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.lowerBound.hashCode() * 31) + this.upperBound.hashCode();
    }

    public final boolean isEmpty() {
        return this.lowerBound.equals(this.upperBound);
    }

    /* access modifiers changed from: 0000 */
    public final Object readResolve() {
        if (equals(ALL)) {
            return all();
        }
        return this;
    }

    public final String toString() {
        return toString(this.lowerBound, this.upperBound);
    }

    private static <T> SortedSet<T> cast(Iterable<T> iterable) {
        return (SortedSet) iterable;
    }

    public static <C extends Comparable<?>> Range<C> singleton(C c) {
        return closed(c, c);
    }

    public final boolean apply(C c) {
        return contains(c);
    }

    public static <C extends Comparable<?>> Range<C> atLeast(C c) {
        return create(C17701ad.m58895b(c), C17701ad.m58898e());
    }

    public static <C extends Comparable<?>> Range<C> atMost(C c) {
        return create(C17701ad.m58897d(), C17701ad.m58896c(c));
    }

    public static <C extends Comparable<?>> Range<C> greaterThan(C c) {
        return create(C17701ad.m58896c(c), C17701ad.m58898e());
    }

    public static <C extends Comparable<?>> Range<C> lessThan(C c) {
        return create(C17701ad.m58897d(), C17701ad.m58895b(c));
    }

    public final Range<C> canonical(C17719ai<C> aiVar) {
        C17439m.m57962a(aiVar);
        C17701ad<C> c = this.lowerBound.mo45826c(aiVar);
        C17701ad<C> c2 = this.upperBound.mo45826c(aiVar);
        if (c == this.lowerBound && c2 == this.upperBound) {
            return this;
        }
        return create(c, c2);
    }

    public final boolean contains(C c) {
        C17439m.m57962a(c);
        if (!this.lowerBound.mo45821a(c) || this.upperBound.mo45821a(c)) {
            return false;
        }
        return true;
    }

    public final boolean encloses(Range<C> range) {
        if (this.lowerBound.compareTo(range.lowerBound) > 0 || this.upperBound.compareTo(range.upperBound) < 0) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        if (!this.lowerBound.equals(range.lowerBound) || !this.upperBound.equals(range.upperBound)) {
            return false;
        }
        return true;
    }

    public final boolean isConnected(Range<C> range) {
        if (this.lowerBound.compareTo(range.upperBound) > 0 || range.lowerBound.compareTo(this.upperBound) > 0) {
            return false;
        }
        return true;
    }

    public final Range<C> intersection(Range<C> range) {
        C17701ad<C> adVar;
        C17701ad<C> adVar2;
        int a = this.lowerBound.compareTo(range.lowerBound);
        int a2 = this.upperBound.compareTo(range.upperBound);
        if (a >= 0 && a2 <= 0) {
            return this;
        }
        if (a <= 0 && a2 >= 0) {
            return range;
        }
        if (a >= 0) {
            adVar = this.lowerBound;
        } else {
            adVar = range.lowerBound;
        }
        if (a2 <= 0) {
            adVar2 = this.upperBound;
        } else {
            adVar2 = range.upperBound;
        }
        return create(adVar, adVar2);
    }

    public final Range<C> span(Range<C> range) {
        C17701ad<C> adVar;
        C17701ad<C> adVar2;
        int a = this.lowerBound.compareTo(range.lowerBound);
        int a2 = this.upperBound.compareTo(range.upperBound);
        if (a <= 0 && a2 >= 0) {
            return this;
        }
        if (a >= 0 && a2 <= 0) {
            return range;
        }
        if (a <= 0) {
            adVar = this.lowerBound;
        } else {
            adVar = range.lowerBound;
        }
        if (a2 >= 0) {
            adVar2 = this.upperBound;
        } else {
            adVar2 = range.upperBound;
        }
        return create(adVar, adVar2);
    }

    public static <C extends Comparable<?>> Range<C> encloseAll(Iterable<C> iterable) {
        C17439m.m57962a(iterable);
        if (iterable instanceof SortedSet) {
            SortedSet cast = cast(iterable);
            Comparator comparator = cast.comparator();
            if (C17896ch.m59497b().equals(comparator) || comparator == null) {
                return closed((Comparable) cast.first(), (Comparable) cast.last());
            }
        }
        Iterator it = iterable.iterator();
        Comparable comparable = (Comparable) C17439m.m57962a(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) C17439m.m57962a(it.next());
            comparable = (Comparable) C17896ch.m59497b().mo46247a(comparable, comparable3);
            comparable2 = (Comparable) C17896ch.m59497b().mo46250b(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    public final boolean containsAll(Iterable<? extends C> iterable) {
        if (C17777bq.m59105e(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet cast = cast(iterable);
            Comparator comparator = cast.comparator();
            if (C17896ch.m59497b().equals(comparator) || comparator == null) {
                if (!contains((Comparable) cast.first()) || !contains((Comparable) cast.last())) {
                    return false;
                }
                return true;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains((Comparable) it.next())) {
                return false;
            }
        }
        return true;
    }

    static int compareOrThrow(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    static <C extends Comparable<?>> Range<C> create(C17701ad<C> adVar, C17701ad<C> adVar2) {
        return new Range<>(adVar, adVar2);
    }

    public static <C extends Comparable<?>> Range<C> closed(C c, C c2) {
        return create(C17701ad.m58895b(c), C17701ad.m58896c(c2));
    }

    public static <C extends Comparable<?>> Range<C> closedOpen(C c, C c2) {
        return create(C17701ad.m58895b(c), C17701ad.m58895b(c2));
    }

    public static <C extends Comparable<?>> Range<C> open(C c, C c2) {
        return create(C17701ad.m58896c(c), C17701ad.m58895b(c2));
    }

    public static <C extends Comparable<?>> Range<C> openClosed(C c, C c2) {
        return create(C17701ad.m58896c(c), C17701ad.m58896c(c2));
    }

    private static String toString(C17701ad<?> adVar, C17701ad<?> adVar2) {
        StringBuilder sb = new StringBuilder(16);
        adVar.mo45820a(sb);
        sb.append("..");
        adVar2.mo45825b(sb);
        return sb.toString();
    }

    private Range(C17701ad<C> adVar, C17701ad<C> adVar2) {
        this.lowerBound = (C17701ad) C17439m.m57962a(adVar);
        this.upperBound = (C17701ad) C17439m.m57962a(adVar2);
        if (adVar.compareTo(adVar2) > 0 || adVar == C17701ad.m58898e() || adVar2 == C17701ad.m58897d()) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            sb.append(toString(adVar, adVar2));
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static <C extends Comparable<?>> Range<C> downTo(C c, BoundType boundType) {
        switch (boundType) {
            case OPEN:
                return greaterThan(c);
            case CLOSED:
                return atLeast(c);
            default:
                throw new AssertionError();
        }
    }

    public static <C extends Comparable<?>> Range<C> upTo(C c, BoundType boundType) {
        switch (boundType) {
            case OPEN:
                return lessThan(c);
            case CLOSED:
                return atMost(c);
            default:
                throw new AssertionError();
        }
    }

    public static <C extends Comparable<?>> Range<C> range(C c, BoundType boundType, C c2, BoundType boundType2) {
        C17701ad adVar;
        C17701ad adVar2;
        C17439m.m57962a(boundType);
        C17439m.m57962a(boundType2);
        if (boundType == BoundType.OPEN) {
            adVar = C17701ad.m58896c(c);
        } else {
            adVar = C17701ad.m58895b(c);
        }
        if (boundType2 == BoundType.OPEN) {
            adVar2 = C17701ad.m58895b(c2);
        } else {
            adVar2 = C17701ad.m58896c(c2);
        }
        return create(adVar, adVar2);
    }
}
