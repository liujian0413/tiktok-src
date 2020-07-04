package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;

/* renamed from: com.ss.android.ugc.aweme.metrics.g */
public final class C33265g extends C33259d {

    /* renamed from: a */
    private String f86773a;

    /* renamed from: b */
    private String f86774b;

    public C33265g() {
        super("client_show");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("enter_from", this.f86773a, C33260a.f86770a);
        mo85248a(C38347c.f99553h, this.f86774b, C33260a.f86770a);
    }

    /* renamed from: a */
    public final C33265g mo85258a(String str) {
        this.f86773a = str;
        return this;
    }

    /* renamed from: b */
    public final C33265g mo85259b(String str) {
        this.f86774b = str;
        return this;
    }
}
