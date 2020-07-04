package com.bytedance.jedi.ext.adapter;

import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.ext.list.differ.C11561b;
import com.bytedance.jedi.ext.adapter.multitype.C11738c;
import kotlin.jvm.internal.C7573i;

public abstract class JediMultiTypeAdapter<T> extends DiffableRawAdapter<T, JediViewHolder<? extends C11501d, T>, C11713f<JediViewHolder<? extends C11501d, T>>> {

    /* renamed from: a */
    public final C11713f<JediViewHolder<? extends C11501d, T>> f31368a;

    /* renamed from: b */
    private final C11561b<T> f31369b;

    public final C11561b<T> aC_() {
        return this.f31369b;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C11738c mo29202b() {
        return this.f31368a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onViewRecycled(JediViewHolder<? extends C11501d, T> jediViewHolder) {
        C7573i.m23587b(jediViewHolder, "holder");
        this.f31368a.mo29267a(jediViewHolder);
    }
}
