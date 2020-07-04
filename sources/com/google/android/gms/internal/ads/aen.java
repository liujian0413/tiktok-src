package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.C15267r;

@C6505uv
public final class aen {

    /* renamed from: a */
    public Handler f40103a;

    /* renamed from: b */
    private HandlerThread f40104b;

    /* renamed from: c */
    private int f40105c;

    /* renamed from: d */
    private final Object f40106d = new Object();

    /* renamed from: a */
    public final Looper mo39258a() {
        Looper looper;
        synchronized (this.f40106d) {
            if (this.f40105c != 0) {
                C15267r.m44385a(this.f40104b, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f40104b == null) {
                acd.m45438a("Starting the looper thread.");
                this.f40104b = new HandlerThread("LooperProvider");
                this.f40104b.start();
                this.f40103a = new apn(this.f40104b.getLooper());
                acd.m45438a("Looper thread started.");
            } else {
                acd.m45438a("Resuming the looper thread");
                this.f40106d.notifyAll();
            }
            this.f40105c++;
            looper = this.f40104b.getLooper();
        }
        return looper;
    }
}
