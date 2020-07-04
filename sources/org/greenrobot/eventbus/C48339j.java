package org.greenrobot.eventbus;

/* renamed from: org.greenrobot.eventbus.j */
final class C48339j {

    /* renamed from: a */
    private C48338i f123417a;

    /* renamed from: b */
    private C48338i f123418b;

    C48339j() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized C48338i mo121777a() {
        C48338i iVar;
        iVar = this.f123417a;
        if (this.f123417a != null) {
            this.f123417a = this.f123417a.f123416c;
            if (this.f123417a == null) {
                this.f123418b = null;
            }
        }
        return iVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized C48338i mo121778a(int i) throws InterruptedException {
        if (this.f123417a == null) {
            wait(1000);
        }
        return mo121777a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo121779a(C48338i iVar) {
        if (iVar != null) {
            if (this.f123418b != null) {
                this.f123418b.f123416c = iVar;
                this.f123418b = iVar;
            } else if (this.f123417a == null) {
                this.f123418b = iVar;
                this.f123417a = iVar;
            } else {
                throw new IllegalStateException("Head present, but no tail");
            }
            notifyAll();
        } else {
            throw new NullPointerException("null cannot be enqueued");
        }
    }
}
