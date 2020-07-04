package com.bytedance.ies.uikit.p577b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: com.bytedance.ies.uikit.b.e */
public final class C11005e {
    /* renamed from: a */
    public static AnimatorSet m32260a(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f})});
        animatorSet.setDuration(300);
        return animatorSet;
    }

    /* renamed from: b */
    public static AnimatorSet m32261b(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f})});
        animatorSet.setDuration(300);
        return animatorSet;
    }
}
