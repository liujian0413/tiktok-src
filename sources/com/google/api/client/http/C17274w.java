package com.google.api.client.http;

import com.google.api.client.util.C17384w;
import java.io.InputStream;

/* renamed from: com.google.api.client.http.w */
public final class C17274w extends C17241b {

    /* renamed from: b */
    private long f48135b = -1;

    /* renamed from: c */
    private boolean f48136c;

    /* renamed from: d */
    private final InputStream f48137d;

    /* renamed from: a */
    public final long mo44564a() {
        return this.f48135b;
    }

    /* renamed from: d */
    public final boolean mo44567d() {
        return this.f48136c;
    }

    /* renamed from: b */
    public final InputStream mo44595b() {
        return this.f48137d;
    }

    /* renamed from: b */
    public final C17274w mo44668b(boolean z) {
        this.f48136c = true;
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C17274w mo44593a(String str) {
        return (C17274w) super.mo44593a(str);
    }

    /* renamed from: c */
    public final C17274w mo44594a(boolean z) {
        return (C17274w) super.mo44594a(z);
    }

    /* renamed from: a */
    public final C17274w mo44667a(long j) {
        this.f48135b = j;
        return this;
    }

    public C17274w(String str, InputStream inputStream) {
        super(str);
        this.f48137d = (InputStream) C17384w.m57847a(inputStream);
    }
}
