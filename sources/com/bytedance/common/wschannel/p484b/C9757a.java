package com.bytedance.common.wschannel.p484b;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.message.log.C19851c;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.b.a */
public final class C9757a {
    /* renamed from: a */
    public static void m28773a(Context context, String str, Bundle bundle) {
        if (!C6319n.m19593a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                for (String str2 : bundle.keySet()) {
                    jSONObject.put(str2, bundle.get(str2));
                }
            } catch (Throwable unused) {
            }
            C19851c.m65554a(context, "event_v3", str, null, 0, 0, jSONObject);
        }
    }
}
