package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;

/* renamed from: com.ss.android.ugc.aweme.metrics.z */
public final class C33284z extends C33270l<C33284z> {

    /* renamed from: A */
    private String f86924A;

    /* renamed from: B */
    private int f86925B;

    /* renamed from: C */
    private int f86926C;

    /* renamed from: D */
    private int f86927D;

    /* renamed from: a */
    private String f86928a;

    /* renamed from: b */
    private String f86929b;

    /* renamed from: c */
    private String f86930c;

    public C33284z() {
        super("unlogin_like");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85250c();
        mo85248a("group_id", this.f86928a, C33260a.f86771b);
        mo85248a("author_id", this.f86929b, C33260a.f86771b);
        mo85248a("request_id", this.f86930c, C33260a.f86771b);
        if (C33230ac.m107222d(this.f86753e)) {
            mo85255h(this.f86930c);
        }
        if (!TextUtils.equals(this.f86752d, "like_cancel") && !TextUtils.equals(this.f86752d, "unlogin_like")) {
            mo85253f();
        }
        if (C22494d.m74385a().mo59063a(this.f86928a)) {
            mo85248a("previous_page", "push", C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86924A)) {
            mo85248a("enter_method", this.f86924A, C33260a.f86770a);
        }
        mo85248a("is_first", String.valueOf(this.f86925B), C33260a.f86770a);
        mo85248a("is_login_notify", String.valueOf(this.f86926C), C33260a.f86770a);
    }

    /* renamed from: a */
    public final C33284z mo85387a(int i) {
        this.f86927D = i;
        return this;
    }

    /* renamed from: b */
    public final C33284z mo85389b(int i) {
        this.f86925B = i;
        return this;
    }

    /* renamed from: c */
    public final C33284z mo85391c(int i) {
        this.f86926C = i;
        return this;
    }

    /* renamed from: a */
    public final C33284z mo85388a(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: b */
    public final C33284z mo85390b(String str) {
        this.f86928a = str;
        return this;
    }

    /* renamed from: c */
    public final C33284z mo85392c(String str) {
        this.f86924A = str;
        return this;
    }

    /* renamed from: f */
    public final C33284z mo85071g(Aweme aweme) {
        String str;
        super.mo85071g(aweme);
        if (aweme != null) {
            this.f86928a = aweme.getAid();
            this.f86929b = m107477c(aweme);
            if (TextUtils.isEmpty(C33230ac.m107206a(aweme, this.f86927D))) {
                str = aweme.getRequestId();
            } else {
                str = C33230ac.m107206a(aweme, this.f86927D);
            }
            this.f86930c = str;
        }
        return this;
    }
}
