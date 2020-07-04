package com.bytedance.android.livesdk.browser.jsbridge.p201c;

import com.bytedance.android.live.core.p148d.C3171d;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.e */
public final class C4047e implements C11093e {

    /* renamed from: a */
    private WeakReference<C4048a> f12035a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.e$a */
    public interface C4048a {
        /* renamed from: a */
        void mo11600a(long j);

        /* renamed from: a */
        void mo11607a(String str);

        /* renamed from: a */
        void mo11608a(String str, Object obj);

        /* renamed from: i */
        void mo11616i();
    }

    public C4047e(WeakReference<C4048a> weakReference) {
        this.f12035a = weakReference;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        if (iVar.f30171d != null) {
            C4048a aVar = (C4048a) this.f12035a.get();
            String optString = iVar.f30171d.optString("type");
            char c = 65535;
            int hashCode = optString.hashCode();
            if (hashCode != -1361632588) {
                if (hashCode == 24553548 && optString.equals("cashdesk")) {
                    c = 1;
                }
            } else if (optString.equals("charge")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    aVar.mo11607a(C3171d.m11992a(IWalletService.SERVICE_RECHARGE_WEBVIEW_LOAD_DETAIL));
                    break;
                case 1:
                    aVar.mo11607a(C3171d.m11992a("ttlive_charge_open_check_fe_detail"));
                    break;
            }
            if (iVar.f30171d.has("args")) {
                JSONObject optJSONObject = iVar.f30171d.optJSONObject("args");
                if (optJSONObject.has("first_loaded")) {
                    aVar.mo11616i();
                }
                if (optJSONObject.has("blank_duration")) {
                    long optLong = optJSONObject.optLong("blank_duration");
                    aVar.mo11608a("blank_duration", Long.valueOf(optLong));
                    aVar.mo11600a(optLong);
                }
                if (optJSONObject.has("interactive_duration")) {
                    aVar.mo11608a("interactive_duration", Long.valueOf(optJSONObject.optLong("interactive_duration")));
                }
                if (optJSONObject.has("finished_duration")) {
                    aVar.mo11608a("finished_duration", Long.valueOf(optJSONObject.optLong("finished_duration")));
                }
            }
        }
    }
}
