package com.bytedance.android.live.wallet.p177a;

import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.wallet.api.C3626a;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;

/* renamed from: com.bytedance.android.live.wallet.a.a */
public final class C3601a implements C3626a {
    /* renamed from: a */
    public final C7492s<CheckOrderOriginalResult> mo11038a(String str) {
        return ((WalletApi) C3458e.m12798a().mo10440a(WalletApi.class)).queryOrder(str).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
    }
}
