package com.p280ss.android.ugc.aweme.sec;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.sec.C37406c.C37407a;
import com.p280ss.android.ugc.aweme.secapi.C37420a;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sec.f */
public class C37412f<T> extends C37407a<T> {

    /* renamed from: c */
    public boolean f97702c;

    /* renamed from: d */
    public boolean f97703d;

    /* renamed from: e */
    public final Object f97704e = new Object();

    /* renamed from: f */
    public JSONObject f97705f;

    /* renamed from: a */
    public T mo83512a() {
        if (this.f97697b == null) {
            return null;
        }
        return this.f97697b.mo83512a();
    }

    /* renamed from: b */
    public T mo83513b() throws Exception {
        if (this.f97697b == null) {
            return null;
        }
        return this.f97697b.mo83513b();
    }

    /* renamed from: c */
    public final T mo94175c() throws Exception {
        if (this.f97702c) {
            return mo83513b();
        }
        return mo83512a();
    }

    /* renamed from: a */
    private static boolean m120039a(JSONObject jSONObject) {
        if ((jSONObject == null || !jSONObject.has("status_code") || jSONObject.optInt("status_code") != 0) && (jSONObject == null || !jSONObject.has("message") || !TextUtils.equals("success", jSONObject.optString("message")))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo94177a(int i) throws InterruptedException {
        Activity g = C6405d.m19984g();
        if (g == null || !((ISecApi) ServiceManager.get().getService(ISecApi.class)).needVerifyImage(i)) {
            return false;
        }
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).popCaptcha(g, i, new C37420a() {
            /* renamed from: a */
            public final void mo80302a(boolean z, String str) {
                C37412f.this.f97702c = z;
                C37412f.this.f97703d = true;
                synchronized (C37412f.this.f97704e) {
                    C37412f.this.f97704e.notifyAll();
                }
            }
        });
        synchronized (this.f97704e) {
            int i2 = 4;
            while (!this.f97703d) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                this.f97704e.wait(50000);
                i2 = i3;
            }
            this.f97704e.notifyAll();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo94178a(String str, JSONObject jSONObject) throws InterruptedException, IOException, JSONException {
        int i;
        this.f97705f = jSONObject;
        if (m120039a(jSONObject)) {
            return false;
        }
        if (jSONObject.has("error_code")) {
            i = jSONObject.optInt("error_code");
        } else if (jSONObject.has("status_code")) {
            i = jSONObject.optInt("status_code");
        } else if (!((ISecApi) ServiceManager.get().getService(ISecApi.class)).isCaptchaUrl(str)) {
            return false;
        } else {
            new C37410d();
            i = C37410d.m120036a(str, jSONObject);
        }
        return mo94177a(i);
    }
}
