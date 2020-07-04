package com.bytedance.p073ad.symphony;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p254b.C9713b;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2145d;
import com.bytedance.p073ad.symphony.p081e.p082a.C2147f;
import com.bytedance.p073ad.symphony.p083f.C2154c;
import com.bytedance.p073ad.symphony.p083f.C2155d;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.a */
public class C2078a {

    /* renamed from: b */
    public static int f7153b = 5;

    /* renamed from: d */
    private static volatile C2078a f7154d;

    /* renamed from: a */
    public int f7155a;

    /* renamed from: c */
    public Context f7156c;

    /* renamed from: e */
    private int f7157e = 900;

    /* renamed from: f */
    private ScheduledExecutorService f7158f;

    /* renamed from: com.bytedance.ad.symphony.a$a */
    public static class C2080a {

        /* renamed from: a */
        public List<C2142a> f7161a = new ArrayList();

        /* renamed from: b */
        public List<C2142a> f7162b = new ArrayList();

        /* renamed from: c */
        public List<C2142a> f7163c = new ArrayList();

        /* renamed from: d */
        public Map<String, List<String>> f7164d = new HashMap();

        /* renamed from: e */
        public C2145d f7165e;

        /* renamed from: f */
        public C2147f f7166f;
    }

    /* renamed from: d */
    private SharedPreferences m9175d() {
        return C7285c.m22838a(this.f7156c, "new_sp_ad_config", 0);
    }

    /* renamed from: b */
    public final boolean mo7747b() {
        if (this.f7155a <= f7153b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final synchronized ScheduledExecutorService mo7748c() {
        if (this.f7158f == null) {
            this.f7158f = C2094b.m9265a(1, new C9713b("ad-symphony-pool"));
        }
        return this.f7158f;
    }

    /* renamed from: a */
    public final C2080a mo7744a() {
        SharedPreferences d = m9175d();
        if (d == null || m9174a(d)) {
            return null;
        }
        String string = d.getString("config", "");
        if (C6319n.m19593a(string)) {
            return null;
        }
        try {
            return m9172a(new JSONObject(string));
        } catch (Exception unused) {
            return null;
        }
    }

    private C2078a(Context context) {
        this.f7156c = context;
    }

    /* renamed from: a */
    private static boolean m9174a(SharedPreferences sharedPreferences) {
        int i;
        try {
            i = sharedPreferences.getInt("version_code", 0);
        } catch (Exception unused) {
            i = 0;
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C2078a m9173a(Context context) {
        if (f7154d == null) {
            synchronized (C2078a.class) {
                if (f7154d == null) {
                    f7154d = new C2078a(context);
                }
            }
        }
        return f7154d;
    }

    /* renamed from: a */
    public static C2080a m9172a(JSONObject jSONObject) {
        C2080a aVar = new C2080a();
        if (jSONObject != null) {
            aVar.f7161a = C2142a.m9364a(jSONObject.optJSONArray("native_ad_config"), 0);
            aVar.f7162b = C2142a.m9364a(jSONObject.optJSONArray("interstitial_ad_config"), 1);
            aVar.f7163c = C2142a.m9364a(jSONObject.optJSONArray("banner_ad_config"), 2);
            aVar.f7164d = C2142a.m9365a(jSONObject.optJSONArray("placement_type_map_config"));
            aVar.f7165e = C2145d.m9369a(jSONObject.optJSONArray("default_fill_strategy_config"));
            aVar.f7166f = C2147f.m9373a(jSONObject.optJSONObject("symphony_sdk_config"));
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo7745a(final C2154c cVar) {
        mo7748c().scheduleAtFixedRate(new Runnable() {
            public final void run() {
                try {
                    if (!C2078a.this.mo7747b()) {
                        C2078a.this.mo7748c().shutdown();
                        return;
                    }
                    String a = C2155d.m9391a(cVar.mo7835a(), C2078a.this.f7156c);
                    new StringBuilder("setting url:").append(a);
                    JSONObject a2 = cVar.mo7836a(a);
                    if (a2 != null) {
                        C2114c.m9313a().mo7808a(C2078a.m9172a(a2));
                        C2078a.this.mo7746a(a2.toString());
                        C2078a.this.f7155a = 0;
                        return;
                    }
                    C2078a.this.f7155a++;
                } catch (Exception unused) {
                }
            }
        }, 10, (long) this.f7157e, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public final void mo7746a(String str) {
        Editor edit = m9175d().edit();
        edit.clear();
        edit.putString("config", str);
        edit.putInt("version_code", 1);
        edit.apply();
    }
}
