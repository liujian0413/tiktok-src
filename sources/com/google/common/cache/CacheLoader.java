package com.google.common.cache;

import com.google.common.base.C17439m;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;

public abstract class CacheLoader<K, V> {

    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
        UnsupportedLoadingOperationException() {
        }
    }

    protected CacheLoader() {
    }

    /* renamed from: a */
    public abstract V mo44954a(K k) throws Exception;

    /* renamed from: a */
    public final C18253l<V> mo44953a(K k, V v) throws Exception {
        C17439m.m57962a(k);
        C17439m.m57962a(v);
        return C18246h.m60210a(mo44954a(k));
    }
}
