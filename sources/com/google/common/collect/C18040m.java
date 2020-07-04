package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.common.collect.m */
abstract class C18040m<K, V> extends C18002e<K, V> implements C17932da<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    /* access modifiers changed from: 0000 */
    public abstract Set<V> createCollection();

    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    /* access modifiers changed from: 0000 */
    public Set<V> createUnmodifiableEmptyCollection() {
        return Collections.emptySet();
    }

    public Set<Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    protected C18040m(Map<K, Collection<V>> map) {
        super(map);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    public Set<V> get(K k) {
        return (Set) super.get(k);
    }

    public Set<V> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return new C18021l(k, (Set) collection);
    }

    public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues(k, iterable);
    }
}
