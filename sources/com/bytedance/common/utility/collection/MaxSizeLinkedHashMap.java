package com.bytedance.common.utility.collection;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MaxSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    private static final long serialVersionUID = 3805937866184666407L;
    final int mMaxSize;

    /* access modifiers changed from: protected */
    public boolean removeEldestEntry(Entry<K, V> entry) {
        if (size() > this.mMaxSize) {
            return true;
        }
        return false;
    }

    public MaxSizeLinkedHashMap(int i, int i2) {
        this(i, i2, false);
    }

    public MaxSizeLinkedHashMap(int i, int i2, boolean z) {
        super(i2, 0.75f, true);
        this.mMaxSize = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }
}
