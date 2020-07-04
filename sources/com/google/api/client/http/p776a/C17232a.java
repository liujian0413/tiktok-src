package com.google.api.client.http.p776a;

import com.google.api.client.http.C17275x;
import com.google.api.client.http.C17276y;
import com.google.api.client.util.C17384w;
import java.io.IOException;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: com.google.api.client.http.a.a */
final class C17232a extends C17275x {

    /* renamed from: e */
    private final HttpClient f48025e;

    /* renamed from: f */
    private final HttpRequestBase f48026f;

    /* renamed from: a */
    public final C17276y mo44568a() throws IOException {
        if (this.f48141d != null) {
            C17384w.m57852a(this.f48026f instanceof HttpEntityEnclosingRequest, "Apache HTTP client does not support %s requests with content.", this.f48026f.getRequestLine().getMethod());
            C17235d dVar = new C17235d(this.f48138a, this.f48141d);
            dVar.setContentEncoding(this.f48139b);
            dVar.setContentType(this.f48140c);
            ((HttpEntityEnclosingRequest) this.f48026f).setEntity(dVar);
        }
        return new C17233b(this.f48026f, this.f48025e.execute(this.f48026f));
    }

    C17232a(HttpClient httpClient, HttpRequestBase httpRequestBase) {
        this.f48025e = httpClient;
        this.f48026f = httpRequestBase;
    }

    /* renamed from: a */
    public final void mo44570a(String str, String str2) {
        this.f48026f.addHeader(str, str2);
    }

    /* renamed from: a */
    public final void mo44569a(int i, int i2) throws IOException {
        HttpParams params = this.f48026f.getParams();
        ConnManagerParams.setTimeout(params, (long) i);
        HttpConnectionParams.setConnectionTimeout(params, i);
        HttpConnectionParams.setSoTimeout(params, i2);
    }
}
