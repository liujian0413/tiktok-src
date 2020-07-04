package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.b */
public final class C31887b {
    /* renamed from: a */
    public static void m103598a(View view) {
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        view.clearAnimation();
    }

    /* renamed from: a */
    public static RotateAnimation m103596a(int i, AnimationListener animationListener) {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration((long) i);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setAnimationListener(animationListener);
        return rotateAnimation;
    }

    /* renamed from: a */
    public static AlphaAnimation m103595a(int i, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        alphaAnimation.setDuration(2000);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setFillBefore(false);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setRepeatCount(-1);
        return alphaAnimation;
    }

    /* renamed from: a */
    public static TranslateAnimation m103597a(int i, float f, float f2, float f3, float f4) {
        TranslateAnimation translateAnimation = new TranslateAnimation(f, f2, 0.0f, 0.0f);
        translateAnimation.setDuration(240);
        translateAnimation.setInterpolator(new LinearInterpolator());
        translateAnimation.setRepeatMode(1);
        return translateAnimation;
    }
}
