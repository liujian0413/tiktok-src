package com.bytedance.android.live.wallet.p177a;

import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.wallet.api.C3629d;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.livesdkapi.p457i.C9476d;
import java.util.HashMap;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;

/* renamed from: com.bytedance.android.live.wallet.a.c */
public final class C3605c implements C3629d {
    /* renamed from: a */
    public final C7492s<C3479d<C9476d>> mo11040a(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("data", str);
        hashMap.put("signature", str2);
        String str4 = "order_id";
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put(str4, str3);
        return ((WalletApi) C3458e.m12798a().mo10440a(WalletApi.class)).googlePayVerify(hashMap).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
    }
}
