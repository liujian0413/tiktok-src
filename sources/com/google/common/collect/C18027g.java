package com.google.common.collect;

import com.google.common.base.C17434j;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.g */
abstract class C18027g<K, V> implements Entry<K, V> {
    C18027g() {
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        int i;
        Object key = getKey();
        Object value = getValue();
        int i2 = 0;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append("=");
        sb.append(getValue());
        return sb.toString();
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
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
