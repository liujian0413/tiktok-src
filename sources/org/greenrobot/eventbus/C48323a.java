package org.greenrobot.eventbus;

/* renamed from: org.greenrobot.eventbus.a */
final class C48323a implements Runnable, C48340k {

    /* renamed from: a */
    private final C48339j f123377a = new C48339j();

    /* renamed from: b */
    private final C7705c f123378b;

    public final void run() {
        C48338i a = this.f123377a.mo121777a();
        if (a != null) {
            this.f123378b.mo20390a(a);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }

    C48323a(C7705c cVar) {
        this.f123378b = cVar;
    }

    /* renamed from: a */
    public final void mo121760a(C48345p pVar, Object obj) {
        this.f123377a.mo121779a(C48338i.m149920a(pVar, obj));
        this.f123378b.f20942c.execute(this);
    }
}
