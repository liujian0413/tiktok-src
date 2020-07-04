package com.bytedance.android.livesdk.utils;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: com.bytedance.android.livesdk.utils.j */
public final class C9072j {
    /* renamed from: a */
    public static AnimatorSet m27079a(View view, float f, float f2, AnimatorListener animatorListener) {
        View view2 = view;
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(view2, "scaleX", new float[]{0.0f, 1.1f}).setDuration(400), ObjectAnimator.ofFloat(view2, "scaleY", new float[]{0.0f, 1.1f}).setDuration(400), ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f, 1.0f}).setDuration(400)});
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(new Animator[]{ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.1f, 1.0f}).setDuration(400), ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.1f, 1.0f}).setDuration(400)});
        animatorSet.playSequentially(new Animator[]{animatorSet2, animatorSet3});
        AnimatorSet animatorSet4 = new AnimatorSet();
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.playTogether(new Animator[]{ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.0f, 0.6f}).setDuration(800), ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.0f, 0.6f}).setDuration(800), ObjectAnimator.ofFloat(view2, "translationX", new float[]{0.0f, f}).setDuration(800), ObjectAnimator.ofFloat(view2, "translationY", new float[]{0.0f, f2}).setDuration(800)});
        AnimatorSet animatorSet6 = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(view2, "rotation", new float[]{0.0f, 8.0f}).setDuration(120);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view2, "rotation", new float[]{8.0f, -8.0f}).setDuration(120);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view2, "rotation", new float[]{-8.0f, 0.0f}).setDuration(120);
        animatorSet6.setStartDelay(1000);
        animatorSet6.playSequentially(new Animator[]{duration, duration2, duration3});
        AnimatorSet animatorSet7 = new AnimatorSet();
        animatorSet7.playTogether(new Animator[]{ObjectAnimator.ofFloat(view2, "scaleX", new float[]{0.6f, 0.5f}).setDuration(400), ObjectAnimator.ofFloat(view2, "scaleY", new float[]{0.6f, 0.5f}).setDuration(400), ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f, 0.0f}).setDuration(400)});
        animatorSet7.setStartDelay(2200);
        animatorSet4.playTogether(new Animator[]{animatorSet5, animatorSet6, animatorSet7});
        AnimatorSet animatorSet8 = new AnimatorSet();
        animatorSet8.playSequentially(new Animator[]{animatorSet, animatorSet4});
        animatorSet8.addListener(animatorListener);
        return animatorSet8;
    }
}
