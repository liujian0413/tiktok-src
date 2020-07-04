package com.google.gson.internal.bind;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.p277b.C6597a;

class TypeAdapters$34 implements C6717s {

    /* renamed from: a */
    final /* synthetic */ Class f19038a;

    /* renamed from: b */
    final /* synthetic */ Class f19039b;

    /* renamed from: c */
    final /* synthetic */ C6715r f19040c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Factory[type=");
        sb.append(this.f19038a.getName());
        sb.append("+");
        sb.append(this.f19039b.getName());
        sb.append(",adapter=");
        sb.append(this.f19040c);
        sb.append("]");
        return sb.toString();
    }

    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        if (cls == this.f19038a || cls == this.f19039b) {
            return this.f19040c;
        }
        return null;
    }

    TypeAdapters$34(Class cls, Class cls2, C6715r rVar) {
        this.f19038a = cls;
        this.f19039b = cls2;
        this.f19040c = rVar;
    }
}
