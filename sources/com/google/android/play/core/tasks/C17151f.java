package com.google.android.play.core.tasks;

/* renamed from: com.google.android.play.core.tasks.f */
final class C17151f implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17147c f47874a;

    /* renamed from: b */
    private final /* synthetic */ C17152g f47875b;

    C17151f(C17152g gVar, C17147c cVar) {
        this.f47875b = gVar;
        this.f47874a = cVar;
    }

    public final void run() {
        synchronized (this.f47875b.f47877b) {
            if (this.f47875b.f47878c != null) {
                this.f47875b.f47878c.mo24985a(this.f47874a.mo44421d());
            }
        }
    }
}
