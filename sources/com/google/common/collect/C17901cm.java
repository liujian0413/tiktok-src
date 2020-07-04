package com.google.common.collect;

import java.lang.Comparable;
import java.util.Set;

/* renamed from: com.google.common.collect.cm */
public interface C17901cm<C extends Comparable> {
    Set<Range<C>> asRanges();

    C17901cm<C> complement();

    boolean encloses(Range<C> range);

    boolean isEmpty();

    void removeAll(C17901cm<C> cmVar);

    C17901cm<C> subRangeSet(Range<C> range);
}
