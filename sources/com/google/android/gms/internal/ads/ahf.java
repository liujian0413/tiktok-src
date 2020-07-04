package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

@C6505uv
final class ahf extends ahg implements OnScrollChangedListener {

    /* renamed from: a */
    private final WeakReference<OnScrollChangedListener> f40209a;

    public ahf(View view, OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f40209a = new WeakReference<>(onScrollChangedListener);
    }

    public final void onScrollChanged() {
        OnScrollChangedListener onScrollChangedListener = (OnScrollChangedListener) this.f40209a.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            mo39350b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39345a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo39346b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }
}
