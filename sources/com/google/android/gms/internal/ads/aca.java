package com.google.android.gms.internal.ads;

final class aca implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ abz f39969a;

    aca(abz abz) {
        this.f39969a = abz;
    }

    public final void run() {
        this.f39969a.f39967b = Thread.currentThread();
        this.f39969a.mo37835a();
    }
}
