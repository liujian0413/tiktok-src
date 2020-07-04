package com.bytedance.android.livesdk.gift.effect.doodle.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class CustomConstraintLayout extends ConstraintLayout {

    /* renamed from: g */
    private Runnable f21680g;

    public CustomConstraintLayout(Context context) {
        super(context);
    }

    public void setDispatchTouchEventCallback(Runnable runnable) {
        this.f21680g = runnable;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f21680g != null) {
            this.f21680g.run();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public CustomConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
