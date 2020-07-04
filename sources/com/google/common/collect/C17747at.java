package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.common.collect.at */
public abstract class C17747at<K, V> extends C17750aw<K, V> implements ConcurrentMap<K, V> {
    protected C17747at() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ConcurrentMap<K, V> delegate();

    public V putIfAbsent(K k, V v) {
        return delegate().putIfAbsent(k, v);
    }

    public boolean remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    public V replace(K k, V v) {
        return delegate().replace(k, v);
    }

    public boolean replace(K k, V v, V v2) {
        return delegate().replace(k, v, v2);
    }
}
