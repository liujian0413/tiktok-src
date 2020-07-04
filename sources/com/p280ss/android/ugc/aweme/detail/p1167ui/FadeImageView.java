package com.p280ss.android.ugc.aweme.detail.p1167ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.FadeImageView */
public class FadeImageView extends ImageView {

    /* renamed from: a */
    public C26187a f69078a;

    /* renamed from: b */
    private boolean f69079b;

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.FadeImageView$a */
    public interface C26187a {
        /* renamed from: a */
        void mo63136a(ImageView imageView);
    }

    public boolean isSelected() {
        return this.f69079b;
    }

    /* renamed from: a */
    public final void mo67763a() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f});
        ofFloat.setDuration(100);
        ofFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f});
        ofFloat2.setDuration(100);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (FadeImageView.this.f69078a != null) {
                    FadeImageView.this.f69078a.mo63136a(FadeImageView.this);
                }
            }
        });
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    public void setListener(C26187a aVar) {
        this.f69078a = aVar;
    }

    public void setSelected(boolean z) {
        this.f69079b = z;
    }

    public FadeImageView(Context context) {
        this(context, null);
    }

    public FadeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FadeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
