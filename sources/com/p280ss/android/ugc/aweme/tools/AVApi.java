package com.p280ss.android.ugc.aweme.tools;

/* renamed from: com.ss.android.ugc.aweme.tools.AVApi */
public interface AVApi {
    <T> T executeGetJSONObject(String str, Class<T> cls, String str2) throws Exception;

    String getAPI_URL_PREFIX_SI();
}
