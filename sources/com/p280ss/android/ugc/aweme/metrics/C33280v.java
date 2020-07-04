package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.detail.C26062g;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;
import com.p280ss.android.ugc.aweme.p1286g.C30187a;

/* renamed from: com.ss.android.ugc.aweme.metrics.v */
public final class C33280v extends C33270l<C33280v> {

    /* renamed from: A */
    private String f86869A;

    /* renamed from: B */
    private String f86870B;

    /* renamed from: C */
    private String f86871C;

    /* renamed from: D */
    private String f86872D;

    /* renamed from: E */
    private String f86873E;

    /* renamed from: F */
    private String f86874F;

    /* renamed from: G */
    private String f86875G;

    /* renamed from: H */
    private String f86876H;

    /* renamed from: I */
    private String f86877I;

    /* renamed from: J */
    private String f86878J;

    /* renamed from: K */
    private String f86879K;

    /* renamed from: L */
    private String f86880L;

    /* renamed from: M */
    private String f86881M;

    /* renamed from: N */
    private String f86882N;

    /* renamed from: O */
    private String f86883O;

    /* renamed from: P */
    private String f86884P;

    /* renamed from: a */
    private String f86885a;

    /* renamed from: b */
    private String f86886b;

    /* renamed from: c */
    private String f86887c;

    public C33280v() {
        super("follow");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85250c();
        mo85248a("scene_id", this.f86885a, C33260a.f86770a);
        mo85248a("previous_page", this.f86886b, C33260a.f86770a);
        mo85248a("previous_page_position", this.f86887c, C33260a.f86770a);
        mo85248a("enter_method", this.f86874F, C33260a.f86770a);
        mo85248a("to_user_id", this.f86869A, C33260a.f86771b);
        mo85248a("group_id", this.f86870B, C33260a.f86771b);
        mo85248a("author_id", this.f86869A, C33260a.f86771b);
        mo85248a("author_id", this.f86869A, C33260a.f86771b);
        mo85248a("page_status", this.f86878J, C33260a.f86770a);
        mo85248a("request_id", this.f86871C, C33260a.f86771b);
        mo85248a("enter_type", this.f86873E, C33260a.f86770a);
        if (!TextUtils.isEmpty(this.f86872D)) {
            mo85248a("enter_from_request", this.f86872D, C33260a.f86771b);
        }
        if (C33230ac.m107222d(this.f86753e) || "homepage_hot".equals(this.f86886b) || "potential_friends".equals(this.f86886b)) {
            mo85255h(this.f86871C);
        }
        if (!TextUtils.equals(this.f86752d, "follow_cancel")) {
            mo85253f();
        }
        if (C22494d.m74385a().mo59063a(this.f86870B)) {
            mo85248a("previous_page", "push", C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86876H)) {
            mo85248a(this.f86876H, this.f86877I, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86875G)) {
            mo85248a("playlist_type", this.f86875G, C33260a.f86770a);
        }
        if ((TextUtils.equals(this.f86753e, "homepage_fresh") || TextUtils.equals(this.f86753e, "homepage_channel")) && C30187a.m98819b()) {
            mo85245a("tab_name", C30187a.m98818a());
        }
        if (!TextUtils.isEmpty(this.f86879K)) {
            mo85248a("rule_id", this.f86879K, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86880L)) {
            mo85248a("impr_type", this.f86880L, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86881M)) {
            mo85248a("compilation_id", this.f86881M, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86883O)) {
            mo85248a("card_type", this.f86883O, C33260a.f86770a);
        }
        if (C26062g.m85608a()) {
            mo85245a("is_fullscreen", "1");
        }
        if (C33230ac.m107226f(this.f86753e)) {
            mo85245a("video_type", this.f86882N);
        }
        if (!TextUtils.isEmpty(this.f86884P)) {
            mo85245a("rec_user_type", this.f86884P);
        }
    }

    /* renamed from: a */
    public final C33280v mo85340a(String str) {
        this.f86885a = str;
        return this;
    }

    /* renamed from: b */
    public final C33280v mo85341b(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: c */
    public final C33280v mo85343c(String str) {
        this.f86874F = str;
        return this;
    }

    /* renamed from: d */
    public final C33280v mo85344d(String str) {
        this.f86878J = str;
        return this;
    }

    /* renamed from: e */
    public final C33280v mo85345e(String str) {
        this.f86886b = str;
        return this;
    }

    /* renamed from: f */
    public final C33280v mo85347f(String str) {
        this.f86887c = str;
        return this;
    }

    /* renamed from: g */
    public final C33280v mo85348g(String str) {
        this.f86869A = str;
        return this;
    }

    /* renamed from: i */
    public final C33280v mo85349i(String str) {
        this.f86883O = str;
        return this;
    }

    /* renamed from: j */
    public final C33280v mo85350j(String str) {
        this.f86884P = str;
        return this;
    }

    /* renamed from: k */
    public final C33280v mo85351k(String str) {
        this.f86870B = str;
        return this;
    }

    /* renamed from: o */
    public final C33280v mo85352o(String str) {
        this.f86871C = str;
        return this;
    }

    /* renamed from: p */
    public final C33280v mo85353p(String str) {
        this.f86872D = str;
        return this;
    }

    /* renamed from: q */
    public final C33280v mo85354q(String str) {
        this.f86873E = str;
        return this;
    }

    /* renamed from: r */
    public final C33280v mo85355r(String str) {
        this.f86875G = str;
        return this;
    }

    /* renamed from: s */
    public final C33280v mo85356s(String str) {
        this.f86876H = str;
        return this;
    }

    /* renamed from: t */
    public final C33280v mo85357t(String str) {
        this.f86877I = str;
        return this;
    }

    /* renamed from: u */
    public final C33280v mo85358u(String str) {
        this.f86879K = str;
        return this;
    }

    /* renamed from: v */
    public final C33280v mo85359v(String str) {
        this.f86880L = str;
        return this;
    }

    public C33280v(String str) {
        super(str);
    }

    /* renamed from: f */
    public final C33280v mo85346f(Aweme aweme) {
        if (aweme != null) {
            this.f86881M = aweme.getMixId();
        }
        return this;
    }

    /* renamed from: c */
    public final C33280v mo85342c(Aweme aweme, int i) {
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86870B = aweme.getAid();
            this.f86871C = m107475a(aweme, i);
            this.f86869A = aweme.getAuthorUid();
            this.f86880L = C33230ac.m107245t(aweme);
            if (aweme.getMixInfo() != null) {
                this.f86881M = aweme.getMixInfo().mixId;
            }
            this.f86882N = C33230ac.m107247v(aweme);
        }
        return this;
    }
}
