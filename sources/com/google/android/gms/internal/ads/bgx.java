package com.google.android.gms.internal.ads;

final class bgx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f41973a;

    /* renamed from: b */
    private final /* synthetic */ long f41974b;

    /* renamed from: c */
    private final /* synthetic */ long f41975c;

    /* renamed from: d */
    private final /* synthetic */ bgu f41976d;

    bgx(bgu bgu, String str, long j, long j2) {
        this.f41976d = bgu;
        this.f41973a = str;
        this.f41974b = j;
        this.f41975c = j2;
    }

    public final void run() {
        this.f41976d.f41954l.mo39503a(this.f41973a, this.f41974b, this.f41975c);
    }
}
