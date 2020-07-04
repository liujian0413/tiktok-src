package com.bytedance.apm.util;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.util.h */
public final class C6291h {
    /* renamed from: a */
    public static boolean m19519a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m19521b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m19522b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static JSONObject m19517a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        Iterator keys = jSONObject.keys();
        if (keys == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            jSONObject2.put(str, jSONObject.opt(str));
        }
        return jSONObject2;
    }

    /* renamed from: b */
    public static void m19520b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    jSONObject.put(str, jSONObject2.get(str));
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m19518a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null || jSONObject2 == null) {
            return null;
        }
        Iterator keys = jSONObject2.keys();
        if (keys == null) {
            return null;
        }
        while (keys.hasNext()) {
            String str = (String) keys.next();
            if (!jSONObject2.isNull(str)) {
                jSONObject.put(str, jSONObject2.opt(str));
            }
        }
        return jSONObject;
    }
}
