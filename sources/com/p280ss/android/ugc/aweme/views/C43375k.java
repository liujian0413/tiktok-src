package com.p280ss.android.ugc.aweme.views;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.ss.android.ugc.aweme.views.k */
public final class C43375k extends ViewOutlineProvider {

    /* renamed from: a */
    private float f112346a;

    /* renamed from: b */
    private int f112347b;

    /* renamed from: c */
    private int f112348c;

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(new Rect(0, 0, this.f112347b, this.f112348c), this.f112346a);
    }

    public C43375k(float f, int i, int i2) {
        this.f112346a = f;
        this.f112347b = i;
        this.f112348c = i2;
    }
}
