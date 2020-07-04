package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.common.collect.bt */
public interface C17794bt<K, V> extends C17862by<K, V> {
    Map<K, Collection<V>> asMap();

    List<V> get(K k);

    List<V> removeAll(Object obj);
}
