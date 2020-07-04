package com.p280ss.android.ugc.aweme.story.shootvideo;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.a */
public final class C42007a {
    /* renamed from: a */
    public static void m133552a(View view) {
        m133553a(view, null);
    }

    /* renamed from: b */
    public static void m133554b(View view) {
        m133555b(view, null);
    }

    /* renamed from: a */
    private static void m133553a(final View view, AnimatorListener animatorListener) {
        if (view != null) {
            view.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.setDuration(300);
            ofFloat.addListener(new AnimatorListenerAdapter(null) {
                public final void onAnimationEnd(Animator animator) {
                    view.setVisibility(0);
                    if (null != null) {
                        null.onAnimationEnd(animator);
                    }
                    super.onAnimationEnd(animator);
                }
            });
            ofFloat.start();
        }
    }

    /* renamed from: b */
    private static void m133555b(final View view, AnimatorListener animatorListener) {
        if (view != null && view.getVisibility() != 8) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.setDuration(300);
            ofFloat.addListener(new AnimatorListenerAdapter(null) {
                public final void onAnimationEnd(Animator animator) {
                    view.setVisibility(8);
                    if (null != null) {
                        null.onAnimationEnd(animator);
                    }
                    super.onAnimationEnd(animator);
                }
            });
            ofFloat.start();
        }
    }
}
