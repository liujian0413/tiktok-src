package com.google.android.play.core.splitinstall;

/* renamed from: com.google.android.play.core.splitinstall.w */
final class C6574w implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C6563f f18895a;

    /* renamed from: b */
    private final /* synthetic */ int f18896b;

    /* renamed from: c */
    private final /* synthetic */ int f18897c;

    /* renamed from: d */
    private final /* synthetic */ C6575x f18898d;

    C6574w(C6575x xVar, C6563f fVar, int i, int i2) {
        this.f18898d = xVar;
        this.f18895a = fVar;
        this.f18896b = i;
        this.f18897c = i2;
    }

    public final void run() {
        this.f18898d.mo15874a(this.f18895a.mo15925a(this.f18896b, this.f18897c));
    }
}
