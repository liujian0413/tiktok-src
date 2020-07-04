package com.p280ss.android.ugc.aweme.sdk.p1507a;

import android.content.Context;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.sdk.p899a.C20097a;
import com.p280ss.android.ugc.aweme.sdk.iap.C37334b;
import com.p280ss.android.ugc.aweme.sdk.iap.C37350e.C37352b;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.a.b */
public final class C37309b extends C37308a {

    /* renamed from: e */
    private C37352b f97451e;

    /* renamed from: f */
    private C37313d f97452f;

    /* renamed from: g */
    private C37334b f97453g = new C37334b() {
        /* renamed from: a */
        public final void mo93929a(int i, Exception exc) {
            String str;
            if (i == 2) {
                try {
                    C37309b.this.f97448b.put("code", -1);
                    JSONObject jSONObject = C37309b.this.f97448b;
                    String str2 = "msg";
                    if (exc == null) {
                        str = "";
                    } else {
                        str = exc.getMessage();
                    }
                    jSONObject.put(str2, str);
                } catch (JSONException unused) {
                }
                C37309b.this.f97450d.mo27030a(C37309b.this.f97447a.f30169b, C37309b.this.f97448b);
                C7705c.m23799a().mo20393c((Object) C37309b.this);
            }
        }

        /* renamed from: a */
        public final void mo93930a(int i, Object obj) {
            if (i == 2) {
                try {
                    C37309b.this.f97448b.put("code", 0);
                } catch (JSONException unused) {
                }
                C37309b.this.f97450d.mo27030a(C37309b.this.f97447a.f30169b, C37309b.this.f97448b);
                C7705c.m23799a().mo20393c((Object) C37309b.this);
            }
        }
    };

    @C7709l
    public final void onEvent(C20097a aVar) {
        this.f97451e.mo93984a(aVar.f54357a, aVar.f54358b, aVar.f54359c);
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        if (!C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20389a((Object) this);
        }
        super.call(iVar, jSONObject);
        if (this.f97451e == null) {
            this.f97451e = this.f97452f.mo93931a(this.f97449c, this.f97453g);
        }
        this.f97447a.f30173f = false;
        JSONObject jSONObject2 = this.f97447a.f30171d.getJSONObject("args");
        this.f97451e.mo93985a(jSONObject2.getString("iap_id"), Integer.parseInt(jSONObject2.getString("diamond_id")));
    }

    public C37309b(Context context, C11087a aVar, C37313d dVar) {
        super(context, aVar);
        this.f97452f = dVar;
    }
}
