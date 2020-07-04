package com.bytedance.android.livesdk.gift.effect.normal.utils;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

public final class AnimationUtils {

    /* renamed from: a */
    private static final Interpolator f21930a = new Interpolator() {

        /* renamed from: a */
        private final float f21931a = 2.0f;

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * ((f2 * 3.0f) + 2.0f)) + 1.0f;
        }
    };

    public enum GiftAnimType {
        entry,
        comb,
        show,
        exit
    }

    /* renamed from: com.bytedance.android.livesdk.gift.effect.normal.utils.AnimationUtils$a */
    public static class C8055a implements AnimatorListener {

        /* renamed from: a */
        private C8056b f21933a;

        /* renamed from: b */
        private GiftAnimType f21934b;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f21933a != null) {
                switch (this.f21934b) {
                    case entry:
                        this.f21933a.mo21016a();
                        return;
                    case comb:
                        this.f21933a.mo21017b();
                        return;
                    case show:
                        this.f21933a.mo21018c();
                        return;
                    default:
                        this.f21933a.mo21019d();
                        this.f21933a = null;
                        return;
                }
            }
        }

        public C8055a(GiftAnimType giftAnimType, C8056b bVar) {
            this.f21933a = bVar;
            this.f21934b = giftAnimType;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.effect.normal.utils.AnimationUtils$b */
    public interface C8056b {
        /* renamed from: a */
        void mo21016a();

        /* renamed from: b */
        void mo21017b();

        /* renamed from: c */
        void mo21018c();

        /* renamed from: d */
        void mo21019d();
    }

    /* renamed from: a */
    public static AnimatorSet m24680a(View view, C8056b bVar) {
        return m24683c(view, bVar);
    }

    /* renamed from: b */
    public static AnimatorSet m24682b(View view, C8056b bVar) {
        view.getX();
        float y = view.getY();
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationY", new float[]{y, y - 100.0f}).setDuration(500);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f}).setDuration(500);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, duration2});
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new C8055a(GiftAnimType.exit, bVar));
        return animatorSet;
    }

    /* renamed from: c */
    private static AnimatorSet m24683c(View view, C8056b bVar) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "scaleX", new float[]{4.0f, 1.0f}).setDuration(300);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{4.0f, 1.0f}).setDuration(300);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(100);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 1.5f}).setDuration(100);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 1.5f}).setDuration(100);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.5f, 1.0f}).setDuration(100);
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.5f, 1.0f}).setDuration(100);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, duration2, duration3});
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{duration4, duration5});
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(new Animator[]{duration6, duration7});
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(new Animator[]{animatorSet, animatorSet2, animatorSet3});
        animatorSet4.addListener(new C8055a(GiftAnimType.comb, bVar));
        return animatorSet4;
    }

    /* renamed from: a */
    public static AnimatorSet m24681a(View view, boolean z, C8056b bVar) {
        int i;
        float x = view.getX();
        view.getY();
        if (z) {
            i = -1;
        } else {
            i = 1;
        }
        float f = (float) i;
        float f2 = 100.0f * f;
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationX", new float[]{x * f, f2}).setDuration(500);
        float f3 = f * 25.0f;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "translationX", new float[]{f2, f3}).setDuration(200);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "translationX", new float[]{f3, f3}).setDuration(200);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2, duration3});
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new C8055a(GiftAnimType.entry, bVar));
        return animatorSet;
    }
}
