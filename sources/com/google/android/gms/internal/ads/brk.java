package com.google.android.gms.internal.ads;

final class brk implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f43347a;

    /* renamed from: b */
    private final /* synthetic */ long f43348b;

    /* renamed from: c */
    private final /* synthetic */ bqk f43349c;

    brk(bqk bqk, String str, long j) {
        this.f43349c = bqk;
        this.f43347a = str;
        this.f43348b = j;
    }

    public final void run() {
        this.f43349c.f43257g.mo41605a(this.f43347a, this.f43348b);
        this.f43349c.f43257g.mo41604a(this.f43349c.toString());
    }
}
