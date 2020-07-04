package com.p280ss.android.ugc.aweme.net;

import com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10113d;
import com.bytedance.ies.net.p574b.C10922b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.net.interceptor.C34073c;
import com.p280ss.android.ugc.aweme.net.interceptor.C34075e;
import com.p280ss.android.ugc.aweme.net.interceptor.C34076f;
import com.p280ss.android.ugc.aweme.net.interceptor.C34078h;
import com.p280ss.android.ugc.aweme.net.interceptor.C34081k;
import com.p280ss.android.ugc.aweme.net.interceptor.C34083m;
import com.p280ss.android.ugc.aweme.net.interceptor.C34084n;
import com.p280ss.android.ugc.aweme.sec.C37418h;
import java.net.CookieHandler;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Protocol;

/* renamed from: com.ss.android.ugc.aweme.net.r */
public final class C34098r {

    /* renamed from: a */
    private static final C34098r f88862a = new C34098r();

    /* renamed from: b */
    private OkHttpClient f88863b;

    /* renamed from: c */
    private OkHttpClient f88864c;

    /* renamed from: d */
    private OkHttpClient f88865d = new OkHttpClient();

    /* renamed from: e */
    private OkHttpClient f88866e;

    /* renamed from: a */
    public static C34098r m109769a() {
        return f88862a;
    }

    private C34098r() {
    }

    /* renamed from: b */
    public final OkHttpClient mo86751b() {
        if (this.f88864c != null) {
            return this.f88864c;
        }
        Builder newBuilder = m109769a().mo86753d().newBuilder();
        List<Interceptor> list = newBuilder.interceptors;
        list.add(0, new C34076f());
        list.add(0, new C34073c());
        list.add(0, new C34081k());
        this.f88864c = newBuilder.build();
        return this.f88864c;
    }

    /* renamed from: c */
    public final OkHttpClient mo86752c() {
        if (this.f88866e != null) {
            return this.f88866e;
        }
        Builder builder = new Builder();
        builder.connectTimeout(240, TimeUnit.SECONDS).writeTimeout(240, TimeUnit.SECONDS).readTimeout(240, TimeUnit.SECONDS);
        builder.followRedirects(true);
        builder.retryOnConnectionFailure(true);
        if (C34097q.m109767a() != null) {
            builder.dispatcher(new Dispatcher(C34097q.m109767a()));
        }
        this.f88866e = builder.build();
        return this.f88866e;
    }

    /* renamed from: d */
    public final OkHttpClient mo86753d() {
        if (this.f88863b != null) {
            return this.f88863b;
        }
        C10944e.m32116c();
        Builder newBuilder = this.f88865d.newBuilder();
        newBuilder.connectTimeout(60000, TimeUnit.MILLISECONDS);
        newBuilder.readTimeout(60000, TimeUnit.MILLISECONDS);
        newBuilder.retryOnConnectionFailure(true);
        if (C34097q.m109767a() != null) {
            newBuilder.dispatcher(new Dispatcher(C34097q.m109767a()));
        }
        if (C6776h.m20947b(C6399b.m19921a())) {
            newBuilder.cookieJar(new C10922b(CookieHandler.getDefault()));
        }
        if (C10944e.m32115b() != null && C10944e.m32115b().f29626h) {
            Interceptor a = C37418h.m120053a();
            if (a != null) {
                newBuilder.addInterceptor(a);
            }
        }
        newBuilder.addNetworkInterceptor(new C34083m());
        newBuilder.addNetworkInterceptor(new C10113d());
        newBuilder.addNetworkInterceptor(new C34075e());
        newBuilder.addInterceptor(new C34078h());
        newBuilder.addInterceptor(new C34084n());
        newBuilder.addInterceptor(C34099s.f88867a);
        newBuilder.protocols(Collections.singletonList(Protocol.HTTP_1_1));
        this.f88863b = newBuilder.build();
        return this.f88863b;
    }
}
