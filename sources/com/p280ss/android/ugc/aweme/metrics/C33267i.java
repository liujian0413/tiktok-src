package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.detail.C26062g;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.metrics.i */
public final class C33267i extends C33270l<C33267i> {

    /* renamed from: A */
    private Aweme f86778A;

    /* renamed from: B */
    private int f86779B;

    /* renamed from: C */
    private String f86780C;

    /* renamed from: D */
    private String f86781D;

    /* renamed from: E */
    private String f86782E;

    /* renamed from: F */
    private String f86783F;

    /* renamed from: G */
    private int f86784G;

    /* renamed from: H */
    private String f86785H;

    /* renamed from: I */
    private String f86786I;

    /* renamed from: J */
    private String f86787J;

    /* renamed from: K */
    private String f86788K;

    /* renamed from: a */
    private String f86789a;

    /* renamed from: b */
    private String f86790b;

    /* renamed from: c */
    private String f86791c;

    public C33267i() {
        super("click_more_button");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85250c();
        mo85248a("group_id", this.f86789a, C33260a.f86771b);
        mo85248a("author_id", this.f86790b, C33260a.f86771b);
        if (this.f86778A != null) {
            mo85246a((Map<String, String>) C6903bc.m21485d().mo75947a(this.f86778A, this.f86791c));
        }
        if (C33230ac.m107222d(this.f86753e)) {
            mo85255h(C33230ac.m107219c(this.f86778A));
        }
        if (this.f86779B != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f86779B);
            mo85248a("is_long_item", sb.toString(), C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86781D)) {
            mo85248a(this.f86781D, this.f86782E, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86780C)) {
            mo85248a("playlist_type", this.f86780C, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86785H)) {
            mo85248a("log_pb", this.f86785H, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86783F)) {
            mo85248a("prop_id", this.f86783F, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86788K)) {
            mo85245a("enter_method", this.f86788K);
        }
        if (this.f86784G != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f86784G);
            mo85248a("scene_id", sb2.toString(), C33260a.f86770a);
        }
        mo85248a("previous_page", this.f86786I, C33260a.f86770a);
        if (!TextUtils.isEmpty(this.f86787J)) {
            mo85248a("impr_type", this.f86787J, C33260a.f86770a);
        }
        mo85245a("request_id", C33230ac.m107219c(this.f86778A));
        if (C26062g.m85608a()) {
            mo85245a("is_fullscreen", "1");
        }
    }

    /* renamed from: a */
    public final C33267i mo85263a(int i) {
        this.f86779B = i;
        return this;
    }

    /* renamed from: b */
    public final C33267i mo85266b(String str) {
        this.f86781D = str;
        return this;
    }

    /* renamed from: c */
    public final C33267i mo85267c(String str) {
        this.f86782E = str;
        return this;
    }

    /* renamed from: d */
    public final C33267i mo85268d(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: e */
    public final C33267i mo85269e(String str) {
        this.f86786I = str;
        return this;
    }

    /* renamed from: f */
    public final C33267i mo85271f(String str) {
        this.f86791c = str;
        return this;
    }

    /* renamed from: g */
    public final C33267i mo85272g(String str) {
        this.f86783F = str;
        return this;
    }

    /* renamed from: i */
    public final C33267i mo85273i(String str) {
        this.f86785H = str;
        return this;
    }

    /* renamed from: j */
    public final C33267i mo85274j(String str) {
        this.f86789a = str;
        return this;
    }

    /* renamed from: k */
    public final C33267i mo85275k(String str) {
        this.f86790b = str;
        return this;
    }

    /* renamed from: a */
    public final C33267i mo85264a(String str) {
        this.f86780C = str;
        return this;
    }

    /* renamed from: b */
    public final C33267i mo85265b(int i) {
        this.f86784G = 1009;
        return this;
    }

    /* renamed from: f */
    public final C33267i mo85071g(Aweme aweme) {
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86778A = aweme;
            this.f86789a = aweme.getAid();
            this.f86787J = C33230ac.m107245t(aweme);
        }
        return this;
    }
}
