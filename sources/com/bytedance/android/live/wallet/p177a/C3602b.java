package com.bytedance.android.live.wallet.p177a;

import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.wallet.api.C3627b;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.host.PayChannel;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.live.wallet.a.b */
public final class C3602b implements C3627b {
    /* renamed from: a */
    public final C7492s<C9353b> mo11039a(long j, final PayChannel payChannel, String str) {
        int i = 1;
        switch (payChannel) {
            case ALIPAY:
                i = 0;
                break;
            case GOOGLE:
                i = 10;
                break;
            case TEST:
                i = -1;
                break;
        }
        return ((WalletApi) C3458e.m12798a().mo10440a(WalletApi.class)).createOrderInfo(String.valueOf(j), i, str).mo19317d((C7327h<? super T, ? extends R>) new C7327h<String, C9353b>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C9353b apply(String str) throws Exception {
                JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
                C9353b bVar = new C9353b();
                bVar.f25553h = jSONObject.optString("order_info", "");
                bVar.f25554i = jSONObject.optString("app_id", "");
                bVar.f25557l = jSONObject.optString("nonce_str", "");
                bVar.f25555j = jSONObject.optString("partner_id", "");
                bVar.f25556k = jSONObject.optString("prepay_id", "");
                bVar.f25559n = jSONObject.optString("sign", "");
                bVar.f25558m = jSONObject.optString("timestamp", "");
                bVar.f25546a = jSONObject.optString("order_id", "");
                bVar.f25551f = jSONObject.optBoolean("result", false);
                bVar.f25548c = payChannel;
                return bVar;
            }
        }).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
    }
}
