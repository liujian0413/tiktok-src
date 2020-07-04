package com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.InterceptFrameLayout */
public final class InterceptFrameLayout extends FrameLayout {

    /* renamed from: a */
    private boolean f101897a;

    public InterceptFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public InterceptFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean getIntercept() {
        return this.f101897a;
    }

    public final void setIntercept(boolean z) {
        this.f101897a = z;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f101897a) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public InterceptFrameLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ InterceptFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
