package com.google.gson.internal.bind;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.C6630a;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.gson.internal.bind.i */
final class C6648i<T> extends C6715r<T> {

    /* renamed from: a */
    private final C6600e f19069a;

    /* renamed from: b */
    private final C6715r<T> f19070b;

    /* renamed from: c */
    private final Type f19071c;

    public final T read(C6718a aVar) throws IOException {
        return this.f19070b.read(aVar);
    }

    /* renamed from: a */
    private static Type m20629a(Type type, Object obj) {
        if (obj == null) {
            return type;
        }
        if (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) {
            return obj.getClass();
        }
        return type;
    }

    public final void write(C6720b bVar, T t) throws IOException {
        C6715r<T> rVar = this.f19070b;
        Type a = m20629a(this.f19071c, t);
        if (a != this.f19071c) {
            rVar = this.f19069a.mo15965a(C6597a.get(a));
            if ((rVar instanceof C6630a) && !(this.f19070b instanceof C6630a)) {
                rVar = this.f19070b;
            }
        }
        rVar.write(bVar, t);
    }

    C6648i(C6600e eVar, C6715r<T> rVar, Type type) {
        this.f19069a = eVar;
        this.f19070b = rVar;
        this.f19071c = type;
    }
}
