package com.bytedance.apm.p253n;

import android.text.TextUtils;
import com.bytedance.apm.C6159b;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.apm.p245h.C9607h;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.util.C9645j;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.n.e */
public final class C9636e {

    /* renamed from: a */
    public long f26354a;

    /* renamed from: b */
    private long f26355b;

    /* renamed from: c */
    private final ConcurrentHashMap<String, C9607h> f26356c = new ConcurrentHashMap<>(4);

    /* renamed from: d */
    private final String f26357d;

    /* renamed from: e */
    private final String f26358e;

    /* renamed from: b */
    public final void mo23992b() {
        this.f26356c.clear();
    }

    /* renamed from: a */
    public final void mo23989a() {
        this.f26355b = System.currentTimeMillis();
        C6174c.m19144c(this.f26355b);
    }

    public C9636e(String str, String str2) {
        this.f26357d = str;
        this.f26358e = str2;
    }

    /* renamed from: a */
    public final void mo23991a(String str, String str2) {
        ConcurrentHashMap<String, C9607h> concurrentHashMap = this.f26356c;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("#");
        sb.append(str2);
        if (((C9607h) concurrentHashMap.get(sb.toString())) == null) {
            C9607h hVar = new C9607h(System.currentTimeMillis());
            ConcurrentHashMap<String, C9607h> concurrentHashMap2 = this.f26356c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("#");
            sb2.append(str2);
            concurrentHashMap2.put(sb2.toString(), hVar);
        }
    }

    /* renamed from: b */
    public final void mo23994b(String str, String str2) {
        ConcurrentHashMap<String, C9607h> concurrentHashMap = this.f26356c;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("#");
        sb.append(str2);
        C9607h hVar = (C9607h) concurrentHashMap.get(sb.toString());
        if (hVar != null) {
            hVar.mo23954a(System.currentTimeMillis(), Thread.currentThread().getName());
            ConcurrentHashMap<String, C9607h> concurrentHashMap2 = this.f26356c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("#");
            sb2.append(str2);
            concurrentHashMap2.put(sb2.toString(), hVar);
        }
    }

    /* renamed from: a */
    public final void mo23990a(final int i, final String str, long j) {
        this.f26354a = System.currentTimeMillis();
        long j2 = this.f26354a - this.f26355b;
        if (j <= 0 || j2 <= j) {
            C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                public final void run() {
                    C9636e.this.mo23993b(i, str, C9636e.this.f26354a);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo23993b(int i, String str, long j) {
        if (this.f26356c != null && !this.f26356c.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            try {
                if (TextUtils.equals(str, AutoLaunchTraceHelper.sLauncherActivityName)) {
                    jSONArray = AutoLaunchTraceHelper.assemblySpan();
                }
                for (Entry entry : this.f26356c.entrySet()) {
                    String str2 = (String) entry.getKey();
                    C9607h hVar = (C9607h) entry.getValue();
                    JSONObject jSONObject = new JSONObject();
                    String[] split = str2.split("#");
                    if (split.length == 2) {
                        if ("page_load_trace".equals(this.f26357d)) {
                            jSONObject.put("name", split[1]);
                        } else {
                            jSONObject.put("module_name", split[0]);
                            jSONObject.put("span_name", split[1]);
                        }
                    } else if (split.length == 1) {
                        jSONObject.put("span_name", split[0]);
                    }
                    jSONObject.put("start", hVar.f26282a);
                    jSONObject.put("end", hVar.f26283b);
                    jSONObject.put("thread", hVar.f26284c);
                    jSONArray.put(jSONObject);
                }
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("name", this.f26358e);
                jSONObject2.put("page_type", this.f26358e);
                jSONObject2.put("start", this.f26355b);
                jSONObject2.put("end", j);
                jSONObject2.put("spans", jSONArray);
                jSONObject2.put("launch_mode", i);
                jSONObject2.put("collect_from", 2);
                jSONObject2.put("page_name", str);
            } catch (JSONException unused2) {
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("trace", jSONObject2);
            } catch (JSONException unused3) {
            }
            this.f26356c.clear();
            if (C6174c.m19149g()) {
                StringBuilder sb = new StringBuilder("reportAsync: ");
                sb.append(jSONObject3);
                C9645j.m28535a("AppStartStats", sb.toString());
            }
            C6159b.m19118b(this.f26357d, null, null, jSONObject3);
        }
    }
}
