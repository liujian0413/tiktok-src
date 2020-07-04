package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.aa */
final class C15050aa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15159z f38935a;

    C15050aa(C15159z zVar) {
        this.f38935a = zVar;
    }

    public final void run() {
        this.f38935a.f39216d.cancelAvailabilityErrorNotifications(this.f38935a.f39215c);
    }
}
