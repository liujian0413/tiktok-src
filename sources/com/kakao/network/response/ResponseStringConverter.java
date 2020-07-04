package com.kakao.network.response;

import com.kakao.network.response.ResponseBody.ResponseBodyException;
import com.kakao.util.helper.log.Logger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public abstract class ResponseStringConverter<T> implements ResponseConverter<String, T> {
    public static final ResponseStringConverter<String> IDENTITY_CONVERTER = new ResponseStringConverter<String>() {
        public final String convert(String str) {
            return str;
        }

        public final /* bridge */ /* synthetic */ Object fromArray(JSONArray jSONArray, int i) throws ResponseBodyException {
            return ResponseStringConverter.super.fromArray(jSONArray, i);
        }
    };

    public List<T> convertList(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            return convertList(new JSONArray(str));
        } catch (JSONException e) {
            Logger.m60955w(e.toString());
            return arrayList;
        }
    }

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

    public String fromArray(JSONArray jSONArray, int i) {
        try {
            return jSONArray.getString(i);
        } catch (JSONException unused) {
            return null;
        }
    }
}
