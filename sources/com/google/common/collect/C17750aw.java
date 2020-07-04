package com.google.common.collect;

import com.google.common.base.C17434j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.common.collect.aw */
public abstract class C17750aw<K, V> extends C17755ba implements Map<K, V> {
    protected C17750aw() {
    }

    /* access modifiers changed from: protected */
    public abstract Map<K, V> delegate();

    public void clear() {
        delegate().clear();
    }

    /* access modifiers changed from: protected */
    public String standardToString() {
        return C17839bx.m59332a((Map<?, ?>) this);
    }

    public Set<Entry<K, V>> entrySet() {
        return delegate().entrySet();
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

    public int size() {
        return delegate().size();
    }

    /* access modifiers changed from: protected */
    public void standardClear() {
        C17782br.m59133h(entrySet().iterator());
    }

    /* access modifiers changed from: protected */
    public int standardHashCode() {
        return C17933db.m59564a(entrySet());
    }

    public Collection<V> values() {
        return delegate().values();
    }

    /* access modifiers changed from: protected */
    public boolean standardIsEmpty() {
        if (!entrySet().iterator().hasNext()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void standardPutAll(Map<? extends K, ? extends V> map) {
        C17839bx.m59340a((Map<K, V>) this, map);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    /* access modifiers changed from: protected */
    public boolean standardContainsKey(Object obj) {
        return C17839bx.m59353d(this, obj);
    }

    /* access modifiers changed from: protected */
    public boolean standardContainsValue(Object obj) {
        return C17839bx.m59354e(this, obj);
    }

    /* access modifiers changed from: protected */
    public boolean standardEquals(Object obj) {
        return C17839bx.m59355f(this, obj);
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    public V get(Object obj) {
        return delegate().get(obj);
    }

    public V remove(Object obj) {
        return delegate().remove(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this || delegate().equals(obj)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public V standardRemove(Object obj) {
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (C17434j.m57955a(entry.getKey(), obj)) {
                V value = entry.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public V put(K k, V v) {
        return delegate().put(k, v);
    }
}
