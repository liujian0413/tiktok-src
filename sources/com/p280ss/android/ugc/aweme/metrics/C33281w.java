package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;

/* renamed from: com.ss.android.ugc.aweme.metrics.w */
public final class C33281w extends C33270l<C33281w> {

    /* renamed from: A */
    private String f86888A;

    /* renamed from: B */
    private String f86889B;

    /* renamed from: C */
    private String f86890C;

    /* renamed from: D */
    private String f86891D;

    /* renamed from: E */
    private String f86892E;

    /* renamed from: F */
    private String f86893F;

    /* renamed from: a */
    private String f86894a;

    /* renamed from: b */
    private String f86895b;

    /* renamed from: c */
    private String f86896c;

    public C33281w() {
        super("unlogin_follow");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85250c();
        mo85248a("previous_page", this.f86894a, C33260a.f86770a);
        mo85248a("previous_page_position", this.f86895b, C33260a.f86770a);
        mo85248a("enter_method", this.f86892E, C33260a.f86770a);
        mo85248a("to_user_id", this.f86896c, C33260a.f86771b);
        mo85248a("group_id", this.f86888A, C33260a.f86771b);
        mo85248a("author_id", this.f86896c, C33260a.f86771b);
        mo85248a("request_id", this.f86889B, C33260a.f86771b);
        mo85248a("enter_type", this.f86891D, C33260a.f86770a);
        if (!TextUtils.isEmpty(this.f86890C)) {
            mo85248a("enter_from_request", this.f86890C, C33260a.f86771b);
        }
        if (C33230ac.m107222d(this.f86753e) || "homepage_hot".equals(this.f86894a)) {
            mo85255h(this.f86889B);
        }
        if (!TextUtils.equals(this.f86752d, "follow_cancel") && !TextUtils.equals(this.f86752d, "unlogin_follow")) {
            mo85253f();
        }
        if (C22494d.m74385a().mo59063a(this.f86888A)) {
            mo85248a("previous_page", "push", C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86893F)) {
            mo85248a("impr_type", this.f86893F, C33260a.f86770a);
        }
    }

    /* renamed from: a */
    public final C33281w mo85360a(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: b */
    public final C33281w mo85361b(String str) {
        this.f86892E = str;
        return this;
    }

    /* renamed from: c */
    public final C33281w mo85363c(String str) {
        this.f86894a = str;
        return this;
    }

    /* renamed from: d */
    public final C33281w mo85364d(String str) {
        this.f86895b = str;
        return this;
    }

    /* renamed from: e */
    public final C33281w mo85365e(String str) {
        this.f86896c = str;
        return this;
    }

    /* renamed from: c */
    public final C33281w mo85362c(Aweme aweme, int i) {
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86888A = aweme.getAid();
            this.f86889B = m107475a(aweme, i);
            this.f86896c = aweme.getAuthorUid();
            this.f86893F = C33230ac.m107245t(aweme);
        }
        return this;
    }
}
