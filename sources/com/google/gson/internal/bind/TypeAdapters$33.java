package com.google.gson.internal.bind;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.p277b.C6597a;

class TypeAdapters$33 implements C6717s {

    /* renamed from: a */
    final /* synthetic */ Class f19035a;

    /* renamed from: b */
    final /* synthetic */ Class f19036b;

    /* renamed from: c */
    final /* synthetic */ C6715r f19037c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Factory[type=");
        sb.append(this.f19036b.getName());
        sb.append("+");
        sb.append(this.f19035a.getName());
        sb.append(",adapter=");
        sb.append(this.f19037c);
        sb.append("]");
        return sb.toString();
    }

    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        if (cls == this.f19035a || cls == this.f19036b) {
            return this.f19037c;
        }
        return null;
    }

    TypeAdapters$33(Class cls, Class cls2, C6715r rVar) {
        this.f19035a = cls;
        this.f19036b = cls2;
        this.f19037c = rVar;
    }
}
