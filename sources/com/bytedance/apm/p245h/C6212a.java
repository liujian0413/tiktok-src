package com.bytedance.apm.p245h;

import org.json.JSONObject;

/* renamed from: com.bytedance.apm.h.a */
public class C6212a extends C6213e {

    /* renamed from: a */
    public int f18288a;

    /* renamed from: b */
    public int f18289b;

    /* renamed from: c */
    public long f18290c;

    /* renamed from: d */
    public int f18291d;

    /* renamed from: e */
    public long f18292e;

    public C6212a() {
    }

    /* renamed from: a */
    public final C6213e mo14945a(JSONObject jSONObject) {
        this.f18288a = jSONObject.optInt("front");
        this.f18290c = jSONObject.optLong("sid");
        this.f18289b = jSONObject.optInt("network_type");
        this.f18291d = jSONObject.optInt("hit_rules");
        this.f18292e = jSONObject.optLong("timing_totalSendBytes", 0) + jSONObject.optLong("timing_totalReceivedBytes", 0);
        return super.mo14945a(jSONObject);
    }

    public C6212a(long j, String str, long j2, String str2) {
        super(j, str, j2, str2);
    }

    public C6212a(long j, String str, long j2, JSONObject jSONObject) {
        super(j, str, j2, jSONObject);
    }
}
