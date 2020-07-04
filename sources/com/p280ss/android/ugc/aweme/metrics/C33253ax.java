package com.p280ss.android.ugc.aweme.metrics;

import android.provider.Settings.System;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.detail.C26062g;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.follow.p1262e.C29451a;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.utils.C43122ff;

/* renamed from: com.ss.android.ugc.aweme.metrics.ax */
public final class C33253ax extends C33270l<C33253ax> {

    /* renamed from: A */
    private String f86635A;

    /* renamed from: B */
    private String f86636B;

    /* renamed from: C */
    private String f86637C;

    /* renamed from: D */
    private String f86638D;

    /* renamed from: E */
    private String f86639E = "0";

    /* renamed from: F */
    private Integer f86640F;

    /* renamed from: G */
    private String f86641G;

    /* renamed from: H */
    private String f86642H = "";

    /* renamed from: I */
    private String f86643I;

    /* renamed from: J */
    private String f86644J;

    /* renamed from: K */
    private String f86645K;

    /* renamed from: L */
    private String f86646L;

    /* renamed from: M */
    private String f86647M;

    /* renamed from: N */
    private int f86648N = 1;

    /* renamed from: O */
    private String f86649O;

    /* renamed from: P */
    private String f86650P;

    /* renamed from: Q */
    private String f86651Q;

    /* renamed from: R */
    private int f86652R;

    /* renamed from: S */
    private String f86653S;

    /* renamed from: T */
    private String f86654T;

    /* renamed from: U */
    private String f86655U;

    /* renamed from: V */
    private String f86656V;

    /* renamed from: W */
    private int f86657W;

    /* renamed from: X */
    private String f86658X;

    /* renamed from: Y */
    private String f86659Y;

    /* renamed from: Z */
    private String f86660Z;

    /* renamed from: a */
    protected String f86661a;

    /* renamed from: aa */
    private String f86662aa;

    /* renamed from: ab */
    private int f86663ab;

    /* renamed from: ac */
    private boolean f86664ac;

    /* renamed from: ad */
    private String f86665ad;

    /* renamed from: ae */
    private String f86666ae;

    /* renamed from: af */
    private String f86667af;

    /* renamed from: ag */
    private String f86668ag;

    /* renamed from: ah */
    private int f86669ah = -1;

    /* renamed from: ai */
    private String f86670ai;

    /* renamed from: aj */
    private String f86671aj;

    /* renamed from: ak */
    private String f86672ak;

    /* renamed from: al */
    private String f86673al;

    /* renamed from: am */
    private String f86674am;

    /* renamed from: an */
    private String f86675an;

    /* renamed from: ao */
    private String f86676ao;

    /* renamed from: ap */
    private boolean f86677ap;

    /* renamed from: aq */
    private String f86678aq;

    /* renamed from: ar */
    private String f86679ar;

    /* renamed from: b */
    private String f86680b;

    /* renamed from: c */
    private String f86681c;

    public C33253ax() {
        super("video_play");
    }

    /* renamed from: h */
    private void m107377h() {
        try {
            if (System.getInt(C6399b.m19921a().getContentResolver(), "accelerometer_rotation") == 0) {
                this.f86663ab = 0;
            } else {
                this.f86663ab = 1;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: i */
    private void m107378i() {
        if (TextUtils.isEmpty(this.f86636B)) {
            StringBuilder sb = new StringBuilder("仅 local_test，核心埋点遗漏数据，如果你没有 map local，please contact liuyiming.777,log_pb shouldn't be null,aid:");
            sb.append(this.f86680b);
            C10761a.m31403c(C6399b.m19921a(), new IllegalArgumentException(sb.toString()).getMessage()).mo25750a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        String str;
        mo85250c();
        mo85248a("group_id", this.f86680b, C33260a.f86771b);
        mo85248a("author_id", this.f86681c, C33260a.f86771b);
        mo85248a("player_type", this.f86635A, C33260a.f86770a);
        mo85248a("request_id", this.f86636B, C33260a.f86771b);
        mo85248a(POIService.KEY_ORDER, this.f86643I, C33260a.f86770a);
        mo85248a("feed_count", this.f86644J, C33260a.f86770a);
        mo85248a("previous_page", this.f86645K, C33260a.f86770a);
        mo85248a("is_photo", this.f86639E, C33260a.f86770a);
        if (this.f86640F != null) {
            mo85248a(C22704b.f60415d, String.valueOf(this.f86640F), C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86642H)) {
            mo85248a("is_auto_play", this.f86642H, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86641G)) {
            mo85248a("share_mode", "token", C33260a.f86770a);
            mo85248a("uid", this.f86641G, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86755g)) {
            mo85248a("poi_label_type", this.f86637C, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86638D)) {
            mo85248a("distance_km", this.f86638D, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86667af)) {
            mo85248a("district_code", this.f86667af, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86668ag)) {
            mo85248a("sub_class", this.f86668ag, C33260a.f86770a);
        }
        if (this.f86669ah > 0) {
            mo85248a("rank_index", String.valueOf(this.f86669ah), C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86646L)) {
            mo85248a("enter_from_request", this.f86646L, C33260a.f86771b);
        }
        if (!TextUtils.isEmpty(this.f86647M)) {
            mo85248a("search_keyword", this.f86647M, C33260a.f86770a);
        }
        if (C33230ac.m107222d(this.f86753e)) {
            if (C7163a.m22363a() && "homepage_hot".equals(this.f86753e)) {
                m107378i();
            }
            mo85255h(this.f86636B);
        }
        if (!TextUtils.isEmpty(this.f86661a)) {
            mo85245a("video_type", this.f86661a);
        }
        if (!TextUtils.isEmpty(this.f86649O)) {
            mo85248a("account_type", this.f86649O, C33260a.f86770a);
        }
        mo85248a("is_h265", String.valueOf(this.f86657W), C33260a.f86770a);
        if ("like".equals(this.f86651Q) || "homepage_fresh".equalsIgnoreCase(this.f86753e) || "poi_page".equalsIgnoreCase(this.f86753e) || "poi_map".equalsIgnoreCase(this.f86753e) || "homepage_channel".equals(this.f86753e)) {
            if ("poi_page".equalsIgnoreCase(this.f86753e) && TextUtils.isEmpty(this.f86650P)) {
                this.f86650P = "auto";
            }
            mo85248a("enter_method", this.f86650P, C33260a.f86770a);
        }
        mo85248a("content_source", this.f86651Q, C33260a.f86770a);
        if (C22494d.m74385a().mo59063a(this.f86680b)) {
            mo85248a("previous_page", "push", C33260a.f86770a);
        }
        if (this.f86652R != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f86652R);
            mo85248a("is_long_item", sb.toString(), C33260a.f86770a);
        }
        mo85253f();
        mo85248a("enter_play_method", "manul_play", C33260a.f86770a);
        if (!TextUtils.isEmpty(this.f86659Y)) {
            mo85248a(this.f86659Y, this.f86660Z, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86658X)) {
            mo85248a("playlist_type", this.f86658X, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86662aa)) {
            mo85248a("rule_id", this.f86662aa, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86653S)) {
            mo85248a("impr_type", this.f86653S, C33260a.f86770a);
        }
        mo85248a("is_auto_rotate", String.valueOf(this.f86663ab), C33260a.f86770a);
        if (C6903bc.m21484c().mo59243c()) {
            mo85248a("is_teen_mode", "1", C33260a.f86770a);
        }
        if (C33230ac.m107224e(this.f86753e)) {
            mo85248a("is_auto_play", C33232ae.m107249a(this.f86664ac), C33260a.f86770a);
            mo85248a("enter_fullscreen", String.valueOf(this.f86648N), C33260a.f86770a);
            if (!TextUtils.isEmpty(this.f86665ad)) {
                mo85248a("is_reposted", "1", C33260a.f86770a);
                mo85248a("repost_from_group_id", this.f86665ad, C33260a.f86770a);
                mo85248a("repost_from_user_id", this.f86666ae, C33260a.f86770a);
            }
            mo85245a("notice_type", C29451a.m96918a());
            mo85245a("show_cnt", String.valueOf(C29451a.m96919b()));
            mo85245a("yellow_dot_logid", C29451a.m96920c());
        }
        if (C33230ac.m107226f(this.f86753e)) {
            String str2 = "relation_type";
            if (this.f86677ap) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo85245a(str2, str);
            mo85245a("video_type", this.f86678aq);
            mo85245a("rec_uid", this.f86679ar);
        }
        if (C33230ac.m107228g(this.f86753e) && C6399b.m19944t()) {
            mo85245a("process_id", this.f86654T);
            mo85245a("rank_index", this.f86655U);
            mo85245a("tag_id", this.f86656V);
        }
        if (!TextUtils.isEmpty(this.f86670ai)) {
            mo85248a("compilation_id", this.f86670ai, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86671aj)) {
            mo85248a("carrier_type", this.f86671aj, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86672ak)) {
            mo85248a("refer_seed_id", this.f86672ak, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86673al)) {
            mo85248a("refer_seed_name", this.f86673al, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86674am)) {
            mo85248a("from_group_id", this.f86674am, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86675an)) {
            mo85248a("data_type", this.f86675an, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86676ao)) {
            mo85245a("refer_commodity_id", this.f86676ao);
        }
        if (C26062g.m85608a()) {
            mo85245a("is_fullscreen", "1");
        }
        if (!TextUtils.isEmpty(this.f86769u)) {
            mo85245a("creation_id", this.f86769u);
        }
    }

    /* renamed from: A */
    public final C33253ax mo85160A(String str) {
        this.f86675an = str;
        return this;
    }

    /* renamed from: a */
    public final C33253ax mo85164a(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: b */
    public final C33253ax mo85167b(int i) {
        this.f86652R = i;
        return this;
    }

    /* renamed from: c */
    public final C33253ax mo85173c(String str) {
        this.f86655U = str;
        return this;
    }

    /* renamed from: d */
    public final C33253ax mo85174d(String str) {
        this.f86656V = str;
        return this;
    }

    /* renamed from: e */
    public final C33253ax mo85175e(String str) {
        this.f86676ao = str;
        return this;
    }

    /* renamed from: f */
    public final C33253ax mo85177f(String str) {
        this.f86642H = str;
        return this;
    }

    /* renamed from: g */
    public final C33253ax mo85178g(String str) {
        this.f86641G = str;
        return this;
    }

    /* renamed from: i */
    public final C33253ax mo85179i(String str) {
        this.f86645K = str;
        return this;
    }

    /* renamed from: j */
    public final C33253ax mo85180j(String str) {
        this.f86647M = str;
        return this;
    }

    /* renamed from: k */
    public final C33253ax mo85181k(String str) {
        this.f86646L = str;
        return this;
    }

    /* renamed from: o */
    public final C33253ax mo85182o(String str) {
        this.f86635A = str;
        return this;
    }

    /* renamed from: p */
    public final C33253ax mo85183p(String str) {
        this.f86649O = str;
        return this;
    }

    /* renamed from: q */
    public final C33253ax mo85184q(String str) {
        this.f86650P = str;
        return this;
    }

    /* renamed from: r */
    public final C33253ax mo85185r(String str) {
        this.f86651Q = str;
        return this;
    }

    /* renamed from: s */
    public final C33253ax mo85186s(String str) {
        this.f86658X = str;
        return this;
    }

    /* renamed from: t */
    public final C33253ax mo85187t(String str) {
        this.f86659Y = str;
        return this;
    }

    /* renamed from: u */
    public final C33253ax mo85188u(String str) {
        this.f86660Z = str;
        return this;
    }

    /* renamed from: v */
    public final C33253ax mo85189v(String str) {
        this.f86662aa = str;
        return this;
    }

    /* renamed from: w */
    public final C33253ax mo85190w(String str) {
        this.f86671aj = str;
        return this;
    }

    /* renamed from: x */
    public final C33253ax mo85191x(String str) {
        this.f86672ak = str;
        return this;
    }

    /* renamed from: y */
    public final C33253ax mo85192y(String str) {
        this.f86673al = str;
        return this;
    }

    /* renamed from: z */
    public final C33253ax mo85193z(String str) {
        this.f86674am = str;
        return this;
    }

    /* renamed from: a */
    public final C33253ax mo85161a(int i) {
        this.f86640F = Integer.valueOf(i);
        return this;
    }

    /* renamed from: b */
    public final C33253ax mo85169b(String str) {
        this.f86654T = str;
        return this;
    }

    /* renamed from: a */
    public final C33253ax mo85162a(FeedParam feedParam) {
        if (feedParam != null) {
            this.f86765q = feedParam.getCardType();
            this.f86766r = feedParam.getObjectId();
        }
        return this;
    }

    /* renamed from: b */
    public final C33253ax mo85168b(FeedParam feedParam) {
        if (feedParam != null) {
            this.f86761m = feedParam.getPagePoiId();
        }
        return this;
    }

    /* renamed from: c */
    public final C33253ax mo85172c(FeedParam feedParam) {
        if (feedParam != null) {
            this.f86769u = feedParam.getCreationId();
        }
        return this;
    }

    /* renamed from: b */
    public final C33253ax mo85170b(boolean z) {
        this.f86657W = z ? 1 : 0;
        return this;
    }

    public C33253ax(String str) {
        super(str);
    }

    /* renamed from: a */
    public final C33253ax mo85166a(boolean z) {
        this.f86648N = z ? 1 : 0;
        return this;
    }

    /* renamed from: f */
    public final C33253ax mo85071g(Aweme aweme) {
        String str;
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86680b = aweme.getAid();
            this.f86681c = m107477c(aweme);
            this.f86636B = C33230ac.m107219c(aweme);
            if (aweme.isImage()) {
                str = "1";
            } else {
                str = "0";
            }
            this.f86639E = str;
            this.f86638D = C33230ac.m107209a(aweme.getDistance());
            this.f86653S = C33230ac.m107245t(aweme);
            if (aweme.getPoiStruct() != null) {
                this.f86637C = String.valueOf(aweme.getPoiStruct().getPoiSubTitleType());
            }
            this.f86664ac = aweme.isImage();
            this.f86665ad = aweme.getRepostFromGroupId();
            this.f86666ae = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.f86670ai = aweme.getMixInfo().mixId;
            }
            this.f86677ap = C43122ff.m136762a(aweme);
            this.f86678aq = C33230ac.m107247v(aweme);
            this.f86679ar = C33230ac.m107248w(aweme);
        }
        m107377h();
        return this;
    }

    /* renamed from: a */
    public final C33253ax mo85163a(FeedParam feedParam, int i) {
        if (feedParam != null) {
            this.f86757i = feedParam.getBackendType();
            this.f86754f = feedParam.getCityCode();
            this.f86667af = feedParam.getDistrictCode();
            this.f86668ag = feedParam.getSubClass();
            this.f86669ah = i;
        }
        return this;
    }

    /* renamed from: c */
    public final C33253ax mo85171c(Aweme aweme, int i) {
        String str;
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86680b = aweme.getAid();
            this.f86681c = m107477c(aweme);
            this.f86636B = m107475a(aweme, i);
            this.f86643I = m107476b(aweme, i);
            this.f86644J = String.valueOf(aweme.getFeedCount());
            if (aweme.isImage()) {
                str = "1";
            } else {
                str = "0";
            }
            this.f86639E = str;
            this.f86664ac = aweme.isImage();
            this.f86638D = C33230ac.m107209a(aweme.getDistance());
            this.f86653S = C33230ac.m107245t(aweme);
            if (aweme.getPoiStruct() != null) {
                this.f86637C = String.valueOf(aweme.getPoiStruct().getPoiSubTitleType());
            }
            this.f86664ac = aweme.isImage();
            this.f86665ad = aweme.getRepostFromGroupId();
            this.f86666ae = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.f86670ai = aweme.getMixInfo().mixId;
            }
            this.f86677ap = C43122ff.m136762a(aweme);
            this.f86678aq = C33230ac.m107247v(aweme);
            this.f86679ar = C33230ac.m107248w(aweme);
        }
        m107377h();
        return this;
    }

    /* renamed from: a */
    public final C33253ax mo85165a(String str, String str2, String str3) {
        this.f86680b = str;
        this.f86681c = str2;
        this.f86636B = str3;
        return this;
    }
}
