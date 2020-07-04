package com.bytedance.android.monitor.webview.safe;

import java.util.concurrent.ConcurrentHashMap;

public class SafeConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return super.containsKey(obj);
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        return super.get(obj);
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return super.remove(obj);
    }

    public V put(K k, V v) {
        if (k == null || v == null) {
            return null;
        }
        return super.put(k, v);
    }
}
