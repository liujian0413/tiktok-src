package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* renamed from: com.ss.android.ugc.aweme.views.f */
public final class C43370f extends HorizontalScrollView {

    /* renamed from: a */
    private boolean f112341a = true;

    public final void setScrollable(boolean z) {
        this.f112341a = z;
    }

    public C43370f(Context context) {
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f112341a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }
}
