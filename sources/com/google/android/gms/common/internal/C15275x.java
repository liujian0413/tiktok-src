package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.C15139g;

/* renamed from: com.google.android.gms.common.internal.x */
final class C15275x extends C15248g {

    /* renamed from: a */
    private final /* synthetic */ Intent f39471a;

    /* renamed from: b */
    private final /* synthetic */ C15139g f39472b;

    /* renamed from: c */
    private final /* synthetic */ int f39473c;

    C15275x(Intent intent, C15139g gVar, int i) {
        this.f39471a = intent;
        this.f39472b = gVar;
        this.f39473c = i;
    }

    /* renamed from: a */
    public final void mo38590a() {
        if (this.f39471a != null) {
            this.f39472b.startActivityForResult(this.f39471a, this.f39473c);
        }
    }
}
