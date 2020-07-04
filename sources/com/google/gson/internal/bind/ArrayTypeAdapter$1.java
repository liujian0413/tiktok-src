package com.google.gson.internal.bind;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.internal.C6623b;
import com.google.gson.p277b.C6597a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

class ArrayTypeAdapter$1 implements C6717s {
    ArrayTypeAdapter$1() {
    }

    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        Type type = aVar.type;
        if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type e = C6623b.m20553e(type);
        return new C6636a(eVar, eVar.mo15965a(C6597a.get(e)), C6623b.m20551c(e));
    }
}
