package com.bytedance.android.livesdk.feed.fragment;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.live.core.network.NetworkStat;

/* renamed from: com.bytedance.android.livesdk.feed.fragment.l */
final /* synthetic */ class C6013l implements C0053p {

    /* renamed from: a */
    private final FeedLiveFragment f17827a;

    C6013l(FeedLiveFragment feedLiveFragment) {
        this.f17827a = feedLiveFragment;
    }

    public final void onChanged(Object obj) {
        this.f17827a.mo14676b((NetworkStat) obj);
    }
}
