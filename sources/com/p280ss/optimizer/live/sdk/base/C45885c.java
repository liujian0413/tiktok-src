package com.p280ss.optimizer.live.sdk.base;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.optimizer.live.sdk.base.c */
public final class C45885c {

    /* renamed from: a */
    final String f117296a;

    /* renamed from: b */
    final String f117297b;

    /* renamed from: c */
    final C45884b f117298c;

    /* renamed from: d */
    final List<Pair<String, String>> f117299d;

    /* renamed from: com.ss.optimizer.live.sdk.base.c$a */
    public static class C45887a {

        /* renamed from: a */
        public String f117300a;

        /* renamed from: b */
        public String f117301b;

        /* renamed from: c */
        public String f117302c;

        /* renamed from: d */
        public C45884b f117303d;

        /* renamed from: e */
        private int f117304e;

        /* renamed from: a */
        public final C45885c mo111167a() {
            return new C45885c(this);
        }

        /* renamed from: a */
        public final C45887a mo111164a(int i) {
            this.f117304e = i;
            return this;
        }

        /* renamed from: a */
        public final C45887a mo111165a(C45884b bVar) {
            this.f117303d = bVar;
            return this;
        }

        /* renamed from: a */
        public final C45887a mo111166a(String str) {
            this.f117301b = str;
            return this;
        }
    }

    /* renamed from: com.ss.optimizer.live.sdk.base.c$b */
    static class C45888b implements C45884b {
        private C45888b() {
        }

        /* renamed from: a */
        public final String mo14420a(String str) throws Exception {
            throw new RuntimeException("no implementation");
        }

        /* renamed from: a */
        public final String mo14421a(String str, byte[] bArr, String str2, String str3) throws Exception {
            throw new RuntimeException("no implementation");
        }
    }

    private C45885c(C45887a aVar) {
        String str;
        this.f117296a = aVar.f117300a;
        if (aVar.f117301b == null) {
            str = "http://i.snssdk.com";
        } else {
            str = aVar.f117301b;
        }
        this.f117297b = str;
        if (aVar.f117303d == null) {
            this.f117298c = new C45888b();
        } else {
            this.f117298c = aVar.f117303d;
        }
        this.f117299d = new ArrayList();
        if (this.f117296a != null) {
            this.f117299d.add(Pair.create("ProjectKey", this.f117296a));
        }
        if (aVar.f117302c != null) {
            this.f117299d.add(Pair.create("DeviceId", aVar.f117302c));
        }
    }
}
