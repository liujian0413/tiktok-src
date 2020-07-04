package com.google.api.client.http;

import com.google.api.client.util.C17347ab;
import com.google.api.client.util.C17384w;
import java.io.IOException;

public class HttpResponseException extends IOException {
    private static final long serialVersionUID = -1875819453475890043L;
    private final String content;
    private final transient C17261l headers;
    private final int statusCode;
    private final String statusMessage;

    /* renamed from: com.google.api.client.http.HttpResponseException$a */
    public static class C17230a {

        /* renamed from: a */
        public int f48018a;

        /* renamed from: b */
        public String f48019b;

        /* renamed from: c */
        public C17261l f48020c;

        /* renamed from: d */
        public String f48021d;

        /* renamed from: e */
        public String f48022e;

        /* renamed from: c */
        private C17230a m57272c(String str) {
            this.f48019b = str;
            return this;
        }

        /* renamed from: a */
        public final C17230a mo44562a(String str) {
            this.f48022e = str;
            return this;
        }

        /* renamed from: b */
        public final C17230a mo44563b(String str) {
            this.f48021d = str;
            return this;
        }

        /* renamed from: a */
        private C17230a m57270a(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            C17384w.m57850a(z);
            this.f48018a = i;
            return this;
        }

        /* renamed from: a */
        private C17230a m57271a(C17261l lVar) {
            this.f48020c = (C17261l) C17384w.m57847a(lVar);
            return this;
        }

        public C17230a(C17269r rVar) {
            this(rVar.f48126e, rVar.f48127f, rVar.mo44656a());
            try {
                this.f48021d = rVar.mo44662f();
                if (this.f48021d.length() == 0) {
                    this.f48021d = null;
                }
            } catch (IOException unused) {
            }
            StringBuilder computeMessageBuffer = HttpResponseException.computeMessageBuffer(rVar);
            if (this.f48021d != null) {
                computeMessageBuffer.append(C17347ab.f48262a);
                computeMessageBuffer.append(this.f48021d);
            }
            this.f48022e = computeMessageBuffer.toString();
        }

        public C17230a(int i, String str, C17261l lVar) {
            m57270a(i);
            m57272c(str);
            m57271a(lVar);
        }
    }

    public final String getContent() {
        return this.content;
    }

    public C17261l getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final boolean isSuccessStatusCode() {
        return C17271t.m57459a(this.statusCode);
    }

    public HttpResponseException(C17269r rVar) {
        this(new C17230a(rVar));
    }

    protected HttpResponseException(C17230a aVar) {
        super(aVar.f48022e);
        this.statusCode = aVar.f48018a;
        this.statusMessage = aVar.f48019b;
        this.headers = aVar.f48020c;
        this.content = aVar.f48021d;
    }

    public static StringBuilder computeMessageBuffer(C17269r rVar) {
        StringBuilder sb = new StringBuilder();
        int i = rVar.f48126e;
        if (i != 0) {
            sb.append(i);
        }
        String str = rVar.f48127f;
        if (str != null) {
            if (i != 0) {
                sb.append(' ');
            }
            sb.append(str);
        }
        return sb;
    }
}
