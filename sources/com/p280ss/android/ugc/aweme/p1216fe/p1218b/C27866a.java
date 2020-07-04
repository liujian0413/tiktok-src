package com.p280ss.android.ugc.aweme.p1216fe.p1218b;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.newmedia.p892b.C19926a;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.b.a */
public final class C27866a {
    /* renamed from: a */
    public static void m91289a(Context context, JSONObject jSONObject) {
        Context context2;
        try {
            if (context instanceof Activity) {
                context2 = (Activity) context;
            } else {
                context2 = null;
            }
            if (context2 != null) {
                if (!(context2 instanceof AbsActivity) || ((AbsActivity) context2).isActive()) {
                    String optString = jSONObject.optString("type");
                    if (!C6319n.m19593a(optString) && optString.indexOf(58) < 0) {
                        StringBuilder sb = new StringBuilder("sslocal://");
                        sb.append(optString);
                        C19290j jVar = new C19290j(sb.toString());
                        m91290a(jSONObject.optJSONObject("args"), jVar);
                        C19926a.m65748a(context2, jVar.mo51184a(), null);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m91290a(JSONObject jSONObject, C19290j jVar) throws JSONException {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                Object obj = jSONObject.get(str);
                if (obj instanceof Integer) {
                    jVar.mo51186a(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    jVar.mo51187a(str, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    jVar.mo51185a(str, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    jVar.mo51188a(str, (String) obj);
                } else if (obj instanceof JSONObject) {
                    m91290a((JSONObject) obj, jVar);
                }
            }
        }
    }
}
