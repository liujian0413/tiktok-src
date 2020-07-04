package com.google.api.client.auth.oauth2;

import com.google.api.client.http.C17239ab;
import com.google.api.client.http.C17260k;
import com.google.api.client.http.C17266o;
import com.google.api.client.http.C17268q;
import com.google.api.client.util.C17366i;
import com.google.api.client.util.C17384w;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.api.client.auth.oauth2.c */
public final class C17195c implements C17260k, C17268q {

    /* renamed from: a */
    public final String f47898a;

    /* renamed from: b */
    public final String f47899b;

    /* renamed from: a */
    public final void mo44480a(C17266o oVar) throws IOException {
        oVar.mo44645a((C17260k) this);
    }

    /* renamed from: b */
    public final void mo44481b(C17266o oVar) throws IOException {
        Map b = C17366i.m57815b(C17239ab.m57308a(oVar).f48049b);
        b.put("client_id", this.f47898a);
        if (this.f47899b != null) {
            b.put("client_secret", this.f47899b);
        }
    }

    public C17195c(String str, String str2) {
        this.f47898a = (String) C17384w.m57847a(str);
        this.f47899b = str2;
    }
}
