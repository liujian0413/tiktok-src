package com.twitter.sdk.android.core.internal.p1845a;

import com.twitter.sdk.android.core.C46938j;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.C46886b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.twitter.sdk.android.core.internal.a.d */
public final class C46856d implements Interceptor {

    /* renamed from: a */
    final C46938j<? extends TwitterAuthToken> f120164a;

    /* renamed from: b */
    final TwitterAuthConfig f120165b;

    /* renamed from: a */
    private String m146559a(Request request) throws IOException {
        return new C46886b().mo118003a(this.f120165b, (TwitterAuthToken) this.f120164a.f120356a, null, request.method, request.url.toString(), m146561b(request));
    }

    /* renamed from: a */
    private static HttpUrl m146560a(HttpUrl httpUrl) {
        Builder query = httpUrl.newBuilder().query(null);
        int querySize = httpUrl.querySize();
        for (int i = 0; i < querySize; i++) {
            query.addEncodedQueryParameter(C46858f.m146570b(httpUrl.queryParameterName(i)), C46858f.m146570b(httpUrl.queryParameterValue(i)));
        }
        return query.build();
    }

    /* renamed from: b */
    private static Map<String, String> m146561b(Request request) throws IOException {
        HashMap hashMap = new HashMap();
        if ("POST".equals(request.method.toUpperCase(Locale.US))) {
            RequestBody requestBody = request.body;
            if (requestBody instanceof FormBody) {
                FormBody formBody = (FormBody) requestBody;
                for (int i = 0; i < formBody.size(); i++) {
                    hashMap.put(formBody.encodedName(i), formBody.value(i));
                }
            }
        }
        return hashMap;
    }

    public final Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request build = request.newBuilder().url(m146560a(request.url)).build();
        return chain.proceed(build.newBuilder().header("Authorization", m146559a(build)).build());
    }

    public C46856d(C46938j<? extends TwitterAuthToken> jVar, TwitterAuthConfig twitterAuthConfig) {
        this.f120164a = jVar;
        this.f120165b = twitterAuthConfig;
    }
}
