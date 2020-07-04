package com.bytedance.android.live.core.widget.simple;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: com.bytedance.android.live.core.widget.simple.a */
public abstract class C3423a<F extends T, T> extends C3424b<T> {
    /* renamed from: a */
    public abstract int mo10346a();

    /* renamed from: a */
    public void mo10348a(SimpleViewHolder simpleViewHolder, F f) {
    }

    /* renamed from: a */
    public abstract void mo10349a(SimpleViewHolder simpleViewHolder, F f, int i);

    /* renamed from: a */
    public final C1293v mo10347a(ViewGroup viewGroup) {
        return new SimpleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(mo10346a(), viewGroup, false));
    }
}
