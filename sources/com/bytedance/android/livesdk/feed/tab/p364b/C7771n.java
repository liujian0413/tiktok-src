package com.bytedance.android.livesdk.feed.tab.p364b;

import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.livesdk.feed.C6084p;
import com.bytedance.android.livesdk.feed.p227b.C5951b;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import com.bytedance.android.livesdk.feed.tab.p235a.C6124a;
import com.bytedance.android.livesdk.feed.tab.p235a.C6127d;

/* renamed from: com.bytedance.android.livesdk.feed.tab.b.n */
public final class C7771n extends C7757a {

    /* renamed from: a */
    private static C7771n f21002a;

    /* renamed from: d */
    public static C7771n m23888d() {
        if (f21002a == null) {
            f21002a = new C7771n(new C7774q(new C6124a(), new C6127d(), C5951b.m18633a().getApplicationContext(), new C6084p()), new C7775r((FeedTabApi) C3458e.m12798a().mo10440a(FeedTabApi.class)));
        }
        return f21002a;
    }

    private C7771n(C7772o oVar, C7773p pVar) {
        super(oVar, pVar);
    }
}
