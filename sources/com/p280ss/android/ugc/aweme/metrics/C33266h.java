package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;

/* renamed from: com.ss.android.ugc.aweme.metrics.h */
public final class C33266h extends C33259d {

    /* renamed from: a */
    private String f86775a;

    /* renamed from: b */
    private String f86776b;

    /* renamed from: c */
    private String f86777c;

    public C33266h() {
        super("choose_filter");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("content_type", this.f86775a, C33260a.f86770a);
        mo85248a("enter_from", this.f86776b, C33260a.f86770a);
        mo85248a("filter_name", this.f86777c, C33260a.f86770a);
    }

    /* renamed from: a */
    public final C33266h mo85260a(String str) {
        this.f86775a = str;
        return this;
    }

    /* renamed from: b */
    public final C33266h mo85261b(String str) {
        this.f86776b = str;
        return this;
    }

    /* renamed from: c */
    public final C33266h mo85262c(String str) {
        this.f86777c = str;
        return this;
    }
}
