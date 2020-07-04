package com.google.common.collect;

import com.google.common.base.C17439m;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.common.collect.cn */
final class C17902cn<C extends Comparable> extends ContiguousSet<C> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Range<C> f49172a;

    /* renamed from: com.google.common.collect.cn$a */
    static final class C17906a<C extends Comparable> implements Serializable {

        /* renamed from: a */
        final Range<C> f49178a;

        /* renamed from: b */
        final C17719ai<C> f49179b;

        private Object readResolve() {
            return new C17902cn(this.f49178a, this.f49179b);
        }

        private C17906a(Range<C> range, C17719ai<C> aiVar) {
            this.f49178a = range;
            this.f49179b = aiVar;
        }
    }

    public final boolean isEmpty() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        return false;
    }

    public final int hashCode() {
        return C17933db.m59564a((Set<?>) this);
    }

    public final Range<C> range() {
        BoundType boundType = BoundType.CLOSED;
        return range(boundType, boundType);
    }

    /* renamed from: b */
    public final C last() {
        return this.f49172a.upperBound.mo45824b(this.domain);
    }

    public final C17995dt<C> descendingIterator() {
        return new C18039l<C>(last()) {

            /* renamed from: a */
            final C f49175a = C17902cn.this.first();

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C mo45079a(C c) {
                if (C17902cn.m59514a(c, this.f49175a)) {
                    return null;
                }
                return C17902cn.this.domain.mo45850b(c);
            }
        };
    }

    public final C17995dt<C> iterator() {
        return new C18039l<C>(first()) {

            /* renamed from: a */
            final C f49173a = C17902cn.this.last();

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C mo45079a(C c) {
                if (C17902cn.m59514a(c, this.f49173a)) {
                    return null;
                }
                return C17902cn.this.domain.mo45848a(c);
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new C17906a(this.f49172a, this.domain);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableList<C> createAsList() {
        if (this.domain.f48958a) {
            return new C17762bh<C>() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ ImmutableCollection mo45965a() {
                    return C17902cn.this;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C get(int i) {
                    C17439m.m57960a(i, size());
                    return C17902cn.this.domain.mo45849a(C17902cn.this.first(), (long) i);
                }
            };
        }
        return super.createAsList();
    }

    public final int size() {
        long a = this.domain.mo45847a(first(), last());
        if (a >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) a) + 1;
    }

    /* renamed from: a */
    public final C first() {
        return this.f49172a.lowerBound.mo45819a(this.domain);
    }

    public final boolean containsAll(Collection<?> collection) {
        return C18054w.m59711a((Collection<?>) this, collection);
    }

    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f49172a.contains((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private ContiguousSet<C> m59513a(Range<C> range) {
        if (this.f49172a.isConnected(range)) {
            return ContiguousSet.create(this.f49172a.intersection(range), this.domain);
        }
        return new C17723aj(this.domain);
    }

    /* access modifiers changed from: 0000 */
    public final int indexOf(Object obj) {
        if (contains(obj)) {
            return (int) this.domain.mo45847a(first(), (Comparable) obj);
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17902cn) {
            C17902cn cnVar = (C17902cn) obj;
            if (this.domain.equals(cnVar.domain)) {
                if (!first().equals(cnVar.first()) || !last().equals(cnVar.last())) {
                    return false;
                }
                return true;
            }
        }
        return super.equals(obj);
    }

    public final ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet) {
        C17439m.m57962a(contiguousSet);
        C17439m.m57968a(this.domain.equals(contiguousSet.domain));
        if (contiguousSet.isEmpty()) {
            return contiguousSet;
        }
        Comparable comparable = (Comparable) C17896ch.m59497b().mo46250b(first(), contiguousSet.first());
        Comparable comparable2 = (Comparable) C17896ch.m59497b().mo46247a(last(), contiguousSet.last());
        if (comparable.compareTo(comparable2) <= 0) {
            return ContiguousSet.create(Range.closed(comparable, comparable2), this.domain);
        }
        return new C17723aj(this.domain);
    }

    C17902cn(Range<C> range, C17719ai<C> aiVar) {
        super(aiVar);
        this.f49172a = range;
    }

    /* renamed from: a */
    public static boolean m59514a(Comparable<?> comparable, Comparable<?> comparable2) {
        if (comparable2 == null || Range.compareOrThrow(comparable, comparable2) != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final ContiguousSet<C> headSetImpl(C c, boolean z) {
        return m59513a(Range.upTo(c, BoundType.forBoolean(z)));
    }

    /* access modifiers changed from: 0000 */
    public final ContiguousSet<C> tailSetImpl(C c, boolean z) {
        return m59513a(Range.downTo(c, BoundType.forBoolean(z)));
    }

    public final Range<C> range(BoundType boundType, BoundType boundType2) {
        return Range.create(this.f49172a.lowerBound.mo45818a(boundType, this.domain), this.f49172a.upperBound.mo45823b(boundType2, this.domain));
    }

    /* access modifiers changed from: 0000 */
    public final ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
        if (c.compareTo(c2) != 0 || z || z2) {
            return m59513a(Range.range(c, BoundType.forBoolean(z), c2, BoundType.forBoolean(z2)));
        }
        return new C17723aj(this.domain);
    }
}
