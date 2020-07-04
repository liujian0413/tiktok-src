package com.bytedance.apm.p241f.p242a;

import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.p241f.C6189a;
import com.bytedance.apm.p241f.C6201d;
import com.bytedance.apm.p241f.p243b.C9597a;
import com.bytedance.apm.util.C6291h;
import com.bytedance.apm.util.C6294k;
import com.bytedance.apm.util.C9651o;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.a.b */
public final class C6192b extends C6189a<C9597a> {

    /* renamed from: b */
    private volatile List<String> f18242b;

    /* renamed from: c */
    private volatile List<Pattern> f18243c;

    /* renamed from: d */
    private volatile List<String> f18244d;

    /* renamed from: e */
    private volatile List<Pattern> f18245e;

    /* renamed from: com.bytedance.apm.f.a.b$a */
    static class C6194a {

        /* renamed from: a */
        public static final C6192b f18246a = new C6192b();
    }

    private C6192b() {
    }

    /* renamed from: b */
    public static C6192b m19221b() {
        return C6194a.f18246a;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo14924d(C9597a aVar) {
        m19224d(aVar);
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo14920b(C6201d dVar) {
        return m19220a((C9597a) dVar);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo14922c(C6201d dVar) {
        m19222b((C9597a) dVar);
    }

    /* renamed from: a */
    private static boolean m19220a(C9597a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f26230d)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static void m19222b(C9597a aVar) {
        try {
            aVar.mo23942a(!m19205a());
            aVar.mo23941a("image_monitor");
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private boolean m19225d(String str) {
        return C9651o.m28542a(str, this.f18242b, this.f18243c);
    }

    /* renamed from: e */
    private boolean m19226e(String str) {
        return C9651o.m28542a(str, this.f18244d, this.f18245e);
    }

    /* renamed from: d */
    private void m19224d(C9597a aVar) {
        boolean z;
        int i;
        String str = aVar.f26230d;
        if (!m19225d(str) && C6294k.m19530b(C6174c.m19129a())) {
            JSONObject a = aVar.mo14926a();
            C6291h.m19520b(a, aVar.f26234h);
            if (a != null) {
                try {
                    a.put("net_consume_type", "image_monitor");
                } catch (JSONException unused) {
                }
                boolean e = m19226e(str);
                boolean z2 = true;
                if (e || mo14918a("image_sla_switch")) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
                boolean b = mo14921b("smart_traffic");
                if (b) {
                    i |= 4;
                }
                try {
                    a.put("hit_rules", i);
                } catch (JSONException unused2) {
                }
                String str2 = "api_all";
                String str3 = "api_all";
                if (!z && !b) {
                    z2 = false;
                }
                mo14917a(str2, str3, a, z2, false);
            }
        }
    }

    public final void onRefresh(JSONObject jSONObject, boolean z) {
        super.onRefresh(jSONObject, z);
        this.f18242b = C9651o.m28540a(jSONObject, "api_black_list");
        this.f18243c = C9651o.m28543b(jSONObject, "api_black_list");
        this.f18244d = C9651o.m28540a(jSONObject, "api_allow_list");
        this.f18245e = C9651o.m28543b(jSONObject, "api_allow_list");
    }
}
