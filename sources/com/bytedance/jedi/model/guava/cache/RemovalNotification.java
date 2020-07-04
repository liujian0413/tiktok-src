package com.bytedance.jedi.model.guava.cache;

import com.bytedance.jedi.model.guava.base.C11864b;
import java.util.AbstractMap.SimpleImmutableEntry;

public final class RemovalNotification<K, V> extends SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final RemovalCause cause;

    public final RemovalCause getCause() {
        return this.cause;
    }

    public final boolean wasEvicted() {
        return this.cause.wasEvicted();
    }

    public static <K, V> RemovalNotification<K, V> create(K k, V v, RemovalCause removalCause) {
        return new RemovalNotification<>(k, v, removalCause);
    }

    private RemovalNotification(K k, V v, RemovalCause removalCause) {
        super(k, v);
        this.cause = (RemovalCause) C11864b.m34655a(removalCause);
    }
}
