package com.google.common.collect;

import java.lang.Comparable;

/* renamed from: com.google.common.collect.k */
abstract class C18038k<C extends Comparable> implements C17901cm<C> {
    C18038k() {
    }

    public abstract boolean encloses(Range<C> range);

    public abstract Range<C> rangeContaining(C c);

    public void clear() {
        remove(Range.all());
    }

    public final int hashCode() {
        return asRanges().hashCode();
    }

    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    public final String toString() {
        return asRanges().toString();
    }

    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    public void addAll(C17901cm<C> cmVar) {
        addAll((Iterable<Range<C>>) cmVar.asRanges());
    }

    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    public void removeAll(C17901cm<C> cmVar) {
        removeAll((Iterable<Range<C>>) cmVar.asRanges());
    }

    public boolean contains(C c) {
        if (rangeContaining(c) != null) {
            return true;
        }
        return false;
    }

    public boolean enclosesAll(C17901cm<C> cmVar) {
        return enclosesAll((Iterable<Range<C>>) cmVar.asRanges());
    }

    public boolean intersects(Range<C> range) {
        if (!subRangeSet(range).isEmpty()) {
            return true;
        }
        return false;
    }

    public void addAll(Iterable<Range<C>> iterable) {
        for (Range add : iterable) {
            add(add);
        }
    }

    public boolean enclosesAll(Iterable<Range<C>> iterable) {
        for (Range encloses : iterable) {
            if (!encloses(encloses)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17901cm)) {
            return false;
        }
        return asRanges().equals(((C17901cm) obj).asRanges());
    }

    public void removeAll(Iterable<Range<C>> iterable) {
        for (Range remove : iterable) {
            remove(remove);
        }
    }
}
