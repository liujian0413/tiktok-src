package com.p280ss.android.ugc.aweme.net.interceptor;

import com.facebook.network.connectionclass.C14146c;
import com.p280ss.android.ugc.aweme.net.C34091l;
import java.io.IOException;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.m */
public final class C34083m implements C34091l {
    public final Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        C14146c.m41761a().mo33903b();
        Response proceed = chain.proceed(request);
        C14146c.m41761a().mo33904c();
        return proceed;
    }
}
