package com.bytedance.android.live.wallet.p177a;

import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.wallet.C3777e;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.C3819f;
import java.util.HashMap;
import p346io.reactivex.C7492s;

/* renamed from: com.bytedance.android.live.wallet.a.d */
public final class C3606d implements C3777e {

    /* renamed from: a */
    long f10788a;

    /* renamed from: b */
    long f10789b;

    /* renamed from: b */
    public final int mo11042b() {
        return 10001;
    }

    /* renamed from: a */
    public final C7492s<C3479d<C3819f>> mo11041a() {
        HashMap hashMap = new HashMap();
        hashMap.put("campaign_id", String.valueOf(this.f10788a));
        hashMap.put("item_id", String.valueOf(this.f10789b));
        return ((WalletApi) C3458e.m12798a().mo10440a(WalletApi.class)).buyPackage(hashMap);
    }

    public C3606d(long j, long j2) {
        this.f10788a = j;
        this.f10789b = j2;
    }
}
