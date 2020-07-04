package com.google.api.client.http.p777b;

import com.google.api.client.http.C17275x;
import com.google.api.client.http.C17276y;
import com.google.api.client.util.C17384w;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* renamed from: com.google.api.client.http.b.c */
final class C17244c extends C17275x {

    /* renamed from: e */
    private final HttpURLConnection f48054e;

    /* renamed from: a */
    public final C17276y mo44568a() throws IOException {
        boolean z;
        HttpURLConnection httpURLConnection = this.f48054e;
        if (this.f48141d != null) {
            String str = this.f48140c;
            if (str != null) {
                mo44570a("Content-Type", str);
            }
            String str2 = this.f48139b;
            if (str2 != null) {
                mo44570a("Content-Encoding", str2);
            }
            long j = this.f48138a;
            if (j >= 0) {
                mo44570a("Content-Length", Long.toString(j));
            }
            String requestMethod = httpURLConnection.getRequestMethod();
            if ("POST".equals(requestMethod) || "PUT".equals(requestMethod)) {
                httpURLConnection.setDoOutput(true);
                if (j < 0 || j > 2147483647L) {
                    httpURLConnection.setChunkedStreamingMode(0);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode((int) j);
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    this.f48141d.mo44591a(outputStream);
                    try {
                    } catch (IOException e) {
                        throw e;
                    }
                } finally {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } else {
                if (j == 0) {
                    z = true;
                } else {
                    z = false;
                }
                C17384w.m57852a(z, "%s with non-zero content length is not supported", requestMethod);
            }
        }
        try {
            httpURLConnection.connect();
            return new C17246e(httpURLConnection);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    C17244c(HttpURLConnection httpURLConnection) {
        this.f48054e = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    /* renamed from: a */
    public final void mo44570a(String str, String str2) {
        C17245d.m57328a(this.f48054e, str, str2);
    }

    /* renamed from: a */
    public final void mo44569a(int i, int i2) {
        this.f48054e.setReadTimeout(i2);
        this.f48054e.setConnectTimeout(i);
    }
}
