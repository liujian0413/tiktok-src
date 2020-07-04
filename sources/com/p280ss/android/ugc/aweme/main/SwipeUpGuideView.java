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
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.main.SwipeUpGuideView */
public class SwipeUpGuideView extends FrameLayout implements AnimatorListener, AnimatorUpdateListener, OnGestureListener {

    /* renamed from: a */
    GestureDetector f85767a;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    /* renamed from: a */
    private void m106427a() {
        this.f85767a = new GestureDetector(getContext(), this);
    }

    public SwipeUpGuideView(Context context) {
        this(context, null);
    }

    public void onLongPress(MotionEvent motionEvent) {
        performLongClick();
        m106428a(0.0f);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f85767a.onTouchEvent(motionEvent);
    }

    public void onAnimationEnd(Animator animator) {
        callOnClick();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        callOnClick();
        m106428a(0.0f);
        return true;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        View childAt = getChildAt(0);
        childAt.setTranslationY((-valueAnimator.getAnimatedFraction()) * ((float) getHeight()));
        childAt.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    /* renamed from: a */
    private void m106428a(float f) {
        int height = getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        long min = Math.min((long) (((float) ((long) height)) / ((Math.abs(f) / 1000.0f) / 2.0f)), 400);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(min);
        ofFloat.addUpdateListener(this);
        ofFloat.addListener(this);
        ofFloat.start();
    }

    public SwipeUpGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeUpGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m106427a();
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (f2 < 0.0f) {
            m106428a(f2);
        }
        return true;
    }
}
