package com.bytedance.apm.p248k;

import android.os.Process;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p241f.p243b.C9600e;
import com.bytedance.apm.p245h.C9604c;
import com.bytedance.apm.util.C9640c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.c */
public final class C6248c extends C6244a {

    /* renamed from: a */
    private C9604c f18381a;

    /* renamed from: d */
    private long f18382d = 300;

    /* renamed from: e */
    private long f18383e = 60;

    /* renamed from: f */
    private boolean f18384f = true;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo14865c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo14866d() {
        return this.f18383e * 1000;
    }

    /* renamed from: e */
    public final void mo14867e() {
        if (!this.f18384f || C9640c.m28518a()) {
            long currentTimeMillis = System.currentTimeMillis();
            long b = C9640c.m28519b();
            long a = C9640c.m28514a(Process.myPid());
            try {
                Thread.sleep(360);
            } catch (InterruptedException unused) {
            }
            long b2 = C9640c.m28519b() - b;
            if (b2 > 0) {
                double a2 = (double) (C9640c.m28514a(Process.myPid()) - a);
                Double.isNaN(a2);
                double d = a2 * 1.0d;
                double d2 = (double) b2;
                Double.isNaN(d2);
                double d3 = d / d2;
                if (this.f18381a == null) {
                    C9604c cVar = new C9604c(currentTimeMillis, d3, d3, d3);
                    this.f18381a = cVar;
                    return;
                }
                this.f18381a.f26270b++;
                this.f18381a.f26273e += d3;
                if (this.f18381a.f26272d > d3) {
                    this.f18381a.f26272d = d3;
                }
                if (this.f18381a.f26271c < d3) {
                    this.f18381a.f26271c = d3;
                }
                if (currentTimeMillis - this.f18381a.f26269a > this.f18382d * 1000) {
                    double d4 = this.f18381a.f26273e;
                    double d5 = (double) this.f18381a.f26270b;
                    Double.isNaN(d5);
                    m19363a((float) (d4 / d5), (float) this.f18381a.f26271c);
                    this.f18381a = null;
                }
                return;
            }
            return;
        }
        this.f18384f = false;
        mo15025g();
        mo15026h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14862a(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("cpu_monitor_interval", 300);
        long optLong2 = jSONObject.optLong("cpu_sample_interval", 60);
        if (optLong > 0) {
            this.f18382d = optLong;
        }
        if (optLong2 > 0) {
            this.f18383e = optLong2;
        }
    }

    /* renamed from: a */
    private static void m19363a(float f, float f2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_usage_rate", (double) f);
            jSONObject.put("app_max_usage_rate", (double) f2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("scene", ActivityLifeObserver.getInstance().getTopActivityClassName());
            jSONObject2.put("process_name", C6174c.m19141b());
            jSONObject2.put("is_main_process", C6174c.m19145c());
            m19342a(new C9600e().mo23944a("cpu").mo23947b("cpu_monitor").mo23945a(jSONObject).mo23948b(jSONObject2));
        } catch (JSONException unused) {
        }
    }
}
