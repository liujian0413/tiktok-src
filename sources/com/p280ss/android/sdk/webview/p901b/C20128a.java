package com.p280ss.android.sdk.webview.p901b;

import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.b.a */
public final class C20128a implements C11093e {

    /* renamed from: a */
    private C20129a f54505a;

    /* renamed from: com.ss.android.sdk.webview.b.a$a */
    public interface C20129a {
        /* renamed from: a */
        void mo53871a(JSONObject jSONObject) throws Exception;
    }

    public C20128a(C20129a aVar) {
        this.f54505a = aVar;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        if (this.f54505a != null) {
            this.f54505a.mo53871a(jSONObject);
        }
    }
}
