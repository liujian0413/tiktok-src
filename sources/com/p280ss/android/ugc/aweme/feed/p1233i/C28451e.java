package com.p280ss.android.ugc.aweme.feed.p1233i;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

/* renamed from: com.ss.android.ugc.aweme.feed.i.e */
final /* synthetic */ class C28451e implements Callable {

    /* renamed from: a */
    private final C28447b f75033a;

    /* renamed from: b */
    private final int f75034b;

    /* renamed from: c */
    private final Lock f75035c;

    C28451e(C28447b bVar, int i, Lock lock) {
        this.f75033a = bVar;
        this.f75034b = i;
        this.f75035c = lock;
    }

    public final Object call() {
        return this.f75033a.mo72179a(this.f75034b, this.f75035c);
    }
}
