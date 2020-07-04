package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.http.legacy.p296a.C6810f;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.tools.AVApi;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.AVApiImpl */
public class AVApiImpl implements AVApi {
    public String getAPI_URL_PREFIX_SI() {
        return Api.f60502b;
    }

    public <T> T executeGetJSONObject(String str, Class<T> cls, String str2) throws Exception {
        return Api.m75206a(0, str, cls, str2, (C6810f) null);
    }
}
