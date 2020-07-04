package com.google.api.client.http;

import com.google.api.client.util.C17372l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.api.client.http.b */
public abstract class C17241b implements C17257h {

    /* renamed from: a */
    public boolean f48051a = true;

    /* renamed from: b */
    private String f48052b;

    /* renamed from: b */
    public abstract InputStream mo44595b() throws IOException;

    /* renamed from: c */
    public final String mo44566c() {
        return this.f48052b;
    }

    /* renamed from: a */
    public C17241b mo44593a(String str) {
        this.f48052b = str;
        return this;
    }

    /* renamed from: a */
    public C17241b mo44594a(boolean z) {
        this.f48051a = z;
        return this;
    }

    public C17241b(String str) {
        mo44593a(str);
    }

    /* renamed from: a */
    public final void mo44591a(OutputStream outputStream) throws IOException {
        C17372l.m57835a(mo44595b(), outputStream, this.f48051a);
        outputStream.flush();
    }
}
