package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.ImmutableSortedSet.C17636a;
import java.lang.Comparable;
import java.util.NoSuchElementException;

public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    final C17719ai<C> domain;

    /* access modifiers changed from: 0000 */
    public abstract ContiguousSet<C> headSetImpl(C c, boolean z);

    public abstract ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet);

    public abstract Range<C> range();

    public abstract Range<C> range(BoundType boundType, BoundType boundType2);

    /* access modifiers changed from: 0000 */
    public abstract ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2);

    /* access modifiers changed from: 0000 */
    public abstract ContiguousSet<C> tailSetImpl(C c, boolean z);

    public static <E> C17636a<E> builder() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public ImmutableSortedSet<C> createDescendingSet() {
        return new C17716ag(this);
    }

    public String toString() {
        return range().toString();
    }

    ContiguousSet(C17719ai<C> aiVar) {
        super(C17896ch.m59497b());
        this.domain = aiVar;
    }

    public ContiguousSet<C> headSet(C c) {
        return headSetImpl((C) (Comparable) C17439m.m57962a(c), false);
    }

    public ContiguousSet<C> tailSet(C c) {
        return tailSetImpl((C) (Comparable) C17439m.m57962a(c), true);
    }

    public static ContiguousSet<Integer> closed(int i, int i2) {
        return create(Range.closed(Integer.valueOf(i), Integer.valueOf(i2)), C17719ai.m58977a());
    }

    public static ContiguousSet<Integer> closedOpen(int i, int i2) {
        return create(Range.closedOpen(Integer.valueOf(i), Integer.valueOf(i2)), C17719ai.m58977a());
    }

    public ContiguousSet<C> headSet(C c, boolean z) {
        return headSetImpl((C) (Comparable) C17439m.m57962a(c), z);
    }

    public ContiguousSet<C> subSet(C c, C c2) {
        boolean z;
        C17439m.m57962a(c);
        C17439m.m57962a(c2);
        if (comparator().compare(c, c2) <= 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57968a(z);
        return subSetImpl(c, true, c2, false);
    }

    public ContiguousSet<C> tailSet(C c, boolean z) {
        return tailSetImpl((C) (Comparable) C17439m.m57962a(c), z);
    }

    public static ContiguousSet<Long> closed(long j, long j2) {
        return create(Range.closed(Long.valueOf(j), Long.valueOf(j2)), C17719ai.m58978b());
    }

    public static ContiguousSet<Long> closedOpen(long j, long j2) {
        return create(Range.closedOpen(Long.valueOf(j), Long.valueOf(j2)), C17719ai.m58978b());
    }

    public static <C extends Comparable> ContiguousSet<C> create(Range<C> range, C17719ai<C> aiVar) {
        Range<C> range2;
        boolean z;
        C17439m.m57962a(range);
        C17439m.m57962a(aiVar);
        try {
            if (!range.hasLowerBound()) {
                range2 = range.intersection(Range.atLeast(aiVar.mo45851c()));
            } else {
                range2 = range;
            }
            if (!range.hasUpperBound()) {
                range2 = range2.intersection(Range.atMost(aiVar.mo45852d()));
            }
            if (range2.isEmpty() || Range.compareOrThrow(range.lowerBound.mo45819a(aiVar), range.upperBound.mo45824b(aiVar)) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new C17723aj(aiVar);
            }
            return new C17902cn(range2, aiVar);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public ContiguousSet<C> subSet(C c, boolean z, C c2, boolean z2) {
        boolean z3;
        C17439m.m57962a(c);
        C17439m.m57962a(c2);
        if (comparator().compare(c, c2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C17439m.m57968a(z3);
        return subSetImpl(c, z, c2, z2);
    }
}
