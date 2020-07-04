package com.p280ss.android.ugc.aweme.account.shortvideo.p981ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.ss.android.ugc.aweme.account.shortvideo.ui.PressFadeLinearLayout */
public class PressFadeLinearLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f59348a;

    /* renamed from: a */
    private void m73701a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getChildAt(i), "alpha", new float[]{1.0f, 0.5f});
            ofFloat.setDuration(100);
            ofFloat.start();
            ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                }
            });
        }
    }

    /* renamed from: b */
    private void m73702b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.clearAnimation();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "alpha", new float[]{childAt.getAlpha(), 1.0f});
            ofFloat.setDuration(100);
            ofFloat.start();
            ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                }
            });
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f59348a;
    }

    public void setIntercept(boolean z) {
        this.f59348a = z;
    }

    public PressFadeLinearLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    m73701a();
                    break;
                case 1:
                    m73702b();
                    break;
            }
        } else {
            m73702b();
        }
        return super.onTouchEvent(motionEvent);
    }

    public PressFadeLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PressFadeLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
