package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;

/* renamed from: com.ss.android.ugc.aweme.metrics.ah */
public final class C33235ah extends C33259d {

    /* renamed from: a */
    private String f86521a;

    /* renamed from: b */
    private String f86522b;

    public C33235ah() {
        super("qr_code_generate");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("enter_from", this.f86521a, C33260a.f86770a);
        mo85248a("qr_code_type", this.f86522b, C33260a.f86770a);
    }

    /* renamed from: a */
    public final C33235ah mo85083a(String str) {
        this.f86521a = str;
        return this;
    }

    /* renamed from: b */
    public final C33235ah mo85084b(String str) {
        this.f86522b = str;
        return this;
    }
}
