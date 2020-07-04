package com.p280ss.android.ugc.aweme.poi.p1461a;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.a.a */
public final class C35005a {

    /* renamed from: a */
    public String f91369a;

    /* renamed from: b */
    public String f91370b;

    /* renamed from: c */
    public String f91371c;

    /* renamed from: d */
    public String f91372d;

    /* renamed from: e */
    public String f91373e;

    /* renamed from: f */
    public String f91374f;

    /* renamed from: g */
    public String f91375g;

    /* renamed from: h */
    public String f91376h;

    /* renamed from: i */
    public String f91377i;

    /* renamed from: j */
    public String f91378j;

    /* renamed from: k */
    public String f91379k;

    /* renamed from: l */
    public String f91380l;

    /* renamed from: m */
    public String f91381m = "";

    /* renamed from: n */
    public String f91382n = "";

    /* renamed from: o */
    public String f91383o = "";

    /* renamed from: p */
    public String f91384p = "";

    /* renamed from: q */
    public String f91385q = "";

    /* renamed from: r */
    public String f91386r = "";

    /* renamed from: s */
    public String f91387s = "";

    /* renamed from: com.ss.android.ugc.aweme.poi.a.a$a */
    public static final class C35006a {

        /* renamed from: a */
        public String f91388a = "";

        /* renamed from: b */
        public String f91389b = "";

        /* renamed from: c */
        public String f91390c = "";

        /* renamed from: d */
        public String f91391d = "";

        /* renamed from: e */
        public String f91392e = "";

        /* renamed from: f */
        public String f91393f = "";

        /* renamed from: g */
        public String f91394g = "";

        /* renamed from: h */
        public String f91395h = "";

        /* renamed from: i */
        public String f91396i = "";

        /* renamed from: j */
        public String f91397j = "";

        /* renamed from: k */
        public String f91398k = "";

        /* renamed from: l */
        public String f91399l = "";

        /* renamed from: m */
        public String f91400m = "";

        /* renamed from: n */
        public String f91401n = "";

        /* renamed from: o */
        public String f91402o = "";

        /* renamed from: p */
        public String f91403p = "";

        /* renamed from: q */
        public String f91404q = "";

        /* renamed from: r */
        public String f91405r = "";

        /* renamed from: s */
        public String f91406s = "";

        /* renamed from: a */
        public final C35005a mo88753a() {
            return new C35005a(this);
        }

        /* renamed from: a */
        public final C35006a mo88752a(String str) {
            this.f91388a = str;
            return this;
        }

        /* renamed from: b */
        public final C35006a mo88754b(String str) {
            this.f91389b = str;
            return this;
        }

        /* renamed from: c */
        public final C35006a mo88755c(String str) {
            this.f91390c = str;
            return this;
        }

        /* renamed from: d */
        public final C35006a mo88756d(String str) {
            this.f91391d = str;
            return this;
        }

        /* renamed from: e */
        public final C35006a mo88757e(String str) {
            this.f91392e = str;
            return this;
        }

        /* renamed from: f */
        public final C35006a mo88758f(String str) {
            this.f91393f = str;
            return this;
        }

        /* renamed from: g */
        public final C35006a mo88759g(String str) {
            this.f91394g = str;
            return this;
        }

        /* renamed from: h */
        public final C35006a mo88760h(String str) {
            this.f91395h = str;
            return this;
        }

        /* renamed from: i */
        public final C35006a mo88761i(String str) {
            this.f91397j = str;
            return this;
        }

        /* renamed from: j */
        public final C35006a mo88762j(String str) {
            this.f91399l = str;
            return this;
        }

        /* renamed from: a */
        public final C35006a mo88750a(PoiSimpleBundle poiSimpleBundle) {
            if (poiSimpleBundle != null) {
                this.f91405r = poiSimpleBundle.getBackendType();
                this.f91406s = poiSimpleBundle.getPoiCity();
            }
            return this;
        }

        /* renamed from: a */
        public final C35006a mo88751a(PoiStruct poiStruct) {
            if (poiStruct != null) {
                this.f91405r = poiStruct.getBackendTypeCode();
                if (!TextUtils.isEmpty(poiStruct.getCityCode())) {
                    this.f91406s = poiStruct.getCityCode();
                }
            }
            return this;
        }
    }

    public C35005a(C35006a aVar) {
        C7573i.m23587b(aVar, "builder");
        this.f91369a = aVar.f91388a;
        this.f91370b = aVar.f91389b;
        this.f91371c = aVar.f91390c;
        this.f91372d = aVar.f91391d;
        this.f91373e = aVar.f91392e;
        this.f91374f = aVar.f91393f;
        this.f91375g = aVar.f91394g;
        this.f91376h = aVar.f91395h;
        this.f91377i = aVar.f91396i;
        this.f91378j = aVar.f91397j;
        this.f91379k = aVar.f91398k;
        this.f91380l = aVar.f91399l;
        this.f91381m = aVar.f91400m;
        this.f91386r = aVar.f91405r;
        this.f91387s = aVar.f91406s;
        this.f91382n = aVar.f91401n;
        this.f91383o = aVar.f91402o;
        this.f91384p = aVar.f91403p;
        this.f91385q = aVar.f91404q;
    }
}
