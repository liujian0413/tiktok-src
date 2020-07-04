package com.google.gson.internal.bind;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.p277b.C6597a;

class TypeAdapters$32 implements C6717s {

    /* renamed from: a */
    final /* synthetic */ Class f19033a;

    /* renamed from: b */
    final /* synthetic */ C6715r f19034b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Factory[type=");
        sb.append(this.f19033a.getName());
        sb.append(",adapter=");
        sb.append(this.f19034b);
        sb.append("]");
        return sb.toString();
    }

    TypeAdapters$32(Class cls, C6715r rVar) {
        this.f19033a = cls;
        this.f19034b = rVar;
    }

    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        if (aVar.rawType == this.f19033a) {
            return this.f19034b;
        }
        return null;
    }
}
