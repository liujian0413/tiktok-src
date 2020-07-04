package com.p280ss.android.ugc.aweme.filter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p262ui.p562b.C10744c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34856c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34858e;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;

/* renamed from: com.ss.android.ugc.aweme.filter.b */
public final class C29231b implements C34856c, C34858e {

    /* renamed from: a */
    public C34860g f77143a = new C34861a();

    /* renamed from: b */
    public View f77144b;

    /* renamed from: c */
    private FrameLayout f77145c;

    /* renamed from: d */
    private View f77146d;

    /* renamed from: b */
    public final void mo74847b() {
    }

    /* renamed from: c */
    public final void mo74769c() {
    }

    /* renamed from: a */
    public final void mo74767a() {
        this.f77144b.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo74768d() {
        this.f77145c.removeView(this.f77146d);
    }

    /* renamed from: a */
    public final void mo74846a(C34860g gVar) {
        this.f77143a = gVar;
    }

    /* renamed from: a */
    public final void mo74845a(final C34856c cVar) {
        this.f77145c.removeAllViews();
        this.f77145c.addView(this.f77146d);
        this.f77145c.post(new Runnable() {
            public final void run() {
                C29231b.this.f77143a.mo74767a();
                C29231b.this.mo74767a();
                cVar.mo74767a();
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                duration.setInterpolator(new C10744c());
                final int measuredHeight = C29231b.this.f77144b.getMeasuredHeight();
                duration.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C29231b.this.f77143a.mo74844a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        C29231b.this.mo74844a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        cVar.mo74844a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C29231b.this.f77143a.mo74847b();
                        C29231b.this.mo74847b();
                        cVar.mo74847b();
                    }
                });
                duration.start();
            }
        });
    }

    /* renamed from: b */
    public final void mo74849b(final C34856c cVar) {
        this.f77143a.mo74769c();
        mo74769c();
        cVar.mo74769c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
        duration.setInterpolator(new C10744c());
        final int measuredHeight = this.f77144b.getMeasuredHeight();
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C29231b.this.f77143a.mo74848b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                C29231b.this.mo74848b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                cVar.mo74848b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C29231b.this.f77143a.mo74768d();
                C29231b.this.mo74768d();
                cVar.mo74768d();
            }
        });
        duration.start();
    }

    public C29231b(FrameLayout frameLayout, View view, View view2) {
        this.f77145c = frameLayout;
        this.f77146d = view;
        this.f77144b = view2;
    }

    /* renamed from: a */
    public final void mo74844a(float f, int i, int i2) {
        this.f77144b.setTranslationY(((float) i2) + (((float) (i - i2)) * f));
        this.f77144b.setAlpha(f);
    }

    /* renamed from: b */
    public final void mo74848b(float f, int i, int i2) {
        this.f77144b.setTranslationY(((float) (i2 - i)) * f);
        this.f77144b.setAlpha(1.0f - f);
    }
}
