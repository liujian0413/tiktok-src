package com.p280ss.caijing.globaliap.p1791d;

import android.content.Context;
import android.text.TextUtils;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.base.p1786b.C45778a;
import com.p280ss.base.p1786b.C45779b;
import com.p280ss.base.p1786b.C45780c;
import com.p280ss.caijing.globaliap.p1795f.C45863b;
import com.p280ss.caijing.globaliap.p1795f.C45864c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.d.h */
public final class C45846h {
    /* renamed from: a */
    public static String m143867a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            C6497a.m20185b(e);
            return "";
        }
    }

    /* renamed from: a */
    public static Map<String, JSONObject> m143868a(Context context) {
        HashMap hashMap = new HashMap();
        for (Entry entry : C7285c.m22838a(context, "gpay_ords", 0).getAll().entrySet()) {
            String str = (String) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append((String) entry.getKey());
            sb.append(":");
            sb.append(str);
            String b = C45778a.m143732b(str, "KAMQNNABCVBNM027");
            if (TextUtils.isEmpty(b)) {
                C45864c.m143930a("caijing_iap_decrypt_failed", new HashMap());
            }
            try {
                hashMap.put(entry.getKey(), new JSONObject(b));
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, String> m143869a(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, jSONObject.getString(str2));
            }
            return hashMap;
        } catch (JSONException e) {
            C6497a.m20185b(e);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m143871a(Context context, String str) {
        String a = C45780c.m143737a(str);
        if (!C45779b.m143736c(context, "gpay_ords", a)) {
            return false;
        }
        C45779b.m143735b(context, "gpay_ords", a);
        return true;
    }

    /* renamed from: a */
    public static void m143870a(Context context, String str, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            String a = C45780c.m143737a(str);
            if (!C45779b.m143736c(context, "gpay_ords", a)) {
                try {
                    str3 = C45778a.m143731a(str2, "KAMQNNABCVBNM027");
                } catch (Exception unused) {
                    C45863b.m143916a();
                    str3 = null;
                }
                C45779b.m143734a(context, "gpay_ords", a, str3);
            }
        }
    }
}
