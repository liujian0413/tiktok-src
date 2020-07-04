package com.google.gson.internal.bind;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.p277b.C6597a;

class TypeAdapters$30 implements C6717s {
    TypeAdapters$30() {
    }

    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
            return null;
        }
        if (!cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        return new C6679a(cls);
    }
}
