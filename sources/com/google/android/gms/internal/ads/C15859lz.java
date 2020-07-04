package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lz */
final class C15859lz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f44626a;

    /* renamed from: b */
    private final /* synthetic */ C15853lt f44627b;

    C15859lz(C15853lt ltVar, String str) {
        this.f44627b = ltVar;
        this.f44626a = str;
    }

    public final void run() {
        this.f44627b.f44616a.loadUrl(this.f44626a);
    }
}
