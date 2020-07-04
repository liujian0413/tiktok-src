package com.bytedance.jedi.ext.adapter.multitype;

import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;

public abstract class MultiTypeAdapter<VH extends MultiTypeViewHolder<?>> extends MultiTypeRawAdapter<VH, C11738c<VH>> {

    /* renamed from: a */
    private final C11738c<VH> f31522a;

    /* renamed from: b */
    public final C11738c<VH> mo29202b() {
        return this.f31522a;
    }

    public MultiTypeAdapter() {
        C11738c<VH> cVar = new C11738c<>();
        mo29263a(cVar);
        this.f31522a = cVar;
    }
}
