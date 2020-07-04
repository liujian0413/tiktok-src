package com.p280ss.android.ugc.aweme.tools.beauty;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34856c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34858e;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.b */
public final class C42169b implements C34856c, C34858e {

    /* renamed from: a */
    public C34860g f109722a = new C34861a();

    /* renamed from: b */
    public View f109723b;

    /* renamed from: c */
    private ViewGroup f109724c;

    /* renamed from: d */
    private View f109725d;

    /* renamed from: b */
    public final void mo74847b() {
    }

    /* renamed from: c */
    public final void mo74769c() {
    }

    /* renamed from: a */
    public final void mo74767a() {
        this.f109723b.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo74768d() {
        this.f109724c.removeView(this.f109725d);
    }

    /* renamed from: a */
    public final void mo74846a(C34860g gVar) {
        this.f109722a = gVar;
    }

    /* renamed from: a */
    public final void mo74845a(final C34856c cVar) {
        this.f109724c.removeAllViews();
        ViewGroup viewGroup = (ViewGroup) this.f109725d.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f109725d);
        }
        this.f109724c.addView(this.f109725d);
        this.f109724c.post(new Runnable() {
            public final void run() {
                C42169b.this.f109722a.mo74767a();
                C42169b.this.mo74767a();
                cVar.mo74767a();
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                final int measuredHeight = C42169b.this.f109723b.getMeasuredHeight();
                duration.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C42169b.this.f109722a.mo74844a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        C42169b.this.mo74844a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        cVar.mo74844a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C42169b.this.f109722a.mo74847b();
                        C42169b.this.mo74847b();
                        cVar.mo74847b();
                    }
                });
                duration.start();
            }
        });
    }

    /* renamed from: b */
    public final void mo74849b(final C34856c cVar) {
        this.f109722a.mo74769c();
        mo74769c();
        cVar.mo74769c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
        final int measuredHeight = this.f109723b.getMeasuredHeight();
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C42169b.this.f109722a.mo74848b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                C42169b.this.mo74848b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                cVar.mo74848b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C42169b.this.f109722a.mo74768d();
                C42169b.this.mo74768d();
                cVar.mo74768d();
            }
        });
        duration.start();
    }

    /* renamed from: a */
    public final void mo74844a(float f, int i, int i2) {
        this.f109723b.setTranslationY(((float) i2) + (((float) (i - i2)) * f));
    }

    /* renamed from: b */
    public final void mo74848b(float f, int i, int i2) {
        this.f109723b.setTranslationY(((float) (i2 - i)) * f);
    }

    C42169b(ViewGroup viewGroup, View view, View view2) {
        this.f109724c = viewGroup;
        this.f109725d = view;
        this.f109723b = view2;
    }
}
