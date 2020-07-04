package com.bytedance.ttnet.p671c;

import com.bytedance.common.utility.C6319n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.c.a */
public final class C12954a {

    /* renamed from: a */
    public int f34292a;

    /* renamed from: b */
    public String f34293b;

    /* renamed from: c */
    public long f34294c;

    /* renamed from: d */
    public String f34295d = "";

    /* renamed from: e */
    public String f34296e;

    /* renamed from: f */
    public String f34297f;

    /* renamed from: g */
    public String f34298g;

    /* renamed from: h */
    public boolean f34299h;

    /* renamed from: a */
    public final JSONObject mo31474a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", this.f34292a);
        jSONObject.put("url", this.f34293b);
        jSONObject.put("query_time", this.f34294c);
        if (!this.f34299h) {
            jSONObject.put("raw_sign", this.f34296e);
            jSONObject.put("ss_sign", this.f34297f);
            jSONObject.put("local_sign", this.f34298g);
        }
        if (!C6319n.m19593a(this.f34295d)) {
            jSONObject.put("err_msg", this.f34295d);
        }
        return jSONObject;
    }
}
