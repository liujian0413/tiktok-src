package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;

/* renamed from: com.ss.android.ugc.aweme.metrics.av */
public final class C33251av extends C33259d {

    /* renamed from: a */
    private int f86627a;

    /* renamed from: b */
    private String f86628b;

    /* renamed from: c */
    private String f86629c;

    public C33251av() {
        super("account_transform");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("transform_content", this.f86628b, C33260a.f86770a);
        mo85248a("is_success", String.valueOf(this.f86627a), C33260a.f86770a);
        mo85248a("fail_reason", this.f86629c, C33260a.f86770a);
    }

    /* renamed from: a */
    public final C33251av mo85154a(int i) {
        this.f86627a = i;
        return this;
    }

    /* renamed from: b */
    public final C33251av mo85156b(String str) {
        this.f86629c = str;
        return this;
    }

    /* renamed from: a */
    public final C33251av mo85155a(String str) {
        this.f86628b = str;
        return this;
    }
}
