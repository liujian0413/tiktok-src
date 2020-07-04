package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bj */
final class C16837bj implements Callable<List<zzo>> {

    /* renamed from: a */
    private final /* synthetic */ zzk f47061a;

    /* renamed from: b */
    private final /* synthetic */ String f47062b;

    /* renamed from: c */
    private final /* synthetic */ String f47063c;

    /* renamed from: d */
    private final /* synthetic */ C16828ba f47064d;

    C16837bj(C16828ba baVar, zzk zzk, String str, String str2) {
        this.f47064d = baVar;
        this.f47061a = zzk;
        this.f47062b = str;
        this.f47063c = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f47064d.f47035a.mo43873n();
        return this.f47064d.f47035a.mo43864d().mo44100b(this.f47061a.f47530a, this.f47062b, this.f47063c);
    }
}
