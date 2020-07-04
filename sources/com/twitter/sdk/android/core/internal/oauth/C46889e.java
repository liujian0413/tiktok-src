package com.twitter.sdk.android.core.internal.oauth;

import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Response;

/* renamed from: com.twitter.sdk.android.core.internal.oauth.e */
final /* synthetic */ class C46889e implements Interceptor {

    /* renamed from: a */
    private final C46888d f120233a;

    C46889e(C46888d dVar) {
        this.f120233a = dVar;
    }

    public final Response intercept(Chain chain) {
        return this.f120233a.mo118005a(chain);
    }
}
