package com.google.api.client.auth.oauth2;

import com.google.api.client.http.C17239ab;
import com.google.api.client.http.C17256g;
import com.google.api.client.http.C17260k;
import com.google.api.client.http.C17266o;
import com.google.api.client.http.C17268q;
import com.google.api.client.http.C17269r;
import com.google.api.client.http.C17272u;
import com.google.api.client.json.C17291c;
import com.google.api.client.json.C17293e;
import com.google.api.client.util.C17379u;
import com.google.api.client.util.C17384w;
import com.google.api.client.util.C6580n;
import com.google.api.client.util.GenericData;
import java.io.IOException;

/* renamed from: com.google.api.client.auth.oauth2.g */
public class C17201g extends GenericData {

    /* renamed from: a */
    public C17268q f47921a;

    /* renamed from: b */
    public C17260k f47922b;

    /* renamed from: c */
    public final C17272u f47923c;

    /* renamed from: d */
    public final C17291c f47924d;

    /* renamed from: e */
    public C17256g f47925e;
    @C6580n(mo15941a = "grant_type")
    public String grantType;
    @C6580n(mo15941a = "scope")
    public String scopes;

    /* renamed from: c */
    public C17204h mo44499c() throws IOException {
        return (C17204h) mo44498a().mo44657a(C17204h.class);
    }

    /* renamed from: a */
    public final C17269r mo44498a() throws IOException {
        C17266o a = this.f47923c.mo44665a((C17268q) new C17268q() {
            /* renamed from: a */
            public final void mo44480a(C17266o oVar) throws IOException {
                if (C17201g.this.f47921a != null) {
                    C17201g.this.f47921a.mo44480a(oVar);
                }
                final C17260k kVar = oVar.f48096a;
                oVar.mo44645a((C17260k) new C17260k() {
                    /* renamed from: b */
                    public final void mo44481b(C17266o oVar) throws IOException {
                        if (kVar != null) {
                            kVar.mo44481b(oVar);
                        }
                        if (C17201g.this.f47922b != null) {
                            C17201g.this.f47922b.mo44481b(oVar);
                        }
                    }
                });
            }
        }).mo44653a(this.f47925e, new C17239ab(this));
        a.mo44649a((C17379u) new C17293e(this.f47924d));
        a.mo44651a(false);
        C17269r a2 = a.mo44652a();
        if (a2.mo44658b()) {
            return a2;
        }
        throw TokenResponseException.from(this.f47924d, a2);
    }

    /* renamed from: b */
    public C17201g mo44473b(C17260k kVar) {
        this.f47922b = kVar;
        return this;
    }

    /* renamed from: b */
    public C17201g mo44474b(C17268q qVar) {
        this.f47921a = qVar;
        return this;
    }

    /* renamed from: b */
    public C17201g mo44472b(C17256g gVar) {
        boolean z;
        this.f47925e = gVar;
        if (gVar.f48079f == null) {
            z = true;
        } else {
            z = false;
        }
        C17384w.m57850a(z);
        return this;
    }

    /* renamed from: d */
    public C17201g mo44477d(String str) {
        this.grantType = (String) C17384w.m57847a(str);
        return this;
    }

    /* renamed from: b */
    public C17201g mo44448c(String str, Object obj) {
        return (C17201g) super.mo44448c(str, obj);
    }

    public C17201g(C17272u uVar, C17291c cVar, C17256g gVar, String str) {
        this.f47923c = (C17272u) C17384w.m57847a(uVar);
        this.f47924d = (C17291c) C17384w.m57847a(cVar);
        mo44472b(gVar);
        mo44477d(str);
    }
}
