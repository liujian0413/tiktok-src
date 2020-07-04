package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.C17882cb.C17883a;
import com.google.common.primitives.C18143c;
import java.util.Comparator;

/* renamed from: com.google.common.collect.ct */
final class C17919ct<E> extends ImmutableSortedMultiset<E> {

    /* renamed from: a */
    static final ImmutableSortedMultiset<Comparable> f49216a = new C17919ct(C17896ch.m59497b());

    /* renamed from: c */
    private static final long[] f49217c = {0};

    /* renamed from: b */
    final transient C17920cu<E> f49218b;

    /* renamed from: d */
    private final transient long[] f49219d;

    /* renamed from: e */
    private final transient int f49220e;

    /* renamed from: f */
    private final transient int f49221f;

    public final ImmutableSortedSet<E> elementSet() {
        return this.f49218b;
    }

    public final C17883a<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(0);
    }

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        if (this.f49220e > 0 || this.f49221f < this.f49219d.length - 1) {
            return true;
        }
        return false;
    }

    public final C17883a<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(this.f49221f - 1);
    }

    public final int size() {
        return C18143c.m59970b(this.f49219d[this.f49220e + this.f49221f] - this.f49219d[this.f49220e]);
    }

    public final int count(Object obj) {
        int indexOf = this.f49218b.indexOf(obj);
        if (indexOf >= 0) {
            return m59528a(indexOf);
        }
        return 0;
    }

    C17919ct(Comparator<? super E> comparator) {
        this.f49218b = ImmutableSortedSet.emptySet(comparator);
        this.f49219d = f49217c;
        this.f49220e = 0;
        this.f49221f = 0;
    }

    /* renamed from: a */
    private int m59528a(int i) {
        return (int) (this.f49219d[(this.f49220e + i) + 1] - this.f49219d[this.f49220e + i]);
    }

    /* access modifiers changed from: 0000 */
    public final C17883a<E> getEntry(int i) {
        return C17884cc.m59424a(this.f49218b.asList().get(i), m59528a(i));
    }

    public final ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType) {
        boolean z;
        C17920cu<E> cuVar = this.f49218b;
        if (C17439m.m57962a(boundType) == BoundType.CLOSED) {
            z = true;
        } else {
            z = false;
        }
        return m59529a(0, cuVar.mo46271a(e, z));
    }

    public final ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        boolean z;
        C17920cu<E> cuVar = this.f49218b;
        if (C17439m.m57962a(boundType) == BoundType.CLOSED) {
            z = true;
        } else {
            z = false;
        }
        return m59529a(cuVar.mo46273b(e, z), this.f49221f);
    }

    /* renamed from: a */
    private ImmutableSortedMultiset<E> m59529a(int i, int i2) {
        C17439m.m57967a(i, i2, this.f49221f);
        if (i == i2) {
            return emptyMultiset(comparator());
        }
        if (i == 0 && i2 == this.f49221f) {
            return this;
        }
        return new C17919ct(this.f49218b.mo46272a(i, i2), this.f49219d, this.f49220e + i, i2 - i);
    }

    C17919ct(C17920cu<E> cuVar, long[] jArr, int i, int i2) {
        this.f49218b = cuVar;
        this.f49219d = jArr;
        this.f49220e = i;
        this.f49221f = i2;
    }
}
