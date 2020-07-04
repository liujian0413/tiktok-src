package com.google.android.gms.internal.ads;

final class aia implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f40265a;

    /* renamed from: b */
    private final /* synthetic */ ahv f40266b;

    aia(ahv ahv, boolean z) {
        this.f40266b = ahv;
        this.f40265a = z;
    }

    public final void run() {
        this.f40266b.m45929b("windowVisibilityChanged", "isVisible", String.valueOf(this.f40265a));
    }
}
