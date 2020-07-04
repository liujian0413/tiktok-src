package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.google.android.gms.ads.internal.bl */
final class C14807bl implements OnTouchListener {

    /* renamed from: a */
    private final /* synthetic */ C14817bv f38312a;

    /* renamed from: b */
    private final /* synthetic */ C14805bj f38313b;

    C14807bl(C14805bj bjVar, C14817bv bvVar) {
        this.f38313b = bjVar;
        this.f38312a = bvVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f38312a.mo37759a();
        if (this.f38313b.f38308b != null) {
            this.f38313b.f38308b.mo39033c();
        }
        return false;
    }
}
