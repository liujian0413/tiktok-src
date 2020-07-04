package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ly */
final class C15858ly implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f44624a;

    /* renamed from: b */
    private final /* synthetic */ C15853lt f44625b;

    C15858ly(C15853lt ltVar, String str) {
        this.f44625b = ltVar;
        this.f44624a = str;
    }

    public final void run() {
        this.f44625b.f44616a.loadData(this.f44624a, "text/html", "UTF-8");
    }
}
