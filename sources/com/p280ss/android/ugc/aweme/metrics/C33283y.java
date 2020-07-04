package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.detail.C26062g;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.follow.p1262e.C29451a;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;
import com.p280ss.android.ugc.aweme.p1286g.C30187a;
import com.p280ss.android.ugc.aweme.utils.C43122ff;

/* renamed from: com.ss.android.ugc.aweme.metrics.y */
public final class C33283y extends C33270l<C33283y> {

    /* renamed from: A */
    private int f86903A;

    /* renamed from: B */
    private int f86904B;

    /* renamed from: C */
    private String f86905C;

    /* renamed from: D */
    private String f86906D;

    /* renamed from: E */
    private String f86907E;

    /* renamed from: F */
    private String f86908F;

    /* renamed from: G */
    private String f86909G;

    /* renamed from: H */
    private String f86910H;

    /* renamed from: I */
    private String f86911I;

    /* renamed from: J */
    private int f86912J = 1;

    /* renamed from: K */
    private String f86913K;

    /* renamed from: L */
    private String f86914L;

    /* renamed from: M */
    private String f86915M;

    /* renamed from: N */
    private int f86916N = -1;

    /* renamed from: O */
    private boolean f86917O;

    /* renamed from: P */
    private String f86918P;

    /* renamed from: Q */
    private String f86919Q;

    /* renamed from: R */
    private long f86920R;

    /* renamed from: a */
    private String f86921a;

    /* renamed from: b */
    private String f86922b;

    /* renamed from: c */
    private String f86923c;

    public C33283y() {
        super("like");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        String str;
        mo85250c();
        mo85248a("group_id", this.f86921a, C33260a.f86771b);
        mo85248a("author_id", this.f86922b, C33260a.f86771b);
        mo85248a("request_id", this.f86923c, C33260a.f86771b);
        mo85248a("previous_page", this.f86908F, C33260a.f86770a);
        mo85248a("duration", String.valueOf(this.f86920R), C33260a.f86770a);
        if (C33230ac.m107222d(this.f86753e)) {
            mo85255h(this.f86923c);
        }
        if (!TextUtils.equals(this.f86752d, "like_cancel")) {
            mo85253f();
        }
        if (C22494d.m74385a().mo59063a(this.f86921a)) {
            mo85248a("previous_page", "push", C33260a.f86770a);
        }
        if (this.f86903A != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f86903A);
            mo85248a("is_long_item", sb.toString(), C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86906D)) {
            mo85248a(this.f86906D, this.f86907E, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86905C)) {
            mo85248a("playlist_type", this.f86905C, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86909G)) {
            mo85248a("impr_type", this.f86909G, C33260a.f86770a);
        }
        if (C33230ac.m107224e(this.f86753e)) {
            if (!TextUtils.isEmpty(this.f86910H)) {
                mo85248a("enter_method", this.f86910H, C33260a.f86770a);
            }
            if (!TextUtils.isEmpty(this.f86911I)) {
                mo85248a("content_type", this.f86911I, C33260a.f86770a);
            }
            mo85248a("enter_fullscreen", String.valueOf(this.f86912J), C33260a.f86770a);
            if (!TextUtils.isEmpty(this.f86913K)) {
                mo85248a("is_reposted", "1", C33260a.f86770a);
                mo85248a("repost_from_group_id", this.f86913K, C33260a.f86770a);
                mo85248a("repost_from_user_id", this.f86914L, C33260a.f86770a);
            }
            mo85245a("notice_type", C29451a.m96918a());
            mo85245a("show_cnt", String.valueOf(C29451a.m96919b()));
            mo85245a("yellow_dot_logid", C29451a.m96920c());
        }
        if ((TextUtils.equals(this.f86753e, "homepage_fresh") || TextUtils.equals(this.f86753e, "homepage_channel")) && C30187a.m98819b()) {
            mo85245a("tab_name", C30187a.m98818a());
        }
        if (C33230ac.m107226f(this.f86753e)) {
            String str2 = "relation_type";
            if (this.f86917O) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo85245a(str2, str);
            mo85245a("video_type", this.f86918P);
            mo85245a("rec_uid", this.f86919Q);
        }
        if (!TextUtils.isEmpty(this.f86910H)) {
            mo85248a("enter_method", this.f86910H, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86915M)) {
            mo85248a("compilation_id", this.f86915M, C33260a.f86770a);
        }
        if (this.f86916N != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f86916N);
            mo85248a("is_logged_in", sb2.toString(), C33260a.f86770a);
        }
        if (C26062g.m85608a()) {
            mo85245a("is_fullscreen", "1");
        }
        if (!TextUtils.isEmpty(this.f86769u)) {
            mo85245a("creation_id", this.f86769u);
        }
    }

    /* renamed from: a */
    public final C33283y mo85372a(int i) {
        this.f86916N = i;
        return this;
    }

    /* renamed from: b */
    public final C33283y mo85376b(int i) {
        this.f86904B = i;
        return this;
    }

    /* renamed from: c */
    public final C33283y mo85378c(int i) {
        this.f86903A = i;
        return this;
    }

    /* renamed from: d */
    public final C33283y mo85380d(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: e */
    public final C33283y mo85381e(String str) {
        this.f86908F = str;
        return this;
    }

    /* renamed from: f */
    public final C33283y mo85383f(String str) {
        this.f86910H = str;
        return this;
    }

    /* renamed from: g */
    public final C33283y mo85384g(String str) {
        this.f86766r = str;
        return this;
    }

    /* renamed from: i */
    public final C33283y mo85385i(String str) {
        this.f86765q = str;
        return this;
    }

    /* renamed from: j */
    public final C33283y mo85386j(String str) {
        this.f86769u = str;
        return this;
    }

    /* renamed from: a */
    public final C33283y mo85373a(long j) {
        this.f86920R = j;
        return this;
    }

    /* renamed from: b */
    public final C33283y mo85377b(String str) {
        this.f86906D = str;
        return this;
    }

    /* renamed from: c */
    public final C33283y mo85379c(String str) {
        this.f86907E = str;
        return this;
    }

    /* renamed from: a */
    public final C33283y mo85374a(String str) {
        this.f86905C = str;
        return this;
    }

    public C33283y(String str) {
        super(str);
    }

    /* renamed from: a */
    public final C33283y mo85375a(boolean z) {
        this.f86912J = 0;
        return this;
    }

    /* renamed from: f */
    public final C33283y mo85071g(Aweme aweme) {
        String str;
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86921a = aweme.getAid();
            this.f86922b = m107477c(aweme);
            if (TextUtils.isEmpty(C33230ac.m107206a(aweme, this.f86904B))) {
                str = aweme.getRequestId();
            } else {
                str = C33230ac.m107206a(aweme, this.f86904B);
            }
            this.f86923c = str;
            this.f86909G = C33230ac.m107245t(aweme);
            this.f86911I = C33230ac.m107240o(aweme);
            this.f86913K = aweme.getRepostFromGroupId();
            this.f86914L = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.f86915M = aweme.getMixInfo().mixId;
            }
            this.f86917O = C43122ff.m136762a(aweme);
            this.f86918P = C33230ac.m107247v(aweme);
            this.f86919Q = C33230ac.m107248w(aweme);
        }
        return this;
    }
}
