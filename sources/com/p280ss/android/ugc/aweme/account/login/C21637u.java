package com.p280ss.android.ugc.aweme.account.login;

import com.p280ss.android.ugc.aweme.account.p950k.C21227b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.u */
public final class C21637u implements C21569n {

    /* renamed from: a */
    private int f58073a;

    /* renamed from: b */
    private int f58074b;

    /* renamed from: c */
    private int f58075c;

    /* renamed from: d */
    private int f58076d;

    /* renamed from: e */
    private int f58077e;

    /* renamed from: f */
    private int f58078f;

    /* renamed from: a */
    public final void mo57757a(boolean z) {
        if (z) {
            this.f58077e++;
        } else {
            this.f58078f++;
        }
    }

    /* renamed from: b */
    public final void mo57853b(boolean z) {
        if (z) {
            this.f58073a++;
        } else {
            this.f58074b++;
        }
    }

    /* renamed from: c */
    public final void mo57854c(boolean z) {
        if (z) {
            this.f58075c++;
        } else {
            this.f58076d++;
        }
    }

    /* renamed from: d */
    public final void mo57855d(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("send_code_success_count", this.f58073a);
            jSONObject.put("send_code_failed_count", this.f58074b);
            jSONObject.put("send_voice_code_success_count", this.f58075c);
            jSONObject.put("send_voice_code_failed_count", this.f58076d);
            jSONObject.put("login_success_count", this.f58077e);
            jSONObject.put("login_failed_count", this.f58078f);
        } catch (Exception e) {
            C6921a.m21554a(e);
            jSONObject = new JSONObject();
        }
        C21227b.m71450a("phone_login_monitor", z ? 1 : 0, jSONObject);
    }
}
