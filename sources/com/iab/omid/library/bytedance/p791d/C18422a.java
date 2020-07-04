package com.iab.omid.library.bytedance.p791d;

import android.os.Build;
import android.os.Build.VERSION;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance.d.a */
public final class C18422a {
    /* renamed from: a */
    public static JSONObject m60646a() {
        JSONObject jSONObject = new JSONObject();
        C18423b.m60655a(jSONObject, "deviceType", m60647b());
        C18423b.m60655a(jSONObject, "osVersion", m60648c());
        C18423b.m60655a(jSONObject, "os", m60649d());
        return jSONObject;
    }

    /* renamed from: b */
    private static String m60647b() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append("; ");
        sb.append(Build.MODEL);
        return sb.toString();
    }

    /* renamed from: c */
    private static String m60648c() {
        return Integer.toString(VERSION.SDK_INT);
    }

    /* renamed from: d */
    private static String m60649d() {
        return "Android";
    }
}
