package com.bytedance.android.livesdk.browser.jsbridge.p201c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.verify.model.C9110b;
import com.bytedance.ies.web.jsbridge2.C11176q;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.m */
public final class C4061m implements C11093e {

    /* renamed from: a */
    private C4062a f12050a;

    /* renamed from: b */
    private C11176q f12051b;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.m$a */
    public interface C4062a {
        /* renamed from: a */
        void mo11667a(C9110b bVar);
    }

    /* renamed from: a */
    public final void mo11666a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
        } catch (JSONException unused) {
        }
        this.f12051b.mo27213a("H5_zmCertStatus", jSONObject);
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = iVar.f30171d;
        if (jSONObject2 != null && !TextUtils.isEmpty(jSONObject2.getString("url"))) {
            iVar.f30173f = false;
            C9110b bVar = new C9110b();
            bVar.f24800a = jSONObject2.optString("transactionId", "");
            bVar.f24801b = jSONObject2.optString("url", "");
            bVar.f24802c = jSONObject2.optString("zhimaToken", "");
            if (this.f12050a != null) {
                this.f12050a.mo11667a(bVar);
            }
        }
    }

    public C4061m(Context context, C4062a aVar, C11176q qVar) {
        this.f12050a = aVar;
        this.f12051b = qVar;
    }
}
