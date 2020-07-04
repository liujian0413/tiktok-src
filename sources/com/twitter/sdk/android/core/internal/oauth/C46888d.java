package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.C46969q;
import com.twitter.sdk.android.core.internal.C46892r;
import com.twitter.sdk.android.core.internal.p1845a.C46857e;
import java.io.IOException;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Response;
import retrofit2.C48479e.C48480a;
import retrofit2.C48517m;
import retrofit2.C48517m.C48519a;
import retrofit2.p1899a.p1900a.C48469a;

/* renamed from: com.twitter.sdk.android.core.internal.oauth.d */
abstract class C46888d {

    /* renamed from: b */
    public final C46969q f120229b;

    /* renamed from: c */
    public final C46892r f120230c;

    /* renamed from: d */
    public final String f120231d = C46892r.m146673a("TwitterAndroidSDK", C46969q.m146848b());

    /* renamed from: e */
    public final C48517m f120232e = new C48519a().mo123319a(this.f120230c.f120234a).mo123320a(new Builder().addInterceptor(new C46889e(this)).certificatePinner(C46857e.m146562a()).build()).mo123322a((C48480a) C48469a.m150166a()).mo123323a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Response mo118005a(Chain chain) throws IOException {
        return chain.proceed(chain.request().newBuilder().header("User-Agent", this.f120231d).build());
    }

    C46888d(C46969q qVar, C46892r rVar) {
        this.f120229b = qVar;
        this.f120230c = rVar;
    }
}
