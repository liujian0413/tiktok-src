package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36442dz;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.af */
public final class C43494af implements C11093e {

    /* renamed from: a */
    C11087a f112636a;

    /* renamed from: b */
    WeakReference<Context> f112637b;

    public C43494af(C11087a aVar, WeakReference<Context> weakReference) {
        this.f112636a = aVar;
        this.f112637b = weakReference;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        iVar.f30173f = false;
        C36442dz dzVar = new C36442dz(C6405d.m19984g());
        dzVar.mo92514a();
        dzVar.f95624f = new C43495ag(this, iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo105418a(C11097i iVar, boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            try {
                jSONObject.put("code", 0);
            } catch (JSONException unused) {
                return;
            }
        } else {
            jSONObject.put("code", 1);
            jSONObject.put("location", str);
        }
        this.f112636a.mo27030a(iVar.f30169b, jSONObject);
    }
}
