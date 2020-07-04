package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.detail.C26062g;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;
import com.p280ss.android.ugc.aweme.p1286g.C30187a;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.metrics.am */
public final class C33241am extends C33270l<C33241am> {

    /* renamed from: A */
    private String f86545A = "normal_share";

    /* renamed from: B */
    private String f86546B;

    /* renamed from: C */
    private String f86547C;

    /* renamed from: D */
    private int f86548D;

    /* renamed from: E */
    private int f86549E;

    /* renamed from: F */
    private boolean f86550F;

    /* renamed from: G */
    private String f86551G;

    /* renamed from: H */
    private Aweme f86552H;

    /* renamed from: I */
    private String f86553I;

    /* renamed from: J */
    private String f86554J;

    /* renamed from: K */
    private String f86555K;

    /* renamed from: L */
    private String f86556L;

    /* renamed from: M */
    private String f86557M;

    /* renamed from: N */
    private String f86558N;

    /* renamed from: O */
    private String f86559O;

    /* renamed from: P */
    private String f86560P;

    /* renamed from: Q */
    private boolean f86561Q;

    /* renamed from: R */
    private String f86562R;

    /* renamed from: S */
    private String f86563S;

    /* renamed from: a */
    private String f86564a;

    /* renamed from: b */
    private String f86565b;

    /* renamed from: c */
    private String f86566c;

    public C33241am() {
        super("share_video");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        String str;
        mo85250c();
        mo85248a("group_id", this.f86564a, C33260a.f86771b);
        mo85248a("author_id", this.f86565b, C33260a.f86771b);
        mo85248a("platform", this.f86566c, C33260a.f86770a);
        mo85248a("content_type", this.f86546B, C33260a.f86770a);
        mo85248a("share_mode", this.f86547C, C33260a.f86770a);
        mo85248a("reflow_flag", String.valueOf(this.f86549E), C33260a.f86770a);
        mo85248a("enter_method", this.f86545A, C33260a.f86770a);
        if (C33230ac.m107222d(this.f86753e)) {
            mo85255h(C33230ac.m107219c(this.f86552H));
        }
        if (this.f86548D != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f86548D);
            mo85248a("is_long_item", sb.toString(), C33260a.f86770a);
        }
        if (this.f86550F) {
            mo85248a("scene_id", this.f86551G, C33260a.f86771b);
            mo85248a("country_name", this.f86800v, C33260a.f86770a);
            mo85251d();
            mo85255h(C33230ac.m107219c(this.f86552H));
        }
        mo85246a((Map<String, String>) C6903bc.m21485d().mo75947a(this.f86552H, C6903bc.m21485d().mo75946a()));
        if (C22494d.m74385a().mo59063a(this.f86564a)) {
            mo85248a("previous_page", "push", C33260a.f86770a);
        } else {
            mo85248a("previous_page", this.f86557M, C33260a.f86770a);
        }
        mo85253f();
        if (!TextUtils.isEmpty(this.f86554J)) {
            mo85248a(this.f86554J, this.f86555K, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86553I)) {
            mo85248a("playlist_type", this.f86553I, C33260a.f86770a);
        }
        if ((TextUtils.equals(this.f86753e, "homepage_fresh") || TextUtils.equals(this.f86753e, "homepage_channel")) && C30187a.m98819b()) {
            mo85245a("tab_name", BusinessComponentServiceUtils.getBusinessBridgeService().mo61469a());
        }
        mo85248a("sector", this.f86556L, C33260a.f86770a);
        if (!TextUtils.isEmpty(this.f86558N)) {
            mo85248a("impr_type", this.f86558N, C33260a.f86770a);
        }
        if (C33230ac.m107224e(this.f86753e) && !TextUtils.isEmpty(this.f86559O)) {
            mo85248a("is_reposted", "1", C33260a.f86770a);
            mo85248a("repost_from_group_id", this.f86559O, C33260a.f86770a);
            mo85248a("repost_from_user_id", this.f86560P, C33260a.f86770a);
        }
        mo85248a("request_id", C33230ac.m107219c(this.f86552H), C33260a.f86771b);
        if (C26062g.m85608a()) {
            mo85245a("is_fullscreen", "1");
        }
        if (C33230ac.m107226f(this.f86753e)) {
            String str2 = "relation_type";
            if (this.f86561Q) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo85245a(str2, str);
            mo85245a("video_type", this.f86562R);
            mo85245a("rec_uid", this.f86563S);
        }
        if (!TextUtils.isEmpty(this.f86769u)) {
            mo85245a("creation_id", this.f86769u);
        }
    }

    /* renamed from: a */
    public final C33241am mo85104a(int i) {
        this.f86548D = i;
        return this;
    }

    /* renamed from: b */
    public final C33241am mo85106b(int i) {
        this.f86549E = i;
        return this;
    }

    /* renamed from: c */
    public final C33241am mo85108c(String str) {
        this.f86554J = str;
        return this;
    }

    /* renamed from: d */
    public final C33241am mo85109d(String str) {
        this.f86555K = str;
        return this;
    }

    /* renamed from: e */
    public final C33241am mo85110e(String str) {
        this.f86545A = str;
        return this;
    }

    /* renamed from: f */
    public final C33241am mo85112f(String str) {
        this.f86566c = str;
        return this;
    }

    /* renamed from: g */
    public final C33241am mo85113g(String str) {
        this.f86769u = str;
        return this;
    }

    /* renamed from: a */
    public final C33241am mo85105a(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: b */
    public final C33241am mo85107b(String str) {
        this.f86553I = str;
        return this;
    }

    /* renamed from: f */
    public final C33241am mo85071g(Aweme aweme) {
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86552H = aweme;
            this.f86564a = aweme.getAid();
            this.f86565b = m107477c(aweme);
            this.f86546B = C33230ac.m107240o(aweme);
            this.f86558N = C33230ac.m107245t(aweme);
            this.f86559O = aweme.getRepostFromGroupId();
            this.f86560P = aweme.getRepostFromUserId();
            this.f86561Q = C43122ff.m136762a(aweme);
            this.f86562R = C33230ac.m107247v(aweme);
            this.f86563S = C33230ac.m107248w(aweme);
        }
        return this;
    }
}
