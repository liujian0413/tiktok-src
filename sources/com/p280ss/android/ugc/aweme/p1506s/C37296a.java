package com.p280ss.android.ugc.aweme.p1506s;

import android.os.Build.VERSION;
import com.bytedance.dataplatform.p507a.C10034a;
import com.bytedance.gcsuppression.GcSuppression;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.s.a */
public final class C37296a {
    /* renamed from: a */
    public static void m119783a() {
        if (VERSION.SDK_INT <= 19) {
            C7258h.m22731d().execute(C37297b.f97425a);
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m119786b() {
        if (C10034a.m29822e(true).booleanValue()) {
            GcSuppression.m30429a().mo24993a(C6399b.m19921a(), false, 90, C7258h.m22733f(), C7258h.m22731d(), C37298c.f97426a);
            GcSuppression.m30429a().mo24994b();
        }
    }

    /* renamed from: a */
    private static void m119784a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gcsuppression_exec_result", i);
        } catch (Throwable unused) {
        }
        C6893q.m21452b("service_monitor", "aweme_gcsuppression_report", jSONObject);
    }

    /* renamed from: a */
    static final /* synthetic */ void m119785a(int i, boolean z, boolean z2) {
        if (z || z2) {
            m119784a(i);
        }
    }
}
