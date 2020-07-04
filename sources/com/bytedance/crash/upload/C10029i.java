package com.bytedance.crash.upload;

import org.json.JSONObject;

/* renamed from: com.bytedance.crash.upload.i */
public final class C10029i {

    /* renamed from: a */
    public final int f27305a;

    /* renamed from: b */
    public String f27306b;

    /* renamed from: c */
    public JSONObject f27307c;

    /* renamed from: a */
    public final boolean mo24657a() {
        if (this.f27305a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo24658b() {
        if (this.f27307c == null || this.f27307c.optInt("state") != 0) {
            return false;
        }
        return true;
    }

    public C10029i(int i) {
        this.f27305a = i;
    }

    public C10029i(int i, String str) {
        this.f27305a = i;
        this.f27306b = str;
    }

    public C10029i(int i, Throwable th) {
        this.f27305a = i;
        this.f27306b = th.getMessage();
    }

    public C10029i(int i, JSONObject jSONObject) {
        this.f27305a = 0;
        this.f27307c = jSONObject;
    }
}
