package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;

/* renamed from: com.ss.android.ugc.aweme.metrics.b */
public final class C33256b extends C33259d {

    /* renamed from: a */
    private String f86745a;

    /* renamed from: b */
    private String f86746b;

    /* renamed from: c */
    private String f86747c;

    public C33256b() {
        super("add_poi");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("enter_from", this.f86745a, C33260a.f86770a);
        mo85248a("position_privilege", this.f86746b, C33260a.f86770a);
        mo85248a("content_type", this.f86747c, C33260a.f86770a);
    }

    /* renamed from: a */
    public final C33256b mo85242a(String str) {
        this.f86745a = str;
        return this;
    }

    /* renamed from: b */
    public final C33256b mo85243b(String str) {
        this.f86746b = str;
        return this;
    }

    /* renamed from: c */
    public final C33256b mo85244c(String str) {
        this.f86747c = str;
        return this;
    }
}
