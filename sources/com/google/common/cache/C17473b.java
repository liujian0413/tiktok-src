package com.google.common.cache;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.common.cache.b */
public interface C17473b<K, V> {
    /* renamed from: a */
    V mo44963a(Object obj);

    /* renamed from: a */
    V mo44964a(K k, Callable<? extends V> callable) throws ExecutionException;

    /* renamed from: a */
    ConcurrentMap<K, V> mo44965a();

    /* renamed from: a */
    void mo44966a(K k, V v);

    /* renamed from: b */
    void mo44967b(Object obj);
}
