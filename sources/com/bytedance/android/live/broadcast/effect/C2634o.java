package com.bytedance.android.live.broadcast.effect;

import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7495v;

/* renamed from: com.bytedance.android.live.broadcast.effect.o */
final /* synthetic */ class C2634o implements C7495v {

    /* renamed from: a */
    private final C2624k f8439a;

    /* renamed from: b */
    private final FilterModel f8440b;

    C2634o(C2624k kVar, FilterModel filterModel) {
        this.f8439a = kVar;
        this.f8440b = filterModel;
    }

    public final void subscribe(C47870u uVar) {
        this.f8439a.mo9263a(this.f8440b, uVar);
    }
}
