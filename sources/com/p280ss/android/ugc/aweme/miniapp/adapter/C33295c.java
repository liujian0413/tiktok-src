package com.p280ss.android.ugc.aweme.miniapp.adapter;

import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;

/* renamed from: com.ss.android.ugc.aweme.miniapp.adapter.c */
final /* synthetic */ class C33295c implements C33292a {

    /* renamed from: a */
    private final RecentlyMicroAppListAdapter f86965a;

    /* renamed from: b */
    private final int f86966b;

    /* renamed from: c */
    private final MicroAppInfo f86967c;

    C33295c(RecentlyMicroAppListAdapter recentlyMicroAppListAdapter, int i, MicroAppInfo microAppInfo) {
        this.f86965a = recentlyMicroAppListAdapter;
        this.f86966b = i;
        this.f86967c = microAppInfo;
    }

    /* renamed from: a */
    public final void mo85415a(String str) {
        this.f86965a.mo85411a(this.f86966b, this.f86967c, str);
    }
}
