package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;

/* renamed from: com.ss.android.ugc.aweme.metrics.ai */
public final class C33236ai extends C33259d {

    /* renamed from: a */
    private String f86523a;

    /* renamed from: b */
    private String f86524b;

    /* renamed from: c */
    private String f86525c;

    /* renamed from: v */
    private String f86526v;

    public C33236ai() {
        super("qr_code_save");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("previous_page", this.f86523a, C33260a.f86770a);
        mo85248a("platform", this.f86524b, C33260a.f86770a);
        mo85248a("qr_code_type", this.f86525c, C33260a.f86770a);
        mo85248a("enter_method", this.f86526v, C33260a.f86770a);
    }

    /* renamed from: a */
    public final C33236ai mo85085a(String str) {
        this.f86523a = str;
        return this;
    }

    /* renamed from: b */
    public final C33236ai mo85086b(String str) {
        this.f86524b = str;
        return this;
    }

    /* renamed from: c */
    public final C33236ai mo85087c(String str) {
        this.f86525c = str;
        return this;
    }
}
