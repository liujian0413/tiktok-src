package com.bytedance.framwork.core.p517a;

import android.content.Context;
import com.bytedance.framwork.core.p517a.p518a.C10206c;
import com.bytedance.framwork.core.p517a.p519b.C10208a;
import com.bytedance.framwork.core.p517a.p520c.C10210a;
import com.bytedance.framwork.core.p517a.p520c.C10214b;
import com.bytedance.framwork.core.p517a.p520c.C10216d;
import com.bytedance.framwork.core.p517a.p521d.C10219a;
import com.bytedance.framwork.core.p517a.p521d.C10219a.C10222b;
import com.bytedance.framwork.core.p517a.p522e.C10230b;
import com.bytedance.framwork.core.p517a.p522e.C10231c;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.a.b */
public final class C10207b implements C10222b {

    /* renamed from: a */
    public volatile boolean f27754a = true;

    /* renamed from: b */
    public JSONObject f27755b;

    /* renamed from: c */
    private long f27756c;

    /* renamed from: d */
    private int f27757d = 120;

    /* renamed from: e */
    private int f27758e = 100;

    /* renamed from: f */
    private C10209c f27759f;

    /* renamed from: g */
    private String f27760g;

    /* renamed from: h */
    private Context f27761h;

    /* renamed from: c */
    private long m30298c() {
        return (long) this.f27759f.mo24922a(this.f27760g);
    }

    /* renamed from: b */
    public final void mo24919b() {
        m30297b(C10206c.m30284a(this.f27760g));
        m30299c(C10206c.m30287b(this.f27760g));
        this.f27755b = C10206c.m30288c(this.f27760g);
    }

    /* renamed from: d */
    private void m30300d() {
        List<C10208a> a = m30294a(100);
        if (!C10231c.m30354a(a)) {
            long j = -1;
            try {
                JSONArray jSONArray = new JSONArray();
                LinkedList linkedList = new LinkedList();
                for (C10208a aVar : a) {
                    long j2 = aVar.f27762a;
                    if (j2 > j) {
                        j = j2;
                    }
                    String str = aVar.f27766e;
                    linkedList.add(aVar);
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        jSONObject.put("log_id", j2);
                        jSONObject.put("d_s_t", System.currentTimeMillis());
                        jSONArray.put(jSONObject);
                    } catch (Exception unused) {
                    }
                }
                if (m30296a(jSONArray, false)) {
                    m30293a(j);
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo24918a() {
        C10219a.m30335a().mo24931a((C10222b) this);
        C10216d.m30328a(this.f27760g, (C10214b) new C10210a(this.f27761h, this.f27760g));
    }

    /* renamed from: b */
    private void m30297b(int i) {
        if (i > 0) {
            this.f27757d = i;
        }
    }

    /* renamed from: c */
    private void m30299c(int i) {
        if (i > 0) {
            this.f27758e = i;
        }
    }

    public final void onTimeEvent(long j) {
        m30295a(false);
    }

    /* renamed from: a */
    private int m30293a(long j) {
        return this.f27759f.mo24923a(this.f27760g, j);
    }

    /* renamed from: a */
    private List<C10208a> m30294a(int i) {
        return this.f27759f.mo24924a(Integer.parseInt(this.f27760g), 100);
    }

    /* renamed from: a */
    private void m30295a(boolean z) {
        if (this.f27754a) {
            long currentTimeMillis = System.currentTimeMillis();
            long c = m30298c();
            if (c > 0) {
                if (c > ((long) this.f27758e) || (currentTimeMillis - this.f27756c) / 1000 > ((long) this.f27757d)) {
                    this.f27756c = currentTimeMillis;
                    m30300d();
                }
            }
        }
    }

    public C10207b(Context context, String str) {
        this.f27761h = context;
        this.f27759f = C10209c.m30304a(context);
        this.f27760g = str;
    }

    /* renamed from: a */
    private boolean m30296a(JSONArray jSONArray, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (C10230b.m30352a(jSONArray)) {
                return false;
            }
            jSONObject.put("data", jSONArray);
            if (this.f27755b == null) {
                return true;
            }
            jSONObject.put("header", this.f27755b);
            return C10216d.m30330a(this.f27760g, jSONObject.toString());
        } catch (Throwable unused) {
            return false;
        }
    }
}
