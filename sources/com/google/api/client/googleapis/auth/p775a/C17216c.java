package com.google.api.client.googleapis.auth.p775a;

import com.google.api.client.auth.oauth2.C17193b;
import com.google.api.client.auth.oauth2.C17195c;
import com.google.api.client.auth.oauth2.C17196d;
import com.google.api.client.auth.oauth2.C17196d.C17198b;
import com.google.api.client.auth.oauth2.C17201g;
import com.google.api.client.auth.oauth2.C17204h;
import com.google.api.client.http.C17256g;
import com.google.api.client.http.C17260k;
import com.google.api.client.http.C17272u;
import com.google.api.client.json.C17291c;
import com.google.api.client.json.p780b.C17286a;
import com.google.api.client.json.p780b.C17286a.C17287a;
import com.google.api.client.json.p780b.C17288b.C17290b;
import com.google.api.client.util.C17373m;
import com.google.api.client.util.C17384w;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.google.api.client.googleapis.auth.a.c */
public final class C17216c extends C17196d {

    /* renamed from: p */
    private static C17214a f47968p = new C17214a();

    /* renamed from: j */
    public String f47969j;

    /* renamed from: k */
    public String f47970k;

    /* renamed from: l */
    public Collection<String> f47971l;

    /* renamed from: m */
    public PrivateKey f47972m;

    /* renamed from: n */
    public String f47973n;

    /* renamed from: o */
    public String f47974o;

    /* renamed from: com.google.api.client.googleapis.auth.a.c$a */
    public static class C17217a extends C17198b {

        /* renamed from: i */
        public String f47975i;

        /* renamed from: j */
        public Collection<String> f47976j;

        /* renamed from: k */
        public PrivateKey f47977k;

        /* renamed from: l */
        public String f47978l;

        /* renamed from: m */
        public String f47979m;

        /* renamed from: n */
        public String f47980n;

        public C17217a() {
            super(C17193b.m57053a());
            mo44495a("https://accounts.google.com/o/oauth2/token");
        }

        /* renamed from: a */
        public final C17216c mo44514a() {
            return new C17216c(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17217a mo44492a(C17260k kVar) {
            return (C17217a) super.mo44492a(kVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17217a mo44495a(String str) {
            return (C17217a) super.mo44495a(str);
        }

        /* renamed from: b */
        public final C17217a mo44493a(C17272u uVar) {
            return (C17217a) super.mo44493a(uVar);
        }

        /* renamed from: b */
        public final C17217a mo44494a(C17291c cVar) {
            return (C17217a) super.mo44494a(cVar);
        }

        /* renamed from: a */
        public final C17217a mo44513a(String str, String str2) {
            mo44492a((C17260k) new C17195c(str, str2));
            return this;
        }
    }

    public C17216c() {
        this(new C17217a());
    }

    /* renamed from: d */
    public final C17204h mo44491d() throws IOException {
        if (this.f47972m == null) {
            return super.mo44491d();
        }
        C17287a aVar = new C17287a();
        aVar.mo44709b("RS256");
        aVar.mo44713d("JWT");
        aVar.mo44711c(this.f47973n);
        C17290b bVar = new C17290b();
        long a = this.f47902c.mo44836a();
        bVar.mo44717a(this.f47969j);
        bVar.mo44716a((Object) this.f47906g);
        long j = a / 1000;
        bVar.mo44718b(Long.valueOf(j));
        bVar.mo44715a(Long.valueOf(j + 3600));
        bVar.mo44719b(this.f47974o);
        bVar.put("scope", C17373m.m57836a(' ').mo44860a((Iterable<?>) this.f47971l));
        try {
            String a2 = C17286a.m57540a(this.f47972m, this.f47905f, aVar, bVar);
            C17201g gVar = new C17201g(this.f47903d, this.f47905f, new C17256g(this.f47906g), "urn:ietf:params:oauth:grant-type:jwt-bearer");
            gVar.put("assertion", a2);
            return gVar.mo44499c();
        } catch (GeneralSecurityException e) {
            IOException iOException = new IOException();
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C17216c mo44482a(C17204h hVar) {
        return (C17216c) super.mo44482a(hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C17216c mo44483a(Long l) {
        return (C17216c) super.mo44483a(l);
    }

    /* renamed from: c */
    public final C17216c mo44487b(Long l) {
        return (C17216c) super.mo44487b(l);
    }

    /* renamed from: c */
    public final C17216c mo44484a(String str) {
        return (C17216c) super.mo44484a(str);
    }

    /* renamed from: d */
    public final C17216c mo44488b(String str) {
        boolean z;
        if (str != null) {
            if (this.f47905f == null || this.f47903d == null || this.f47904e == null) {
                z = false;
            } else {
                z = true;
            }
            C17384w.m57851a(z, (Object) "Please use the Builder and call setJsonFactory, setTransport and setClientSecrets");
        }
        return (C17216c) super.mo44488b(str);
    }

    protected C17216c(C17217a aVar) {
        Collection<String> collection;
        boolean z;
        super(aVar);
        if (aVar.f47977k == null) {
            if (aVar.f47975i == null && aVar.f47976j == null && aVar.f47980n == null) {
                z = true;
            } else {
                z = false;
            }
            C17384w.m57850a(z);
            return;
        }
        this.f47969j = (String) C17384w.m57847a(aVar.f47975i);
        this.f47970k = aVar.f47979m;
        if (aVar.f47976j == null) {
            collection = Collections.emptyList();
        } else {
            collection = Collections.unmodifiableCollection(aVar.f47976j);
        }
        this.f47971l = collection;
        this.f47972m = aVar.f47977k;
        this.f47973n = aVar.f47978l;
        this.f47974o = aVar.f47980n;
    }
}
