package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.C13187j;
import com.facebook.login.LoginClient.Request;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.c */
final class C14101c {

    /* renamed from: a */
    public String f37249a;

    /* renamed from: b */
    private final C13187j f37250b;

    /* renamed from: c */
    private String f37251c;

    /* renamed from: a */
    private static Bundle m41653a(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    /* renamed from: a */
    public final void mo33827a(Request request) {
        Bundle a = m41653a(request.f37204e);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("login_behavior", request.f37200a.toString());
            jSONObject.put("request_code", LoginClient.m41535b());
            jSONObject.put("permissions", TextUtils.join(",", request.f37201b));
            jSONObject.put("default_audience", request.f37202c.toString());
            jSONObject.put("isReauthorize", request.f37205f);
            if (this.f37251c != null) {
                jSONObject.put("facebookVersion", this.f37251c);
            }
            a.putString("6_extras", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.f37250b.mo32367a("fb_mobile_login_start", (Double) null, a);
    }

    /* renamed from: c */
    public final void mo33833c(String str, String str2) {
        mo33829a(str, str2, "");
    }

    /* renamed from: a */
    public final void mo33828a(String str, String str2) {
        Bundle a = m41653a(str);
        a.putString("3_method", str2);
        this.f37250b.mo32371b("fb_mobile_login_method_start", a);
    }

    /* renamed from: b */
    public final void mo33832b(String str, String str2) {
        Bundle a = m41653a(str);
        a.putString("3_method", str2);
        this.f37250b.mo32371b("fb_mobile_login_method_not_tried", a);
    }

    C14101c(Context context, String str) {
        this.f37249a = str;
        this.f37250b = new C13187j(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0);
                if (packageInfo != null) {
                    this.f37251c = packageInfo.versionName;
                }
            }
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public final void mo33829a(String str, String str2, String str3) {
        Bundle a = m41653a("");
        a.putString("2_result", C14085a.ERROR.f37220d);
        a.putString("5_error_message", str2);
        a.putString("3_method", str3);
        this.f37250b.mo32371b(str, a);
    }

    /* renamed from: a */
    public final void mo33831a(String str, Map<String, String> map, C14085a aVar, Map<String, String> map2, Exception exc) {
        Bundle a = m41653a(str);
        if (aVar != null) {
            a.putString("2_result", aVar.f37220d);
        }
        if (!(exc == null || exc.getMessage() == null)) {
            a.putString("5_error_message", exc.getMessage());
        }
        JSONObject jSONObject = null;
        if (!map.isEmpty()) {
            jSONObject = new JSONObject(map);
        }
        if (map2 != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                for (Entry entry : map2.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            a.putString("6_extras", jSONObject.toString());
        }
        this.f37250b.mo32371b("fb_mobile_login_complete", a);
    }

    /* renamed from: a */
    public final void mo33830a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Bundle a = m41653a(str);
        if (str3 != null) {
            a.putString("2_result", str3);
        }
        if (str4 != null) {
            a.putString("5_error_message", str4);
        }
        if (str5 != null) {
            a.putString("4_error_code", str5);
        }
        if (map != null && !map.isEmpty()) {
            a.putString("6_extras", new JSONObject(map).toString());
        }
        a.putString("3_method", str2);
        this.f37250b.mo32371b("fb_mobile_login_method_complete", a);
    }
}
