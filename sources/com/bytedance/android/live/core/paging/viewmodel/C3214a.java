package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.live.core.network.NetworkStat;

/* renamed from: com.bytedance.android.live.core.paging.viewmodel.a */
final /* synthetic */ class C3214a implements C0053p {

    /* renamed from: a */
    private final PagingViewModel f9882a;

    C3214a(PagingViewModel pagingViewModel) {
        this.f9882a = pagingViewModel;
    }

    public final void onChanged(Object obj) {
        this.f9882a.mo10113b((NetworkStat) obj);
    }
}
