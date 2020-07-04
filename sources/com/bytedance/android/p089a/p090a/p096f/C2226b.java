package com.bytedance.android.p089a.p090a.p096f;

import com.bytedance.android.p089a.p090a.p098h.C2231b;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.f.b */
public class C2226b {

    /* renamed from: f */
    public boolean f7486f = true;

    /* renamed from: a */
    public void mo7963a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f7486f = jSONObject.optBoolean("is_enable", true);
            } catch (Throwable th) {
                C2231b.m9595a();
                th.getMessage();
            }
        }
    }
}
