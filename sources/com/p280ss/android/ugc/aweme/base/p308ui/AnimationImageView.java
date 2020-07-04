package com.p280ss.android.ugc.aweme.base.p308ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AnimationImageView */
public class AnimationImageView extends LottieAnimationView {
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo7085f();
    }

    /* renamed from: h */
    private void m76750h() {
        setImageFolder("images");
        mo7076a((AnimatorListener) new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                AnimationImageView.this.setLayerType(0, null);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                AnimationImageView.this.setLayerType(0, null);
            }
        });
    }

    private void setImageFolder(String str) {
        setImageAssetsFolder(str);
    }

    public AnimationImageView(Context context) {
        super(context);
        m76750h();
    }

    public AnimationImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m76750h();
    }

    public AnimationImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m76750h();
    }
}
