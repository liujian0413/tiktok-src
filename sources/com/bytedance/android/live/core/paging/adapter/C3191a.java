package com.bytedance.android.live.core.paging.adapter;

import android.arch.lifecycle.C0053p;
import android.arch.paging.C0100h;

/* renamed from: com.bytedance.android.live.core.paging.adapter.a */
final /* synthetic */ class C3191a implements C0053p {

    /* renamed from: a */
    private final PagingAdapter f9825a;

    C3191a(PagingAdapter pagingAdapter) {
        this.f9825a = pagingAdapter;
    }

    public final void onChanged(Object obj) {
        this.f9825a.mo154a((C0100h) obj);
    }
}
