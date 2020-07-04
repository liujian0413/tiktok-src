package com.google.api.client.http.p778c;

import com.google.api.client.http.C17231a;
import com.google.api.client.json.C17291c;
import com.google.api.client.json.C17292d;
import com.google.api.client.util.C17384w;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.api.client.http.c.a */
public final class C17251a extends C17231a {

    /* renamed from: b */
    public final Object f48066b;

    /* renamed from: c */
    public final C17291c f48067c;

    /* renamed from: d */
    public String f48068d;

    /* renamed from: a */
    public final C17251a mo44602a(String str) {
        this.f48068d = str;
        return this;
    }

    /* renamed from: a */
    public final void mo44591a(OutputStream outputStream) throws IOException {
        C17292d a = this.f48067c.mo44671a(outputStream, mo44565b());
        if (this.f48068d != null) {
            a.mo44687d();
            a.mo44680a(this.f48068d);
        }
        a.mo44723a(this.f48066b);
        if (this.f48068d != null) {
            a.mo44688e();
        }
        a.mo44675a();
    }

    public C17251a(C17291c cVar, Object obj) {
        super("application/json; charset=UTF-8");
        this.f48067c = (C17291c) C17384w.m57847a(cVar);
        this.f48066b = C17384w.m57847a(obj);
    }
}
