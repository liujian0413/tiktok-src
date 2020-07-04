package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.tools.C42149ap;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fk */
final /* synthetic */ class C39891fk implements Runnable {

    /* renamed from: a */
    private final C398881 f103643a;

    /* renamed from: b */
    private final Integer f103644b;

    /* renamed from: c */
    private final ShortVideoContext f103645c;

    /* renamed from: d */
    private final C42149ap f103646d;

    C39891fk(C398881 r1, Integer num, ShortVideoContext shortVideoContext, C42149ap apVar) {
        this.f103643a = r1;
        this.f103644b = num;
        this.f103645c = shortVideoContext;
        this.f103646d = apVar;
    }

    public final void run() {
        this.f103643a.mo99307a(this.f103644b, this.f103645c, this.f103646d);
    }
}
