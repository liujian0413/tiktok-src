package com.google.common.reflect;

import com.google.common.base.C17439m;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.common.reflect.e */
public abstract class C18177e<T> extends C18176d<T> {

    /* renamed from: a */
    final TypeVariable<?> f49542a;

    public final int hashCode() {
        return this.f49542a.hashCode();
    }

    public String toString() {
        return this.f49542a.toString();
    }

    protected C18177e() {
        Type capture = capture();
        C17439m.m57976a(capture instanceof TypeVariable, "%s should be a type variable.", (Object) capture);
        this.f49542a = (TypeVariable) capture;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18177e)) {
            return false;
        }
        return this.f49542a.equals(((C18177e) obj).f49542a);
    }
}
