package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PressFadeFrameLayout */
public class PressFadeFrameLayout extends FrameLayout {

    /* renamed from: a */
    public boolean f107090a;

    /* renamed from: a */
    private void m131356a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getChildAt(i), "alpha", new float[]{1.0f, 0.5f});
            ofFloat.setDuration(100);
            ofFloat.start();
            ofFloat.addUpdateListener(C41428w.f107781a);
        }
    }

    /* renamed from: b */
    private void m131357b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.clearAnimation();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "alpha", new float[]{childAt.getAlpha(), 1.0f});
            ofFloat.setDuration(100);
            ofFloat.start();
            ofFloat.addUpdateListener(C41429x.f107782a);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f107090a;
    }

    public void setIntercept(boolean z) {
        this.f107090a = z;
    }

    public PressFadeFrameLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    m131356a();
                    break;
                case 1:
                    m131357b();
                    break;
            }
        } else {
            m131357b();
        }
        return super.onTouchEvent(motionEvent);
    }

    public PressFadeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PressFadeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
