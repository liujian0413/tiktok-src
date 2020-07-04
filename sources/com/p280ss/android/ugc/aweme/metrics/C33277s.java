package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.detail.C26062g;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;
import com.p280ss.android.ugc.aweme.p1286g.C30187a;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.metrics.s */
public final class C33277s extends C33220a<C33277s> {

    /* renamed from: A */
    private String f86850A;

    /* renamed from: B */
    private String f86851B;

    /* renamed from: C */
    private String f86852C;

    /* renamed from: D */
    private String f86853D;

    /* renamed from: E */
    private String f86854E;

    /* renamed from: F */
    private String f86855F;

    /* renamed from: G */
    private String f86856G;

    /* renamed from: H */
    private Aweme f86857H;

    /* renamed from: I */
    private String f86858I;

    /* renamed from: J */
    private String f86859J;

    /* renamed from: K */
    private String f86860K;

    /* renamed from: L */
    private String f86861L;

    /* renamed from: M */
    private String f86862M;

    /* renamed from: N */
    private String f86863N;

    /* renamed from: O */
    private boolean f86864O;

    /* renamed from: P */
    private String f86865P;

    /* renamed from: Q */
    private String f86866Q;

    /* renamed from: R */
    private String f86867R;

    public C33277s() {
        super("enter_tag_detail");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        String str;
        mo85250c();
        mo85248a("group_id", this.f86850A, C33260a.f86771b);
        mo85248a("author_id", this.f86851B, C33260a.f86771b);
        mo85248a("tag_id", this.f86852C, C33260a.f86771b);
        mo85248a("request_id", this.f86853D, C33260a.f86770a);
        if (!C6319n.m19593a(this.f86854E)) {
            mo85248a("content_type", this.f86854E, C33260a.f86770a);
        }
        mo85246a((Map<String, String>) C6903bc.m21485d().mo75947a(this.f86857H, this.f86856G));
        if (C22494d.m74385a().mo59063a(this.f86850A)) {
            mo85248a("previous_page", "push", C33260a.f86770a);
        } else if (!TextUtils.isEmpty(this.f86867R)) {
            mo85248a("previous_page", this.f86867R, C33260a.f86770a);
        }
        mo85253f();
        if (C33230ac.m107222d(this.f86753e)) {
            mo85255h(this.f86853D);
        }
        if (!TextUtils.isEmpty(this.f86859J)) {
            mo85248a(this.f86859J, this.f86860K, C33260a.f86770a);
        }
        if ((TextUtils.equals(this.f86753e, "homepage_fresh") || TextUtils.equals(this.f86753e, "homepage_channel")) && C30187a.m98819b()) {
            mo85245a("tab_name", C30187a.m98818a());
        }
        if (!TextUtils.isEmpty(this.f86858I)) {
            mo85248a("playlist_type", this.f86858I, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86861L)) {
            mo85248a("impr_type", this.f86861L, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86862M)) {
            mo85248a("compilation_id", this.f86862M, C33260a.f86770a);
        }
        mo85245a("impr_id", C28199ae.m92689a().mo71791a(this.f86853D));
        if (C26062g.m85608a()) {
            mo85245a("is_fullscreen", "1");
        }
        if (!TextUtils.isEmpty(this.f86863N)) {
            mo85248a("search_keyword", this.f86863N, C33260a.f86770a);
        }
        if (C33230ac.m107226f(this.f86753e)) {
            String str2 = "relation_type";
            if (this.f86864O) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo85245a(str2, str);
            mo85245a("video_type", this.f86865P);
            mo85245a("rec_uid", this.f86866Q);
        }
        if (!TextUtils.isEmpty(this.f86855F) && C6399b.m19944t()) {
            mo85245a("process_id", this.f86855F);
        }
    }

    /* renamed from: b */
    public final C33277s mo85325b(String str) {
        this.f86867R = str;
        return this;
    }

    /* renamed from: c */
    public final C33277s mo85326c(String str) {
        this.f86858I = str;
        return this;
    }

    /* renamed from: d */
    public final C33277s mo85327d(String str) {
        this.f86859J = str;
        return this;
    }

    /* renamed from: e */
    public final C33277s mo85328e(String str) {
        this.f86860K = str;
        return this;
    }

    /* renamed from: f */
    public final C33277s mo85330f(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: g */
    public final C33277s mo85331g(String str) {
        this.f86850A = str;
        return this;
    }

    /* renamed from: i */
    public final C33277s mo85332i(String str) {
        this.f86856G = str;
        return this;
    }

    /* renamed from: j */
    public final C33277s mo85333j(String str) {
        this.f86851B = str;
        return this;
    }

    /* renamed from: k */
    public final C33277s mo85334k(String str) {
        this.f86852C = str;
        return this;
    }

    /* renamed from: o */
    public final C33277s mo85335o(String str) {
        this.f86855F = str;
        return this;
    }

    /* renamed from: q */
    public final C33277s mo85337q(String str) {
        this.f86863N = str;
        return this;
    }

    /* renamed from: p */
    public final C33277s mo85336p(String str) {
        if (!C6319n.m19593a(str)) {
            this.f86853D = str;
        }
        return this;
    }

    /* renamed from: f */
    public final C33277s mo85071g(Aweme aweme) {
        String str;
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86857H = aweme;
            this.f86850A = aweme.getAid();
            if (TextUtils.isEmpty(this.f86853D)) {
                this.f86853D = aweme.getRequestId();
            }
            if (aweme.getAuthor() != null) {
                str = aweme.getAuthor().getUid();
            } else {
                str = "";
            }
            this.f86851B = str;
            this.f86854E = C33230ac.m107240o(aweme);
            this.f86861L = C33230ac.m107245t(aweme);
            if (aweme.getMixInfo() != null) {
                this.f86862M = aweme.getMixInfo().mixId;
            }
            this.f86864O = C43122ff.m136762a(aweme);
            this.f86865P = C33230ac.m107247v(aweme);
            this.f86866Q = C33230ac.m107248w(aweme);
        }
        return this;
    }
}
