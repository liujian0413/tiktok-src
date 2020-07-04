package com.bytedance.frameworks.baselib.network.http.p512a.p513a;

import com.bytedance.frameworks.baselib.network.http.C10142f;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;

/* renamed from: com.bytedance.frameworks.baselib.network.http.a.a.d */
public final class C10113d implements Interceptor {
    public final Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Map a = C10142f.m30099a(request.url.toString(), request.headers.toMultimap());
        if (a == null) {
            return chain.proceed(request);
        }
        Builder builder = new Builder();
        builder.url(request.url);
        builder.method(request.method, request.body);
        builder.tag(request.tag);
        Headers.Builder newBuilder = request.headers.newBuilder();
        for (Entry entry : a.entrySet()) {
            newBuilder.add((String) entry.getKey(), (String) entry.getValue());
        }
        builder.headers(newBuilder.build());
        return chain.proceed(builder.build());
    }
}
