package com.google.api.client.http;

import com.google.api.client.util.C17361f;
import com.google.api.client.util.C17372l;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.api.client.http.a */
public abstract class C17231a implements C17257h {

    /* renamed from: a */
    public C17265n f48023a;

    /* renamed from: b */
    private long f48024b;

    /* renamed from: d */
    public boolean mo44567d() {
        return true;
    }

    /* renamed from: e */
    private long m57276e() throws IOException {
        return m57275a(this);
    }

    /* renamed from: c */
    public final String mo44566c() {
        if (this.f48023a == null) {
            return null;
        }
        return this.f48023a.mo44636a();
    }

    /* renamed from: a */
    public final long mo44564a() throws IOException {
        if (this.f48024b == -1) {
            this.f48024b = m57276e();
        }
        return this.f48024b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Charset mo44565b() {
        if (this.f48023a == null || this.f48023a.mo44638b() == null) {
            return C17361f.f48275a;
        }
        return this.f48023a.mo44638b();
    }

    protected C17231a(C17265n nVar) {
        this.f48024b = -1;
        this.f48023a = nVar;
    }

    /* renamed from: a */
    public static long m57275a(C17257h hVar) throws IOException {
        if (!hVar.mo44567d()) {
            return -1;
        }
        return C17372l.m57833a(hVar);
    }

    protected C17231a(String str) {
        C17265n nVar;
        if (str == null) {
            nVar = null;
        } else {
            nVar = new C17265n(str);
        }
        this(nVar);
    }
}
