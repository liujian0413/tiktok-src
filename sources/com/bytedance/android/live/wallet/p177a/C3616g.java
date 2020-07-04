package com.bytedance.android.live.wallet.p177a;

import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.wallet.C3777e;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.C3819f;
import java.util.HashMap;
import p346io.reactivex.C7492s;

/* renamed from: com.bytedance.android.live.wallet.a.g */
public final class C3616g implements C3777e {

    /* renamed from: a */
    private long f10801a;

    /* renamed from: b */
    private long f10802b;

    /* renamed from: b */
    public final int mo11042b() {
        return 10002;
    }

    /* renamed from: a */
    public final C7492s<C3479d<C3819f>> mo11041a() {
        HashMap hashMap = new HashMap();
        hashMap.put("package_id", String.valueOf(this.f10801a));
        hashMap.put("anchor_id", String.valueOf(this.f10802b));
        return ((WalletApi) C3458e.m12798a().mo10440a(WalletApi.class)).buyWard(hashMap);
    }

    public C3616g(long j, long j2) {
        this.f10801a = j;
        this.f10802b = j2;
    }
}
