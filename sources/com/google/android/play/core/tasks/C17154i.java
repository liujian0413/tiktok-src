package com.google.android.play.core.tasks;

/* renamed from: com.google.android.play.core.tasks.i */
final class C17154i implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17147c f47882a;

    /* renamed from: b */
    private final /* synthetic */ C17153h f47883b;

    C17154i(C17153h hVar, C17147c cVar) {
        this.f47883b = hVar;
        this.f47882a = cVar;
    }

    public final void run() {
        synchronized (this.f47883b.f47880b) {
            if (this.f47883b.f47881c != null) {
                this.f47883b.f47881c.mo24986a(this.f47882a.mo44420c());
            }
        }
    }
}
