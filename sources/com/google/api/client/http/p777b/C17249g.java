package com.google.api.client.http.p777b;

import com.google.api.client.http.C17272u;
import com.google.api.client.util.C17384w;
import com.p280ss.android.ugc.aweme.policy.Policy;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.api.client.http.b.g */
public final class C17249g extends C17272u {

    /* renamed from: b */
    private static final String[] f48062b;

    /* renamed from: c */
    private final C17242a f48063c;

    /* renamed from: d */
    private final SSLSocketFactory f48064d;

    /* renamed from: e */
    private final HostnameVerifier f48065e;

    public C17249g() {
        this(null, null, null);
    }

    static {
        String[] strArr = {Policy.ACTION_DELETE, "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"};
        f48062b = strArr;
        Arrays.sort(strArr);
    }

    /* renamed from: a */
    public final boolean mo44582a(String str) {
        if (Arrays.binarySearch(f48062b, str) >= 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C17244c mo44581a(String str, String str2) throws IOException {
        C17384w.m57852a(mo44582a(str), "HTTP method %s not supported", str);
        HttpURLConnection a = this.f48063c.mo44596a(new URL(str2));
        a.setRequestMethod(str);
        if (a instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) a;
            if (this.f48065e != null) {
                httpsURLConnection.setHostnameVerifier(this.f48065e);
            }
            if (this.f48064d != null) {
                httpsURLConnection.setSSLSocketFactory(this.f48064d);
            }
        }
        return new C17244c(a);
    }

    private C17249g(C17242a aVar, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        this.f48063c = new C17243b();
        this.f48064d = null;
        this.f48065e = null;
    }
}
