package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.C11174p;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aa */
public final class C4087aa {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aa$a */
    public static class C4088a extends C11155d<JSONObject, JSONObject> {
        public final /* synthetic */ Object invoke(Object obj, CallContext callContext) throws Exception {
            return m14170a((JSONObject) obj, callContext);
        }

        /* renamed from: a */
        private static JSONObject m14170a(JSONObject jSONObject, CallContext callContext) throws Exception {
            JSONObject jSONObject2 = new JSONObject();
            if (TextUtils.equals(jSONObject.optString("type", ""), "all")) {
                Map all = C4087aa.m14169b(callContext).getAll();
                JSONObject jSONObject3 = new JSONObject();
                if (all != null && !all.isEmpty()) {
                    for (Object next : all.keySet()) {
                        if (next != null) {
                            jSONObject3.put(next.toString(), C4087aa.m14169b(callContext).getString(next.toString(), ""));
                        }
                    }
                }
                jSONObject2.put("value", jSONObject3);
            } else {
                jSONObject2.put("value", C4087aa.m14169b(callContext).getString(jSONObject.optString("key"), ""));
            }
            jSONObject2.put("code", 1);
            return jSONObject2;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aa$b */
    public static class C4089b extends C11155d<JSONObject, JSONObject> {
        public final /* synthetic */ Object invoke(Object obj, CallContext callContext) throws Exception {
            return m14171a((JSONObject) obj, callContext);
        }

        /* renamed from: a */
        private static JSONObject m14171a(JSONObject jSONObject, CallContext callContext) throws Exception {
            boolean z;
            boolean equals = TextUtils.equals(jSONObject.optString("type", ""), "all");
            JSONObject jSONObject2 = new JSONObject();
            if (equals) {
                z = C4087aa.m14166a(callContext).clear().commit();
            } else {
                z = C4087aa.m14166a(callContext).remove(jSONObject.optString("key")).commit();
            }
            jSONObject2.put("code", z ? 1 : 0);
            return jSONObject2;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aa$c */
    public static class C4090c extends C11155d<JSONObject, JSONObject> {
        public final /* synthetic */ Object invoke(Object obj, CallContext callContext) throws Exception {
            return m14172a((JSONObject) obj, callContext);
        }

        /* renamed from: a */
        private static JSONObject m14172a(JSONObject jSONObject, CallContext callContext) throws Exception {
            boolean commit = C4087aa.m14166a(callContext).putString(jSONObject.optString("key"), jSONObject.optString("value")).commit();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", commit ? 1 : 0);
            return jSONObject2;
        }
    }

    /* renamed from: a */
    private static String m14167a() {
        return "js_kv_methods_20191113";
    }

    /* renamed from: a */
    public static Editor m14166a(CallContext callContext) {
        return C7285c.m22838a(callContext.f30265a, m14167a(), 0).edit();
    }

    /* renamed from: b */
    public static SharedPreferences m14169b(CallContext callContext) {
        return C7285c.m22838a(callContext.f30265a, m14167a(), 0);
    }

    /* renamed from: a */
    public static void m14168a(C11174p pVar) {
        pVar.mo27204a("setStorage", (C11155d<?, ?>) new C4090c<Object,Object>()).mo27204a("getStorage", (C11155d<?, ?>) new C4088a<Object,Object>()).mo27204a("removeStorage", (C11155d<?, ?>) new C4089b<Object,Object>());
    }
}
