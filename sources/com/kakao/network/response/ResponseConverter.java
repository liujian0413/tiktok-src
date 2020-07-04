package com.kakao.network.response;

import com.kakao.network.response.ResponseBody.ResponseBodyException;
import org.json.JSONArray;

public interface ResponseConverter<F, T> {
    T convert(F f) throws ResponseBodyException;

    F fromArray(JSONArray jSONArray, int i) throws ResponseBodyException;
}
