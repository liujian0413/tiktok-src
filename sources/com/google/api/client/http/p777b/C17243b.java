package com.google.api.client.http.p777b;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.google.api.client.http.b.b */
public final class C17243b implements C17242a {

    /* renamed from: a */
    private final Proxy f48053a;

    public C17243b() {
        this(null);
    }

    private C17243b(Proxy proxy) {
        this.f48053a = null;
    }

    /* renamed from: a */
    public final HttpURLConnection mo44596a(URL url) throws IOException {
        URLConnection uRLConnection;
        if (this.f48053a == null) {
            uRLConnection = url.openConnection();
        } else {
            uRLConnection = url.openConnection(this.f48053a);
        }
        return (HttpURLConnection) uRLConnection;
    }
}
