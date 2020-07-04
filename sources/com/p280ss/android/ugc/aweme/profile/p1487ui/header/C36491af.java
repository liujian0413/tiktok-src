package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.af */
final /* synthetic */ class C36491af implements AnimatorUpdateListener {

    /* renamed from: a */
    private final TextView f95783a;

    C36491af(TextView textView) {
        this.f95783a = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f95783a.setTextSize(1, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
