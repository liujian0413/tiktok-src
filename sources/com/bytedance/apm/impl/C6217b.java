package com.bytedance.apm.impl;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.core.C6178c;
import com.bytedance.apm.core.C9593d;
import com.bytedance.apm.p252m.C6273b.C6276b;
import com.bytedance.apm.p468e.C9596a;
import com.bytedance.apm.util.C6291h;
import com.bytedance.apm.util.C6292i;
import com.bytedance.apm.util.C6294k;
import com.bytedance.apm.util.C6296u;
import com.bytedance.framwork.core.monitor.MonitorNetUtil;
import com.bytedance.services.apm.api.C6477b;
import com.bytedance.services.slardar.config.C6480a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.impl.b */
public final class C6217b implements C6276b {

    /* renamed from: a */
    public volatile boolean f18306a;

    /* renamed from: b */
    private volatile boolean f18307b = true;

    /* renamed from: c */
    private volatile JSONObject f18308c;

    /* renamed from: d */
    private volatile JSONObject f18309d;

    /* renamed from: e */
    private volatile JSONObject f18310e;

    /* renamed from: f */
    private List<String> f18311f = C9596a.f26218a;

    /* renamed from: g */
    private volatile long f18312g = 1200;

    /* renamed from: h */
    private SharedPreferences f18313h;

    /* renamed from: i */
    private C6178c f18314i;

    /* renamed from: j */
    private JSONObject f18315j;

    /* renamed from: k */
    private boolean f18316k;

    /* renamed from: l */
    private long f18317l = -1;

    /* renamed from: m */
    private long f18318m = -1;

    /* renamed from: n */
    private long f18319n = -1;

    /* renamed from: o */
    private int f18320o;

    /* renamed from: p */
    private List<C6480a> f18321p;

    /* renamed from: com.bytedance.apm.impl.b$a */
    static class C6218a {

        /* renamed from: a */
        private String f18322a;

        /* renamed from: b */
        private Map<String, String> f18323b = new HashMap();

        /* renamed from: a */
        private void m19318a() {
            this.f18322a = MonitorNetUtil.m19813a(this.f18322a, null);
        }

        /* renamed from: b */
        private void m19319b() {
            this.f18323b.put("Content-Type", "application/json; charset=utf-8");
        }

        C6218a(String str) {
            this.f18322a = str;
        }

        /* renamed from: b */
        private void m19320b(Map<String, String> map) {
            this.f18322a = C6296u.m19536a(this.f18322a, map);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C9610a mo14982a(Map<String, String> map) throws Exception {
            m19320b(map);
            m19318a();
            m19319b();
            return new C9610a(this.f18322a, this.f18323b);
        }
    }

    /* renamed from: a */
    public final boolean mo14974a(String str) {
        if (this.f18308c == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(str, "block_monitor")) {
            str = "caton_monitor";
        }
        if (this.f18308c.opt(str) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14973a(C6480a aVar) {
        if (aVar != null) {
            if (this.f18321p == null) {
                this.f18321p = new CopyOnWriteArrayList();
            }
            if (!this.f18321p.contains(aVar)) {
                this.f18321p.add(aVar);
            }
            if (this.f18306a) {
                aVar.onRefresh(this.f18315j, this.f18316k);
                aVar.onReady();
            }
        }
    }

    /* renamed from: c */
    private long m19303c() {
        return this.f18313h.getLong("monitor_configure_refresh_time", 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo14975b() {
        return this.f18313h.getString("monitor_net_config", "");
    }

    C6217b() {
    }

    /* renamed from: d */
    private void m19304d() {
        if (!this.f18306a) {
            this.f18306a = true;
            if (this.f18321p != null) {
                for (C6480a onReady : this.f18321p) {
                    onReady.onReady();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14971a() {
        /*
            r7 = this;
            java.lang.String r0 = r7.mo14975b()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0035
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x002f }
            r1.<init>(r0)     // Catch:{ Exception -> 0x002f }
            r7.f18316k = r3     // Catch:{ Exception -> 0x002f }
            android.content.SharedPreferences r0 = r7.f18313h     // Catch:{ Exception -> 0x002f }
            java.lang.String r4 = "monitor_net_config_id"
            r5 = -1
            long r4 = r0.getLong(r4, r5)     // Catch:{ Exception -> 0x002f }
            r7.f18317l = r4     // Catch:{ Exception -> 0x002f }
            long r4 = r7.m19303c()     // Catch:{ Exception -> 0x002f }
            r7.f18318m = r4     // Catch:{ Exception -> 0x002f }
            r7.m19297a(r1)     // Catch:{ Exception -> 0x002f }
            r7.m19298a(r1, r3)     // Catch:{ Exception -> 0x002f }
            r7.m19304d()     // Catch:{ Exception -> 0x002f }
            goto L_0x0036
        L_0x002f:
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.String r1 = "配置信息读取失败"
            r0[r2] = r1
        L_0x0035:
            r2 = 1
        L_0x0036:
            boolean r0 = com.bytedance.apm.C6174c.m19145c()
            if (r0 == 0) goto L_0x0051
            long r0 = r7.f18318m
            long r4 = java.lang.System.currentTimeMillis()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0047
            r2 = 1
        L_0x0047:
            r7.m19299a(r2)
            com.bytedance.apm.m.b r0 = com.bytedance.apm.p252m.C6273b.m19475a()
            r0.mo15065a(r7)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.impl.C6217b.mo14971a():void");
    }

    /* renamed from: a */
    public final void mo7731a(long j) {
        m19299a(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14977b(C6480a aVar) {
        if (!(aVar == null || this.f18321p == null)) {
            this.f18321p.remove(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo14979c(String str) {
        if (this.f18310e == null || TextUtils.isEmpty(str) || this.f18310e.opt(str) == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo14980d(String str) {
        if (TextUtils.isEmpty(str) || this.f18315j == null) {
            return false;
        }
        return this.f18315j.optBoolean(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final JSONObject mo14981e(String str) {
        if (TextUtils.isEmpty(str) || this.f18315j == null) {
            return new JSONObject();
        }
        return this.f18315j.optJSONObject(str);
    }

    /* renamed from: a */
    private boolean m19300a(C6477b bVar) throws JSONException {
        if (bVar != null && bVar.f18797a == 200) {
            byte[] bArr = bVar.f18798b;
            if (bArr != null) {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                this.f18316k = false;
                this.f18317l = jSONObject.optLong("id");
                this.f18318m = System.currentTimeMillis();
                m19297a(optJSONObject);
                m19298a(optJSONObject, false);
                m19304d();
                m19301b(jSONObject);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m19301b(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            long optLong = jSONObject.optLong("id");
            String optString = jSONObject.optString("name");
            Editor edit = this.f18313h.edit();
            edit.putString("monitor_net_config", optJSONObject.toString());
            edit.putLong("monitor_net_config_id", optLong);
            edit.putString("monitor_net_config_name", optString);
            edit.putLong("monitor_configure_refresh_time", this.f18318m);
            edit.commit();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m19297a(JSONObject jSONObject) {
        if (!C6291h.m19522b(jSONObject)) {
            this.f18307b = jSONObject.optBoolean("monitor_encrypt_switch", true);
            this.f18308c = jSONObject.optJSONObject("allow_log_type");
            this.f18309d = jSONObject.optJSONObject("allow_metric_type");
            this.f18310e = jSONObject.optJSONObject("allow_service_name");
            this.f18312g = jSONObject.optLong("fetch_setting_interval", 1200);
            if (this.f18312g < 600) {
                this.f18312g = 600;
            }
            this.f18315j = jSONObject;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f18317l);
            C6174c.m19140a("config_id", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f18318m);
            C6174c.m19140a("config_time", sb2.toString());
        }
    }

    /* renamed from: b */
    private boolean m19302b(long j) {
        if (this.f18320o > 0) {
            if (j - this.f18319n > Math.max(((long) (this.f18320o * 5)) * 60000, 1200000)) {
                return true;
            }
            return false;
        } else if (j - this.f18318m > this.f18312g * 1000) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private void m19299a(boolean z) {
        boolean z2;
        if (z || m19302b(System.currentTimeMillis())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && C6294k.m19530b(C6174c.m19129a()) && this.f18314i != null && this.f18314i.mo14888a() != null && !this.f18314i.mo14888a().isEmpty()) {
            this.f18319n = System.currentTimeMillis();
            Iterator it = this.f18311f.iterator();
            boolean z3 = false;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    C9610a a = new C6218a((String) it.next()).mo14982a(this.f18314i.mo14888a());
                    boolean a2 = m19300a(C6174c.m19130a(a.f26302a, a.f26303b));
                    if (a2) {
                        z3 = a2;
                        break;
                    }
                    z3 = a2;
                } catch (Throwable unused) {
                }
            }
            if (z3) {
                this.f18320o = 0;
            } else {
                this.f18320o++;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo14978b(String str) {
        if (this.f18309d == null || TextUtils.isEmpty(str) || this.f18309d.opt(str) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m19298a(JSONObject jSONObject, boolean z) {
        if (this.f18321p != null) {
            for (C6480a onRefresh : this.f18321p) {
                onRefresh.onRefresh(jSONObject, z);
            }
        }
    }

    /* renamed from: b */
    public final void mo14976b(C6178c cVar, List<String> list) {
        if (this.f18313h == null) {
            this.f18313h = C9593d.m28389a(C6174c.m19129a(), "monitor_config");
        }
        if (cVar != null) {
            this.f18314i = cVar;
        }
        if (!C6292i.m19525a(list)) {
            this.f18311f = new ArrayList(list);
        }
        m19299a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo14970a(String str, int i) {
        if (TextUtils.isEmpty(str) || this.f18315j == null) {
            return i;
        }
        return this.f18315j.optInt(str, i);
    }

    /* renamed from: a */
    public final void mo14972a(C6178c cVar, List<String> list) {
        this.f18313h = C9593d.m28389a(C6174c.m19129a(), "monitor_config");
        this.f18314i = cVar;
        if (!C6292i.m19525a(list)) {
            this.f18311f = new ArrayList(list);
        }
    }
}
