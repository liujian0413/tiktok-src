package com.p280ss.android.ugc.aweme.main;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.main.cq */
final /* synthetic */ class C32940cq implements Callable {

    /* renamed from: a */
    private final String f85886a;

    /* renamed from: b */
    private final String f85887b;

    /* renamed from: c */
    private final long f85888c;

    C32940cq(String str, String str2, long j) {
        this.f85886a = str;
        this.f85887b = str2;
        this.f85888c = j;
    }

    public final Object call() {
        return MainPageFragment.m106314a(this.f85886a, this.f85887b, this.f85888c);
    }
}
