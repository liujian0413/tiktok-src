package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.detail.C26062g;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;
import com.p280ss.android.ugc.aweme.p1286g.C30187a;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.metrics.r */
public final class C33276r extends C33220a<C33276r> {

    /* renamed from: A */
    private Aweme f86832A;

    /* renamed from: B */
    private String f86833B;

    /* renamed from: C */
    private String f86834C;

    /* renamed from: D */
    private String f86835D;

    /* renamed from: E */
    private String f86836E;

    /* renamed from: F */
    private String f86837F;

    /* renamed from: G */
    private String f86838G;

    /* renamed from: H */
    private String f86839H;

    /* renamed from: I */
    private String f86840I;

    /* renamed from: J */
    private String f86841J;

    /* renamed from: K */
    private String f86842K;

    /* renamed from: L */
    private String f86843L;

    /* renamed from: M */
    private String f86844M;

    /* renamed from: N */
    private boolean f86845N;

    /* renamed from: O */
    private String f86846O;

    /* renamed from: P */
    private String f86847P;

    /* renamed from: Q */
    private String f86848Q;

    /* renamed from: R */
    private String f86849R;

    public C33276r() {
        super("enter_personal_detail");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        String str;
        mo85250c();
        mo85248a("group_id", this.f86833B, C33260a.f86771b);
        mo85248a("author_id", this.f86834C, C33260a.f86771b);
        mo85248a("to_user_id", this.f86835D, C33260a.f86771b);
        mo85248a("request_id", this.f86836E, C33260a.f86771b);
        mo85246a((Map<String, String>) C6903bc.m21485d().mo75947a(this.f86832A, this.f86837F));
        if (C22494d.m74385a().mo59063a(this.f86833B)) {
            mo85248a("previous_page", "push", C33260a.f86770a);
        } else if (!TextUtils.isEmpty(this.f86842K)) {
            mo85248a("previous_page", this.f86842K, C33260a.f86770a);
        }
        if (!"poi_page".equalsIgnoreCase(this.f86753e)) {
            mo85253f();
        }
        if ((TextUtils.equals(this.f86753e, "homepage_fresh") || TextUtils.equals(this.f86753e, "homepage_channel")) && C30187a.m98819b()) {
            mo85245a("tab_name", C30187a.m98818a());
        }
        if (C33230ac.m107222d(this.f86753e)) {
            mo85255h(this.f86836E);
        }
        if (!TextUtils.isEmpty(this.f86839H)) {
            mo85248a(this.f86839H, this.f86840I, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86838G)) {
            mo85248a("playlist_type", this.f86838G, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86841J)) {
            mo85248a("scene_id", this.f86841J, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86843L)) {
            mo85248a("impr_type", this.f86843L, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86844M)) {
            mo85248a("compilation_id", this.f86844M, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86848Q)) {
            mo85248a("card_type", this.f86848Q, C33260a.f86770a);
        }
        if (C26062g.m85608a()) {
            mo85245a("is_fullscreen", "1");
        }
        if (C33230ac.m107226f(this.f86753e)) {
            String str2 = "relation_type";
            if (this.f86845N) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo85245a(str2, str);
            mo85245a("video_type", this.f86846O);
            mo85245a("rec_uid", this.f86847P);
        }
        if (!TextUtils.isEmpty(this.f86849R)) {
            mo85248a("rec_user_type", this.f86849R, C33260a.f86770a);
        }
    }

    /* renamed from: b */
    public final C33276r mo85310b(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: c */
    public final C33276r mo85313c(String str) {
        this.f86833B = str;
        return this;
    }

    /* renamed from: d */
    public final C33276r mo85314d(String str) {
        this.f86838G = str;
        return this;
    }

    /* renamed from: e */
    public final C33276r mo85315e(String str) {
        this.f86839H = str;
        return this;
    }

    /* renamed from: f */
    public final C33276r mo85317f(String str) {
        this.f86840I = str;
        return this;
    }

    /* renamed from: g */
    public final C33276r mo85318g(String str) {
        this.f86841J = str;
        return this;
    }

    /* renamed from: i */
    public final C33276r mo85319i(String str) {
        this.f86842K = str;
        return this;
    }

    /* renamed from: j */
    public final C33276r mo85320j(String str) {
        this.f86848Q = str;
        return this;
    }

    /* renamed from: k */
    public final C33276r mo85321k(String str) {
        this.f86833B = str;
        return this;
    }

    /* renamed from: o */
    public final C33276r mo85322o(String str) {
        this.f86835D = str;
        return this;
    }

    /* renamed from: p */
    public final C33276r mo85323p(String str) {
        this.f86836E = str;
        return this;
    }

    /* renamed from: q */
    public final C33276r mo85324q(String str) {
        this.f86849R = str;
        return this;
    }

    /* renamed from: f */
    public final C33276r mo85071g(Aweme aweme) {
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86832A = aweme;
            this.f86833B = aweme.getAid();
            this.f86834C = m107477c(aweme);
            this.f86836E = C33230ac.m107219c(aweme);
            this.f86835D = aweme.getAuthorUid();
            this.f86843L = C33230ac.m107245t(aweme);
            if (aweme.getMixInfo() != null) {
                this.f86844M = aweme.getMixInfo().mixId;
            }
            this.f86845N = C43122ff.m136762a(aweme);
            this.f86846O = C33230ac.m107247v(aweme);
            this.f86847P = C33230ac.m107248w(aweme);
        }
        return this;
    }

    /* renamed from: b */
    public final C33276r mo85311b(String str, String str2) {
        this.f86755g = str;
        this.f86756h = str2;
        return this;
    }

    /* renamed from: c */
    public final C33276r mo85312c(Aweme aweme, int i) {
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86833B = aweme.getAid();
            this.f86834C = m107477c(aweme);
            this.f86836E = m107475a(aweme, i);
            this.f86835D = aweme.getAuthorUid();
            this.f86843L = C33230ac.m107245t(aweme);
            if (aweme.getMixInfo() != null) {
                this.f86844M = aweme.getMixInfo().mixId;
            }
            this.f86845N = C43122ff.m136762a(aweme);
            this.f86846O = C33230ac.m107247v(aweme);
            this.f86847P = C33230ac.m107248w(aweme);
        }
        return this;
    }
}
