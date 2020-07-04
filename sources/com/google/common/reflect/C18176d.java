package com.google.common.reflect;

import com.google.common.base.C17439m;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.google.common.reflect.d */
abstract class C18176d<T> {
    C18176d() {
    }

    /* access modifiers changed from: 0000 */
    public final Type capture() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        C17439m.m57976a(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", (Object) genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
