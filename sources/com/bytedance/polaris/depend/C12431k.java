package com.bytedance.polaris.depend;

import android.app.Application;

/* renamed from: com.bytedance.polaris.depend.k */
public final class C12431k {

    /* renamed from: a */
    final C12422c f32986a;

    /* renamed from: b */
    final C12426g f32987b;

    /* renamed from: c */
    final C12425f f32988c;

    /* renamed from: d */
    final C12424e f32989d;

    /* renamed from: e */
    final Application f32990e;

    /* renamed from: f */
    public final C12434l f32991f;

    /* renamed from: g */
    public final boolean f32992g;

    /* renamed from: com.bytedance.polaris.depend.k$a */
    public static class C12433a {

        /* renamed from: a */
        private Application f32993a;

        /* renamed from: b */
        private C12424e f32994b;

        /* renamed from: c */
        private C12422c f32995c;

        /* renamed from: d */
        private C12426g f32996d;

        /* renamed from: e */
        private C12425f f32997e;

        /* renamed from: f */
        private C12434l f32998f;

        /* renamed from: g */
        private boolean f32999g;

        /* renamed from: a */
        public final C12431k mo30344a() {
            C12431k.m36171a(this.f32993a, "context");
            C12431k.m36171a(this.f32994b, "foundationDepend");
            C12431k.m36171a(this.f32995c, "businessDepend");
            C12431k.m36171a(this.f32996d, "shareDepend");
            C12431k.m36171a(this.f32998f, "urlConfig");
            C12431k kVar = new C12431k(this.f32993a, this.f32994b, this.f32995c, this.f32996d, this.f32997e, this.f32999g, this.f32998f);
            return kVar;
        }

        /* renamed from: a */
        public final C12433a mo30340a(C12422c cVar) {
            this.f32995c = cVar;
            return this;
        }

        public C12433a(Application application) {
            this.f32993a = application;
        }

        /* renamed from: a */
        public final C12433a mo30341a(C12424e eVar) {
            this.f32994b = eVar;
            return this;
        }

        /* renamed from: a */
        public final C12433a mo30342a(C12426g gVar) {
            this.f32996d = gVar;
            return this;
        }

        /* renamed from: a */
        public final C12433a mo30343a(C12434l lVar) {
            this.f32998f = lVar;
            return this;
        }
    }

    /* renamed from: a */
    public static void m36171a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("can not be null");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private C12431k(Application application, C12424e eVar, C12422c cVar, C12426g gVar, C12425f fVar, boolean z, C12434l lVar) {
        this.f32990e = application;
        this.f32989d = eVar;
        this.f32986a = cVar;
        this.f32987b = gVar;
        this.f32988c = fVar;
        this.f32992g = z;
        this.f32991f = lVar;
    }
}
