package com.bytedance.p073ad.symphony.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ad.symphony.util.SafeConcurrentHashMap */
public class SafeConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {
    public SafeConcurrentHashMap() {
    }

    public SafeConcurrentHashMap(int i) {
        super(i);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        try {
            super.putAll(map);
        } catch (Exception unused) {
        }
    }

    public SafeConcurrentHashMap(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public SafeConcurrentHashMap(int i, float f) {
        super(i, f);
    }

    public V put(K k, V v) {
        if (k == null || v == null) {
            return null;
        }
        return super.put(k, v);
    }

    public SafeConcurrentHashMap(int i, float f, int i2) {
        super(i, f, i2);
    }
}
