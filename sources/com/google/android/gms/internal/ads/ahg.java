package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@C6505uv
abstract class ahg {

    /* renamed from: a */
    private final WeakReference<View> f40210a;

    public ahg(View view) {
        this.f40210a = new WeakReference<>(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo39345a(ViewTreeObserver viewTreeObserver);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo39346b(ViewTreeObserver viewTreeObserver);

    /* renamed from: a */
    public final void mo39349a() {
        ViewTreeObserver c = m45866c();
        if (c != null) {
            mo39345a(c);
        }
    }

    /* renamed from: b */
    public final void mo39350b() {
        ViewTreeObserver c = m45866c();
        if (c != null) {
            mo39346b(c);
        }
    }

    /* renamed from: c */
    private final ViewTreeObserver m45866c() {
        View view = (View) this.f40210a.get();
        if (view == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}
