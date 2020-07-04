package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.ty */
final class C16074ty implements OnScrollChangedListener {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f45086a;

    /* renamed from: b */
    private final /* synthetic */ C16065tp f45087b;

    C16074ty(C16065tp tpVar, WeakReference weakReference) {
        this.f45087b = tpVar;
        this.f45086a = weakReference;
    }

    public final void onScrollChanged() {
        this.f45087b.m52195a(this.f45086a, true);
    }
}
