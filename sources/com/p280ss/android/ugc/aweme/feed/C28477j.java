package com.p280ss.android.ugc.aweme.feed;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.j */
final /* synthetic */ class C28477j implements Runnable {

    /* renamed from: a */
    private final Callable f75072a;

    /* renamed from: b */
    private final Handler f75073b;

    /* renamed from: c */
    private final int f75074c;

    /* renamed from: d */
    private final int f75075d;

    C28477j(Callable callable, Handler handler, int i, int i2) {
        this.f75072a = callable;
        this.f75073b = handler;
        this.f75074c = i;
        this.f75075d = i2;
    }

    public final void run() {
        C28434i.m93464a(this.f75072a, this.f75073b, this.f75074c, this.f75075d);
    }
}
