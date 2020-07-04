package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.adj;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.overlay.h */
final class C14841h extends RelativeLayout {

    /* renamed from: a */
    boolean f38447a;

    /* renamed from: b */
    private adj f38448b;

    public C14841h(Context context, String str, String str2) {
        super(context);
        this.f38448b = new adj(context, str);
        this.f38448b.f40031c = str2;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f38447a) {
            this.f38448b.mo39215a(motionEvent);
        }
        return false;
    }
}
