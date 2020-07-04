package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.detail.C26062g;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.follow.p1262e.C29451a;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;
import com.p280ss.android.ugc.aweme.utils.C43122ff;

/* renamed from: com.ss.android.ugc.aweme.metrics.ay */
public final class C33254ay extends C33270l<C33254ay> {

    /* renamed from: A */
    private String f86682A;

    /* renamed from: B */
    private String f86683B = "";

    /* renamed from: C */
    private String f86684C;

    /* renamed from: D */
    private String f86685D;

    /* renamed from: E */
    private int f86686E;

    /* renamed from: F */
    private String f86687F;

    /* renamed from: G */
    private String f86688G;

    /* renamed from: H */
    private String f86689H;

    /* renamed from: I */
    private String f86690I;

    /* renamed from: J */
    private String f86691J;

    /* renamed from: K */
    private String f86692K;

    /* renamed from: L */
    private int f86693L = 1;

    /* renamed from: M */
    private boolean f86694M;

    /* renamed from: N */
    private String f86695N;

    /* renamed from: O */
    private String f86696O;

    /* renamed from: P */
    private String f86697P;

    /* renamed from: Q */
    private String f86698Q;

    /* renamed from: R */
    private int f86699R = -1;

    /* renamed from: S */
    private String f86700S;

    /* renamed from: T */
    private boolean f86701T;

    /* renamed from: U */
    private String f86702U;

    /* renamed from: V */
    private String f86703V;

    /* renamed from: W */
    private String f86704W;

    /* renamed from: X */
    private String f86705X;

    /* renamed from: Y */
    private String f86706Y;

    /* renamed from: a */
    private String f86707a;

    /* renamed from: b */
    private String f86708b;

    /* renamed from: c */
    private String f86709c;

    public C33254ay() {
        super("video_play_finish");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        String str;
        mo85250c();
        mo85248a("group_id", this.f86707a, C33260a.f86771b);
        mo85248a("author_id", this.f86708b, C33260a.f86771b);
        mo85248a("request_id", this.f86709c, C33260a.f86771b);
        if (!TextUtils.isEmpty(this.f86683B)) {
            mo85248a("is_auto_play", this.f86683B, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86755g)) {
            mo85248a("poi_label_type", this.f86682A, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86697P)) {
            mo85248a("district_code", this.f86697P, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86698Q)) {
            mo85248a("sub_class", this.f86698Q, C33260a.f86770a);
        }
        if (this.f86699R > 0) {
            mo85248a("rank_index", String.valueOf(this.f86699R), C33260a.f86770a);
        }
        if (C33230ac.m107222d(this.f86753e)) {
            mo85255h(this.f86709c);
        }
        if ("like".equals(this.f86685D)) {
            mo85248a("enter_method", this.f86684C, C33260a.f86770a);
        }
        mo85248a("content_source", this.f86685D, C33260a.f86770a);
        if (C22494d.m74385a().mo59063a(this.f86707a)) {
            mo85248a("previous_page", "push", C33260a.f86770a);
        } else {
            mo85248a("previous_page", this.f86690I, C33260a.f86770a);
        }
        if (this.f86686E != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f86686E);
            mo85248a("is_long_item", sb.toString(), C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86688G)) {
            mo85248a(this.f86688G, this.f86689H, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86687F)) {
            mo85248a("playlist_type", this.f86687F, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86692K)) {
            mo85248a("video_type", this.f86692K, C33260a.f86770a);
        }
        mo85253f();
        if (!TextUtils.isEmpty(this.f86691J)) {
            mo85248a("impr_type", this.f86691J, C33260a.f86770a);
        }
        if (C6903bc.m21484c().mo59243c()) {
            mo85248a("is_teen_mode", "1", C33260a.f86770a);
        }
        if (C33230ac.m107224e(this.f86753e)) {
            mo85248a("is_auto_play", C33232ae.m107249a(this.f86694M), C33260a.f86770a);
            mo85248a("enter_fullscreen", String.valueOf(this.f86693L), C33260a.f86770a);
            if (!TextUtils.isEmpty(this.f86695N)) {
                mo85248a("is_reposted", "1", C33260a.f86770a);
                mo85248a("repost_from_group_id", this.f86695N, C33260a.f86770a);
                mo85248a("repost_from_user_id", this.f86696O, C33260a.f86770a);
            }
            mo85245a("notice_type", C29451a.m96918a());
            mo85245a("show_cnt", String.valueOf(C29451a.m96919b()));
            mo85245a("yellow_dot_logid", C29451a.m96920c());
        }
        if (C33230ac.m107226f(this.f86753e)) {
            String str2 = "relation_type";
            if (this.f86701T) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo85245a(str2, str);
            mo85245a("video_type", this.f86702U);
            mo85245a("rec_uid", this.f86703V);
        }
        if (!TextUtils.isEmpty(this.f86700S)) {
            mo85248a("compilation_id", this.f86700S, C33260a.f86770a);
        }
        if (C26062g.m85608a()) {
            mo85245a("is_fullscreen", "1");
        }
        if (C33230ac.m107228g(this.f86753e) && C6399b.m19944t()) {
            mo85245a("process_id", this.f86704W);
            mo85245a("rank_index", this.f86705X);
            mo85245a("tag_id", this.f86706Y);
        }
        if (!TextUtils.isEmpty(this.f86769u)) {
            mo85245a("creation_id", this.f86769u);
        }
    }

    /* renamed from: a */
    public final C33254ay mo85194a(int i) {
        this.f86686E = i;
        return this;
    }

    /* renamed from: b */
    public final C33254ay mo85200b(String str) {
        this.f86690I = str;
        return this;
    }

    /* renamed from: c */
    public final C33254ay mo85204c(String str) {
        this.f86683B = str;
        return this;
    }

    /* renamed from: d */
    public final C33254ay mo85205d(String str) {
        this.f86709c = str;
        return this;
    }

    /* renamed from: e */
    public final C33254ay mo85206e(String str) {
        this.f86684C = str;
        return this;
    }

    /* renamed from: f */
    public final C33254ay mo85208f(String str) {
        this.f86685D = str;
        return this;
    }

    /* renamed from: g */
    public final C33254ay mo85209g(String str) {
        this.f86687F = str;
        return this;
    }

    /* renamed from: i */
    public final C33254ay mo85210i(String str) {
        this.f86688G = str;
        return this;
    }

    /* renamed from: j */
    public final C33254ay mo85211j(String str) {
        this.f86689H = str;
        return this;
    }

    /* renamed from: k */
    public final C33254ay mo85212k(String str) {
        this.f86704W = str;
        return this;
    }

    /* renamed from: o */
    public final C33254ay mo85213o(String str) {
        this.f86705X = str;
        return this;
    }

    /* renamed from: p */
    public final C33254ay mo85214p(String str) {
        this.f86706Y = str;
        return this;
    }

    /* renamed from: a */
    public final C33254ay mo85197a(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: a */
    public final C33254ay mo85195a(FeedParam feedParam) {
        if (feedParam != null) {
            this.f86765q = feedParam.getCardType();
            this.f86766r = feedParam.getObjectId();
        }
        return this;
    }

    /* renamed from: b */
    public final C33254ay mo85199b(FeedParam feedParam) {
        if (feedParam != null) {
            this.f86761m = feedParam.getPagePoiId();
        }
        return this;
    }

    /* renamed from: c */
    public final C33254ay mo85203c(FeedParam feedParam) {
        if (feedParam != null) {
            this.f86769u = feedParam.getCreationId();
        }
        return this;
    }

    /* renamed from: a */
    public final C33254ay mo85198a(boolean z) {
        this.f86693L = 0;
        return this;
    }

    /* renamed from: f */
    public final C33254ay mo85071g(Aweme aweme) {
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86707a = aweme.getAid();
            this.f86708b = m107477c(aweme);
            this.f86709c = C33230ac.m107219c(aweme);
            this.f86691J = C33230ac.m107245t(aweme);
            if (aweme.getPoiStruct() != null) {
                this.f86682A = String.valueOf(aweme.getPoiStruct().getPoiSubTitleType());
            }
            this.f86694M = aweme.isImage();
            this.f86695N = aweme.getRepostFromGroupId();
            this.f86696O = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.f86700S = aweme.getMixInfo().mixId;
            }
            this.f86701T = C43122ff.m136762a(aweme);
            this.f86702U = C33230ac.m107247v(aweme);
            this.f86703V = C33230ac.m107248w(aweme);
        }
        return this;
    }

    /* renamed from: b */
    public final C33254ay mo85201b(String str, String str2) {
        this.f86707a = str;
        this.f86708b = str2;
        return this;
    }

    /* renamed from: a */
    public final C33254ay mo85196a(FeedParam feedParam, int i) {
        if (feedParam != null) {
            this.f86757i = feedParam.getBackendType();
            this.f86754f = feedParam.getCityCode();
            this.f86697P = feedParam.getDistrictCode();
            this.f86698Q = feedParam.getSubClass();
            this.f86699R = i;
        }
        return this;
    }

    /* renamed from: c */
    public final C33254ay mo85202c(Aweme aweme, int i) {
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86707a = aweme.getAid();
            this.f86708b = m107477c(aweme);
            this.f86709c = m107475a(aweme, i);
            this.f86691J = C33230ac.m107245t(aweme);
            this.f86694M = aweme.isImage();
            if (aweme.getPoiStruct() != null) {
                this.f86682A = String.valueOf(aweme.getPoiStruct().getPoiSubTitleType());
            }
            this.f86694M = aweme.isImage();
            this.f86695N = aweme.getRepostFromGroupId();
            this.f86696O = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.f86700S = aweme.getMixInfo().mixId;
            }
            this.f86701T = C43122ff.m136762a(aweme);
            this.f86702U = C33230ac.m107247v(aweme);
            this.f86703V = C33230ac.m107248w(aweme);
        }
        return this;
    }
}
