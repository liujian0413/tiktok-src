package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.m */
final class C17067m implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17057f f47741a;

    /* renamed from: b */
    private final /* synthetic */ C17066l f47742b;

    C17067m(C17066l lVar, C17057f fVar) {
        this.f47742b = lVar;
        this.f47741a = fVar;
    }

    public final void run() {
        try {
            C17057f fVar = (C17057f) this.f47742b.f47739b.mo44281a(this.f47741a);
            if (fVar == null) {
                this.f47742b.mo44283a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            fVar.mo44290a(C17059h.f47730b, (C17056e<? super TResult>) this.f47742b);
            fVar.mo44289a(C17059h.f47730b, (C17055d) this.f47742b);
            fVar.mo44287a(C17059h.f47730b, (C17053b) this.f47742b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f47742b.f47740c.mo44315a((Exception) e.getCause());
            } else {
                this.f47742b.f47740c.mo44315a((Exception) e);
            }
        } catch (Exception e2) {
            this.f47742b.f47740c.mo44315a(e2);
        }
    }
}
