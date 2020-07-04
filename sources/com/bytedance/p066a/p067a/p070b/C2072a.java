package com.bytedance.p066a.p067a.p070b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p241f.C6201d;
import com.bytedance.apm.p241f.C6202e;
import com.bytedance.apm.p241f.p242a.C6192b;
import com.bytedance.apm.p241f.p243b.C9597a;
import com.bytedance.apm.p245h.C9605d;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.p252m.C6273b.C6276b;
import com.bytedance.apm.util.C6294k;
import com.bytedance.apm.util.C9651o;
import com.bytedance.framwork.core.p523b.C10233a;
import com.bytedance.news.common.service.manager.C6446c;
import com.bytedance.services.slardar.config.C6480a;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.bytedance.a.a.b.a */
public final class C2072a implements C6276b, C6480a {

    /* renamed from: a */
    public final HashMap<String, C9605d> f7138a;

    /* renamed from: b */
    private boolean f7139b;

    /* renamed from: c */
    private long f7140c;

    /* renamed from: d */
    private volatile List<String> f7141d;

    /* renamed from: e */
    private volatile boolean f7142e;

    /* renamed from: f */
    private volatile long f7143f;

    /* renamed from: com.bytedance.a.a.b.a$a */
    static class C2075a {

        /* renamed from: a */
        public static final C2072a f7151a = new C2072a();
    }

    /* renamed from: b */
    public static C2072a m9150b() {
        return C2075a.f7151a;
    }

    public final void onReady() {
        this.f7142e = true;
    }

    private C2072a() {
        this.f7140c = 120000;
        this.f7138a = new HashMap<>();
    }

    /* renamed from: a */
    public final void mo7730a() {
        C6273b.m19475a().mo15065a((C6276b) this);
        ((IConfigManager) C6446c.m20127a(IConfigManager.class)).registerConfigListener(this);
    }

    /* renamed from: a */
    public final void mo7731a(long j) {
        m9151b(j);
    }

    /* renamed from: a */
    private boolean m9149a(String str) {
        if (!this.f7142e || C10233a.m30356a(this.f7141d) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String host = Uri.parse(str).getHost();
            for (String equalsIgnoreCase : this.f7141d) {
                if (host.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: b */
    private void m9151b(long j) {
        if (this.f7143f == 0) {
            this.f7143f = j;
            return;
        }
        if (j - this.f7143f > this.f7140c) {
            this.f7143f = j;
            C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        HashMap hashMap = new HashMap();
                        synchronized (C2072a.this.f7138a) {
                            hashMap.putAll(C2072a.this.f7138a);
                            C2072a.this.f7138a.clear();
                        }
                        if (!hashMap.isEmpty()) {
                            for (Entry value : hashMap.entrySet()) {
                                C2072a.m9148a((C9605d) value.getValue());
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m9148a(C9605d dVar) {
        if (dVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("log_type", "image_monitor");
                jSONObject.put("uri", dVar.f26274a);
                jSONObject.put("count", dVar.f26280g);
                jSONObject.put("ip", dVar.f26276c);
                jSONObject.put("status", dVar.f26275b);
                jSONObject.put("duration", dVar.f26278e);
                jSONObject.put("timestamp", dVar.f26277d);
                jSONObject.put("network_type", C6294k.m19531c(C6174c.m19129a()).getValue());
                jSONObject.put("sid", C6174c.m19147e());
                String b = C6174c.m19153k().mo14886b();
                if (!TextUtils.isEmpty(b)) {
                    jSONObject.put("session_id", b);
                }
                if (dVar.f26279f != null) {
                    jSONObject.put("extra", dVar.f26279f);
                }
                C6202e.m19259a().mo14932a("image_monitor", "image_monitor", jSONObject, ApmDelegate.getInstance().getLogTypeSwitch("image_monitor"), false);
            } catch (Throwable unused) {
            }
        }
    }

    public final void onRefresh(JSONObject jSONObject, boolean z) {
        this.f7139b = jSONObject.optBoolean("pic_sla_switch", false);
        long optLong = jSONObject.optLong("image_sample_interval", -1);
        if (optLong > 0) {
            this.f7140c = optLong * 1000;
        }
        this.f7141d = C9651o.m28540a(jSONObject, "image_allow_list");
    }

    /* renamed from: b */
    public final void mo7733b(String str, int i, String str2, long j, JSONObject jSONObject) {
        C6273b a = C6273b.m19475a();
        final String str3 = str;
        final int i2 = i;
        final String str4 = str2;
        final long j2 = j;
        final JSONObject jSONObject2 = jSONObject;
        C20731 r1 = new Runnable() {
            public final void run() {
                C2072a.this.mo7732a(str3, i2, str4, j2, jSONObject2);
            }
        };
        a.mo15066a((Runnable) r1);
    }

    /* renamed from: a */
    public final void mo7732a(String str, int i, String str2, long j, JSONObject jSONObject) {
        long optLong;
        JSONObject jSONObject2 = jSONObject;
        try {
            if (this.f7139b) {
                if (jSONObject2 == null) {
                    optLong = 0;
                } else {
                    optLong = jSONObject2.optLong("requestStart");
                }
                C9597a aVar = new C9597a("api_all", j, optLong, str, str2, "", i, jSONObject);
                C6192b.m19221b().mo14915a((C6201d) aVar);
            }
            if (m9149a(str)) {
                Uri parse = Uri.parse(str);
                String host = parse.getHost();
                String scheme = parse.getScheme();
                StringBuilder sb = new StringBuilder();
                sb.append(scheme);
                sb.append(host);
                sb.append(i);
                String sb2 = sb.toString();
                synchronized (this.f7138a) {
                    C9605d dVar = (C9605d) this.f7138a.get(sb2);
                    if (dVar == null) {
                        C9605d dVar2 = new C9605d(str, i, str2, System.currentTimeMillis(), j, jSONObject);
                        this.f7138a.put(sb2, dVar2);
                    } else {
                        dVar.f26278e += j;
                        dVar.f26280g++;
                        if (!TextUtils.isEmpty(str2)) {
                            dVar.f26276c = str2;
                        }
                        dVar.f26274a = str;
                        dVar.f26277d = System.currentTimeMillis();
                        dVar.f26279f = jSONObject2;
                    }
                }
                m9151b(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }
}
