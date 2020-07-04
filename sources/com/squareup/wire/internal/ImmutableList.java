package com.squareup.wire.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

final class ImmutableList<T> extends AbstractList<T> implements Serializable, RandomAccess {
    private final ArrayList<T> list;

    private Object writeReplace() throws ObjectStreamException {
        return Collections.unmodifiableList(this.list);
    }

    public final int size() {
        return this.list.size();
    }

    public final Object[] toArray() {
        return this.list.toArray();
    }

    public final T get(int i) {
        return this.list.get(i);
    }

    ImmutableList(List<T> list2) {
        this.list = new ArrayList<>(list2);
    }
}
