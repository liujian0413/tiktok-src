package com.p280ss.android.ugc.aweme.out;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.out.c */
final /* synthetic */ class C34713c implements Callable {

    /* renamed from: a */
    private final AVServiceImpl f90510a;

    /* renamed from: b */
    private final String f90511b;

    C34713c(AVServiceImpl aVServiceImpl, String str) {
        this.f90510a = aVServiceImpl;
        this.f90511b = str;
    }

    public final Object call() {
        return this.f90510a.lambda$getMusicWaveBean$2$AVServiceImpl(this.f90511b);
    }
}
