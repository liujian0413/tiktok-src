package com.p280ss.android.ugc.aweme.main;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.main.LongClickGuideView */
public class LongClickGuideView extends FrameLayout implements AnimatorListener, AnimatorUpdateListener, OnGestureListener {

    /* renamed from: a */
    GestureDetector f85638a;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    /* renamed from: a */
    private void m106215a() {
        this.f85638a = new GestureDetector(getContext(), this);
    }

    public LongClickGuideView(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f85638a.onTouchEvent(motionEvent);
    }

    public void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        getChildAt(0).setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    public void onLongPress(MotionEvent motionEvent) {
        performLongClick();
        m106216a(200);
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        callOnClick();
        m106216a(0);
        return true;
    }

    /* renamed from: a */
    private void m106216a(long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(this);
        ofFloat.addListener(this);
        ofFloat.start();
    }

    public LongClickGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LongClickGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        animate().alpha(1.0f).setDuration(1000).start();
        m106215a();
    }
}
