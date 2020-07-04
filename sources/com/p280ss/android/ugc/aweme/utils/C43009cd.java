package com.p280ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.cd */
public final class C43009cd {

    /* renamed from: a */
    public static final C43009cd f111574a = new C43009cd();

    private C43009cd() {
    }

    /* renamed from: a */
    public static final String m136508a(Map<String, ? extends Object> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static final Map<String, Object> m136509a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap hashMap = new HashMap();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                Map map = hashMap;
                C7573i.m23582a((Object) str2, "key");
                Object obj = jSONObject.get(str2);
                C7573i.m23582a(obj, "jsonObject.get(key)");
                map.put(str2, obj);
            }
            return hashMap;
        } catch (JSONException unused) {
            return null;
        }
    }
}
