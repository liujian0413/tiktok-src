package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.common.collect.ay */
public abstract class C17752ay<K, V> extends C17755ba implements C17862by<K, V> {
    protected C17752ay() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C17862by<K, V> delegate();

    public void clear() {
        delegate().clear();
    }

    public Map<K, Collection<V>> asMap() {
        return delegate().asMap();
    }

    public Collection<Entry<K, V>> entries() {
        return delegate().entries();
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public C17882cb<K> keys() {
        return delegate().keys();
    }

    public int size() {
        return delegate().size();
    }

    public Collection<V> values() {
        return delegate().values();
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    public Collection<V> get(K k) {
        return delegate().get(k);
    }

    public boolean putAll(C17862by<? extends K, ? extends V> byVar) {
        return delegate().putAll(byVar);
    }

    public Collection<V> removeAll(Object obj) {
        return delegate().removeAll(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this || delegate().equals(obj)) {
            return true;
        }
        return false;
    }

    public boolean containsEntry(Object obj, Object obj2) {
        return delegate().containsEntry(obj, obj2);
    }

    public boolean put(K k, V v) {
        return delegate().put(k, v);
    }

    public boolean remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        return delegate().putAll(k, iterable);
    }
}
