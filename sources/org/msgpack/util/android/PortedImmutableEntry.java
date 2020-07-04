package org.msgpack.util.android;

import java.io.Serializable;
import java.util.Map.Entry;

public class PortedImmutableEntry<K, V> implements Serializable, Entry<K, V> {
    private static final long serialVersionUID = -4564047655287765373L;
    private final K key;
    private final V value;

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.key == null) {
            i = 0;
        } else {
            i = this.key.hashCode();
        }
        if (this.value != null) {
            i2 = this.value.hashCode();
        }
        return i ^ i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.key);
        sb.append("=");
        sb.append(this.value);
        return sb.toString();
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public PortedImmutableEntry(Entry<? extends K, ? extends V> entry) {
        this.key = entry.getKey();
        this.value = entry.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (this.key != null ? this.key.equals(entry.getKey()) : entry.getKey() == null) {
            if (this.value != null ? !this.value.equals(entry.getValue()) : entry.getValue() != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public PortedImmutableEntry(K k, V v) {
        this.key = k;
        this.value = v;
    }
}
