package com.twitter.sdk.android.core.internal.p1845a;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Response;

/* renamed from: com.twitter.sdk.android.core.internal.a.b */
public final class C46854b implements Interceptor {
    public final Response intercept(Chain chain) throws IOException {
        Response proceed = chain.proceed(chain.request());
        if (proceed.code == 403) {
            return proceed.newBuilder().code(401).message("Unauthorized").build();
        }
        return proceed;
    }
}
