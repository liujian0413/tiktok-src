package com.twitter.sdk.android.core.internal.p1845a;

import com.twitter.sdk.android.core.C46825e;
import com.twitter.sdk.android.core.C46938j;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import okhttp3.CertificatePinner;
import okhttp3.CertificatePinner.Builder;
import okhttp3.OkHttpClient;

/* renamed from: com.twitter.sdk.android.core.internal.a.e */
public final class C46857e {
    /* renamed from: a */
    public static CertificatePinner m146562a() {
        return new Builder().add("*.twitter.com", "sha1/I0PRSKJViZuUfUYaeX7ATP7RcLc=").add("*.twitter.com", "sha1/VRmyeKyygdftp6vBg5nDu2kEJLU=").add("*.twitter.com", "sha1/Eje6RRfurSkm/cHN/r7t8t7ZFFw=").add("*.twitter.com", "sha1/Wr7Fddyu87COJxlD/H8lDD32YeM=").add("*.twitter.com", "sha1/GiG0lStik84Ys2XsnA6TTLOB5tQ=").add("*.twitter.com", "sha1/IvGeLsbqzPxdI0b0wuj2xVTdXgc=").add("*.twitter.com", "sha1/7WYxNdMb1OymFMQp4xkGn5TBJlA=").add("*.twitter.com", "sha1/sYEIGhmkwJQf+uiVKMEkyZs0rMc=").add("*.twitter.com", "sha1/PANDaGiVHPNpKri0Jtq6j+ki5b0=").add("*.twitter.com", "sha1/u8I+KQuzKHcdrT6iTb30I70GsD0=").add("*.twitter.com", "sha1/wHqYaI2J+6sFZAwRfap9ZbjKzE4=").add("*.twitter.com", "sha1/cTg28gIxU0crbrplRqkQFVggBQk=").add("*.twitter.com", "sha1/sBmJ5+/7Sq/LFI9YRjl2IkFQ4bo=").add("*.twitter.com", "sha1/vb6nG6txV/nkddlU0rcngBqCJoI=").add("*.twitter.com", "sha1/nKmNAK90Dd2BgNITRaWLjy6UONY=").add("*.twitter.com", "sha1/h+hbY1PGI6MSjLD/u/VR/lmADiI=").add("*.twitter.com", "sha1/Xk9ThoXdT57KX9wNRW99UbHcm3s=").add("*.twitter.com", "sha1/1S4TwavjSdrotJWU73w4Q2BkZr0=").add("*.twitter.com", "sha1/gzF+YoVCU9bXeDGQ7JGQVumRueM=").add("*.twitter.com", "sha1/aDMOYTWFIVkpg6PI0tLhQG56s8E=").add("*.twitter.com", "sha1/Vv7zwhR9TtOIN/29MFI4cgHld40=").build();
    }

    /* renamed from: a */
    public static OkHttpClient m146565a(C46825e eVar) {
        return m146563a(new OkHttpClient.Builder(), eVar).build();
    }

    /* renamed from: a */
    private static OkHttpClient.Builder m146563a(OkHttpClient.Builder builder, C46825e eVar) {
        return builder.certificatePinner(m146562a()).authenticator(new C46855c(eVar)).addInterceptor(new C46853a(eVar)).addNetworkInterceptor(new C46854b());
    }

    /* renamed from: a */
    public static OkHttpClient m146566a(C46938j<? extends TwitterAuthToken> jVar, TwitterAuthConfig twitterAuthConfig) {
        if (jVar != null) {
            return m146564a(new OkHttpClient.Builder(), jVar, twitterAuthConfig).build();
        }
        throw new IllegalArgumentException("Session must not be null.");
    }

    /* renamed from: a */
    private static OkHttpClient.Builder m146564a(OkHttpClient.Builder builder, C46938j<? extends TwitterAuthToken> jVar, TwitterAuthConfig twitterAuthConfig) {
        return builder.certificatePinner(m146562a()).addInterceptor(new C46856d(jVar, twitterAuthConfig));
    }
}
