package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.internal.ads.mw */
public final class C15883mw extends aha<C15851lr> {

    /* renamed from: a */
    private final Object f44674a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public adv<C15851lr> f44675b;

    /* renamed from: c */
    private boolean f44676c;

    /* renamed from: d */
    private int f44677d;

    public C15883mw(adv<C15851lr> adv) {
        this.f44675b = adv;
        this.f44676c = false;
        this.f44677d = 0;
    }

    /* renamed from: a */
    public final C15879ms mo41762a() {
        C15879ms msVar = new C15879ms(this);
        synchronized (this.f44674a) {
            mo39339a(new C15884mx(this, msVar), new C15885my(this, msVar));
            C15267r.m44390a(this.f44677d >= 0);
            this.f44677d++;
        }
        return msVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41763b() {
        synchronized (this.f44674a) {
            C15267r.m44390a(this.f44677d > 0);
            acd.m45438a("Releasing 1 reference for JS Engine");
            this.f44677d--;
            m51354f();
        }
    }

    /* renamed from: c */
    public final void mo41764c() {
        synchronized (this.f44674a) {
            C15267r.m44390a(this.f44677d >= 0);
            acd.m45438a("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f44676c = true;
            m51354f();
        }
    }

    /* renamed from: f */
    private final void m51354f() {
        synchronized (this.f44674a) {
            C15267r.m44390a(this.f44677d >= 0);
            if (!this.f44676c || this.f44677d != 0) {
                acd.m45438a("There are still references to the engine. Not destroying.");
            } else {
                acd.m45438a("No reference is left (including root). Cleaning up engine.");
                mo39339a(new C15886mz(this), new agy());
            }
        }
    }
}
