package com.google.common.collect;

import com.google.common.base.C17434j;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.ax */
public abstract class C17751ax<K, V> extends C17755ba implements Entry<K, V> {
    protected C17751ax() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Entry<K, V> delegate();

    public K getKey() {
        return delegate().getKey();
    }

    public V getValue() {
        return delegate().getValue();
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean equals(Object obj) {
        return delegate().equals(obj);
    }

    public V setValue(V v) {
        return delegate().setValue(v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo45929a(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (!C17434j.m57955a(getKey(), entry.getKey()) || !C17434j.m57955a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }
}
