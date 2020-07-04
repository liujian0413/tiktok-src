package com.bytedance.jedi.ext.adapter.extension;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import java.util.List;

public final class DiffableAdapterBuilder$viewHolder$factory$2$1 extends MultiTypeViewHolder<T> {

    /* renamed from: a */
    final /* synthetic */ C11708c f31447a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f31448b;

    /* renamed from: a */
    public final void mo29214a(T t, int i) {
    }

    DiffableAdapterBuilder$viewHolder$factory$2$1(C11708c cVar, ViewGroup viewGroup, View view) {
        this.f31447a = cVar;
        this.f31448b = viewGroup;
        super(view);
    }

    /* renamed from: b */
    public final void mo29215b(T t, int i, List<Object> list) {
        super.mo29215b(t, i, list);
        this.f31447a.f31461a.invoke(this, t, Integer.valueOf(i), list);
    }
}
