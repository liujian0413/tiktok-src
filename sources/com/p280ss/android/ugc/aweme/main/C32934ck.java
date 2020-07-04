package com.p280ss.android.ugc.aweme.main;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.main.ck */
final /* synthetic */ class C32934ck implements Callable {

    /* renamed from: a */
    private final MainPageFragment f85875a;

    /* renamed from: b */
    private final String f85876b;

    /* renamed from: c */
    private final String f85877c;

    /* renamed from: d */
    private final String f85878d;

    C32934ck(MainPageFragment mainPageFragment, String str, String str2, String str3) {
        this.f85875a = mainPageFragment;
        this.f85876b = str;
        this.f85877c = str2;
        this.f85878d = str3;
    }

    public final Object call() {
        return this.f85875a.mo84493a(this.f85876b, this.f85877c, this.f85878d);
    }
}
