package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.C14793ay;
import java.lang.ref.WeakReference;

@C6505uv
final class ahe extends ahg implements OnGlobalLayoutListener {

    /* renamed from: a */
    private final WeakReference<OnGlobalLayoutListener> f40208a;

    public ahe(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f40208a = new WeakReference<>(onGlobalLayoutListener);
    }

    public final void onGlobalLayout() {
        OnGlobalLayoutListener onGlobalLayoutListener = (OnGlobalLayoutListener) this.f40208a.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            mo39350b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39345a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo39346b(ViewTreeObserver viewTreeObserver) {
        C14793ay.m42896b().mo39198a(viewTreeObserver, (OnGlobalLayoutListener) this);
    }
}
