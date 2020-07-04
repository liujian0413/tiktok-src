package com.bytedance.android.livesdk.browser.jsbridge.p201c;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9434c;
import com.bytedance.ies.web.jsbridge2.C11176q;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.d */
public final class C4045d implements C11093e {

    /* renamed from: a */
    public final WeakReference<C11176q> f12030a;

    /* renamed from: b */
    public String f12031b;

    /* renamed from: c */
    private final WeakReference<Context> f12032c;

    /* renamed from: d */
    private IWalletService f12033d = ((IWalletService) C3596c.m13172a(IWalletService.class));

    public C4045d(WeakReference<Context> weakReference, C11176q qVar) {
        this.f12032c = weakReference;
        this.f12030a = new WeakReference<>(qVar);
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        if (iVar != null && iVar.f30171d != null) {
            iVar.f30173f = false;
            this.f12031b = iVar.f30169b;
            String optString = iVar.f30171d.optJSONObject("args").optString("auth_info");
            if (this.f12032c.get() instanceof Activity) {
                this.f12033d.verifyWithAli((Activity) this.f12032c.get(), optString, new C9434c() {
                });
            }
        }
    }
}
