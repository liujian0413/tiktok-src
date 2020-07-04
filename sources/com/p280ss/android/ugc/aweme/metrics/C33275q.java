package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;

/* renamed from: com.ss.android.ugc.aweme.metrics.q */
public final class C33275q extends C33259d {

    /* renamed from: a */
    private String f86828a;

    /* renamed from: b */
    private String f86829b;

    /* renamed from: c */
    private String f86830c;

    /* renamed from: v */
    private String f86831v;

    public C33275q() {
        super("enter_personal_detail_backup");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85250c();
        mo85248a("group_id", this.f86829b, C33260a.f86771b);
        mo85248a("to_user_id", this.f86828a, C33260a.f86771b);
        mo85248a("enter_from", this.f86753e, C33260a.f86770a);
        mo85248a("enter_method", this.f86830c, C33260a.f86770a);
        mo85248a("request_id", this.f86831v, C33260a.f86771b);
        if (C33230ac.m107222d(this.f86753e)) {
            mo85255h(this.f86829b);
        }
    }

    /* renamed from: a */
    public final C33275q mo85305a(String str) {
        this.f86829b = str;
        return this;
    }

    /* renamed from: b */
    public final C33275q mo85306b(String str) {
        this.f86828a = str;
        return this;
    }

    /* renamed from: c */
    public final C33275q mo85307c(String str) {
        this.f86753e = str;
        return this;
    }

    /* renamed from: d */
    public final C33275q mo85308d(String str) {
        this.f86830c = str;
        return this;
    }

    /* renamed from: f */
    public final C33275q mo85309f(Aweme aweme) {
        if (aweme != null) {
            this.f86829b = aweme.getAid();
            this.f86831v = aweme.getRequestId();
            this.f86828a = aweme.getAuthorUid();
        }
        mo85247a(aweme);
        return this;
    }
}
