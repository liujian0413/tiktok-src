package com.p280ss.android.message.log;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p254b.C6304f;
import org.json.JSONObject;

/* renamed from: com.ss.android.message.log.c */
public final class C19851c {
    /* renamed from: a */
    public static void m65556a(String str, Bundle bundle) {
        if (!C6319n.m19593a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                for (String str2 : bundle.keySet()) {
                    jSONObject.put(str2, bundle.get(str2));
                }
            } catch (Throwable unused) {
            }
            m65554a(null, "event_v3", str, null, 0, 0, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m65555a(Context context, String str, String str2, JSONObject... jSONObjectArr) {
        JSONObject[] jSONObjectArr2 = jSONObjectArr;
        if (jSONObjectArr2.length > 0) {
            m65554a(context, "umeng", str, str2, 0, 0, jSONObjectArr2[0]);
            return;
        }
        m65554a(context, "umeng", str, str2, 0, 0, null);
    }

    /* renamed from: a */
    public static void m65553a(Context context, String str, String str2, String str3, long j, long j2) {
        m65554a(context, str, str2, str3, j, j2, null);
    }

    /* renamed from: a */
    public static void m65554a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (!C6319n.m19593a(str) && !C6319n.m19593a(str2)) {
            final String str4 = str;
            final String str5 = str2;
            final String str6 = str3;
            final long j3 = j;
            final long j4 = j2;
            final JSONObject jSONObject2 = jSONObject;
            final Context context2 = context;
            C198521 r1 = new C6304f() {
                public final void run() {
                    try {
                        C19850b bVar = new C19850b();
                        bVar.f53821a = str4;
                        bVar.f53822b = str5;
                        bVar.f53823c = str6;
                        bVar.f53824d = j3;
                        bVar.f53825e = j4;
                        if (jSONObject2 != null) {
                            bVar.f53826f = jSONObject2.toString();
                        }
                        C19848a a = C19848a.m65546a(context2);
                        if (a != null) {
                            a.mo53210a(bVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
            };
            r1.start();
        }
    }
}
