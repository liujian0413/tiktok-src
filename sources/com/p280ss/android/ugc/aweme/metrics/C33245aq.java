package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;

/* renamed from: com.ss.android.ugc.aweme.metrics.aq */
public final class C33245aq extends C33259d {

    /* renamed from: a */
    private String f86585a;

    /* renamed from: b */
    private String f86586b;

    public C33245aq() {
        super("tag_show");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("enter_from", this.f86585a, C33260a.f86770a);
        mo85248a("tag_id", this.f86586b, C33260a.f86771b);
        mo85248a(C38347c.f99553h, "tag", C33260a.f86770a);
    }

    /* renamed from: a */
    public final C33245aq mo85124a(String str) {
        this.f86585a = str;
        return this;
    }

    /* renamed from: b */
    public final C33245aq mo85125b(String str) {
        this.f86586b = str;
        return this;
    }
}
