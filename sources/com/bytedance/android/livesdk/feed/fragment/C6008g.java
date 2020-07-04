package com.bytedance.android.livesdk.feed.fragment;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.live.core.network.NetworkStat;

/* renamed from: com.bytedance.android.livesdk.feed.fragment.g */
final /* synthetic */ class C6008g implements C0053p {

    /* renamed from: a */
    private final BaseTabFeedFragment f17822a;

    C6008g(BaseTabFeedFragment baseTabFeedFragment) {
        this.f17822a = baseTabFeedFragment;
    }

    public final void onChanged(Object obj) {
        this.f17822a.mo14664a((NetworkStat) obj);
    }
}
