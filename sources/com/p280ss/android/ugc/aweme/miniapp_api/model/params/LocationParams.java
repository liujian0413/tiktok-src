package com.p280ss.android.ugc.aweme.miniapp_api.model.params;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.params.LocationParams */
public final class LocationParams {

    /* renamed from: a */
    public String f87378a;

    /* renamed from: b */
    public String f87379b;

    /* renamed from: c */
    public float f87380c;

    /* renamed from: d */
    public double f87381d;

    /* renamed from: e */
    public double f87382e;

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.params.LocationParams$CoordType */
    public enum CoordType {
        BAIDU,
        MAPBAR,
        MAPABC,
        SOSOMAP,
        ALIYUN,
        GOOGLE,
        GPS
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.params.LocationParams$a */
    public static final class C33468a {

        /* renamed from: a */
        public String f87383a;

        /* renamed from: b */
        public String f87384b;

        /* renamed from: c */
        public float f87385c;

        /* renamed from: d */
        public double f87386d;

        /* renamed from: e */
        public double f87387e;

        /* renamed from: a */
        public final LocationParams mo85780a() {
            LocationParams locationParams = new LocationParams();
            locationParams.f87378a = this.f87383a;
            locationParams.f87380c = this.f87385c;
            locationParams.f87381d = this.f87386d;
            locationParams.f87382e = this.f87387e;
            locationParams.f87379b = this.f87384b;
            return locationParams;
        }

        /* renamed from: a */
        public final C33468a mo85777a(double d) {
            this.f87386d = d;
            return this;
        }

        /* renamed from: b */
        public final C33468a mo85781b(double d) {
            this.f87387e = d;
            return this;
        }

        /* renamed from: a */
        public final C33468a mo85778a(float f) {
            this.f87385c = f;
            return this;
        }

        /* renamed from: b */
        public final C33468a mo85782b(String str) {
            this.f87384b = str;
            return this;
        }

        /* renamed from: a */
        public final C33468a mo85779a(String str) {
            this.f87383a = str;
            return this;
        }
    }
}
