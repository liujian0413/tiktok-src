package com.p280ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.a */
final class C42560a {

    /* renamed from: a */
    public C42563b f110659a;

    /* renamed from: b */
    public int f110660b;

    /* renamed from: c */
    public int f110661c;

    /* renamed from: d */
    public int f110662d;

    /* renamed from: e */
    public int f110663e;

    /* renamed from: f */
    public int f110664f;

    /* renamed from: g */
    public int f110665g;

    /* renamed from: h */
    public int f110666h;

    /* renamed from: i */
    public float f110667i;

    /* renamed from: j */
    public float f110668j;

    /* renamed from: k */
    public float f110669k;

    /* renamed from: l */
    public TextView f110670l;

    /* renamed from: m */
    private C42564c f110671m;

    /* renamed from: a */
    public final void mo104152a() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f110661c, this.f110662d});
        final GradientDrawable gradientDrawable = this.f110671m.f110677c;
        ofInt.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                int i2;
                int i3;
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                if (C42560a.this.f110661c > C42560a.this.f110662d) {
                    i2 = (C42560a.this.f110661c - num.intValue()) / 2;
                    i3 = C42560a.this.f110661c - i2;
                    i = (int) (C42560a.this.f110669k * valueAnimator.getAnimatedFraction());
                } else {
                    i2 = (C42560a.this.f110662d - num.intValue()) / 2;
                    i3 = C42560a.this.f110662d - i2;
                    i = (int) (C42560a.this.f110669k - (C42560a.this.f110669k * valueAnimator.getAnimatedFraction()));
                }
                gradientDrawable.setBounds(i2 + i, i, i3 - i, C42560a.this.f110670l.getHeight() - i);
            }
        });
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(gradientDrawable, "color", new int[]{this.f110663e, this.f110664f});
        ofInt2.setEvaluator(new ArgbEvaluator());
        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(this.f110671m, "strokeColor", new int[]{this.f110665g, this.f110666h});
        ofInt3.setEvaluator(new ArgbEvaluator());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gradientDrawable, "cornerRadius", new float[]{this.f110667i, this.f110668j});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration((long) this.f110660b);
        animatorSet.playTogether(new Animator[]{ofInt, ofInt2, ofInt3, ofFloat});
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (C42560a.this.f110659a != null) {
                    C42560a.this.f110659a.mo104130a();
                }
            }
        });
        animatorSet.start();
    }

    C42560a(TextView textView, C42564c cVar) {
        this.f110670l = textView;
        this.f110671m = cVar;
    }
}
