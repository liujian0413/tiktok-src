package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.tasks.z */
final class C17080z implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17079y f47771a;

    /* renamed from: b */
    private final /* synthetic */ Callable f47772b;

    public final void run() {
        try {
            this.f47771a.mo44316a(this.f47772b.call());
        } catch (Exception e) {
            this.f47771a.mo44315a(e);
        }
    }
}
