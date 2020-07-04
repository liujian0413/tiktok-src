package com.google.api.client.googleapis.p773a;

import com.google.api.client.http.C17267p;
import com.google.api.client.http.C17268q;
import com.google.api.client.http.C17272u;
import com.google.api.client.util.C17348ac;
import com.google.api.client.util.C17379u;
import com.google.api.client.util.C17384w;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.googleapis.a.a */
public abstract class C17206a {

    /* renamed from: a */
    static final Logger f47933a = Logger.getLogger(C17206a.class.getName());

    /* renamed from: b */
    public final C17267p f47934b;

    /* renamed from: c */
    public final C17213c f47935c;

    /* renamed from: d */
    public final String f47936d;

    /* renamed from: e */
    public final String f47937e;

    /* renamed from: f */
    public final String f47938f;

    /* renamed from: g */
    public final boolean f47939g;

    /* renamed from: h */
    public final boolean f47940h;

    /* renamed from: i */
    private final String f47941i;

    /* renamed from: j */
    private final C17379u f47942j;

    /* renamed from: com.google.api.client.googleapis.a.a$a */
    public static abstract class C17207a {

        /* renamed from: a */
        public final C17272u f47943a;

        /* renamed from: b */
        public C17213c f47944b;

        /* renamed from: c */
        public C17268q f47945c;

        /* renamed from: d */
        final C17379u f47946d;

        /* renamed from: e */
        public String f47947e;

        /* renamed from: f */
        public String f47948f;

        /* renamed from: g */
        String f47949g;

        /* renamed from: h */
        public String f47950h;

        /* renamed from: i */
        public boolean f47951i;

        /* renamed from: j */
        public boolean f47952j;

        /* renamed from: c */
        public C17207a mo44439c(String str) {
            this.f47950h = str;
            return this;
        }

        /* renamed from: a */
        public C17207a mo44437a(String str) {
            this.f47947e = C17206a.m57112a(str);
            return this;
        }

        /* renamed from: b */
        public C17207a mo44438b(String str) {
            this.f47948f = C17206a.m57113b(str);
            return this;
        }

        protected C17207a(C17272u uVar, String str, String str2, C17379u uVar2, C17268q qVar) {
            this.f47943a = (C17272u) C17384w.m57847a(uVar);
            this.f47946d = uVar2;
            mo44437a(str);
            mo44438b(str2);
            this.f47945c = qVar;
        }
    }

    /* renamed from: b */
    public C17379u mo44503b() {
        return this.f47942j;
    }

    /* renamed from: a */
    public final String mo44502a() {
        String valueOf = String.valueOf(this.f47936d);
        String valueOf2 = String.valueOf(this.f47937e);
        if (valueOf2.length() != 0) {
            return valueOf.concat(valueOf2);
        }
        return new String(valueOf);
    }

    /* renamed from: a */
    static String m57112a(String str) {
        C17384w.m57848a(str, (Object) "root URL cannot be null.");
        if (!str.endsWith("/")) {
            return String.valueOf(str).concat("/");
        }
        return str;
    }

    /* renamed from: b */
    static String m57113b(String str) {
        C17384w.m57848a(str, (Object) "service path cannot be null");
        if (str.length() == 1) {
            C17384w.m57851a("/".equals(str), (Object) "service path must equal \"/\" if it is of length 1.");
            return "";
        } else if (str.length() <= 0) {
            return str;
        } else {
            if (!str.endsWith("/")) {
                str = String.valueOf(str).concat("/");
            }
            if (str.startsWith("/")) {
                return str.substring(1);
            }
            return str;
        }
    }

    protected C17206a(C17207a aVar) {
        C17267p pVar;
        this.f47935c = aVar.f47944b;
        this.f47936d = m57112a(aVar.f47947e);
        this.f47937e = m57113b(aVar.f47948f);
        this.f47941i = aVar.f47949g;
        if (C17348ac.m57772a(aVar.f47950h)) {
            f47933a.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        this.f47938f = aVar.f47950h;
        if (aVar.f47945c == null) {
            pVar = aVar.f47943a.mo44664a();
        } else {
            pVar = aVar.f47943a.mo44665a(aVar.f47945c);
        }
        this.f47934b = pVar;
        this.f47942j = aVar.f47946d;
        this.f47939g = aVar.f47951i;
        this.f47940h = aVar.f47952j;
    }
}
