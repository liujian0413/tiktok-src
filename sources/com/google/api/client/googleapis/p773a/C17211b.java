package com.google.api.client.googleapis.p773a;

import com.google.api.client.googleapis.C17222b;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.api.client.http.C17237aa;
import com.google.api.client.http.C17253e;
import com.google.api.client.http.C17254f;
import com.google.api.client.http.C17256g;
import com.google.api.client.http.C17257h;
import com.google.api.client.http.C17258i;
import com.google.api.client.http.C17261l;
import com.google.api.client.http.C17266o;
import com.google.api.client.http.C17269r;
import com.google.api.client.http.C17270s;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.util.C17384w;
import com.google.api.client.util.GenericData;
import java.io.IOException;

/* renamed from: com.google.api.client.googleapis.a.b */
public abstract class C17211b<T> extends GenericData {

    /* renamed from: a */
    public final String f47954a;

    /* renamed from: b */
    public final String f47955b;

    /* renamed from: c */
    public final C17257h f47956c;

    /* renamed from: d */
    public C17261l f47957d = new C17261l();

    /* renamed from: e */
    public C17261l f47958e;

    /* renamed from: f */
    public int f47959f = -1;

    /* renamed from: g */
    public String f47960g;

    /* renamed from: h */
    public boolean f47961h;

    /* renamed from: i */
    public Class<T> f47962i;

    /* renamed from: j */
    public MediaHttpUploader f47963j;

    /* renamed from: k */
    private final C17206a f47964k;

    /* renamed from: a */
    public C17206a mo44454a() {
        return this.f47964k;
    }

    /* renamed from: e */
    private C17269r m57138e() throws IOException {
        return m57136b(false);
    }

    /* renamed from: c */
    public final T mo44507c() throws IOException {
        return m57138e().mo44657a(this.f47962i);
    }

    /* renamed from: d */
    private C17256g mo44455d() {
        return new C17256g(C17237aa.m57302a(this.f47964k.mo44502a(), this.f47955b, (Object) this, true));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IOException mo44506a(C17269r rVar) {
        return new HttpResponseException(rVar);
    }

    /* renamed from: b */
    private C17269r m57136b(boolean z) throws IOException {
        C17269r rVar;
        if (this.f47963j == null) {
            rVar = m57135a(false).mo44652a();
        } else {
            C17256g d = mo44455d();
            boolean z2 = mo44454a().f47934b.mo44654a(this.f47954a, d, this.f47956c).f48116u;
            rVar = this.f47963j.mo44522a(this.f47957d).mo44523a(this.f47961h).mo44524a(d);
            rVar.f48128g.mo44649a(mo44454a().mo44503b());
            if (z2 && !rVar.mo44658b()) {
                throw mo44506a(rVar);
            }
        }
        this.f47958e = rVar.mo44656a();
        this.f47959f = rVar.f48126e;
        this.f47960g = rVar.f48127f;
        return rVar;
    }

    /* renamed from: a */
    private C17266o m57135a(boolean z) throws IOException {
        boolean z2;
        String str;
        boolean z3 = false;
        if (this.f47963j == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17384w.m57850a(z2);
        if (!z || this.f47954a.equals("GET")) {
            z3 = true;
        }
        C17384w.m57850a(z3);
        if (z) {
            str = "HEAD";
        } else {
            str = this.f47954a;
        }
        final C17266o a = mo44454a().f47934b.mo44654a(str, mo44455d(), this.f47956c);
        new C17222b().mo44481b(a);
        a.mo44649a(mo44454a().mo44503b());
        if (this.f47956c == null && (this.f47954a.equals("POST") || this.f47954a.equals("PUT") || this.f47954a.equals("PATCH"))) {
            a.mo44643a((C17257h) new C17253e());
        }
        a.f48097b.putAll(this.f47957d);
        if (!this.f47961h) {
            a.mo44644a((C17258i) new C17254f());
        }
        final C17270s sVar = a.f48111p;
        a.mo44647a((C17270s) new C17270s() {
            /* renamed from: a */
            public final void mo44508a(C17269r rVar) throws IOException {
                if (sVar != null) {
                    sVar.mo44508a(rVar);
                }
                if (!rVar.mo44658b() && a.f48116u) {
                    throw C17211b.this.mo44506a(rVar);
                }
            }
        });
        return a;
    }

    /* renamed from: a */
    public C17211b<T> mo44448c(String str, Object obj) {
        return (C17211b) super.mo44448c(str, obj);
    }

    protected C17211b(C17206a aVar, String str, String str2, C17257h hVar, Class<T> cls) {
        this.f47962i = (Class) C17384w.m57847a(cls);
        this.f47964k = (C17206a) C17384w.m57847a(aVar);
        this.f47954a = (String) C17384w.m57847a(str);
        this.f47955b = (String) C17384w.m57847a(str2);
        this.f47956c = hVar;
        String str3 = aVar.f47938f;
        if (str3 != null) {
            C17261l lVar = this.f47957d;
            String valueOf = String.valueOf(String.valueOf(str3));
            String valueOf2 = String.valueOf(String.valueOf("Google-API-Java-Client"));
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(valueOf2);
            lVar.mo44632k(sb.toString());
            return;
        }
        this.f47957d.mo44632k("Google-API-Java-Client");
    }
}
