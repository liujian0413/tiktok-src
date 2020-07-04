package com.p280ss.android.ugc.aweme.utils;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.utils.f */
final /* synthetic */ class C43116f implements OnTouchListener {

    /* renamed from: a */
    private final View f111740a;

    /* renamed from: b */
    private final float f111741b;

    C43116f(View view, float f) {
        this.f111740a = view;
        this.f111741b = f;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return C43081e.m136674a(this.f111740a, this.f111741b, view, motionEvent);
    }
}
