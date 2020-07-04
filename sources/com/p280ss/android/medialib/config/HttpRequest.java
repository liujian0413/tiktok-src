package com.p280ss.android.medialib.config;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;

/* renamed from: com.ss.android.medialib.config.HttpRequest */
public final class HttpRequest {

    /* renamed from: a */
    private static final String[] f53455a = new String[0];

    /* renamed from: b */
    private static C19710a f53456b = C19710a.f53462a;

    /* renamed from: c */
    private HttpURLConnection f53457c;

    /* renamed from: d */
    private final URL f53458d;

    /* renamed from: e */
    private final String f53459e;

    /* renamed from: f */
    private String f53460f;

    /* renamed from: g */
    private int f53461g;

    /* renamed from: com.ss.android.medialib.config.HttpRequest$HttpRequestException */
    public static class HttpRequestException extends RuntimeException {
        private static final long serialVersionUID = -1170466989781746231L;

        public IOException getCause() {
            return (IOException) super.getCause();
        }

        public HttpRequestException(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: com.ss.android.medialib.config.HttpRequest$a */
    public interface C19710a {

        /* renamed from: a */
        public static final C19710a f53462a = new C19710a() {
            /* renamed from: a */
            public final HttpURLConnection mo52417a(URL url) throws IOException {
                return (HttpURLConnection) url.openConnection();
            }

            /* renamed from: a */
            public final HttpURLConnection mo52418a(URL url, Proxy proxy) throws IOException {
                return (HttpURLConnection) url.openConnection(proxy);
            }
        };

        /* renamed from: a */
        HttpURLConnection mo52417a(URL url) throws IOException;

        /* renamed from: a */
        HttpURLConnection mo52418a(URL url, Proxy proxy) throws IOException;
    }

    /* renamed from: c */
    private HttpURLConnection m64991c() {
        if (this.f53457c == null) {
            this.f53457c = m64990b();
        }
        return this.f53457c;
    }

    /* renamed from: d */
    private URL m64992d() {
        return m64991c().getURL();
    }

    /* renamed from: e */
    private String m64993e() {
        return m64991c().getRequestMethod();
    }

    /* renamed from: a */
    private Proxy m64989a() {
        return new Proxy(Type.HTTP, new InetSocketAddress(this.f53460f, this.f53461g));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m64993e());
        sb.append(' ');
        sb.append(m64992d());
        return sb.toString();
    }

    /* renamed from: b */
    private HttpURLConnection m64990b() {
        HttpURLConnection httpURLConnection;
        try {
            if (this.f53460f != null) {
                httpURLConnection = f53456b.mo52418a(this.f53458d, m64989a());
            } else {
                httpURLConnection = f53456b.mo52417a(this.f53458d);
            }
            httpURLConnection.setRequestMethod(this.f53459e);
            return httpURLConnection;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }
}
