package com.google.common.collect;

import java.util.List;

/* renamed from: com.google.common.collect.av */
public abstract class C17749av<K, V> extends C17752ay<K, V> implements C17794bt<K, V> {
    protected C17749av() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C17794bt<K, V> delegate();

    public List<V> get(K k) {
        return delegate().get(k);
    }

    public List<V> removeAll(Object obj) {
        return delegate().removeAll(obj);
    }
}
