package com.bytedance.android.livesdk.browser.jsbridge.p201c;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.host.C9467i;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.h */
public final class C4055h implements C11093e {

    /* renamed from: a */
    private final WeakReference<Context> f12045a;

    public C4055h(WeakReference<Context> weakReference) {
        this.f12045a = weakReference;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        if (this.f12045a.get() instanceof Activity) {
            TTLiveSDKContext.getHostService().mo22362c().startBindPhoneDialogFragment((Activity) this.f12045a.get(), "", "", new C9467i() {
            });
            jSONObject.put("code", 1);
            return;
        }
        jSONObject.put("code", 0);
    }
}
