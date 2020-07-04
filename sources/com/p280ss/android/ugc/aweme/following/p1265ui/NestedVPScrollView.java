package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.content.Context;
import android.support.p022v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.ui.NestedVPScrollView */
public final class NestedVPScrollView extends NestedScrollView {

    /* renamed from: c */
    private float f78181c;

    /* renamed from: d */
    private float f78182d;

    public NestedVPScrollView(Context context) {
        C7573i.m23587b(context, "context");
        super(context, null, 0);
        this.f78181c = -1.0f;
        this.f78182d = -1.0f;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (action == 2) {
                if (Math.abs(rawX - this.f78181c) + 0.0f >= Math.abs(rawY - this.f78182d) + 0.0f) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f78181c = rawX;
                this.f78182d = rawY;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public NestedVPScrollView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, 0);
        this.f78181c = -1.0f;
        this.f78182d = -1.0f;
    }

    public NestedVPScrollView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f78181c = -1.0f;
        this.f78182d = -1.0f;
    }

    public /* synthetic */ NestedVPScrollView(Context context, AttributeSet attributeSet, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public /* synthetic */ NestedVPScrollView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
