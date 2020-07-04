package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.webkit.WebView;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PlayableBusiness */
public class PlayableBusiness extends Business {

    /* renamed from: a */
    private C11087a f68363a;

    /* renamed from: b */
    private boolean f68364b;

    /* renamed from: c */
    public final void mo67203c() {
        this.f68364b = false;
        m85045a(false, true);
    }

    /* renamed from: d */
    public final void mo67204d() {
        this.f68364b = true;
        m85045a(true, false);
    }

    /* renamed from: a */
    public final void mo67200a() {
        if (!this.f68364b) {
            m85045a(false, true);
        }
    }

    /* renamed from: b */
    public final void mo67202b() {
        if (!this.f68364b) {
            m85045a(true, false);
        }
    }

    public PlayableBusiness(C25856c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    private void m85045a(boolean z, boolean z2) {
        if (this.f68330i.f68474b.f68469x == 1 && this.f68363a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_mute", z);
                jSONObject.put("endcard_show", z2);
                this.f68363a.mo27034b("endcard_control_event", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo67201a(WebView webView, String str, C11087a aVar) {
        this.f68363a = aVar;
        m85045a(false, true);
    }
}
