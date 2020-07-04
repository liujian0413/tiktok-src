package com.bytedance.polaris.browser.p635a.p636a;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.polaris.browser.p635a.C12408b;
import com.bytedance.polaris.browser.p635a.C12409c;
import com.bytedance.polaris.depend.C12420a;
import com.bytedance.polaris.depend.C12424e;
import com.bytedance.polaris.depend.C12428i;
import com.bytedance.polaris.p634b.C12361l;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.a.a.b */
public final class C12394b implements C12408b {

    /* renamed from: a */
    private final WeakReference<Activity> f32914a;

    /* renamed from: b */
    private final C12396c f32915b;

    /* renamed from: c */
    private String f32916c;

    /* renamed from: d */
    private String f32917d;

    /* renamed from: e */
    private C12420a f32918e = new C12420a() {
    };

    /* renamed from: a */
    public final void mo30259a() {
        m36037c();
    }

    /* renamed from: b */
    public final void mo30261b() {
    }

    /* renamed from: c */
    private void m36037c() {
        if (!C6319n.m19593a(this.f32916c)) {
            C12424e i = C12428i.m36159i();
            int i2 = 1;
            if (i == null) {
                i2 = 0;
            } else if (C6319n.m19593a(this.f32917d)) {
                boolean b = i.mo30323b();
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", i2);
                this.f32915b.mo30265a(this.f32916c, jSONObject);
            } catch (Exception unused) {
            }
        }
        this.f32916c = null;
        this.f32917d = null;
    }

    public C12394b(WeakReference<Activity> weakReference, C12396c cVar) {
        this.f32914a = weakReference;
        this.f32915b = cVar;
    }

    /* renamed from: a */
    private void m36035a(String str, JSONObject jSONObject) {
        try {
            C12424e i = C12428i.m36159i();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            if (i == null) {
                jSONObject2.put("is_login", -1);
            } else if (i.mo30323b()) {
                jSONObject2.put("is_login", 1);
            } else {
                jSONObject2.put("is_login", 0);
            }
            this.f32915b.mo30265a(str, jSONObject2);
        } catch (Throwable th) {
            C12361l.m35897a(th);
        }
    }

    /* renamed from: b */
    private void m36036b(String str, JSONObject jSONObject) {
        Activity activity;
        if (this.f32914a != null) {
            activity = (Activity) this.f32914a.get();
        } else {
            activity = null;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            String optString = jSONObject.optString("title_type");
            String optString2 = jSONObject.optString("login_source");
            String optString3 = jSONObject.optString("platform");
            if (C6319n.m19593a(optString3)) {
                optString3 = "all";
            }
            C12428i.m36159i().mo30317a(activity2, optString3, optString, optString2, jSONObject, this.f32918e);
            if (!C6319n.m19593a(str)) {
                this.f32916c = str;
                this.f32917d = optString3;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo30260a(C12409c cVar, JSONObject jSONObject) {
        String str = cVar.f32953c;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ("login".equals(str)) {
            m36036b(cVar.f32952b, cVar.f32954d);
        } else if ("is_login".equals(str)) {
            m36035a(cVar.f32952b, cVar.f32954d);
        }
        return false;
    }
}
