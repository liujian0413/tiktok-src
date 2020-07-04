package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.s */
final class C17073s implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17057f f47755a;

    /* renamed from: b */
    private final /* synthetic */ C17072r f47756b;

    C17073s(C17072r rVar, C17057f fVar) {
        this.f47756b = rVar;
        this.f47755a = fVar;
    }

    public final void run() {
        synchronized (this.f47756b.f47753b) {
            if (this.f47756b.f47754c != null) {
                this.f47756b.f47754c.mo44283a(this.f47755a.mo44297e());
            }
        }
    }
}
