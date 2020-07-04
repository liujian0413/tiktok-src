package com.p280ss.android.vesdk.p1776d;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.d.a */
public final class C45306a {

    /* renamed from: a */
    private Map<String, String> f116615a = new HashMap();

    /* renamed from: b */
    private StringBuilder f116616b = new StringBuilder();

    /* renamed from: c */
    private boolean f116617c = true;

    /* renamed from: a */
    public final JSONObject mo108382a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : this.f116615a.keySet()) {
                jSONObject.put(str, (String) this.f116615a.get(str));
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C45306a mo108381a(String str, String str2) {
        this.f116615a.put(str, str2);
        m143088b(str, str2);
        return this;
    }

    /* renamed from: b */
    private void m143088b(String str, String str2) {
        if (!this.f116617c) {
            this.f116616b.append(",");
        }
        this.f116616b.append("\"");
        this.f116616b.append(str);
        this.f116616b.append("\"");
        this.f116616b.append(":");
        this.f116616b.append("\"");
        this.f116616b.append(str2);
        this.f116616b.append("\"");
        if (this.f116617c) {
            this.f116617c = false;
        }
    }

    /* renamed from: a */
    public final C45306a mo108379a(String str, float f) {
        Map<String, String> map = this.f116615a;
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        map.put(str, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f);
        m143088b(str, sb2.toString());
        return this;
    }

    /* renamed from: a */
    public final C45306a mo108380a(String str, int i) {
        Map<String, String> map = this.f116615a;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        map.put(str, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        m143088b(str, sb2.toString());
        return this;
    }
}
