package com.google.api.client.json.p779a;

import com.google.api.client.json.C17292d;
import com.google.gson.stream.C6720b;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.google.api.client.json.a.b */
final class C17282b extends C17292d {

    /* renamed from: a */
    private final C6720b f48147a;

    /* renamed from: b */
    private final C17280a f48148b;

    /* renamed from: a */
    public final void mo44675a() throws IOException {
        this.f48147a.flush();
    }

    /* renamed from: b */
    public final void mo44684b() throws IOException {
        this.f48147a.mo16109b();
    }

    /* renamed from: c */
    public final void mo44686c() throws IOException {
        this.f48147a.mo16111c();
    }

    /* renamed from: d */
    public final void mo44687d() throws IOException {
        this.f48147a.mo16113d();
    }

    /* renamed from: e */
    public final void mo44688e() throws IOException {
        this.f48147a.mo16114e();
    }

    /* renamed from: f */
    public final void mo44689f() throws IOException {
        this.f48147a.mo16115f();
    }

    /* renamed from: g */
    public final void mo44690g() throws IOException {
        this.f48147a.mo16170c("  ");
    }

    /* renamed from: a */
    public final void mo44676a(double d) throws IOException {
        this.f48147a.mo16103a(d);
    }

    /* renamed from: b */
    public final void mo44685b(String str) throws IOException {
        this.f48147a.mo16110b(str);
    }

    /* renamed from: a */
    public final void mo44677a(float f) throws IOException {
        this.f48147a.mo16103a((double) f);
    }

    /* renamed from: a */
    public final void mo44678a(int i) throws IOException {
        this.f48147a.mo16104a((long) i);
    }

    /* renamed from: a */
    public final void mo44679a(long j) throws IOException {
        this.f48147a.mo16104a(j);
    }

    /* renamed from: a */
    public final void mo44680a(String str) throws IOException {
        this.f48147a.mo16107a(str);
    }

    /* renamed from: a */
    public final void mo44681a(BigDecimal bigDecimal) throws IOException {
        this.f48147a.mo16106a((Number) bigDecimal);
    }

    /* renamed from: a */
    public final void mo44682a(BigInteger bigInteger) throws IOException {
        this.f48147a.mo16106a((Number) bigInteger);
    }

    /* renamed from: a */
    public final void mo44683a(boolean z) throws IOException {
        this.f48147a.mo16108a(z);
    }

    C17282b(C17280a aVar, C6720b bVar) {
        this.f48148b = aVar;
        this.f48147a = bVar;
    }
}
