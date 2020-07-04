package com.google.android.gms.internal.ads;

public final class brt {

    /* renamed from: a */
    private boolean f43367a;

    /* renamed from: a */
    public final synchronized boolean mo41210a() {
        if (this.f43367a) {
            return false;
        }
        this.f43367a = true;
        notifyAll();
        return true;
    }

    /* renamed from: b */
    public final synchronized boolean mo41211b() {
        boolean z;
        z = this.f43367a;
        this.f43367a = false;
        return z;
    }

    /* renamed from: c */
    public final synchronized void mo41212c() throws InterruptedException {
        while (!this.f43367a) {
            wait();
        }
    }
}
