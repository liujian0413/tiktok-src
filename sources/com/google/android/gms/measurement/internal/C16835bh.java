package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bh */
final class C16835bh implements Callable<List<C16921el>> {

    /* renamed from: a */
    private final /* synthetic */ zzk f47053a;

    /* renamed from: b */
    private final /* synthetic */ String f47054b;

    /* renamed from: c */
    private final /* synthetic */ String f47055c;

    /* renamed from: d */
    private final /* synthetic */ C16828ba f47056d;

    C16835bh(C16828ba baVar, zzk zzk, String str, String str2) {
        this.f47056d = baVar;
        this.f47053a = zzk;
        this.f47054b = str;
        this.f47055c = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f47056d.f47035a.mo43873n();
        return this.f47056d.f47035a.mo43864d().mo44088a(this.f47053a.f47530a, this.f47054b, this.f47055c);
    }
}
