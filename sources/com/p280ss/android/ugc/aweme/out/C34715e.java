package com.p280ss.android.ugc.aweme.out;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.out.e */
final /* synthetic */ class C34715e implements Callable {

    /* renamed from: a */
    private final AVServiceImpl f90513a;

    /* renamed from: b */
    private final String f90514b;

    C34715e(AVServiceImpl aVServiceImpl, String str) {
        this.f90513a = aVServiceImpl;
        this.f90514b = str;
    }

    public final Object call() {
        return this.f90513a.lambda$getAvMusicWaveBean$4$AVServiceImpl(this.f90514b);
    }
}
