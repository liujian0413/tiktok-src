package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.google.android.gms.ads.internal.at */
final class C14788at implements OnTouchListener {

    /* renamed from: a */
    private final /* synthetic */ C14786ar f38206a;

    C14788at(C14786ar arVar) {
        this.f38206a = arVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f38206a.f38203h != null) {
            this.f38206a.f38203h.mo40534a(motionEvent);
        }
        return false;
    }
}
