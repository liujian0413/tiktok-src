package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.detail.C26062g;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;
import com.p280ss.android.ugc.aweme.p1286g.C30187a;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.metrics.af */
public final class C33233af extends C33270l<C33233af> {

    /* renamed from: A */
    private String f86494A;

    /* renamed from: B */
    private String f86495B;

    /* renamed from: C */
    private String f86496C;

    /* renamed from: D */
    private String f86497D;

    /* renamed from: E */
    private String f86498E;

    /* renamed from: F */
    private String f86499F;

    /* renamed from: G */
    private int f86500G;

    /* renamed from: H */
    private boolean f86501H;

    /* renamed from: I */
    private Aweme f86502I;

    /* renamed from: J */
    private String f86503J;

    /* renamed from: K */
    private String f86504K;

    /* renamed from: L */
    private String f86505L;

    /* renamed from: M */
    private String f86506M;

    /* renamed from: N */
    private String f86507N;

    /* renamed from: O */
    private String f86508O;

    /* renamed from: P */
    private int f86509P = 1;

    /* renamed from: Q */
    private String f86510Q;

    /* renamed from: R */
    private String f86511R;

    /* renamed from: S */
    private String f86512S;

    /* renamed from: T */
    private String f86513T;

    /* renamed from: U */
    private String f86514U;

    /* renamed from: V */
    private String f86515V;

    /* renamed from: a */
    private String f86516a;

    /* renamed from: b */
    private String f86517b;

    /* renamed from: c */
    private String f86518c;

    public C33233af() {
        super("post_comment");
    }

    /* renamed from: h */
    private void m107250h() {
        if (C33230ac.m107226f(this.f86753e) || (this.f86502I != null && this.f86502I.isFamiliar())) {
            mo85248a("relation_type", this.f86513T, C33260a.f86770a);
            mo85248a("rec_uid", C33230ac.m107248w(this.f86502I), C33260a.f86770a);
            mo85248a("video_type", C33230ac.m107247v(this.f86502I), C33260a.f86770a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85250c();
        mo85248a("group_id", this.f86516a, C33260a.f86771b);
        mo85248a("author_id", this.f86517b, C33260a.f86771b);
        if (!TextUtils.isEmpty(this.f86494A)) {
            mo85248a("comment_category", this.f86494A, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86518c)) {
            mo85248a("reply_to_comment_id", this.f86518c, C33260a.f86771b);
        }
        if (!TextUtils.isEmpty(this.f86496C)) {
            mo85248a(C38347c.f99553h, this.f86496C, C33260a.f86770a);
        }
        if (C33230ac.m107222d(this.f86753e)) {
            mo85255h(C33230ac.m107219c(this.f86502I));
        }
        mo85246a((Map<String, String>) C6903bc.m21485d().mo75947a(this.f86502I, this.f86499F));
        if (C22494d.m74385a().mo59063a(this.f86516a)) {
            mo85248a("previous_page", "push", C33260a.f86770a);
        } else {
            mo85248a("previous_page", this.f86506M, C33260a.f86770a);
        }
        mo85253f();
        if (this.f86500G == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f86500G);
            mo85248a("is_long_item", sb.toString(), C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86495B)) {
            mo85248a("emoji_times", this.f86495B, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86504K)) {
            mo85248a(this.f86504K, this.f86505L, C33260a.f86770a);
        }
        mo85248a("is_retry", String.valueOf(this.f86501H ? 1 : 0), C33260a.f86770a);
        if (!TextUtils.isEmpty(this.f86503J)) {
            mo85248a("playlist_type", this.f86503J, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86497D)) {
            mo85248a("enter_method", this.f86497D, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86507N)) {
            mo85248a("impr_type", this.f86507N, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(BusinessComponentServiceUtils.getBusinessBridgeService().mo61469a()) && ((TextUtils.equals(this.f86753e, "homepage_fresh") || TextUtils.equals(this.f86753e, "homepage_channel")) && C30187a.m98819b())) {
            mo85245a("tab_name", BusinessComponentServiceUtils.getBusinessBridgeService().mo61469a());
        }
        if (C33230ac.m107224e(this.f86753e)) {
            if (!TextUtils.isEmpty(this.f86508O)) {
                mo85248a("content_type", this.f86508O, C33260a.f86770a);
            }
            mo85248a("enter_fullscreen", String.valueOf(this.f86509P), C33260a.f86770a);
            if (!TextUtils.isEmpty(this.f86510Q)) {
                mo85248a("is_reposted", "1", C33260a.f86770a);
                mo85248a("repost_from_group_id", this.f86510Q, C33260a.f86770a);
                mo85248a("repost_from_user_id", this.f86511R, C33260a.f86770a);
            }
        }
        if (!TextUtils.isEmpty(this.f86512S)) {
            mo85248a("compilation_id", this.f86512S, C33260a.f86770a);
        }
        mo85245a("request_id", C33230ac.m107219c(this.f86502I));
        if (C26062g.m85608a()) {
            mo85245a("is_fullscreen", "1");
        }
        m107250h();
        mo85245a("label_type", this.f86514U);
        mo85245a("relation_label_type", this.f86515V);
        if (!TextUtils.isEmpty(this.f86769u)) {
            mo85245a("creation_id", this.f86769u);
        }
    }

    /* renamed from: a */
    public final C33233af mo85060a(int i) {
        this.f86500G = i;
        return this;
    }

    /* renamed from: b */
    public final C33233af mo85063b(String str) {
        this.f86506M = str;
        return this;
    }

    /* renamed from: c */
    public final C33233af mo85065c(String str) {
        this.f86496C = str;
        return this;
    }

    /* renamed from: d */
    public final C33233af mo85066d(String str) {
        this.f86494A = str;
        return this;
    }

    /* renamed from: e */
    public final C33233af mo85067e(String str) {
        this.f86495B = str;
        return this;
    }

    /* renamed from: f */
    public final C33233af mo85069f(String str) {
        this.f86518c = str;
        return this;
    }

    /* renamed from: g */
    public final C33233af mo85070g(String str) {
        this.f86499F = str;
        return this;
    }

    /* renamed from: i */
    public final C33233af mo85072i(String str) {
        this.f86503J = str;
        return this;
    }

    /* renamed from: j */
    public final C33233af mo85073j(String str) {
        this.f86504K = str;
        return this;
    }

    /* renamed from: k */
    public final C33233af mo85074k(String str) {
        this.f86505L = str;
        return this;
    }

    /* renamed from: o */
    public final C33233af mo85075o(String str) {
        this.f86766r = str;
        return this;
    }

    /* renamed from: p */
    public final C33233af mo85076p(String str) {
        this.f86765q = str;
        return this;
    }

    /* renamed from: q */
    public final C33233af mo85077q(String str) {
        this.f86497D = str;
        return this;
    }

    /* renamed from: r */
    public final C33233af mo85078r(String str) {
        this.f86514U = str;
        return this;
    }

    /* renamed from: s */
    public final C33233af mo85079s(String str) {
        this.f86515V = str;
        return this;
    }

    /* renamed from: t */
    public final C33233af mo85080t(String str) {
        this.f86769u = str;
        return this;
    }

    /* renamed from: a */
    public final C33233af mo85061a(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: b */
    public final C33233af mo85064b(boolean z) {
        this.f86509P = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public final C33233af mo85062a(boolean z) {
        this.f86501H = z;
        return this;
    }

    /* renamed from: f */
    public final C33233af mo85071g(Aweme aweme) {
        String str;
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86502I = aweme;
            this.f86498E = aweme.getAid();
            this.f86516a = aweme.getAid();
            this.f86517b = aweme.getAuthorUid();
            this.f86507N = C33230ac.m107245t(aweme);
            this.f86508O = C33230ac.m107240o(aweme);
            this.f86510Q = aweme.getRepostFromGroupId();
            this.f86511R = aweme.getRepostFromUserId();
            if (C43122ff.m136762a(aweme)) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            this.f86513T = str;
            if (aweme.getMixInfo() != null) {
                this.f86512S = aweme.getMixInfo().mixId;
            }
        }
        return this;
    }
}
