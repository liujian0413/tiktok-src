package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.common.collect.d */
abstract class C17931d<K, V> extends C18002e<K, V> implements C17794bt<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    /* access modifiers changed from: 0000 */
    public abstract List<V> createCollection();

    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    /* access modifiers changed from: 0000 */
    public List<V> createUnmodifiableEmptyCollection() {
        return Collections.emptyList();
    }

    protected C17931d(Map<K, Collection<V>> map) {
        super(map);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    public List<V> get(K k) {
        return (List) super.get(k);
    }

    public List<V> removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return wrapList(k, (List) collection, null);
    }

    public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (List) super.replaceValues(k, iterable);
    }
}
