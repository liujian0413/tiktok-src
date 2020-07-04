package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
public final class aek {

    /* renamed from: a */
    private static final aem<Map<String, ?>> f40102a = new ael();

    /* renamed from: a */
    public static List<String> m45691a(JSONArray jSONArray, List<String> list) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static JSONObject m45692a(JSONObject jSONObject, String... strArr) {
        JSONObject jSONObject2 = jSONObject;
        int i = 0;
        while (true) {
            if (i > 0) {
                break;
            } else if (jSONObject2 == null) {
                jSONObject2 = null;
                break;
            } else {
                jSONObject2 = jSONObject2.optJSONObject(strArr[0]);
                i++;
            }
        }
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.optJSONObject(strArr[1]);
    }
}
