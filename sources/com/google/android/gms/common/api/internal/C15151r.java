package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C15041e.C15042a;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.r */
final class C15151r implements C15042a {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f39200a;

    /* renamed from: b */
    private final /* synthetic */ C15150q f39201b;

    C15151r(C15150q qVar, BasePendingResult basePendingResult) {
        this.f39201b = qVar;
        this.f39200a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo38265a(Status status) {
        this.f39201b.f39198a.remove(this.f39200a);
    }
}
