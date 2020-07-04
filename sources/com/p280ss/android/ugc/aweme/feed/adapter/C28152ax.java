package com.p280ss.android.ugc.aweme.feed.adapter;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ax */
final /* synthetic */ class C28152ax implements Callable {

    /* renamed from: a */
    private final String f74238a;

    /* renamed from: b */
    private final boolean f74239b;

    /* renamed from: c */
    private final String f74240c;

    /* renamed from: d */
    private final long f74241d;

    /* renamed from: e */
    private final int f74242e;

    C28152ax(String str, boolean z, String str2, long j, int i) {
        this.f74238a = str;
        this.f74239b = z;
        this.f74240c = str2;
        this.f74241d = j;
        this.f74242e = i;
    }

    public final Object call() {
        return VideoViewHolder.m92019a(this.f74238a, this.f74239b, this.f74240c, this.f74241d, this.f74242e);
    }
}
