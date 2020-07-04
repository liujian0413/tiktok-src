package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.miniapp_api.C33445e;
import com.p280ss.android.ugc.aweme.miniapp_api.model.event.MpCommonEvent.C33461a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.i */
public final class C43510i implements C11093e {

    /* renamed from: a */
    protected WeakReference<Context> f112667a;

    public C43510i(WeakReference<Context> weakReference) {
        this.f112667a = weakReference;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        if ((((Context) this.f112667a.get()) instanceof CrossPlatformActivity) && iVar.f30171d != null) {
            int optInt = iVar.f30171d.optInt("status");
            C33445e.m108183a().f87289g = new C33461a().mo85770a(optInt).mo85771a("game_pay").mo85774b(jSONObject.optString("msg")).mo85773a();
        }
    }
}
