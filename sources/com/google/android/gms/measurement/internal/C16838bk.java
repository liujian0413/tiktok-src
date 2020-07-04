package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bk */
final class C16838bk implements Callable<List<zzo>> {

    /* renamed from: a */
    private final /* synthetic */ String f47065a;

    /* renamed from: b */
    private final /* synthetic */ String f47066b;

    /* renamed from: c */
    private final /* synthetic */ String f47067c;

    /* renamed from: d */
    private final /* synthetic */ C16828ba f47068d;

    C16838bk(C16828ba baVar, String str, String str2, String str3) {
        this.f47068d = baVar;
        this.f47065a = str;
        this.f47066b = str2;
        this.f47067c = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f47068d.f47035a.mo43873n();
        return this.f47068d.f47035a.mo43864d().mo44100b(this.f47065a, this.f47066b, this.f47067c);
    }
}
