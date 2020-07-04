package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ai */
public final class C43497ai implements C11093e {

    /* renamed from: a */
    WeakReference<Context> f112640a;

    /* renamed from: b */
    C11087a f112641b;

    /* renamed from: a */
    private static boolean m137976a() {
        if (!TimeLockRuler.isContentFilterOn() || (!C6399b.m19944t() && C7213d.m22500a().mo18769ag() != 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m137975a(C11097i iVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isTeenagersModel", m137976a() ? 1 : 0);
            jSONObject.put("language", C32326h.m104885g());
        } catch (JSONException unused) {
        }
        if (this.f112641b != null) {
            this.f112641b.mo27030a(iVar.f30169b, jSONObject);
        }
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        m137975a(iVar);
    }

    public C43497ai(WeakReference<Context> weakReference, C11087a aVar) {
        this.f112640a = weakReference;
        this.f112641b = aVar;
    }
}
