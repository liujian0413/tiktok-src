package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lx */
final class C15857lx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f44622a;

    /* renamed from: b */
    private final /* synthetic */ C15853lt f44623b;

    C15857lx(C15853lt ltVar, String str) {
        this.f44623b = ltVar;
        this.f44622a = str;
    }

    public final void run() {
        this.f44623b.f44616a.loadData(this.f44622a, "text/html", "UTF-8");
    }
}
