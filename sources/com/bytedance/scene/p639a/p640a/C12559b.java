package com.bytedance.scene.p639a.p640a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.scene.p639a.C12557a;
import com.bytedance.scene.p639a.C12575d;

/* renamed from: com.bytedance.scene.a.a.b */
public final class C12559b extends C12575d {
    /* renamed from: a */
    public final boolean mo30836a() {
        return true;
    }

    /* renamed from: a */
    public final Animator mo30835a(C12557a aVar, C12557a aVar2) {
        final View view = aVar2.f33331b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, view.getAlpha()});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(150);
        return ofFloat;
    }

    /* renamed from: b */
    public final Animator mo30837b(final C12557a aVar, C12557a aVar2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{aVar.f33331b.getAlpha(), 0.0f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                aVar.f33331b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(150);
        return ofFloat;
    }
}
