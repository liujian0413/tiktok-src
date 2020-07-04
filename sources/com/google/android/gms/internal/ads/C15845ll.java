package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14793ay;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ll */
public final /* synthetic */ class C15845ll {
    /* renamed from: a */
    public static void m51281a(C15844lk lkVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        lkVar.mo39875a(str, jSONObject.toString());
    }

    /* renamed from: a */
    public static void m51279a(C15844lk lkVar, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        lkVar.mo39815d(sb.toString());
    }

    /* renamed from: b */
    public static void m51282b(C15844lk lkVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String str2 = "Dispatching AFMA event: ";
        String valueOf = String.valueOf(sb.toString());
        acd.m45777b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        lkVar.mo39815d(sb.toString());
    }

    /* renamed from: a */
    public static void m51280a(C15844lk lkVar, String str, Map map) {
        try {
            lkVar.mo39810a(str, C14793ay.m42895a().mo39170a(map));
        } catch (JSONException unused) {
            acd.m45783e("Could not convert parameters to JSON.");
        }
    }
}
