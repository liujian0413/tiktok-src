package com.p280ss.android.ugc.aweme.app.p305g;

import com.facebook.network.connectionclass.C14143b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.g.b */
public final class C22983b {
    /* renamed from: a */
    public static void m75610a(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", C14143b.m41756a().mo33901b().toString());
            jSONObject.put("netWorkSpeed", (int) C14143b.m41756a().mo33902c());
            jSONObject.put("errorDesc", str3);
            jSONObject.put("errorUrl", str4);
            C6877n.m21407a(str, str2, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m75609a(String str, String str2, String str3, int i, String str4, String str5) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", C14143b.m41756a().mo33901b().toString());
            jSONObject.put("netWorkSpeed", (int) C14143b.m41756a().mo33902c());
            jSONObject.put("errorDesc", str3);
            jSONObject.put("errorCode", String.valueOf(i));
            jSONObject.put("errorUrl", str4);
            jSONObject.put("from", str5);
            C6877n.m21407a(str, str2, jSONObject);
        } catch (Exception unused) {
        }
    }
}
