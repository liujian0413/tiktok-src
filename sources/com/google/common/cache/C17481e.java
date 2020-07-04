package com.google.common.cache;

import com.google.common.collect.C17755ba;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.common.cache.e */
public abstract class C17481e<K, V> extends C17755ba implements C17473b<K, V> {
    protected C17481e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C17473b<K, V> delegate();

    /* renamed from: a */
    public final ConcurrentMap<K, V> mo44965a() {
        return delegate().mo44965a();
    }

    /* renamed from: b */
    public final void mo44967b(Object obj) {
        delegate().mo44967b(obj);
    }

    /* renamed from: a */
    public final V mo44963a(Object obj) {
        return delegate().mo44963a(obj);
    }

    /* renamed from: a */
    public final void mo44966a(K k, V v) {
        delegate().mo44966a(k, v);
    }

    /* renamed from: a */
    public final V mo44964a(K k, Callable<? extends V> callable) throws ExecutionException {
        return delegate().mo44964a(k, callable);
    }
}
