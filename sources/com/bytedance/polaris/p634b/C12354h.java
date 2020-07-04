package com.bytedance.polaris.p634b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.b.h */
public final class C12354h {
    /* renamed from: a */
    public static Map<String, String> m35890a(JSONObject jSONObject) {
        new HashMap();
        return m35891b(jSONObject);
    }

    /* renamed from: a */
    private static List<Object> m35889a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m35889a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m35891b((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: b */
    private static Map<String, String> m35891b(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String str = (String) keys.next();
                Object obj = jSONObject.get(str);
                if (obj instanceof JSONArray) {
                    obj = m35889a((JSONArray) obj);
                } else if (obj instanceof JSONObject) {
                    obj = m35891b((JSONObject) obj);
                }
                hashMap.put(str, obj.toString());
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }
}
