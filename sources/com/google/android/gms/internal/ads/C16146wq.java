package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wq */
final class C16146wq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16140wk f45252a;

    C16146wq(C16140wk wkVar) {
        this.f45252a = wkVar;
    }

    public final void run() {
        if (this.f45252a.f45243l != null) {
            this.f45252a.f45243l.mo41761a();
            this.f45252a.f45243l = null;
        }
    }
}
