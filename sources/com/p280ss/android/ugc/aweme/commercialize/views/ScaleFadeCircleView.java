package com.p280ss.android.ugc.aweme.commercialize.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.ScaleFadeCircleView */
public class ScaleFadeCircleView extends View {
    /* renamed from: a */
    public final void mo66229a() {
        m83852a(this, 0.7f, 0.0f, 1500);
        m83851a(this, 1.0f, 1.0f, 1.5f, 1.5f, 1500);
    }

    public ScaleFadeCircleView(Context context) {
        this(context, null);
    }

    public ScaleFadeCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScaleFadeCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackground(C0683b.m2903a(context, (int) R.drawable.c1));
    }

    /* renamed from: a */
    private static void m83852a(View view, float f, float f2, long j) {
        view.setAlpha(0.7f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.7f, 0.0f});
        ofFloat.setDuration(1500);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
    }

    /* renamed from: a */
    private static void m83851a(View view, float f, float f2, float f3, float f4, long j) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 1.5f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 1.5f});
        ofFloat.setRepeatCount(-1);
        ofFloat2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.setDuration(1500);
        animatorSet.start();
    }
}
