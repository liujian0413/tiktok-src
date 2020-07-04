package com.p280ss.android.ugc.aweme.photomovie.p1454a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;

/* renamed from: com.ss.android.ugc.aweme.photomovie.a.b */
public final class C34850b implements C34856c, C34858e {

    /* renamed from: a */
    public C34860g f90912a = new C34861a();

    /* renamed from: b */
    public View f90913b;

    /* renamed from: c */
    public int f90914c;

    /* renamed from: d */
    private FrameLayout f90915d;

    /* renamed from: b */
    public final void mo74847b() {
    }

    /* renamed from: c */
    public final void mo74769c() {
    }

    /* renamed from: a */
    public final void mo74767a() {
        this.f90913b.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo74768d() {
        this.f90915d.removeView(this.f90913b);
    }

    /* renamed from: a */
    public final void mo74846a(C34860g gVar) {
        this.f90912a = gVar;
    }

    /* renamed from: a */
    public final void mo74845a(final C34856c cVar) {
        this.f90915d.removeAllViews();
        this.f90915d.addView(this.f90913b);
        this.f90915d.post(new Runnable() {
            public final void run() {
                C34850b.this.f90912a.mo74767a();
                C34850b.this.mo74767a();
                cVar.mo74767a();
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(400);
                final int measuredHeight = C34850b.this.f90913b.getMeasuredHeight() + C34850b.this.f90914c;
                duration.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C34850b.this.f90912a.mo74844a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        C34850b.this.mo74844a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        cVar.mo74844a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C34850b.this.f90912a.mo74847b();
                        C34850b.this.mo74847b();
                        cVar.mo74847b();
                    }
                });
                duration.start();
            }
        });
    }

    /* renamed from: b */
    public final void mo74849b(final C34856c cVar) {
        this.f90912a.mo74769c();
        mo74769c();
        cVar.mo74769c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(400);
        final int measuredHeight = this.f90913b.getMeasuredHeight() + this.f90914c;
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C34850b.this.f90912a.mo74848b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                C34850b.this.mo74848b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                cVar.mo74848b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C34850b.this.f90912a.mo74768d();
                C34850b.this.mo74768d();
                cVar.mo74768d();
            }
        });
        duration.start();
    }

    public C34850b(FrameLayout frameLayout, View view) {
        this.f90915d = frameLayout;
        this.f90913b = view;
        this.f90914c = (int) C9738o.m28708b(frameLayout.getContext(), 0.0f);
    }

    /* renamed from: a */
    public final void mo74844a(float f, int i, int i2) {
        this.f90913b.setTranslationY(((float) i2) + (((float) (i - i2)) * f));
    }

    /* renamed from: b */
    public final void mo74848b(float f, int i, int i2) {
        this.f90913b.setTranslationY(((float) (i2 - i)) * f);
    }
}
