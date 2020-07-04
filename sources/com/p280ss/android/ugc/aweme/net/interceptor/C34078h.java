package com.p280ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.net.C34092m;
import java.io.IOException;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.h */
public final class C34078h implements C34092m {
    public final Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        if (TextUtils.equals("", request.url.queryParameter("device_id"))) {
            request = request.newBuilder().url(request.url.newBuilder().removeAllQueryParameters("device_id").build()).build();
        }
        return chain.proceed(request);
    }
}
