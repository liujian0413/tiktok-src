package com.p280ss.android.ugc.trill.share.base;

import com.p280ss.android.ugc.trill.share.base.C45083a.C45095b;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.trill.share.base.e */
final /* synthetic */ class C45100e implements Callable {

    /* renamed from: a */
    private final C45095b f115927a;

    /* renamed from: b */
    private final String f115928b;

    /* renamed from: c */
    private final long f115929c;

    /* renamed from: d */
    private final long f115930d;

    C45100e(C45095b bVar, String str, long j, long j2) {
        this.f115927a = bVar;
        this.f115928b = str;
        this.f115929c = j;
        this.f115930d = j2;
    }

    public final Object call() {
        return this.f115927a.mo107656a(this.f115928b, this.f115929c, this.f115930d);
    }
}
