package com.bytedance.apm.p245h;

import org.json.JSONObject;

/* renamed from: com.bytedance.apm.h.e */
public class C6213e {

    /* renamed from: f */
    public long f18293f;

    /* renamed from: g */
    public String f18294g;

    /* renamed from: h */
    public String f18295h;

    /* renamed from: i */
    public JSONObject f18296i;

    /* renamed from: j */
    public long f18297j;

    /* renamed from: k */
    public long f18298k;

    /* renamed from: l */
    public boolean f18299l;

    public C6213e() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LocalLog{id=");
        sb.append(this.f18293f);
        sb.append(", type='");
        sb.append(this.f18294g);
        sb.append('\'');
        sb.append(", type2='");
        sb.append(this.f18295h);
        sb.append('\'');
        sb.append(", data='");
        sb.append(this.f18296i);
        sb.append('\'');
        sb.append(", versionId=");
        sb.append(this.f18297j);
        sb.append(", createTime=");
        sb.append(this.f18298k);
        sb.append(", isSampled=");
        sb.append(this.f18299l);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final C6213e mo14946a(long j) {
        this.f18298k = j;
        return this;
    }

    /* renamed from: b */
    public final C6213e mo14949b(String str) {
        this.f18295h = str;
        return this;
    }

    /* renamed from: a */
    public final C6213e mo14947a(String str) {
        this.f18294g = str;
        return this;
    }

    /* renamed from: a */
    public C6213e mo14945a(JSONObject jSONObject) {
        this.f18296i = jSONObject;
        return this;
    }

    /* renamed from: a */
    public final C6213e mo14948a(boolean z) {
        this.f18299l = z;
        return this;
    }

    /* renamed from: c */
    public static C6213e m19288c(String str) {
        char c;
        if (str.hashCode() == -800094724 && str.equals("api_all")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c != 0) {
            return new C6213e().mo14947a(str);
        }
        return new C6212a().mo14947a(str);
    }

    public C6213e(long j, String str, long j2, JSONObject jSONObject) {
        this.f18293f = j;
        this.f18294g = str;
        this.f18296i = jSONObject;
        this.f18297j = j2;
    }

    public C6213e(long j, String str, long j2, String str2) {
        this.f18293f = j;
        this.f18294g = str;
        try {
            this.f18296i = new JSONObject(str2);
        } catch (Exception unused) {
        }
        this.f18297j = j2;
    }
}
