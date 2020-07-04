package com.p280ss.android.sdk.webview.p901b;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.sdk.webview.p900a.C20126b;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.b.d */
public final class C20132d implements C11093e {

    /* renamed from: a */
    private String f54508a;

    /* renamed from: b */
    private String f54509b;

    /* renamed from: c */
    private C11087a f54510c;

    /* renamed from: d */
    private Activity f54511d;

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
    }

    /* renamed from: a */
    public final void mo53891a() {
        if (!TextUtils.isEmpty(this.f54509b)) {
            int i = 1;
            if (!TextUtils.isEmpty(this.f54508a) ? !C20126b.m66361a().isPlatformBinded(this.f54508a) : !C20126b.m66361a().hasPlatformBinded() && !C20126b.m66361a().isPlatformBinded(C20126b.m66361a().getPlayNameMobile())) {
                i = 0;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", i);
                if (this.f54510c != null) {
                    this.f54510c.mo27030a(this.f54509b, jSONObject);
                }
            } catch (Exception unused) {
            }
        }
        this.f54509b = null;
        this.f54508a = null;
    }

    public C20132d(C11087a aVar, Activity activity) {
        this.f54510c = aVar;
        this.f54511d = activity;
    }
}
