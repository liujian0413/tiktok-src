package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.detail.C26062g;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;
import com.p280ss.android.ugc.aweme.p1286g.C30187a;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.metrics.o */
public final class C33273o extends C33220a<C33273o> {

    /* renamed from: A */
    private String f86812A;

    /* renamed from: B */
    private String f86813B;

    /* renamed from: C */
    private String f86814C;

    /* renamed from: D */
    private String f86815D;

    /* renamed from: E */
    private String f86816E;

    /* renamed from: F */
    private Aweme f86817F;

    /* renamed from: G */
    private String f86818G;

    /* renamed from: H */
    private String f86819H;

    /* renamed from: I */
    private String f86820I;

    /* renamed from: J */
    private String f86821J;

    /* renamed from: K */
    private String f86822K;

    /* renamed from: L */
    private String f86823L;

    /* renamed from: M */
    private boolean f86824M;

    /* renamed from: N */
    private String f86825N;

    /* renamed from: O */
    private String f86826O;

    public C33273o() {
        super("enter_music_detail");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        String str;
        mo85250c();
        mo85248a("group_id", this.f86812A, C33260a.f86771b);
        mo85248a("music_id", this.f86814C, C33260a.f86771b);
        mo85248a("author_id", this.f86813B, C33260a.f86771b);
        mo85248a("request_id", this.f86815D, C33260a.f86771b);
        mo85246a((Map<String, String>) C6903bc.m21485d().mo75947a(this.f86817F, this.f86816E));
        if (C22494d.m74385a().mo59063a(this.f86812A)) {
            mo85248a("previous_page", "push", C33260a.f86770a);
        } else if (!TextUtils.isEmpty(this.f86818G)) {
            mo85248a("previous_page", this.f86818G, C33260a.f86770a);
        }
        mo85253f();
        if (C33230ac.m107222d(this.f86753e)) {
            mo85255h(this.f86815D);
        }
        if ((TextUtils.equals(this.f86753e, "homepage_fresh") || TextUtils.equals(this.f86753e, "homepage_channel")) && C30187a.m98819b()) {
            mo85245a("tab_name", C30187a.m98818a());
        }
        if (!TextUtils.isEmpty(this.f86820I)) {
            mo85248a(this.f86820I, this.f86821J, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86819H)) {
            mo85248a("playlist_type", this.f86819H, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86822K)) {
            mo85248a("impr_type", this.f86822K, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86823L)) {
            mo85248a("compilation_id", this.f86823L, C33260a.f86770a);
        }
        mo85245a("impr_id", C28199ae.m92689a().mo71791a(this.f86815D));
        if (C26062g.m85608a()) {
            mo85245a("is_fullscreen", "1");
        }
        if (C33230ac.m107226f(this.f86753e)) {
            String str2 = "relation_type";
            if (this.f86824M) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo85245a(str2, str);
            mo85245a("video_type", this.f86825N);
            mo85245a("rec_uid", this.f86826O);
        }
    }

    /* renamed from: b */
    public final C33273o mo85293b(String str) {
        this.f86818G = str;
        return this;
    }

    /* renamed from: c */
    public final C33273o mo85294c(String str) {
        this.f86819H = str;
        return this;
    }

    /* renamed from: d */
    public final C33273o mo85295d(String str) {
        this.f86820I = str;
        return this;
    }

    /* renamed from: e */
    public final C33273o mo85296e(String str) {
        this.f86821J = str;
        return this;
    }

    /* renamed from: f */
    public final C33273o mo85298f(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: g */
    public final C33273o mo85299g(String str) {
        this.f86812A = str;
        return this;
    }

    /* renamed from: i */
    public final C33273o mo85300i(String str) {
        this.f86813B = str;
        return this;
    }

    /* renamed from: j */
    public final C33273o mo85301j(String str) {
        this.f86814C = str;
        return this;
    }

    /* renamed from: k */
    public final C33273o mo85302k(String str) {
        this.f86815D = str;
        return this;
    }

    /* renamed from: o */
    public final C33273o mo85303o(String str) {
        this.f86823L = str;
        return this;
    }

    /* renamed from: f */
    public final C33273o mo85071g(Aweme aweme) {
        String str;
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86817F = aweme;
            this.f86815D = C33230ac.m107219c(aweme);
            this.f86812A = aweme.getAid();
            this.f86813B = aweme.getAuthorUid();
            if (aweme.getMusic() == null) {
                str = "";
            } else {
                str = String.valueOf(aweme.getMusic().getId());
            }
            this.f86814C = str;
            this.f86822K = C33230ac.m107245t(aweme);
            if (aweme.getMixInfo() != null) {
                this.f86823L = aweme.getMixInfo().mixId;
            }
            this.f86824M = C43122ff.m136762a(aweme);
            this.f86825N = C33230ac.m107247v(aweme);
            this.f86826O = C33230ac.m107248w(aweme);
        }
        return this;
    }
}
