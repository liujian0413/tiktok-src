package com.google.android.gms.ads.internal;

import android.os.Handler;

/* renamed from: com.google.android.gms.ads.internal.ap */
public final class C14784ap {

    /* renamed from: a */
    private final Handler f38195a;

    public C14784ap(Handler handler) {
        this.f38195a = handler;
    }

    /* renamed from: a */
    public final void mo37680a(Runnable runnable) {
        this.f38195a.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public final boolean mo37681a(Runnable runnable, long j) {
        return this.f38195a.postDelayed(runnable, j);
    }
}
