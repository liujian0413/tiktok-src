package com.google.api.p767a.p768a;

import com.google.api.client.googleapis.C17205a;
import com.google.api.client.googleapis.p773a.p774a.C17208a;
import com.google.api.client.googleapis.p773a.p774a.C17208a.C17209a;
import com.google.api.client.http.C17268q;
import com.google.api.client.http.C17272u;
import com.google.api.client.json.C17291c;
import com.google.api.client.util.C17384w;
import com.google.api.client.util.C6580n;
import com.google.api.p767a.p768a.p769a.C17172h;
import java.io.IOException;

/* renamed from: com.google.api.a.a.a */
public final class C17160a extends C17208a {

    /* renamed from: com.google.api.a.a.a$a */
    public static final class C17161a extends C17209a {
        /* renamed from: a */
        public final C17160a mo44436a() {
            return new C17160a(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public C17161a mo44440d(String str) {
            return (C17161a) super.mo44437a(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public C17161a mo44441e(String str) {
            return (C17161a) super.mo44438b(str);
        }

        /* renamed from: g */
        public final C17161a mo44442f(String str) {
            return (C17161a) super.mo44439c(str);
        }

        public C17161a(C17272u uVar, C17291c cVar, C17268q qVar) {
            super(uVar, cVar, "https://www.googleapis.com/", "youtube/v3/", qVar, false);
        }
    }

    /* renamed from: com.google.api.a.a.a$b */
    public class C17162b {

        /* renamed from: com.google.api.a.a.a$b$a */
        public class C17163a extends C17189b<C17172h> {
            @C6580n
            public String categoryId;
            @C6580n
            public String forUsername;
            @C6580n

            /* renamed from: id */
            public String f47894id;
            @C6580n
            public Boolean managedByMe;
            @C6580n
            public Long maxResults;
            @C6580n
            public Boolean mine;
            @C6580n
            public Boolean mySubscribers;
            @C6580n
            public String onBehalfOfContentOwner;
            @C6580n
            public String pageToken;
            @C6580n
            public String part;

            /* renamed from: a */
            public final C17163a mo44445a(Boolean bool) {
                this.mine = bool;
                return this;
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public C17163a mo44449e(String str, Object obj) {
                return (C17163a) super.mo44449e(str, obj);
            }

            protected C17163a(String str) {
                super(C17160a.this, "GET", "channels", null, C17172h.class);
                this.part = (String) C17384w.m57848a(str, (Object) "Required parameter part must be specified.");
            }
        }

        public C17162b() {
        }

        /* renamed from: a */
        public final C17163a mo44444a(String str) throws IOException {
            return new C17163a(str);
        }
    }

    /* renamed from: e */
    public final C17162b mo44435e() {
        return new C17162b();
    }

    static {
        boolean z;
        if (C17205a.f47929a.intValue() != 1 || C17205a.f47930b.intValue() < 15) {
            z = false;
        } else {
            z = true;
        }
        C17384w.m57854b(z, "You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.19.0 of the YouTube Data API library.", C17205a.f47932d);
    }

    C17160a(C17161a aVar) {
        super(aVar);
    }
}
