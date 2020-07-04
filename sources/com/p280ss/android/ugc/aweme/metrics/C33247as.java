package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;

/* renamed from: com.ss.android.ugc.aweme.metrics.as */
public final class C33247as extends C33259d {

    /* renamed from: a */
    private String f86604a;

    /* renamed from: b */
    private String f86605b;

    /* renamed from: c */
    private String f86606c;

    /* renamed from: v */
    private String f86607v;

    public C33247as() {
        super("sign_in_response");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("is_success", this.f86604a, C33260a.f86770a);
        mo85248a("platform", this.f86605b, C33260a.f86770a);
        mo85248a("error_code", this.f86606c, C33260a.f86770a);
        mo85248a("url_path", this.f86607v, C33260a.f86770a);
    }

    /* renamed from: a */
    public final C33247as mo85134a(String str) {
        this.f86604a = str;
        return this;
    }

    /* renamed from: b */
    public final C33247as mo85135b(String str) {
        this.f86605b = str;
        return this;
    }
}
