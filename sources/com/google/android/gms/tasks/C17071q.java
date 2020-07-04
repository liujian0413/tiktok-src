package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.q */
final class C17071q implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17057f f47750a;

    /* renamed from: b */
    private final /* synthetic */ C17070p f47751b;

    C17071q(C17070p pVar, C17057f fVar) {
        this.f47751b = pVar;
        this.f47750a = fVar;
    }

    public final void run() {
        synchronized (this.f47751b.f47748b) {
            if (this.f47751b.f47749c != null) {
                this.f47751b.f47749c.mo37270a(this.f47750a);
            }
        }
    }
}
