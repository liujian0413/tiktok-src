package com.p280ss.android.ugc.aweme.net.interceptor;

import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.ugc.aweme.p759ac.C15461d;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.f */
public final class C34076f implements Interceptor {
    public final Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Builder newBuilder = request.url.newBuilder();
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, true);
        for (Entry entry : hashMap.entrySet()) {
            newBuilder.addQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        HttpUrl build = newBuilder.build();
        C15461d.m45272a(build.toString());
        return chain.proceed(request.newBuilder().url(build).build());
    }
}
