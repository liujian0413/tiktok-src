package com.bytedance.android.live.core.paging.adapter;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.live.core.network.NetworkStat;

/* renamed from: com.bytedance.android.live.core.paging.adapter.b */
final /* synthetic */ class C3192b implements C0053p {

    /* renamed from: a */
    private final PagingAdapter f9826a;

    C3192b(PagingAdapter pagingAdapter) {
        this.f9826a = pagingAdapter;
    }

    public final void onChanged(Object obj) {
        this.f9826a.mo10075a((NetworkStat) obj);
    }
}
