package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.follow.p1262e.C29451a;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;

/* renamed from: com.ss.android.ugc.aweme.metrics.at */
public final class C33248at extends C33270l<C33248at> {

    /* renamed from: A */
    private String f86608A;

    /* renamed from: B */
    private String f86609B;

    /* renamed from: C */
    private String f86610C;

    /* renamed from: D */
    private String f86611D;

    /* renamed from: E */
    private String f86612E;

    /* renamed from: F */
    private String f86613F;

    /* renamed from: a */
    private String f86614a;

    /* renamed from: b */
    private String f86615b;

    /* renamed from: c */
    private Aweme f86616c;

    /* renamed from: com.ss.android.ugc.aweme.metrics.at$a */
    public static class C33249a {

        /* renamed from: a */
        public String f86617a;

        /* renamed from: b */
        public String f86618b;

        /* renamed from: c */
        public String f86619c;

        /* renamed from: d */
        public String f86620d;

        /* renamed from: e */
        public String f86621e;

        /* renamed from: f */
        public String f86622f;

        public C33249a() {
        }

        public C33249a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f86617a = str;
            this.f86618b = str2;
            this.f86619c = str3;
            this.f86620d = str4;
            this.f86621e = str6;
            this.f86622f = str5;
        }
    }

    public C33248at() {
        super("stay_time");
        this.f86768t = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85250c();
        mo85248a("duration", this.f86614a, C33260a.f86770a);
        mo85248a("enter_from", this.f86753e, C33260a.f86770a);
        mo85248a("group_id", this.f86608A, C33260a.f86770a);
        mo85248a("author_id", C33230ac.m107205a(this.f86616c), C33260a.f86770a);
        mo85248a("city_info", C33230ac.m107204a(), C33260a.f86770a);
        mo85248a("page_uid", this.f86611D, C33260a.f86770a);
        if (!TextUtils.isEmpty(this.f86610C)) {
            mo85248a("previous_page", this.f86610C, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86615b)) {
            mo85248a("page_type", this.f86615b, C33260a.f86770a);
        }
        if (TextUtils.equals(this.f86610C, "homepage_hot") || TextUtils.equals(this.f86610C, "homepage_follow")) {
            boolean z = !TextUtils.equals(this.f86610C, "homepage_hot");
            mo85248a("feeds_group_id", this.f86609B, C33260a.f86770a);
            mo85248a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107210a(this.f86609B, z ? 1 : 0)), C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86755g)) {
            mo85248a("poi_id", this.f86755g, C33260a.f86770a);
            if (!TextUtils.isEmpty(this.f86756h)) {
                mo85248a("poi_type", this.f86756h, C33260a.f86770a);
            }
        }
        if (C33230ac.m107224e(this.f86753e)) {
            mo85245a("notice_type", C29451a.m96918a());
            mo85245a("show_cnt", String.valueOf(C29451a.m96919b()));
            mo85245a("yellow_dot_logid", C29451a.m96920c());
        }
        if (C33230ac.m107228g(this.f86753e) && C6399b.m19944t()) {
            mo85245a("process_id", this.f86612E);
            mo85245a("tag_id", this.f86613F);
        }
    }

    public C33248at(String str) {
        super(str);
    }

    /* renamed from: a */
    public final C33248at mo85138a(String str) {
        this.f86614a = str;
        return this;
    }

    /* renamed from: b */
    public final C33248at mo85139b(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: c */
    public final C33248at mo85140c(String str) {
        this.f86610C = str;
        return this;
    }

    /* renamed from: d */
    public final C33248at mo85141d(String str) {
        this.f86615b = str;
        return this;
    }

    /* renamed from: e */
    public final C33248at mo85142e(String str) {
        this.f86755g = str;
        return this;
    }

    /* renamed from: f */
    public final C33248at mo85144f(String str) {
        this.f86756h = str;
        return this;
    }

    /* renamed from: g */
    public final C33248at mo85145g(String str) {
        this.f86608A = str;
        return this;
    }

    /* renamed from: i */
    public final C33248at mo85146i(String str) {
        this.f86609B = str;
        return this;
    }

    /* renamed from: j */
    public final C33248at mo85147j(String str) {
        this.f86611D = str;
        return this;
    }

    /* renamed from: k */
    public final C33248at mo85148k(String str) {
        this.f86612E = str;
        return this;
    }

    /* renamed from: o */
    public final C33248at mo85149o(String str) {
        this.f86613F = str;
        return this;
    }

    /* renamed from: f */
    public final C33248at mo85071g(Aweme aweme) {
        super.mo85071g(aweme);
        this.f86616c = aweme;
        this.f86608A = C33230ac.m107238m(aweme);
        return this;
    }

    /* renamed from: a */
    public final C33248at mo85137a(PoiStruct poiStruct) {
        if (poiStruct != null) {
            this.f86755g = poiStruct.getPoiId();
            this.f86756h = poiStruct.getTypeCode();
            this.f86759k = poiStruct.getBackendTypeCode();
            this.f86760l = poiStruct.getCityCode();
            this.f86757i = C33230ac.m107214b();
        }
        return this;
    }

    /* renamed from: a */
    public final C33248at mo85136a(C33249a aVar) {
        if (aVar != null) {
            if (!TextUtils.isEmpty(aVar.f86617a)) {
                this.f86755g = aVar.f86617a;
            }
            if (!TextUtils.isEmpty(aVar.f86618b)) {
                this.f86756h = aVar.f86618b;
            }
            if (!TextUtils.isEmpty(aVar.f86619c)) {
                this.f86615b = aVar.f86619c;
            }
            if (!TextUtils.isEmpty(aVar.f86620d)) {
                this.f86608A = aVar.f86620d;
            }
            if (!TextUtils.isEmpty(aVar.f86622f)) {
                this.f86759k = aVar.f86622f;
            }
            if (!TextUtils.isEmpty(aVar.f86621e)) {
                this.f86760l = aVar.f86621e;
            }
        }
        return this;
    }
}
