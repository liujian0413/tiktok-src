package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.k */
final class C17065k implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17057f f47736a;

    /* renamed from: b */
    private final /* synthetic */ C17064j f47737b;

    C17065k(C17064j jVar, C17057f fVar) {
        this.f47737b = jVar;
        this.f47736a = fVar;
    }

    public final void run() {
        if (this.f47736a.mo44295c()) {
            this.f47737b.f47735c.mo44319f();
            return;
        }
        try {
            this.f47737b.f47735c.mo44316a(this.f47737b.f47734b.mo44281a(this.f47736a));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f47737b.f47735c.mo44315a((Exception) e.getCause());
            } else {
                this.f47737b.f47735c.mo44315a((Exception) e);
            }
        } catch (Exception e2) {
            this.f47737b.f47735c.mo44315a(e2);
        }
    }
}
