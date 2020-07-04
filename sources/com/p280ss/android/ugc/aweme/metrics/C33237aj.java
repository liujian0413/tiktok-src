package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;

/* renamed from: com.ss.android.ugc.aweme.metrics.aj */
public final class C33237aj extends C33259d {

    /* renamed from: a */
    private String f86527a;

    /* renamed from: b */
    private String f86528b;

    /* renamed from: c */
    private String f86529c;

    /* renamed from: v */
    private String f86530v;

    /* renamed from: w */
    private String f86531w;

    public C33237aj() {
        super("qr_code_scanned");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("url_content", this.f86527a, C33260a.f86770a);
        mo85248a("enter_method", this.f86528b, C33260a.f86770a);
        mo85248a("landing_page", this.f86529c, C33260a.f86770a);
        mo85248a("from_user_code", this.f86530v, C33260a.f86770a);
        mo85248a("qr_code_type", this.f86531w, C33260a.f86770a);
    }

    /* renamed from: a */
    public final C33237aj mo85088a(String str) {
        this.f86527a = str;
        return this;
    }

    /* renamed from: b */
    public final C33237aj mo85089b(String str) {
        this.f86528b = str;
        return this;
    }

    /* renamed from: c */
    public final C33237aj mo85090c(String str) {
        this.f86529c = str;
        return this;
    }

    /* renamed from: d */
    public final C33237aj mo85091d(String str) {
        this.f86530v = str;
        return this;
    }

    /* renamed from: e */
    public final C33237aj mo85092e(String str) {
        this.f86531w = str;
        return this;
    }
}
