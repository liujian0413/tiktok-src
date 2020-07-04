package com.google.api.client.http.p777b;

import com.google.api.client.http.C17276y;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.api.client.http.b.e */
final class C17246e extends C17276y {

    /* renamed from: a */
    private final HttpURLConnection f48055a;

    /* renamed from: b */
    private final int f48056b;

    /* renamed from: c */
    private final String f48057c;

    /* renamed from: d */
    private final ArrayList<String> f48058d = new ArrayList<>();

    /* renamed from: e */
    private final ArrayList<String> f48059e = new ArrayList<>();

    /* renamed from: com.google.api.client.http.b.e$a */
    final class C17247a extends FilterInputStream {

        /* renamed from: b */
        private long f48061b;

        public final int read() throws IOException {
            int read = this.in.read();
            if (read == -1) {
                m57340a();
            } else {
                this.f48061b++;
            }
            return read;
        }

        /* renamed from: a */
        private void m57340a() throws IOException {
            long i = C17246e.this.mo44597i();
            if (i != -1 && this.f48061b != 0 && this.f48061b < i) {
                long j = this.f48061b;
                StringBuilder sb = new StringBuilder(102);
                sb.append("Connection closed prematurely: bytesRead = ");
                sb.append(j);
                sb.append(", Content-Length = ");
                sb.append(i);
                throw new IOException(sb.toString());
            }
        }

        public C17247a(InputStream inputStream) {
            super(inputStream);
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.in.read(bArr, i, i2);
            if (read == -1) {
                m57340a();
            } else {
                this.f48061b += (long) read;
            }
            return read;
        }
    }

    /* renamed from: e */
    public final int mo44577e() {
        return this.f48056b;
    }

    /* renamed from: f */
    public final String mo44578f() {
        return this.f48057c;
    }

    /* renamed from: b */
    public final String mo44573b() {
        return this.f48055a.getContentEncoding();
    }

    /* renamed from: g */
    public final int mo44579g() {
        return this.f48058d.size();
    }

    /* renamed from: h */
    public final void mo44580h() {
        this.f48055a.disconnect();
    }

    /* renamed from: c */
    public final String mo44575c() {
        return this.f48055a.getHeaderField("Content-Type");
    }

    /* renamed from: a */
    public final InputStream mo44571a() throws IOException {
        InputStream inputStream;
        try {
            inputStream = C17248f.m57341a(this.f48055a);
        } catch (IOException unused) {
            inputStream = this.f48055a.getErrorStream();
        }
        if (inputStream == null) {
            return null;
        }
        return new C17247a(inputStream);
    }

    /* renamed from: d */
    public final String mo44576d() {
        String headerField = this.f48055a.getHeaderField(0);
        if (headerField == null || !headerField.startsWith("HTTP/1.")) {
            return null;
        }
        return headerField;
    }

    /* renamed from: i */
    public final long mo44597i() {
        String headerField = this.f48055a.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1;
        }
        return Long.parseLong(headerField);
    }

    /* renamed from: a */
    public final String mo44572a(int i) {
        return (String) this.f48058d.get(i);
    }

    /* renamed from: b */
    public final String mo44574b(int i) {
        return (String) this.f48059e.get(i);
    }

    C17246e(HttpURLConnection httpURLConnection) throws IOException {
        this.f48055a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == -1) {
            responseCode = 0;
        }
        this.f48056b = responseCode;
        this.f48057c = httpURLConnection.getResponseMessage();
        ArrayList<String> arrayList = this.f48058d;
        ArrayList<String> arrayList2 = this.f48059e;
        for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                for (String str2 : (List) entry.getValue()) {
                    if (str2 != null) {
                        arrayList.add(str);
                        arrayList2.add(str2);
                    }
                }
            }
        }
    }
}
