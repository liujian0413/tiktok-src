package com.bytedance.sdk.account.p666g;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.p280ss.android.common.p288d.C6759a;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.g.a */
public final class C12884a {
    /* renamed from: a */
    public static void m37499a(String str, String str2, String str3, C12707b bVar, WeakReference<? extends C12706a> weakReference) {
        JSONObject jSONObject;
        C12706a aVar = (C12706a) weakReference.get();
        if (aVar != null) {
            jSONObject = aVar.onSendEvent(str);
        } else {
            jSONObject = null;
        }
        m37500a(str, str2, str3, bVar, jSONObject);
    }

    /* renamed from: a */
    private static void m37500a(String str, String str2, String str3, C12707b bVar, JSONObject jSONObject) {
        C12707b bVar2 = bVar;
        if (bVar2 != null) {
            String str4 = bVar2.f33703c;
            if (TextUtils.isEmpty(str4)) {
                str4 = bVar2.f33704d;
            }
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            m37501a(str5, str6, str7, bVar2.f33701a, bVar2.f33702b, str4, jSONObject);
            return;
        }
        m37501a(str, str2, str3, false, -1, null, jSONObject);
    }

    /* renamed from: a */
    private static void m37501a(String str, String str2, String str3, boolean z, int i, String str4, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("platform", str2);
            jSONObject2.put("scene", str3);
            if (z) {
                jSONObject2.put("result", "success");
            } else {
                jSONObject2.put("result", "fail");
                jSONObject2.put("error", i);
                if (str4 != null) {
                    jSONObject2.put("errDesc", str4);
                }
            }
            jSONObject2.put("account_sdk_version", 380);
            jSONObject2.put("raw", jSONObject);
            C6759a.m20910a(str, jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
