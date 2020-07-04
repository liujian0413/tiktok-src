package com.bytedance.android.livesdk.gift.effect.video.p389b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.p022v4.view.animation.C0957c;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.utils.C9051ar;

/* renamed from: com.bytedance.android.livesdk.gift.effect.video.b.a */
public final class C8074a {
    /* renamed from: a */
    public static AnimatorSet m24771a(View view) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(160);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{C9051ar.m27035b(view.getContext(), 45.0f), 0.0f}).setDuration(160);
        duration.setInterpolator(new LinearInterpolator());
        duration2.setInterpolator(C0957c.m4073a(0.33f, 0.0f, 0.2f, 1.0f));
        duration.addUpdateListener(new C8075b(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, duration2});
        return animatorSet;
    }

    /* renamed from: a */
    static final /* synthetic */ void m24772a(View view, ValueAnimator valueAnimator) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }
}
