package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: com.google.common.collect.p */
abstract class C18044p<K, V> extends C18040m<K, V> implements C17959dk<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    /* access modifiers changed from: 0000 */
    public abstract SortedSet<V> createCollection();

    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    public Collection<V> values() {
        return super.values();
    }

    /* access modifiers changed from: 0000 */
    public SortedSet<V> createUnmodifiableEmptyCollection() {
        return unmodifiableCollectionSubclass((Collection) createCollection());
    }

    protected C18044p(Map<K, Collection<V>> map) {
        super(map);
    }

    public SortedSet<V> get(K k) {
        return (SortedSet) super.get((Object) k);
    }

    public SortedSet<V> removeAll(Object obj) {
        return (SortedSet) super.removeAll(obj);
    }

    /* access modifiers changed from: 0000 */
    public <E> SortedSet<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        if (collection instanceof NavigableSet) {
            return C17933db.m59568a((NavigableSet) collection);
        }
        return Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    public SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (SortedSet) super.replaceValues((Object) k, (Iterable) iterable);
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        if (collection instanceof NavigableSet) {
            return new C18020k(k, (NavigableSet) collection, null);
        }
        return new C18022m(k, (SortedSet) collection, null);
    }
}
