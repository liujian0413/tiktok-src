package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.u */
final class C17075u implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17057f f47760a;

    /* renamed from: b */
    private final /* synthetic */ C17074t f47761b;

    C17075u(C17074t tVar, C17057f fVar) {
        this.f47761b = tVar;
        this.f47760a = fVar;
    }

    public final void run() {
        synchronized (this.f47761b.f47758b) {
            if (this.f47761b.f47759c != null) {
                this.f47761b.f47759c.mo44284a(this.f47760a.mo44296d());
            }
        }
    }
}
