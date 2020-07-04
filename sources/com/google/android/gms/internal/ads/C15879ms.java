package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ms */
public final class C15879ms extends aha<C15889nb> {

    /* renamed from: a */
    private final Object f44669a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C15883mw f44670b;

    /* renamed from: c */
    private boolean f44671c;

    public C15879ms(C15883mw mwVar) {
        this.f44670b = mwVar;
    }

    /* renamed from: a */
    public final void mo41761a() {
        synchronized (this.f44669a) {
            if (!this.f44671c) {
                this.f44671c = true;
                mo39339a(new C15880mt(this), new agy());
                mo39339a(new C15881mu(this), new C15882mv(this));
            }
        }
    }
}
