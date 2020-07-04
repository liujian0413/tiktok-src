package com.google.api.client.http.p776a;

import com.google.api.client.http.C17276y;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpRequestBase;

/* renamed from: com.google.api.client.http.a.b */
final class C17233b extends C17276y {

    /* renamed from: a */
    private final HttpRequestBase f48027a;

    /* renamed from: b */
    private final HttpResponse f48028b;

    /* renamed from: c */
    private final Header[] f48029c;

    /* renamed from: g */
    public final int mo44579g() {
        return this.f48029c.length;
    }

    /* renamed from: h */
    public final void mo44580h() {
        this.f48027a.abort();
    }

    /* renamed from: a */
    public final InputStream mo44571a() throws IOException {
        HttpEntity entity = this.f48028b.getEntity();
        if (entity == null) {
            return null;
        }
        return entity.getContent();
    }

    /* renamed from: d */
    public final String mo44576d() {
        StatusLine statusLine = this.f48028b.getStatusLine();
        if (statusLine == null) {
            return null;
        }
        return statusLine.toString();
    }

    /* renamed from: e */
    public final int mo44577e() {
        StatusLine statusLine = this.f48028b.getStatusLine();
        if (statusLine == null) {
            return 0;
        }
        return statusLine.getStatusCode();
    }

    /* renamed from: f */
    public final String mo44578f() {
        StatusLine statusLine = this.f48028b.getStatusLine();
        if (statusLine == null) {
            return null;
        }
        return statusLine.getReasonPhrase();
    }

    /* renamed from: b */
    public final String mo44573b() {
        HttpEntity entity = this.f48028b.getEntity();
        if (entity != null) {
            Header contentEncoding = entity.getContentEncoding();
            if (contentEncoding != null) {
                return contentEncoding.getValue();
            }
        }
        return null;
    }

    /* renamed from: c */
    public final String mo44575c() {
        HttpEntity entity = this.f48028b.getEntity();
        if (entity != null) {
            Header contentType = entity.getContentType();
            if (contentType != null) {
                return contentType.getValue();
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String mo44574b(int i) {
        return this.f48029c[i].getValue();
    }

    /* renamed from: a */
    public final String mo44572a(int i) {
        return this.f48029c[i].getName();
    }

    C17233b(HttpRequestBase httpRequestBase, HttpResponse httpResponse) {
        this.f48027a = httpRequestBase;
        this.f48028b = httpResponse;
        this.f48029c = httpResponse.getAllHeaders();
    }
}
