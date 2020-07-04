package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.ee */
final class C15649ee implements C15630dn {

    /* renamed from: a */
    private final /* synthetic */ View f44395a;

    /* renamed from: b */
    private final /* synthetic */ C15648ed f44396b;

    C15649ee(C15648ed edVar, View view) {
        this.f44396b = edVar;
        this.f44395a = view;
    }

    /* renamed from: a */
    public final void mo41541a() {
        this.f44396b.onClick(this.f44395a);
    }

    /* renamed from: a */
    public final void mo41542a(MotionEvent motionEvent) {
        this.f44396b.onTouch(null, motionEvent);
    }
}
