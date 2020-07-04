package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.live.core.network.NetworkStat;

/* renamed from: com.bytedance.android.live.core.paging.viewmodel.b */
final /* synthetic */ class C3215b implements C0053p {

    /* renamed from: a */
    private final PagingViewModel f9883a;

    C3215b(PagingViewModel pagingViewModel) {
        this.f9883a = pagingViewModel;
    }

    public final void onChanged(Object obj) {
        this.f9883a.mo10108a((NetworkStat) obj);
    }
}
