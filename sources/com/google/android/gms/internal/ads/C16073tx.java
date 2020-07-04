package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.tx */
final class C16073tx implements OnGlobalLayoutListener {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f45084a;

    /* renamed from: b */
    private final /* synthetic */ C16065tp f45085b;

    C16073tx(C16065tp tpVar, WeakReference weakReference) {
        this.f45085b = tpVar;
        this.f45084a = weakReference;
    }

    public final void onGlobalLayout() {
        this.f45085b.m52195a(this.f45084a, false);
    }
}
