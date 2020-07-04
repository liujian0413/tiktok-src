package com.google.api.client.http;

import java.io.IOException;

/* renamed from: com.google.api.client.http.p */
public final class C17267p {

    /* renamed from: a */
    public final C17272u f48120a;

    /* renamed from: b */
    public final C17268q f48121b;

    C17267p(C17272u uVar, C17268q qVar) {
        this.f48120a = uVar;
        this.f48121b = qVar;
    }

    /* renamed from: a */
    public final C17266o mo44653a(C17256g gVar, C17257h hVar) throws IOException {
        return mo44654a("POST", gVar, hVar);
    }

    /* renamed from: b */
    public final C17266o mo44655b(C17256g gVar, C17257h hVar) throws IOException {
        return mo44654a("PUT", gVar, null);
    }

    /* renamed from: a */
    public final C17266o mo44654a(String str, C17256g gVar, C17257h hVar) throws IOException {
        C17266o b = this.f48120a.mo44666b();
        if (this.f48121b != null) {
            this.f48121b.mo44480a(b);
        }
        b.mo44650a(str);
        if (gVar != null) {
            b.mo44642a(gVar);
        }
        if (hVar != null) {
            b.mo44643a(hVar);
        }
        return b;
    }
}
