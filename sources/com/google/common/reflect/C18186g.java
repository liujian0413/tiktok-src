package com.google.common.reflect;

import com.google.common.collect.C17933db;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

/* renamed from: com.google.common.reflect.g */
abstract class C18186g {

    /* renamed from: a */
    private final Set<Type> f49556a = C17933db.m59565a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46962a(Class<?> cls) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46958a(GenericArrayType genericArrayType) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46959a(ParameterizedType parameterizedType) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46960a(TypeVariable<?> typeVariable) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46961a(WildcardType wildcardType) {
    }

    C18186g() {
    }

    /* renamed from: a */
    public final void mo47005a(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.f49556a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        mo46960a((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        mo46961a((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        mo46959a((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        mo46962a((Class) type);
                    } else if (type instanceof GenericArrayType) {
                        mo46958a((GenericArrayType) type);
                    } else {
                        StringBuilder sb = new StringBuilder("Unknown type: ");
                        sb.append(type);
                        throw new AssertionError(sb.toString());
                    }
                } catch (Throwable th) {
                    this.f49556a.remove(type);
                    throw th;
                }
            }
        }
    }
}
