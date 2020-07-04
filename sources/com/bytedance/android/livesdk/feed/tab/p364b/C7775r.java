package com.bytedance.android.livesdk.feed.tab.p364b;

import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.livesdk.feed.feed.C5989f;
import com.bytedance.android.livesdk.feed.feed.C5990g;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import p346io.reactivex.C7492s;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.feed.tab.b.r */
public final class C7775r implements C7773p {

    /* renamed from: a */
    private FeedTabApi f21003a;

    /* renamed from: a */
    public final C7492s<C3474a<C5989f, C5990g>> mo20452a() {
        return this.f21003a.queryTab(0).mo19304b(C7333a.m23044b());
    }

    public C7775r(FeedTabApi feedTabApi) {
        this.f21003a = feedTabApi;
    }
}
