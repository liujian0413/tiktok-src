package org.greenrobot.eventbus;

/* renamed from: org.greenrobot.eventbus.p */
final class C48345p {

    /* renamed from: a */
    final Object f123442a;

    /* renamed from: b */
    final C48342n f123443b;

    /* renamed from: c */
    volatile boolean f123444c = true;

    public final int hashCode() {
        return this.f123442a.hashCode() + this.f123443b.f123428f.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C48345p)) {
            return false;
        }
        C48345p pVar = (C48345p) obj;
        if (this.f123442a != pVar.f123442a || !this.f123443b.equals(pVar.f123443b)) {
            return false;
        }
        return true;
    }

    C48345p(Object obj, C48342n nVar) {
        this.f123442a = obj;
        this.f123443b = nVar;
    }
}
