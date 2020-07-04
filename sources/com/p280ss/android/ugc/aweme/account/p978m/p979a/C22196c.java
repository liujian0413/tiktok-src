package com.p280ss.android.ugc.aweme.account.p978m.p979a;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12713h;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12859t;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment.C21823a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment.C21824b;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.m.a.c */
public final class C22196c implements C11093e, C21823a, C21824b {

    /* renamed from: a */
    protected WeakReference<Context> f59282a;

    /* renamed from: b */
    public boolean f59283b;

    /* renamed from: c */
    private C11087a f59284c;

    /* renamed from: d */
    private InputCaptchaFragment f59285d;

    /* renamed from: e */
    private C12859t f59286e;

    /* renamed from: f */
    private String f59287f;

    /* renamed from: g */
    private C11097i f59288g;

    /* renamed from: a */
    public final void mo57346a() {
    }

    /* renamed from: b */
    public final void mo58201b() {
        mo58547a(this.f59288g, false);
    }

    /* renamed from: a */
    private void m73636a(String str) {
        C12798d.m37186a(C21671bd.m72532b()).mo31181a(this.f59287f, 23, false, this.f59286e);
    }

    public C22196c(WeakReference<Context> weakReference, C11087a aVar) {
        this.f59282a = weakReference;
        this.f59284c = aVar;
    }

    /* renamed from: a */
    public final void mo57347a(String str, int i) {
        this.f59285d.dismiss();
        m73636a(str);
    }

    /* renamed from: a */
    public final void mo58547a(C11097i iVar, boolean z) {
        if (iVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", z ? 1 : 0);
            } catch (JSONException unused) {
            }
            this.f59284c.mo27030a(iVar.f30169b, jSONObject);
        }
    }

    public final void call(final C11097i iVar, JSONObject jSONObject) throws Exception {
        if (this.f59282a.get() != null) {
            this.f59288g = iVar;
            this.f59288g.f30173f = false;
            this.f59287f = iVar.f30171d.getString("code");
            try {
                this.f59283b = iVar.f30171d.getBoolean("ignoreErrorToast");
            } catch (JSONException unused) {
            }
            this.f59286e = new C12859t() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(C12713h hVar) {
                    C22196c.this.mo58547a(iVar, true);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onError(C12713h hVar, int i) {
                    if (C22196c.this.f59282a != null && !C22196c.this.f59283b) {
                        C10761a.m31403c((Context) C22196c.this.f59282a.get(), C22338o.m73945a((C12707b) hVar)).mo25750a();
                    }
                    C22196c.this.mo58547a(iVar, false);
                }
            };
            m73636a("");
        }
    }
}
