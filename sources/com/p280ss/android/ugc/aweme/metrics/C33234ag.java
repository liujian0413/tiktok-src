package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;

/* renamed from: com.ss.android.ugc.aweme.metrics.ag */
public final class C33234ag extends C33259d {

    /* renamed from: a */
    private String f86519a;

    /* renamed from: b */
    private String f86520b;

    public C33234ag() {
        super("client_show");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("enter_from", this.f86519a, C33260a.f86770a);
        mo85248a(C38347c.f99553h, this.f86520b, C33260a.f86770a);
    }

    /* renamed from: a */
    public final C33234ag mo85081a(String str) {
        this.f86519a = str;
        return this;
    }

    /* renamed from: b */
    public final C33234ag mo85082b(String str) {
        this.f86520b = str;
        return this;
    }
}
