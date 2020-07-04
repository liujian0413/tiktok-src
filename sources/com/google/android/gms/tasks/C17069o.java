package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.o */
final class C17069o implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17068n f47746a;

    C17069o(C17068n nVar) {
        this.f47746a = nVar;
    }

    public final void run() {
        synchronized (this.f47746a.f47744b) {
            if (this.f47746a.f47745c != null) {
                this.f47746a.f47745c.mo44282a();
            }
        }
    }
}
