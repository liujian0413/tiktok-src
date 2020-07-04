package com.google.android.gms.internal.p762d;

/* renamed from: com.google.android.gms.internal.d.f */
final class C16366f extends C16363c {

    /* renamed from: a */
    private final C16364d f45850a = new C16364d();

    C16366f() {
    }

    /* renamed from: a */
    public final void mo42453a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f45850a.mo42454a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
