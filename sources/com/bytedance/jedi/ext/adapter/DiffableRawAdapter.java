package com.bytedance.jedi.ext.adapter;

import com.bytedance.jedi.arch.ext.list.C11554a;
import com.bytedance.jedi.arch.ext.list.C11554a.C11555a;
import com.bytedance.jedi.arch.ext.list.differ.C11561b;
import com.bytedance.jedi.ext.adapter.multitype.C11738c;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeRawAdapter;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

public abstract class DiffableRawAdapter<T, VH extends MultiTypeViewHolder<T>, M extends C11738c<VH>> extends MultiTypeRawAdapter<VH, M> implements C11554a<T> {

    /* renamed from: a */
    private final C11561b<T> f31365a;

    public C11561b<T> aC_() {
        return this.f31365a;
    }

    public int getItemCount() {
        return C11555a.m34010b(this);
    }

    /* renamed from: a */
    public final T mo29135a(int i, boolean z) {
        return C11555a.m34005a((C11554a<T>) this, i, z);
    }

    /* renamed from: b */
    public final T mo29203b(int i, boolean z) {
        return mo29135a(i, z);
    }

    /* renamed from: a */
    public final void mo29136a(List<? extends T> list, C7561a<C7581n> aVar) {
        C7573i.m23587b(list, "list");
        C11555a.m34009a((C11554a<T>) this, list, aVar);
    }
}
