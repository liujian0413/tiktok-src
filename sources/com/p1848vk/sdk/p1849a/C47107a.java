package com.p1848vk.sdk.p1849a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.a.a */
public final class C47107a {
    /* renamed from: a */
    private static Object m147297a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return m147299a((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return m147298a((JSONArray) obj);
        }
        return obj;
    }

    /* renamed from: a */
    public static List m147298a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m147297a(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, Object> m147299a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            hashMap.put(str, m147297a(jSONObject.get(str)));
        }
        return hashMap;
    }
}
