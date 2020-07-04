package com.p280ss.android.pushmanager.monitor;

import android.os.Looper;
import com.p280ss.android.message.C19809a;
import com.p280ss.android.message.C19846k;
import com.p280ss.android.message.p885a.C19826j;
import com.p280ss.android.pushmanager.C20074g;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.monitor.c */
public final class C20083c {

    /* renamed from: a */
    private static C20080a f54307a = null;

    /* renamed from: b */
    private static boolean f54308b = true;

    /* renamed from: c */
    private static Boolean f54309c;

    /* renamed from: b */
    static Looper m66140b() {
        Looper looper = C19846k.m65542a().f53813a;
        if (looper == null) {
            return Looper.getMainLooper();
        }
        return looper;
    }

    /* renamed from: a */
    static boolean m66139a() {
        if (f54309c == null) {
            f54309c = Boolean.valueOf(C19826j.m65474c(C19809a.m65408a()));
        }
        if (!f54308b || !f54309c.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m66135a(C20080a aVar) {
        f54307a = aVar;
    }

    /* renamed from: a */
    public static void m66138a(boolean z) {
        f54308b = z;
    }

    /* renamed from: a */
    private static void m66137a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            Iterator keys = jSONObject2.keys();
            while (keys.hasNext()) {
                try {
                    String str = (String) keys.next();
                    jSONObject.put(str, jSONObject2.get(str));
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    static void m66136a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m66141b(str, jSONObject, jSONObject2, jSONObject3);
        if (f54307a != null) {
            f54307a.mo53717a(str, jSONObject, jSONObject2, jSONObject3);
        }
    }

    /* renamed from: b */
    private static void m66141b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jSONObject4 = new JSONObject();
        m66137a(jSONObject4, jSONObject);
        m66137a(jSONObject4, jSONObject2);
        m66137a(jSONObject4, jSONObject3);
        C20074g.m66102a().mo53710a(str, jSONObject4);
    }
}
