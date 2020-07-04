package com.google.common.collect;

import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.do */
public interface C17986do<R, C, V> {

    /* renamed from: com.google.common.collect.do$a */
    public interface C17987a<R, C, V> {
        /* renamed from: a */
        R mo45207a();

        /* renamed from: b */
        C mo45208b();

        /* renamed from: c */
        V mo45209c();
    }

    Set<C17987a<R, C, V>> cellSet();

    Set<C> columnKeySet();

    Map<C, Map<R, V>> columnMap();

    Map<C, V> row(R r);

    Set<R> rowKeySet();

    Map<R, Map<C, V>> rowMap();

    int size();
}
