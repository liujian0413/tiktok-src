package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bo */
final class C16842bo implements Callable<byte[]> {

    /* renamed from: a */
    private final /* synthetic */ zzag f47077a;

    /* renamed from: b */
    private final /* synthetic */ String f47078b;

    /* renamed from: c */
    private final /* synthetic */ C16828ba f47079c;

    C16842bo(C16828ba baVar, zzag zzag, String str) {
        this.f47079c = baVar;
        this.f47077a = zzag;
        this.f47078b = str;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f47079c.f47035a.mo43873n();
        return this.f47079c.f47035a.mo43867f().mo43761a(this.f47077a, this.f47078b);
    }
}
