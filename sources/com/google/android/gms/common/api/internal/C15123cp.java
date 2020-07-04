package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.cp */
final class C15123cp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15122co f39106a;

    C15123cp(C15122co coVar) {
        this.f39106a = coVar;
    }

    public final void run() {
        this.f39106a.f39104m.lock();
        try {
            this.f39106a.m43895e();
        } finally {
            this.f39106a.f39104m.unlock();
        }
    }
}
