package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.p1286g.C30187a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;

/* renamed from: com.ss.android.ugc.aweme.metrics.ar */
public final class C33246ar extends C33259d {

    /* renamed from: A */
    private String f86587A;

    /* renamed from: B */
    private String f86588B;

    /* renamed from: C */
    private String f86589C;

    /* renamed from: D */
    private String f86590D;

    /* renamed from: E */
    private Aweme f86591E;

    /* renamed from: F */
    private String f86592F;

    /* renamed from: G */
    private String f86593G;

    /* renamed from: H */
    private String f86594H;

    /* renamed from: I */
    private String f86595I;

    /* renamed from: a */
    private String f86596a;

    /* renamed from: b */
    private String f86597b;

    /* renamed from: c */
    private Long f86598c;

    /* renamed from: v */
    private String f86599v;

    /* renamed from: w */
    private String f86600w;

    /* renamed from: x */
    private String f86601x;

    /* renamed from: y */
    private String f86602y;

    /* renamed from: z */
    private String f86603z;

    public C33246ar() {
        super("client_show");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85250c();
        if (!TextUtils.isEmpty(this.f86588B)) {
            mo85248a("rank_index", this.f86588B, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86589C)) {
            mo85248a("banner_id", this.f86589C, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86590D)) {
            mo85248a("previous_page", this.f86590D, C33260a.f86770a);
        }
        mo85248a("enter_from", this.f86753e, C33260a.f86770a);
        mo85248a("group_id", this.f86596a, C33260a.f86771b);
        mo85248a("author_id", this.f86597b, C33260a.f86771b);
        if (TextUtils.equals(this.f86753e, "homepage_fresh") && C30187a.m98819b()) {
            if (TextUtils.isEmpty(this.f86592F)) {
                this.f86592F = "Nearby";
            }
            mo85248a("tab_name", this.f86592F, C33260a.f86770a);
            if (!(this.f86591E == null || this.f86591E.getStatistics() == null)) {
                mo85248a("like_cnt", C30537o.m99738a((long) this.f86591E.getStatistics().getDiggCount()), C33260a.f86770a);
            }
        }
        mo85248a("request_id", this.f86603z, C33260a.f86771b);
        mo85248a(C38347c.f99553h, this.f86601x, C33260a.f86770a);
        if ("prop_page".equals(this.f86753e)) {
            mo85248a("prop_id", this.f86599v, C33260a.f86771b);
            mo85248a("log_pb", C28199ae.m92689a().mo71791a(this.f86603z), C33260a.f86771b);
        } else {
            mo85248a("music_id", String.valueOf(this.f86598c), C33260a.f86771b);
            if ("homepage_fresh".equals(this.f86753e) || "categorized_city_poi".equalsIgnoreCase(this.f86753e) || "homepage_channel".equalsIgnoreCase(this.f86753e)) {
                mo85255h(this.f86603z);
            }
        }
        mo85248a("display", this.f86602y, C33260a.f86770a);
        if (!TextUtils.isEmpty(this.f86587A)) {
            mo85248a("distance_km", this.f86587A, C33260a.f86770a);
        }
        if (C33230ac.m107228g(this.f86753e) && C6399b.m19944t()) {
            mo85245a("process_id", this.f86593G);
            mo85245a("tag_id", this.f86595I);
            mo85245a("rank_index", this.f86594H);
        }
    }

    /* renamed from: a */
    public final C33246ar mo85126a(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: b */
    public final C33246ar mo85127b(String str) {
        this.f86592F = str;
        return this;
    }

    /* renamed from: c */
    public final C33246ar mo85129c(String str) {
        this.f86599v = str;
        return this;
    }

    /* renamed from: d */
    public final C33246ar mo85130d(String str) {
        this.f86593G = str;
        return this;
    }

    /* renamed from: e */
    public final C33246ar mo85131e(String str) {
        this.f86594H = str;
        return this;
    }

    /* renamed from: f */
    public final C33246ar mo85132f(String str) {
        this.f86595I = str;
        return this;
    }

    /* renamed from: g */
    public final C33246ar mo85133g(String str) {
        this.f86602y = str;
        return this;
    }

    /* renamed from: c */
    public final C33246ar mo85128c(Aweme aweme, int i) {
        mo85247a(aweme);
        this.f86591E = aweme;
        if (aweme != null) {
            this.f86596a = aweme.getAid();
            this.f86597b = m107477c(aweme);
            this.f86603z = m107475a(aweme, i);
            this.f86601x = m107478d(aweme);
            this.f86598c = m107479e(aweme);
            this.f86600w = aweme.getAid();
            this.f86587A = C33230ac.m107209a(aweme.getDistance());
            if (aweme.isPoiRank()) {
                this.f86757i = aweme.getPoiRankCardStruct().getBackendTypeCode();
                this.f86588B = String.valueOf(aweme.getPoiRankCardStruct().getLocationIndex() + 1);
            }
            if (aweme.isPoiOperate()) {
                this.f86589C = aweme.getPoiOpCardStruct().getCardId();
                this.f86588B = String.valueOf(aweme.getPoiOpCardStruct().getLocationIndex() + 1);
            }
        }
        return this;
    }
}
