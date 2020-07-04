package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.detail.C26062g;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;
import com.p280ss.android.ugc.aweme.p1286g.C30187a;
import com.p280ss.android.ugc.aweme.utils.C43122ff;

/* renamed from: com.ss.android.ugc.aweme.metrics.az */
public final class C33255az extends C33270l<C33255az> {

    /* renamed from: A */
    private String f86710A;

    /* renamed from: B */
    private String f86711B = "";

    /* renamed from: C */
    private int f86712C = 1;

    /* renamed from: D */
    private String f86713D;

    /* renamed from: E */
    private String f86714E;

    /* renamed from: F */
    private String f86715F;

    /* renamed from: G */
    private String f86716G;

    /* renamed from: H */
    private String f86717H;

    /* renamed from: I */
    private int f86718I;

    /* renamed from: J */
    private String f86719J;

    /* renamed from: K */
    private String f86720K;

    /* renamed from: L */
    private String f86721L;

    /* renamed from: M */
    private double f86722M;

    /* renamed from: N */
    private String f86723N;

    /* renamed from: O */
    private String f86724O;

    /* renamed from: P */
    private boolean f86725P;

    /* renamed from: Q */
    private String f86726Q;

    /* renamed from: R */
    private String f86727R;

    /* renamed from: S */
    private String f86728S;

    /* renamed from: T */
    private String f86729T;

    /* renamed from: U */
    private int f86730U = -1;

    /* renamed from: V */
    private String f86731V;

    /* renamed from: W */
    private String f86732W;

    /* renamed from: X */
    private String f86733X;

    /* renamed from: Y */
    private String f86734Y;

    /* renamed from: Z */
    private String f86735Z;

    /* renamed from: a */
    private String f86736a;

    /* renamed from: aa */
    private String f86737aa;

    /* renamed from: ab */
    private String f86738ab;

    /* renamed from: ac */
    private String f86739ac;

    /* renamed from: ad */
    private boolean f86740ad;

    /* renamed from: ae */
    private String f86741ae;

    /* renamed from: af */
    private String f86742af;

    /* renamed from: b */
    private String f86743b;

    /* renamed from: c */
    private long f86744c;

    public C33255az() {
        super("play_time");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        String str;
        mo85250c();
        mo85248a("group_id", this.f86736a, C33260a.f86771b);
        mo85248a("author_id", this.f86743b, C33260a.f86771b);
        mo85248a("duration", String.valueOf(this.f86744c), C33260a.f86770a);
        mo85248a("player_type", this.f86713D, C33260a.f86770a);
        mo85248a("fps", this.f86714E, C33260a.f86770a);
        mo85248a("previous_page", this.f86723N, C33260a.f86770a);
        if (!TextUtils.isEmpty(this.f86711B)) {
            mo85248a("is_auto_play", this.f86711B, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86755g)) {
            mo85248a("poi_label_type", this.f86710A, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86728S)) {
            mo85248a("district_code", this.f86728S, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86729T)) {
            mo85248a("sub_class", this.f86729T, C33260a.f86770a);
        }
        if (this.f86730U > 0) {
            mo85248a("rank_index", String.valueOf(this.f86730U), C33260a.f86770a);
        }
        if (C33230ac.m107222d(this.f86753e)) {
            mo85255h(this.f86715F);
        }
        if ("like".equals(this.f86717H)) {
            mo85248a("enter_method", this.f86716G, C33260a.f86770a);
        }
        mo85248a("content_source", this.f86717H, C33260a.f86770a);
        if (C22494d.m74385a().mo59063a(this.f86736a)) {
            mo85248a("previous_page", "push", C33260a.f86770a);
        }
        if (this.f86718I != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f86718I);
            mo85248a("is_long_item", sb.toString(), C33260a.f86770a);
        }
        mo85253f();
        if ((TextUtils.equals(this.f86753e, "homepage_fresh") || TextUtils.equals(this.f86753e, "homepage_channel")) && C30187a.m98819b()) {
            mo85248a("tab_name", C30187a.m98818a(), C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86720K)) {
            mo85248a(this.f86720K, this.f86721L, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86719J)) {
            mo85248a("playlist_type", this.f86719J, C33260a.f86770a);
        }
        mo85248a("volume_value", String.valueOf(this.f86722M), C33260a.f86770a);
        if (!TextUtils.isEmpty(this.f86724O)) {
            mo85248a("impr_type", this.f86724O, C33260a.f86770a);
        }
        if (C6903bc.m21484c().mo59243c()) {
            mo85248a("is_teen_mode", "1", C33260a.f86770a);
        }
        if (C33230ac.m107224e(this.f86753e)) {
            mo85248a("is_auto_play", C33232ae.m107249a(this.f86725P), C33260a.f86770a);
            mo85248a("enter_fullscreen", String.valueOf(this.f86712C), C33260a.f86770a);
            if (!TextUtils.isEmpty(this.f86726Q)) {
                mo85248a("is_reposted", "1", C33260a.f86770a);
                mo85248a("repost_from_group_id", this.f86726Q, C33260a.f86770a);
                mo85248a("repost_from_user_id", this.f86727R, C33260a.f86770a);
            }
        }
        if (C33230ac.m107226f(this.f86753e)) {
            String str2 = "relation_type";
            if (this.f86740ad) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo85245a(str2, str);
            mo85245a("video_type", this.f86741ae);
            mo85245a("rec_uid", this.f86742af);
        }
        if (!TextUtils.isEmpty(this.f86731V)) {
            mo85248a("compilation_id", this.f86731V, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86732W)) {
            mo85248a("carrier_type", this.f86732W, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86733X)) {
            mo85248a("refer_seed_id", this.f86733X, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86734Y)) {
            mo85248a("refer_seed_name", this.f86734Y, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86735Z)) {
            mo85248a("from_group_id", this.f86735Z, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86737aa)) {
            mo85248a("data_type", this.f86737aa, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86738ab)) {
            mo85245a("refer_commodity_id", this.f86738ab);
        }
        if (C26062g.m85608a()) {
            mo85248a("request_id", this.f86715F, C33260a.f86771b);
            mo85245a("is_fullscreen", "1");
        }
        if (!TextUtils.isEmpty(this.f86739ac)) {
            mo85248a("search_keyword", this.f86739ac, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86769u)) {
            mo85245a("creation_id", this.f86769u);
        }
    }

    /* renamed from: a */
    public final C33255az mo85215a(double d) {
        this.f86722M = d;
        return this;
    }

    /* renamed from: b */
    public final C33255az mo85224b(String str) {
        this.f86723N = str;
        return this;
    }

    /* renamed from: c */
    public final C33255az mo85225c(String str) {
        this.f86711B = str;
        return this;
    }

    /* renamed from: d */
    public final C33255az mo85226d(String str) {
        this.f86713D = str;
        return this;
    }

    /* renamed from: e */
    public final C33255az mo85227e(String str) {
        this.f86715F = str;
        return this;
    }

    /* renamed from: f */
    public final C33255az mo85229f(String str) {
        this.f86716G = str;
        return this;
    }

    /* renamed from: g */
    public final C33255az mo85230g(String str) {
        this.f86717H = str;
        return this;
    }

    /* renamed from: i */
    public final C33255az mo85231i(String str) {
        this.f86719J = str;
        return this;
    }

    /* renamed from: j */
    public final C33255az mo85232j(String str) {
        this.f86720K = str;
        return this;
    }

    /* renamed from: k */
    public final C33255az mo85233k(String str) {
        this.f86721L = str;
        return this;
    }

    /* renamed from: o */
    public final C33255az mo85234o(String str) {
        this.f86732W = str;
        return this;
    }

    /* renamed from: p */
    public final C33255az mo85235p(String str) {
        this.f86733X = str;
        return this;
    }

    /* renamed from: q */
    public final C33255az mo85236q(String str) {
        this.f86734Y = str;
        return this;
    }

    /* renamed from: r */
    public final C33255az mo85237r(String str) {
        this.f86735Z = str;
        return this;
    }

    /* renamed from: s */
    public final C33255az mo85238s(String str) {
        this.f86738ab = str;
        return this;
    }

    /* renamed from: t */
    public final C33255az mo85239t(String str) {
        this.f86737aa = str;
        return this;
    }

    /* renamed from: u */
    public final C33255az mo85240u(String str) {
        this.f86739ac = str;
        return this;
    }

    /* renamed from: v */
    public final C33255az mo85241v(String str) {
        this.f86769u = str;
        return this;
    }

    /* renamed from: a */
    public final C33255az mo85216a(float f) {
        try {
            this.f86714E = String.valueOf(f);
        } catch (Exception unused) {
        }
        return this;
    }

    /* renamed from: a */
    public final C33255az mo85217a(int i) {
        this.f86718I = i;
        return this;
    }

    /* renamed from: b */
    public final C33255az mo85223b(FeedParam feedParam) {
        if (feedParam != null) {
            this.f86761m = feedParam.getPagePoiId();
        }
        return this;
    }

    /* renamed from: a */
    public final C33255az mo85218a(long j) {
        this.f86744c = j;
        return this;
    }

    /* renamed from: a */
    public final C33255az mo85219a(FeedParam feedParam) {
        if (feedParam != null) {
            this.f86765q = feedParam.getCardType();
            this.f86766r = feedParam.getObjectId();
        }
        return this;
    }

    /* renamed from: f */
    public final C33255az mo85071g(Aweme aweme) {
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86736a = aweme.getAid();
            this.f86743b = m107477c(aweme);
            this.f86724O = C33230ac.m107245t(aweme);
            if (aweme.getPoiStruct() != null) {
                this.f86710A = String.valueOf(aweme.getPoiStruct().getPoiSubTitleType());
            }
            this.f86725P = aweme.isImage();
            this.f86726Q = aweme.getRepostFromGroupId();
            this.f86727R = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.f86731V = aweme.getMixInfo().mixId;
            }
            this.f86740ad = C43122ff.m136762a(aweme);
            this.f86741ae = C33230ac.m107247v(aweme);
            this.f86742af = C33230ac.m107248w(aweme);
        }
        return this;
    }

    /* renamed from: a */
    public final C33255az mo85221a(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: a */
    public final C33255az mo85222a(boolean z) {
        this.f86712C = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public final C33255az mo85220a(FeedParam feedParam, int i) {
        if (feedParam != null) {
            this.f86757i = feedParam.getBackendType();
            this.f86754f = feedParam.getCityCode();
            this.f86728S = feedParam.getDistrictCode();
            this.f86729T = feedParam.getSubClass();
            this.f86730U = i;
        }
        return this;
    }
}
