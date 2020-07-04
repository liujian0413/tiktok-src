package com.bytedance.android.livesdk.feed.repository;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.live.core.network.NetworkStat;

/* renamed from: com.bytedance.android.livesdk.feed.repository.e */
final /* synthetic */ class C6093e implements C0053p {

    /* renamed from: a */
    private final FeedRepository f18025a;

    C6093e(FeedRepository feedRepository) {
        this.f18025a = feedRepository;
    }

    public final void onChanged(Object obj) {
        this.f18025a.mo14751a((NetworkStat) obj);
    }
}
