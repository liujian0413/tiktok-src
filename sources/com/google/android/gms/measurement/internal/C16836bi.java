package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bi */
final class C16836bi implements Callable<List<C16921el>> {

    /* renamed from: a */
    private final /* synthetic */ String f47057a;

    /* renamed from: b */
    private final /* synthetic */ String f47058b;

    /* renamed from: c */
    private final /* synthetic */ String f47059c;

    /* renamed from: d */
    private final /* synthetic */ C16828ba f47060d;

    C16836bi(C16828ba baVar, String str, String str2, String str3) {
        this.f47060d = baVar;
        this.f47057a = str;
        this.f47058b = str2;
        this.f47059c = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f47060d.f47035a.mo43873n();
        return this.f47060d.f47035a.mo43864d().mo44088a(this.f47057a, this.f47058b, this.f47059c);
    }
}
