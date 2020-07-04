package com.p280ss.android.ugc.aweme.profile.util;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.util.d */
final /* synthetic */ class C36731d implements Callable {

    /* renamed from: a */
    private final int f96400a;

    /* renamed from: b */
    private final boolean f96401b;

    /* renamed from: c */
    private final Exception f96402c;

    C36731d(int i, boolean z, Exception exc) {
        this.f96400a = i;
        this.f96401b = z;
        this.f96402c = exc;
    }

    public final Object call() {
        return C36729b.m118414b(this.f96400a, this.f96401b, this.f96402c);
    }
}
