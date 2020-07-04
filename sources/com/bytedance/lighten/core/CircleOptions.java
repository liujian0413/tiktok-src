package com.bytedance.lighten.core;

public final class CircleOptions {

    /* renamed from: a */
    public float f32169a;

    /* renamed from: b */
    public int f32170b;

    /* renamed from: c */
    public int f32171c;

    /* renamed from: d */
    public boolean f32172d;

    /* renamed from: e */
    public float f32173e;

    /* renamed from: f */
    public float f32174f;

    /* renamed from: g */
    public C12090b f32175g;

    /* renamed from: h */
    public RoundingMethod f32176h;

    public enum RoundingMethod {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    /* renamed from: com.bytedance.lighten.core.CircleOptions$a */
    public static class C12089a {

        /* renamed from: a */
        public boolean f32177a;

        /* renamed from: b */
        public float f32178b;

        /* renamed from: c */
        public int f32179c;

        /* renamed from: d */
        public int f32180d;

        /* renamed from: e */
        public float f32181e;

        /* renamed from: f */
        public float f32182f;

        /* renamed from: g */
        public C12090b f32183g;

        /* renamed from: h */
        public RoundingMethod f32184h = RoundingMethod.BITMAP_ONLY;

        /* renamed from: a */
        public final CircleOptions mo29782a() {
            return new CircleOptions(this);
        }

        /* renamed from: a */
        public final C12089a mo29780a(float f) {
            this.f32178b = f;
            return this;
        }

        /* renamed from: b */
        public final C12089a mo29783b(float f) {
            this.f32181e = f;
            return this;
        }

        /* renamed from: a */
        public final C12089a mo29781a(boolean z) {
            this.f32177a = true;
            return this;
        }
    }

    /* renamed from: com.bytedance.lighten.core.CircleOptions$b */
    public static class C12090b {

        /* renamed from: a */
        public float f32185a;

        /* renamed from: b */
        public float f32186b;

        /* renamed from: c */
        public float f32187c;

        /* renamed from: d */
        public float f32188d;
    }

    private CircleOptions(C12089a aVar) {
        this.f32172d = aVar.f32177a;
        this.f32169a = aVar.f32178b;
        this.f32170b = aVar.f32179c;
        this.f32171c = aVar.f32180d;
        this.f32173e = aVar.f32181e;
        this.f32174f = aVar.f32182f;
        this.f32175g = aVar.f32183g;
        this.f32176h = aVar.f32184h;
    }
}
