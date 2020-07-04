package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;

/* renamed from: com.ss.android.ugc.aweme.metrics.n */
public final class C33272n extends C33259d {

    /* renamed from: a */
    private String f86810a;

    /* renamed from: b */
    private String f86811b;

    public C33272n() {
        super("download_music");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("enter_from", this.f86810a, C33260a.f86770a);
        mo85248a("music_id", this.f86811b, C33260a.f86771b);
    }

    /* renamed from: a */
    public final C33272n mo85291a(String str) {
        this.f86810a = str;
        return this;
    }

    /* renamed from: b */
    public final C33272n mo85292b(String str) {
        this.f86811b = str;
        return this;
    }
}
