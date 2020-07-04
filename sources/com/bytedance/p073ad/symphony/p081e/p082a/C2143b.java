package com.bytedance.p073ad.symphony.p081e.p082a;

import com.bytedance.common.utility.C6319n;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.e.a.b */
public class C2143b {

    /* renamed from: a */
    public String f7284a = "";

    /* renamed from: b */
    public String f7285b = "";

    /* renamed from: c */
    public boolean f7286c;

    /* renamed from: d */
    public boolean f7287d;

    /* renamed from: e */
    public String f7288e;

    /* renamed from: f */
    public double f7289f;

    /* renamed from: g */
    private String f7290g;

    public String toString() {
        if (this.f7290g == null) {
            return "";
        }
        return this.f7290g;
    }

    /* renamed from: a */
    public final boolean mo7826a() {
        if (C6319n.m19593a(this.f7284a) || C6319n.m19593a(this.f7285b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m9367a(String str) {
        if (str == null || str.length() <= 2) {
            return "";
        }
        return str.substring(0, str.length() - 2);
    }

    public C2143b(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f7290g = jSONObject.toString();
            this.f7284a = jSONObject.optString("id", "");
            this.f7285b = jSONObject.optString("type", "");
            this.f7286c = jSONObject.optBoolean("disable_play_when_visible", false);
            this.f7287d = jSONObject.optBoolean("disable_content_ad", false);
            this.f7288e = jSONObject.optString("media_aspect_ratio");
            this.f7289f = jSONObject.optDouble("local_ecpm_threshold", 0.0d);
        }
    }
}
