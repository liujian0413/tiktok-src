package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bn */
final class C16841bn implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzag f47074a;

    /* renamed from: b */
    private final /* synthetic */ String f47075b;

    /* renamed from: c */
    private final /* synthetic */ C16828ba f47076c;

    C16841bn(C16828ba baVar, zzag zzag, String str) {
        this.f47076c = baVar;
        this.f47074a = zzag;
        this.f47075b = str;
    }

    public final void run() {
        this.f47076c.f47035a.mo43873n();
        this.f47076c.f47035a.mo43849a(this.f47074a, this.f47075b);
    }
}
