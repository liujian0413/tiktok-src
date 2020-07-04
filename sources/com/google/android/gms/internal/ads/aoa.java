package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

final class aoa implements OnAttachStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ aag f40811a;

    /* renamed from: b */
    private final /* synthetic */ anw f40812b;

    aoa(anw anw, aag aag) {
        this.f40812b = anw;
        this.f40811a = aag;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.f40812b.m46672a(view, this.f40811a, 10);
    }
}
