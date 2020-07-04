package com.p280ss.android.ugc.aweme.miniapp_api;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.b */
public final class C33434b {
    /* renamed from: a */
    private static List<Object> m108098a(JSONArray jSONArray) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m108098a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m108099a((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static HashMap<String, Object> m108097a(Uri uri) {
        Object obj;
        if (uri == null) {
            return null;
        }
        JSONParser jSONParser = new JSONParser();
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    String queryParameter = uri.getQueryParameter(str);
                    try {
                        obj = jSONParser.parse(queryParameter);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    try {
                        if (obj instanceof JSONObject) {
                            hashMap.put(str, m108099a((JSONObject) obj));
                        } else if (obj instanceof JSONArray) {
                            hashMap.put(str, ((JSONArray) obj).toArray());
                        } else {
                            hashMap.put(str, queryParameter);
                        }
                    } catch (Exception unused2) {
                        return hashMap;
                    }
                }
            }
        } catch (Exception unused3) {
        }
        return hashMap;
    }

    /* renamed from: a */
    private static Map<String, Object> m108099a(JSONObject jSONObject) throws Exception {
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONArray) {
                obj = m108098a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m108099a((JSONObject) obj);
            }
            hashMap.put(str, obj);
        }
        return hashMap;
    }
}
