package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.common.collect.n */
abstract class C18041n<K, V> extends C18044p<K, V> {
    /* access modifiers changed from: 0000 */
    public Set<K> createKeySet() {
        return createMaybeNavigableKeySet();
    }

    public SortedMap<K, Collection<V>> asMap() {
        return (SortedMap) super.asMap();
    }

    /* access modifiers changed from: 0000 */
    public SortedMap<K, Collection<V>> backingMap() {
        return (SortedMap) super.backingMap();
    }

    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }

    C18041n(SortedMap<K, Collection<V>> sortedMap) {
        super(sortedMap);
    }
}
