package com.p280ss.videoarch.liveplayer;

import org.json.JSONObject;

/* renamed from: com.ss.videoarch.liveplayer.c */
public interface C46300c {

    /* renamed from: com.ss.videoarch.liveplayer.c$a */
    public static class C46302a {

        /* renamed from: a */
        public final JSONObject f118955a;

        /* renamed from: b */
        public final String f118956b;

        /* renamed from: c */
        public final String f118957c;

        /* renamed from: d */
        public final Exception f118958d;

        /* renamed from: com.ss.videoarch.liveplayer.c$a$a */
        public static class C46303a {

            /* renamed from: a */
            JSONObject f118959a;

            /* renamed from: b */
            String f118960b;

            /* renamed from: c */
            String f118961c;

            /* renamed from: d */
            Exception f118962d;

            private C46303a() {
            }

            /* renamed from: a */
            public final C46302a mo115054a() {
                return new C46302a(this);
            }

            /* renamed from: a */
            public final C46303a mo115051a(Exception exc) {
                this.f118962d = exc;
                return this;
            }

            /* renamed from: b */
            public final C46303a mo115055b(String str) {
                this.f118961c = str;
                return this;
            }

            /* renamed from: a */
            public final C46303a mo115052a(String str) {
                this.f118960b = str;
                return this;
            }

            /* renamed from: a */
            public final C46303a mo115053a(JSONObject jSONObject) {
                this.f118959a = jSONObject;
                return this;
            }
        }

        /* renamed from: a */
        public static C46303a m145343a() {
            return new C46303a();
        }

        private C46302a(C46303a aVar) {
            this.f118955a = aVar.f118959a;
            this.f118956b = aVar.f118960b;
            this.f118957c = aVar.f118961c;
            this.f118958d = aVar.f118962d;
        }
    }

    /* renamed from: a */
    C46302a mo21841a(String str, String str2);
}
