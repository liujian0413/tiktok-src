package com.p280ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.utils.C43077dz;
import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.n */
public final class C34084n implements Interceptor {
    public final Response intercept(Chain chain) throws IOException {
        String[] strArr;
        Request request = chain.request();
        HttpUrl httpUrl = request.url;
        if (httpUrl != null) {
            Builder newBuilder = httpUrl.newBuilder();
            for (String str : C43077dz.f111686a) {
                String queryParameter = httpUrl.queryParameter(str);
                StringBuilder sb = new StringBuilder("sec_");
                sb.append(str);
                if (TextUtils.isEmpty(httpUrl.queryParameter(sb.toString()))) {
                    String b = C43077dz.m136657a().mo104734b(queryParameter, httpUrl.url().toString());
                    if (!TextUtils.isEmpty(b)) {
                        if (C43077dz.m136657a().mo104732a(httpUrl.toString())) {
                            newBuilder.removeAllQueryParameters(str);
                        }
                        StringBuilder sb2 = new StringBuilder("sec_");
                        sb2.append(str);
                        newBuilder.setQueryParameter(sb2.toString(), b);
                    }
                }
            }
            request = request.newBuilder().url(newBuilder.build().toString()).build();
        }
        return chain.proceed(request);
    }
}
