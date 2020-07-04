package com.p280ss.android.deviceregister.p290b;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p1029d.C22914a;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.b.c */
final class C19313c {
    /* renamed from: a */
    static boolean m63336a(Context context) {
        try {
            return C6900g.m21454b().mo16943d();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    static boolean m63337a(C6787a aVar, String str, int i) {
        if (C6399b.m19946v()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("header");
                if (optJSONObject != null) {
                    optJSONObject.put("version_code", C22914a.f60646a);
                    jSONObject.put("header", optJSONObject);
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
        }
        return aVar.mo16592a(str, i);
    }
}
