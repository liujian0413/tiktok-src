package com.kakao.network.response;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class JSONObjectConverter<T> implements ResponseConverter<JSONObject, T> {
    public abstract T convert(JSONObject jSONObject);

    public List<T> convertList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(convert(fromArray(jSONArray, i)));
        }
        return arrayList;
    }

    public JSONObject fromArray(JSONArray jSONArray, int i) {
        try {
            return jSONArray.getJSONObject(i);
        } catch (JSONException unused) {
            return null;
        }
    }
}
