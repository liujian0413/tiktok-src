package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

final class amm implements OnAttachStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ aag f40676a;

    /* renamed from: b */
    private final /* synthetic */ amj f40677b;

    amm(amj amj, aag aag) {
        this.f40677b = amj;
        this.f40676a = aag;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.f40677b.m46392a(view, this.f40676a, 10);
    }
}
