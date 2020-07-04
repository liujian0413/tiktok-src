package com.p280ss.android.message;

import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.C6317k;
import com.bytedance.common.utility.C6317k.C6318a;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.message.p885a.C19821g;
import com.p280ss.android.message.p885a.C19826j;
import com.p280ss.android.message.push.p886a.C19854b;
import com.p280ss.android.pushmanager.C20074g;
import com.p280ss.android.pushmanager.app.C20047d;
import com.p280ss.android.pushmanager.setting.C20090b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.message.f */
public final class C19837f {
    /* renamed from: a */
    public static void m65507a(Context context, JSONObject jSONObject) {
        if (context != null && jSONObject != null && C20090b.m66187a().mo53745A()) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", (long) jSONObject.optInt("id", 0));
                C20090b.m66187a();
                jSONObject2.put("did", Long.parseLong(C20090b.m66190r()));
                jSONObject2.put("code", 0);
                byte[] bytes = jSONObject2.toString().getBytes("UTF-8");
                String a = C19826j.m65467a(C20074g.m66110e(), C20047d.m66018a().mo53674c());
                HashMap hashMap = new HashMap();
                hashMap.put("Content-Type", "application/json; charset=utf-8");
                C6318a aVar = new C6318a();
                aVar.f18552a = true;
                String a2 = C6317k.m19580a().mo15154a(a, bytes, (Map<String, String>) hashMap, aVar);
                if (!C6319n.m19593a(a2)) {
                    try {
                        "success".equals(new JSONObject(a2).getString("reason"));
                    } catch (JSONException unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m65508a(Context context, JSONObject jSONObject, int i, String str) {
        if (jSONObject != null) {
            if (!C20090b.m66187a().mo53789o()) {
                StringBuilder sb = new StringBuilder("notifyEnable = ");
                sb.append(C20090b.m66187a().mo53789o());
                sb.append(" drop message");
                C19854b.m65564a(context, sb.toString());
            } else if (!C6319n.m19593a(jSONObject.optString("text"))) {
                if (jSONObject.optInt("id", 0) < 1000) {
                    C19854b.m65564a(context, "id < 1000, drop message");
                    return;
                }
                Intent intent = new Intent("com.ss.android.message");
                intent.putExtra("message_data", jSONObject.toString());
                if (!C6319n.m19593a(str)) {
                    intent.setPackage(str);
                } else {
                    intent.setPackage(context.getPackageName());
                }
                C19854b.m65564a(context, "sendMessageBroadcast");
                try {
                    C19821g.m65443a(context, intent);
                } catch (Exception unused) {
                }
            }
        }
    }
}
