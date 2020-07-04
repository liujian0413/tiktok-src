package com.bytedance.apm.p241f.p242a;

import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.p241f.C6189a;
import com.bytedance.apm.p241f.C6201d;
import com.bytedance.apm.p241f.p243b.C9597a;
import com.bytedance.apm.p253n.C6284b;
import com.bytedance.apm.util.C6291h;
import com.bytedance.apm.util.C6294k;
import com.bytedance.apm.util.C9651o;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.a.c */
public final class C6195c extends C6189a<C9597a> {

    /* renamed from: b */
    public int f18247b;

    /* renamed from: c */
    public boolean f18248c;

    /* renamed from: d */
    private volatile int f18249d;

    /* renamed from: e */
    private volatile List<String> f18250e;

    /* renamed from: f */
    private List<Pattern> f18251f;

    /* renamed from: g */
    private List<String> f18252g;

    /* renamed from: h */
    private List<Pattern> f18253h;

    /* renamed from: i */
    private List<String> f18254i;

    /* renamed from: com.bytedance.apm.f.a.c$a */
    static final class C6197a {

        /* renamed from: a */
        public static final C6195c f18255a = new C6195c();
    }

    /* renamed from: b */
    public static C6195c m19233b() {
        return C6197a.f18255a;
    }

    private C6195c() {
        this.f18248c = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo14924d(C9597a aVar) {
        m19236d(aVar);
    }

    /* renamed from: f */
    private boolean m19239f(String str) {
        return C9651o.m28541a(str, this.f18254i);
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo14920b(C6201d dVar) {
        return m19230a((C9597a) dVar);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo14922c(C6201d dVar) {
        m19234b((C9597a) dVar);
    }

    /* renamed from: a */
    private static boolean m19230a(C9597a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f26230d)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m19237d(String str) {
        return C9651o.m28542a(str, this.f18252g, this.f18253h);
    }

    /* renamed from: e */
    private boolean m19238e(String str) {
        return C9651o.m28542a(str, this.f18250e, this.f18251f);
    }

    /* renamed from: b */
    private static void m19234b(C9597a aVar) {
        try {
            aVar.mo23942a(!m19205a());
            if (C6284b.m19502c()) {
                aVar.mo23943f();
            }
            aVar.mo23941a(aVar.f26227a);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: d */
    private void m19236d(C9597a aVar) {
        String str = aVar.f26230d;
        if (!m19238e(str) && !m19239f(str) && C6294k.m19530b(C6174c.m19129a())) {
            String str2 = aVar.f26227a;
            JSONObject a = aVar.mo14926a();
            C6291h.m19520b(a, aVar.f26234h);
            if (a != null) {
                mo14917a(str2, str2, a, m19231a(aVar.f26227a, str, a), false);
            }
        }
    }

    /* renamed from: a */
    private boolean m19232a(String str, JSONObject jSONObject) {
        int i;
        int i2;
        if (this.f18247b != 0 || m19237d(str)) {
            i = 1;
        } else {
            i = 0;
        }
        boolean b = mo14921b("smart_traffic");
        if (b) {
            i2 = i | 4;
        } else {
            i2 = i;
        }
        try {
            jSONObject.put("hit_rules", i2);
        } catch (JSONException unused) {
        }
        if (i != 0 || b) {
            return true;
        }
        return false;
    }

    public final void onRefresh(JSONObject jSONObject, boolean z) {
        this.f18250e = C9651o.m28540a(jSONObject, "api_black_list");
        this.f18251f = C9651o.m28543b(jSONObject, "api_black_list");
        this.f18252g = C9651o.m28540a(jSONObject, "api_allow_list");
        this.f18253h = C9651o.m28543b(jSONObject, "api_allow_list");
        this.f18247b = jSONObject.optInt("enable_net_stats", 0);
        this.f18248c = jSONObject.optBoolean("enable_hook_net_sample", true);
        this.f18249d = jSONObject.optInt("disable_report_error", 0);
        this.f18254i = C9651o.m28540a(jSONObject, "image_allow_list");
    }

    /* renamed from: a */
    private boolean m19231a(String str, String str2, JSONObject jSONObject) {
        if (TextUtils.equals(str, "api_all")) {
            return m19232a(str2, jSONObject);
        }
        if (!TextUtils.equals(str, "api_error") || this.f18249d != 0) {
            return false;
        }
        return true;
    }
}
