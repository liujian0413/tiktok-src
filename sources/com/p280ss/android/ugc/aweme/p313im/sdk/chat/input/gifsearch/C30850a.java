package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch;

import bolts.C1592h;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.p313im.sdk.p1312b.C30589a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7075h;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import retrofit2.C48476c.C48477a;
import retrofit2.C48479e.C48480a;
import retrofit2.C48517m.C48519a;
import retrofit2.p1899a.p1900a.C48469a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a */
public final class C30850a {

    /* renamed from: a */
    private static GifApi f80796a;

    static {
        try {
            if (C30199h.m98861a().getImUseOkhttpclient().getGifManagerUseOkhttpclient().booleanValue()) {
                m100519a();
            } else {
                m100521b();
            }
        } catch (NullValueException unused) {
            m100521b();
        }
    }

    /* renamed from: a */
    private static void m100519a() {
        f80796a = (GifApi) new C48519a().mo123319a(C7075h.f19903b).mo123320a(m100522c().build()).mo123322a((C48480a) C48469a.m150166a()).mo123321a((C48477a) C30589a.m99907a(C1592h.f5957a)).mo123323a().mo123312a(GifApi.class);
    }

    /* renamed from: b */
    private static void m100521b() {
        f80796a = (GifApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C7075h.f19903b).mo26431b(false).mo26432c(false).mo26429a(true).mo26430a().mo26435a(GifApi.class);
    }

    /* renamed from: c */
    private static Builder m100522c() {
        Builder newBuilder = new OkHttpClient().newBuilder();
        newBuilder.hostnameVerifier(new HostnameVerifier() {
            public final boolean verify(String str, SSLSession sSLSession) {
                return true;
            }
        });
        TrustManager[] trustManagerArr = {new X509TrustManager() {
            public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            public final X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }};
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, trustManagerArr, new SecureRandom());
            newBuilder.sslSocketFactory(instance.getSocketFactory());
        } catch (Exception unused) {
        }
        return newBuilder;
    }

    /* renamed from: a */
    public static void m100520a(String str) {
        f80796a.giphyAnalytics(str);
    }
}
