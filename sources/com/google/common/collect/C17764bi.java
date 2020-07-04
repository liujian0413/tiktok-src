package com.google.common.collect;

import java.io.Serializable;

/* renamed from: com.google.common.collect.bi */
class C17764bi<K, V> extends C18027g<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final K f48993a;

    /* renamed from: b */
    final V f48994b;

    public final K getKey() {
        return this.f48993a;
    }

    public final V getValue() {
        return this.f48994b;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    C17764bi(K k, V v) {
        this.f48993a = k;
        this.f48994b = v;
    }
}
