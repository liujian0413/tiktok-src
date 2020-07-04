package com.p280ss.android.ugc.aweme.net.interceptor;

import com.p280ss.android.common.util.NetworkUtils;
import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.k */
public final class C34081k implements Interceptor {
    public final Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        HttpUrl parse = HttpUrl.parse(NetworkUtils.filterUrl(request.url.newBuilder().query(null).build().toString()));
        if (parse == null) {
            return chain.proceed(request);
        }
        Builder newBuilder = request.url.newBuilder();
        newBuilder.host(parse.host);
        newBuilder.scheme(parse.scheme);
        return chain.proceed(request.newBuilder().url(newBuilder.build()).build());
    }
}
