package com.p280ss.android.ugc.aweme.net.interceptor;

import com.bytedance.retrofit2.p637a.C12461b;
import com.p280ss.android.account.token.C18900c;
import com.p280ss.android.ugc.aweme.net.C34091l;
import com.p280ss.android.ugc.aweme.net.C34107y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Headers;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.e */
public final class C34075e implements C34091l {
    public final Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        ArrayList arrayList = new ArrayList(C34107y.m109783a(request.headers));
        C18900c.m61696a(request.url.toString(), (List<C12461b>) arrayList);
        Headers a = C34107y.m109784a((List<C12461b>) arrayList);
        Builder newBuilder = request.newBuilder();
        if (a == null) {
            a = request.headers;
        }
        Response proceed = chain.proceed(newBuilder.headers(a).build());
        C18900c.m61697b(request.url.toString(), C34107y.m109783a(proceed.headers));
        return proceed;
    }
}
