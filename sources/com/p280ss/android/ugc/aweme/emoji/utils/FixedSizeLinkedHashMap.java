package com.p280ss.android.ugc.aweme.emoji.utils;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.FixedSizeLinkedHashMap */
public final class FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public final Set<Entry<K, V>> entrySet() {
        return getEntries();
    }

    public final Set getEntries() {
        return super.entrySet();
    }

    public final Set getKeys() {
        return super.keySet();
    }

    public final int getSize() {
        return super.size();
    }

    public final Collection getValues() {
        return super.values();
    }

    public final Set<K> keySet() {
        return getKeys();
    }

    public final int size() {
        return getSize();
    }

    public final Collection<V> values() {
        return getValues();
    }

    public FixedSizeLinkedHashMap(int i) {
        this.capacity = i;
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Entry<K, V> entry) {
        if (size() > this.capacity) {
            return true;
        }
        return false;
    }
}
