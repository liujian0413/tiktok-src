package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import com.p280ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.db */
final /* synthetic */ class C41330db implements Runnable {

    /* renamed from: a */
    private final C411891 f107589a;

    /* renamed from: b */
    private final EffectListResponse f107590b;

    /* renamed from: c */
    private final StringBuilder f107591c;

    C41330db(C411891 r1, EffectListResponse effectListResponse, StringBuilder sb) {
        this.f107589a = r1;
        this.f107590b = effectListResponse;
        this.f107591c = sb;
    }

    public final void run() {
        this.f107589a.mo101877a(this.f107590b, this.f107591c);
    }
}
