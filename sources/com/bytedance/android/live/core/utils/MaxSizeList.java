package com.bytedance.android.live.core.utils;

import java.util.Collection;
import java.util.LinkedList;

public class MaxSizeList<T> extends LinkedList<T> {
    private final int max;

    private void trim() {
        while (size() > this.max) {
            removeFirst();
        }
    }

    public MaxSizeList(int i) {
        this.max = i;
    }

    public boolean add(T t) {
        boolean add = super.add(t);
        trim();
        return add;
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = super.addAll(i, collection);
        trim();
        return addAll;
    }
}
