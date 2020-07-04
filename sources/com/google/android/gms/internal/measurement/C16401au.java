package com.google.android.gms.internal.measurement;

import android.os.Looper;

/* renamed from: com.google.android.gms.internal.measurement.au */
final class C16401au implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16400at f45895a;

    C16401au(C16400at atVar) {
        this.f45895a = atVar;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f45895a.f45892a.mo43217b().mo38003a((Runnable) this);
            return;
        }
        boolean c = this.f45895a.mo42524c();
        this.f45895a.f45894d = 0;
        if (c) {
            this.f45895a.mo42504a();
        }
    }
}
