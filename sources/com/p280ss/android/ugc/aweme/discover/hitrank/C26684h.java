package com.p280ss.android.ugc.aweme.discover.hitrank;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.h */
final /* synthetic */ class C26684h implements Callable {

    /* renamed from: a */
    private final RankViewModel f70360a;

    /* renamed from: b */
    private final String f70361b;

    /* renamed from: c */
    private final String f70362c;

    C26684h(RankViewModel rankViewModel, String str, String str2) {
        this.f70360a = rankViewModel;
        this.f70361b = str;
        this.f70362c = str2;
    }

    public final Object call() {
        return this.f70360a.mo68410b(this.f70361b, this.f70362c);
    }
}
