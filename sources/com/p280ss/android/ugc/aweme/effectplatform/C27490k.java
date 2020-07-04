package com.p280ss.android.ugc.aweme.effectplatform;

import com.google.common.base.C17454q;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.k */
public final class C27490k implements C43757g {

    /* renamed from: a */
    private C43757g f72515a;

    /* renamed from: b */
    private C17454q f72516b = C17454q.m58004b();

    /* renamed from: c */
    private String f72517c;

    /* renamed from: a */
    private static JSONObject m90119a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public final void mo9274a(C43726c cVar) {
        String str;
        int i;
        if (cVar == null) {
            i = -2;
            str = "unknow error";
        } else {
            i = cVar.f113220a;
            str = cVar.f113221b;
        }
        C6893q.m21444a("sticker_list_error_rate", 1, new C38510bb().mo96479a("errorCode", Integer.valueOf(i)).mo96481a("errorDesc", str).mo96481a("panel", this.f72517c).mo96482b());
        JSONObject b = new C38510bb().mo96479a("error_code", Integer.valueOf(i)).mo96481a("error_msg", str).mo96481a("panel_type", this.f72517c).mo96482b();
        C6893q.m21445a("ttlive_load_sticker_list_all", 1, null, m90119a(b));
        C6893q.m21444a("ttlive_load_sticker_list_error", 1, b);
        if (this.f72515a != null) {
            this.f72515a.mo9274a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo9275a(EffectChannelResponse effectChannelResponse) {
        JSONObject b = new C38510bb().mo96480a("duration", Long.valueOf(this.f72516b.mo44941a(TimeUnit.MILLISECONDS))).mo96481a("panel", this.f72517c).mo96482b();
        C6893q.m21444a("sticker_list_error_rate", 0, b);
        C6893q.m21445a("ttlive_load_sticker_list_all", 0, b, m90119a(new C38510bb().mo96481a("panel_type", this.f72517c).mo96482b()));
        if (this.f72515a != null) {
            this.f72515a.mo9275a(effectChannelResponse);
        }
    }

    /* renamed from: a */
    public static C27490k m90118a(String str, C43757g gVar) {
        return new C27490k(str, gVar);
    }

    private C27490k(String str, C43757g gVar) {
        this.f72515a = gVar;
        this.f72517c = str;
    }
}
