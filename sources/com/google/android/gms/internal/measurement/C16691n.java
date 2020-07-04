package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n */
final class C16691n implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f46627a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f46628b;

    /* renamed from: c */
    private final /* synthetic */ C16689l f46629c;

    C16691n(C16689l lVar, String str, Runnable runnable) {
        this.f46629c = lVar;
        this.f46627a = str;
        this.f46628b = runnable;
    }

    public final void run() {
        this.f46629c.f46624b.mo42498a(this.f46627a);
        if (this.f46628b != null) {
            this.f46628b.run();
        }
    }
}
