package com.bytedance.p073ad.symphony.p085h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p481c.C9721b;
import com.bytedance.p073ad.symphony.C2114c;
import com.bytedance.p073ad.symphony.p081e.p082a.C2145d;
import com.bytedance.p073ad.symphony.util.C2199b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.h.b */
public final class C2160b {

    /* renamed from: a */
    public boolean f7335a;

    /* renamed from: b */
    public C2145d f7336b;

    /* renamed from: c */
    private Map<String, C2159a> f7337c = new ConcurrentHashMap();

    /* renamed from: d */
    private Context f7338d;

    /* renamed from: e */
    private long f7339e;

    /* renamed from: f */
    private String f7340f;

    /* renamed from: g */
    private String f7341g;

    /* renamed from: b */
    private SharedPreferences m9424b() {
        return C7285c.m22838a(this.f7338d, this.f7340f, 0);
    }

    /* renamed from: c */
    private C2159a m9426c() {
        C2159a aVar = (C2159a) this.f7337c.get("debug_strategy");
        if (aVar == null) {
            aVar = m9425b("debug_strategy");
        }
        if (aVar == null) {
            return C2159a.f7326a;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo7854a() {
        Editor edit = m9424b().edit();
        for (String str : this.f7337c.keySet()) {
            C2159a aVar = (C2159a) this.f7337c.get(str);
            if (aVar != null) {
                String a = aVar.mo7847a();
                if (a != null) {
                    edit.putString(str, a);
                }
            }
        }
        edit.putInt("key_version", 1);
        C9721b.m28656a(edit);
    }

    /* renamed from: c */
    private static String m9427c(String str) {
        if (C6319n.m19593a(str) || str.length() < 2) {
            return "";
        }
        return str.substring(0, str.length() - 2);
    }

    /* renamed from: a */
    public final C2159a mo7853a(String str) {
        if (C6319n.m19593a(str)) {
            return C2159a.f7326a;
        }
        if (this.f7335a && C2114c.m9317b()) {
            return m9426c();
        }
        C2159a aVar = (C2159a) this.f7337c.get(str);
        if (aVar == null) {
            aVar = m9425b(str);
        }
        if (aVar == null) {
            return C2159a.f7326a;
        }
        return aVar;
    }

    /* renamed from: b */
    private C2159a m9425b(String str) {
        String str2;
        boolean z = true;
        if (m9424b().getInt("key_version", 0) != 1) {
            z = false;
        }
        JSONObject jSONObject = null;
        if (z) {
            str2 = m9424b().getString(str, null);
        } else {
            str2 = null;
        }
        if (C6319n.m19593a(str2)) {
            if (this.f7336b == null || this.f7336b.mo7828a(m9427c(str)) == null) {
                str2 = this.f7341g;
            } else {
                str2 = this.f7336b.mo7828a(m9427c(str));
            }
        }
        StringBuilder sb = new StringBuilder("placement-->");
        sb.append(str);
        sb.append(", strategy-->");
        sb.append(str2);
        try {
            jSONObject = new JSONObject(str2);
        } catch (Exception unused) {
        }
        C2159a a = C2159a.m9417a(jSONObject);
        if (a != null) {
            this.f7337c.put(str, a);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo7855a(String str, C2159a aVar) {
        if (!C6319n.m19593a(str)) {
            this.f7337c.put(str, aVar);
            if (System.currentTimeMillis() - this.f7339e > 120000) {
                C2199b.m9504a((Runnable) new Runnable() {
                    public final void run() {
                        C2160b.this.mo7854a();
                    }
                });
                this.f7339e = System.currentTimeMillis();
            }
        }
    }

    public C2160b(Context context, String str, String str2) {
        this.f7338d = context.getApplicationContext();
        this.f7340f = str;
        this.f7341g = str2;
    }
}
