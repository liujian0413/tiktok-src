package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.ago;

/* renamed from: com.google.android.gms.ads.internal.ab */
final /* synthetic */ class C14770ab implements Runnable {

    /* renamed from: a */
    private final C14869z f38149a;

    /* renamed from: b */
    private final Runnable f38150b;

    C14770ab(C14869z zVar, Runnable runnable) {
        this.f38149a = zVar;
        this.f38150b = runnable;
    }

    public final void run() {
        ago.f40189a.execute(new C14771ac(this.f38149a, this.f38150b));
    }
}
