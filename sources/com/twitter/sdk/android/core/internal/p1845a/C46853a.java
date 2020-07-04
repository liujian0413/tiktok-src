package com.twitter.sdk.android.core.internal.p1845a;

import com.twitter.sdk.android.core.C46823d;
import com.twitter.sdk.android.core.C46825e;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;

/* renamed from: com.twitter.sdk.android.core.internal.a.a */
public final class C46853a implements Interceptor {

    /* renamed from: a */
    final C46825e f120162a;

    public C46853a(C46825e eVar) {
        this.f120162a = eVar;
    }

    public final Response intercept(Chain chain) throws IOException {
        GuestAuthToken guestAuthToken;
        Request request = chain.request();
        C46823d a = this.f120162a.mo117911a();
        if (a == null) {
            guestAuthToken = null;
        } else {
            guestAuthToken = (GuestAuthToken) a.f120356a;
        }
        if (guestAuthToken == null) {
            return chain.proceed(request);
        }
        Builder newBuilder = request.newBuilder();
        m146554a(newBuilder, guestAuthToken);
        return chain.proceed(newBuilder.build());
    }

    /* renamed from: a */
    static void m146554a(Builder builder, GuestAuthToken guestAuthToken) {
        StringBuilder sb = new StringBuilder();
        sb.append(guestAuthToken.f120216c);
        sb.append(" ");
        sb.append(guestAuthToken.f120217d);
        builder.header("Authorization", sb.toString());
        builder.header("x-guest-token", guestAuthToken.f120207b);
    }
}
