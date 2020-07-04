package com.google.api.client.auth.oauth2;

import com.google.api.client.http.C17256g;
import com.google.api.client.http.C17260k;
import com.google.api.client.http.C17266o;
import com.google.api.client.http.C17268q;
import com.google.api.client.http.C17269r;
import com.google.api.client.http.C17272u;
import com.google.api.client.http.C17273v;
import com.google.api.client.json.C17291c;
import com.google.api.client.util.C17364h;
import com.google.api.client.util.C17374o;
import com.google.api.client.util.C17380v;
import com.google.api.client.util.C17384w;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.auth.oauth2.d */
public class C17196d implements C17260k, C17268q, C17273v {

    /* renamed from: a */
    static final Logger f47900a = Logger.getLogger(C17196d.class.getName());

    /* renamed from: b */
    public final C17197a f47901b;

    /* renamed from: c */
    public final C17364h f47902c;

    /* renamed from: d */
    public final C17272u f47903d;

    /* renamed from: e */
    public final C17260k f47904e;

    /* renamed from: f */
    public final C17291c f47905f;

    /* renamed from: g */
    public final String f47906g;

    /* renamed from: h */
    public final Collection<Object> f47907h;

    /* renamed from: i */
    public final C17268q f47908i;

    /* renamed from: j */
    private final Lock f47909j = new ReentrantLock();

    /* renamed from: k */
    private String f47910k;

    /* renamed from: l */
    private Long f47911l;

    /* renamed from: m */
    private String f47912m;

    /* renamed from: com.google.api.client.auth.oauth2.d$a */
    public interface C17197a {
        /* renamed from: a */
        String mo44478a(C17266o oVar);

        /* renamed from: a */
        void mo44479a(C17266o oVar, String str) throws IOException;
    }

    /* renamed from: com.google.api.client.auth.oauth2.d$b */
    public static class C17198b {

        /* renamed from: a */
        public final C17197a f47913a;

        /* renamed from: b */
        public C17272u f47914b;

        /* renamed from: c */
        public C17291c f47915c;

        /* renamed from: d */
        public C17256g f47916d;

        /* renamed from: e */
        public C17364h f47917e = C17364h.f48284a;

        /* renamed from: f */
        public C17260k f47918f;

        /* renamed from: g */
        public C17268q f47919g;

        /* renamed from: h */
        public Collection<Object> f47920h = C17374o.m57838a();

        /* renamed from: a */
        public C17198b mo44492a(C17260k kVar) {
            this.f47918f = kVar;
            return this;
        }

        /* renamed from: a */
        public C17198b mo44493a(C17272u uVar) {
            this.f47914b = uVar;
            return this;
        }

        /* renamed from: a */
        public C17198b mo44494a(C17291c cVar) {
            this.f47915c = cVar;
            return this;
        }

        public C17198b(C17197a aVar) {
            this.f47913a = (C17197a) C17384w.m57847a(aVar);
        }

        /* renamed from: a */
        public C17198b mo44495a(String str) {
            C17256g gVar;
            if (str == null) {
                gVar = null;
            } else {
                gVar = new C17256g(str);
            }
            this.f47916d = gVar;
            return this;
        }
    }

    /* renamed from: c */
    public final Long mo44490c() {
        this.f47909j.lock();
        try {
            return this.f47911l;
        } finally {
            this.f47909j.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private Long m57058e() {
        this.f47909j.lock();
        try {
            if (this.f47911l == null) {
                this.f47909j.unlock();
                return null;
            }
            Long valueOf = Long.valueOf((this.f47911l.longValue() - this.f47902c.mo44836a()) / 1000);
            this.f47909j.unlock();
            return valueOf;
        } catch (Throwable th) {
            this.f47909j.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C17204h mo44491d() throws IOException {
        if (this.f47912m == null) {
            return null;
        }
        return new C17199e(this.f47903d, this.f47905f, new C17256g(this.f47906g), this.f47912m).mo44473b(this.f47904e).mo44474b(this.f47908i).mo44499c();
    }

    /* renamed from: f */
    private boolean m57059f() throws IOException {
        this.f47909j.lock();
        boolean z = true;
        try {
            C17204h d = mo44491d();
            if (d != null) {
                mo44482a(d);
                Iterator it = this.f47907h.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                this.f47909j.unlock();
                return true;
            }
        } catch (TokenResponseException e) {
            if (400 > e.getStatusCode() || e.getStatusCode() >= 500) {
                z = false;
            }
            if (e.getDetails() != null && z) {
                mo44484a((String) null);
                mo44487b((Long) null);
            }
            Iterator it2 = this.f47907h.iterator();
            while (it2.hasNext()) {
                it2.next();
                e.getDetails();
            }
            if (z) {
                throw e;
            }
        } catch (Throwable th) {
            this.f47909j.unlock();
            throw th;
        }
        this.f47909j.unlock();
        return false;
    }

    /* renamed from: b */
    public final String mo44489b() {
        this.f47909j.lock();
        try {
            return this.f47912m;
        } finally {
            this.f47909j.unlock();
        }
    }

    /* renamed from: a */
    public final String mo44485a() {
        this.f47909j.lock();
        try {
            return this.f47910k;
        } finally {
            this.f47909j.unlock();
        }
    }

    /* renamed from: a */
    public final void mo44480a(C17266o oVar) throws IOException {
        oVar.mo44645a((C17260k) this);
        oVar.mo44648a((C17273v) this);
    }

    /* renamed from: a */
    public C17196d mo44482a(C17204h hVar) {
        mo44484a(hVar.accessToken);
        if (hVar.refreshToken != null) {
            mo44488b(hVar.refreshToken);
        }
        mo44487b(hVar.expiresInSeconds);
        return this;
    }

    /* renamed from: b */
    public C17196d mo44487b(Long l) {
        Long l2;
        if (l == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(this.f47902c.mo44836a() + (l.longValue() * 1000));
        }
        return mo44483a(l2);
    }

    /* renamed from: a */
    public C17196d mo44483a(Long l) {
        this.f47909j.lock();
        try {
            this.f47911l = l;
            return this;
        } finally {
            this.f47909j.unlock();
        }
    }

    /* renamed from: b */
    public C17196d mo44488b(String str) {
        boolean z;
        this.f47909j.lock();
        if (str != null) {
            try {
                if (this.f47905f == null || this.f47903d == null || this.f47904e == null || this.f47906g == null) {
                    z = false;
                } else {
                    z = true;
                }
                C17384w.m57851a(z, (Object) "Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl");
            } catch (Throwable th) {
                this.f47909j.unlock();
                throw th;
            }
        }
        this.f47912m = str;
        this.f47909j.unlock();
        return this;
    }

    protected C17196d(C17198b bVar) {
        String str;
        this.f47901b = (C17197a) C17384w.m57847a(bVar.f47913a);
        this.f47903d = bVar.f47914b;
        this.f47905f = bVar.f47915c;
        if (bVar.f47916d == null) {
            str = null;
        } else {
            str = bVar.f47916d.mo44609c();
        }
        this.f47906g = str;
        this.f47904e = bVar.f47918f;
        this.f47908i = bVar.f47919g;
        this.f47907h = Collections.unmodifiableCollection(bVar.f47920h);
        this.f47902c = (C17364h) C17384w.m57847a(bVar.f47917e);
    }

    /* renamed from: a */
    public C17196d mo44484a(String str) {
        this.f47909j.lock();
        try {
            this.f47910k = str;
            return this;
        } finally {
            this.f47909j.unlock();
        }
    }

    /* renamed from: b */
    public final void mo44481b(C17266o oVar) throws IOException {
        this.f47909j.lock();
        try {
            Long e = m57058e();
            if (this.f47910k == null || (e != null && e.longValue() <= 60)) {
                m57059f();
                if (this.f47910k == null) {
                    return;
                }
            }
            this.f47901b.mo44479a(oVar, this.f47910k);
            this.f47909j.unlock();
        } finally {
            this.f47909j.unlock();
        }
    }

    /* renamed from: a */
    public final boolean mo44486a(C17266o oVar, C17269r rVar, boolean z) {
        boolean z2;
        boolean z3;
        List<String> list = rVar.mo44656a().authenticate;
        boolean z4 = true;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (str.startsWith("Bearer ")) {
                    z3 = C17193b.f47897a.matcher(str).find();
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        z3 = false;
        if (!z2) {
            if (rVar.f48126e == 401) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        if (z3) {
            try {
                this.f47909j.lock();
                if (C17380v.m57843a(this.f47910k, this.f47901b.mo44478a(oVar)) && !m57059f()) {
                    z4 = false;
                }
                this.f47909j.unlock();
                return z4;
            } catch (IOException e) {
                f47900a.log(Level.SEVERE, "unable to refresh token", e);
            } catch (Throwable th) {
                this.f47909j.unlock();
                throw th;
            }
        }
        return false;
    }
}
