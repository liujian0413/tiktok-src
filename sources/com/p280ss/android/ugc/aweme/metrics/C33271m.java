package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;

/* renamed from: com.ss.android.ugc.aweme.metrics.m */
public final class C33271m extends C33270l<C33271m> {

    /* renamed from: A */
    private String f86805A;

    /* renamed from: B */
    private String f86806B;

    /* renamed from: a */
    private String f86807a;

    /* renamed from: b */
    private String f86808b;

    /* renamed from: c */
    private String f86809c;

    public C33271m() {
        super("dislike");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85250c();
        mo85248a("group_id", this.f86807a, C33260a.f86771b);
        mo85248a("author_id", this.f86808b, C33260a.f86771b);
        mo85248a("enter_method", this.f86809c, C33260a.f86770a);
        if (C22494d.m74385a().mo59063a(this.f86807a)) {
            mo85248a("previous_page", "push", C33260a.f86770a);
        }
        if (C33230ac.m107222d(this.f86753e)) {
            mo85255h(this.f86805A);
        }
        if (!TextUtils.isEmpty(this.f86806B)) {
            mo85248a("impr_type", this.f86806B, C33260a.f86770a);
        }
    }

    /* renamed from: a */
    public final C33271m mo85286a(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: b */
    public final C33271m mo85287b(String str) {
        this.f86807a = str;
        return this;
    }

    /* renamed from: c */
    public final C33271m mo85288c(String str) {
        this.f86808b = str;
        return this;
    }

    /* renamed from: d */
    public final C33271m mo85289d(String str) {
        this.f86809c = str;
        return this;
    }

    /* renamed from: e */
    public final C33271m mo85290e(String str) {
        this.f86805A = str;
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public C33271m mo85071g(Aweme aweme) {
        super.mo85071g(aweme);
        this.f86806B = C33230ac.m107245t(aweme);
        return this;
    }
}
