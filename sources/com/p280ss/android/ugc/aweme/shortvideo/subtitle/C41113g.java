package com.p280ss.android.ugc.aweme.shortvideo.subtitle;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.p562b.C10744c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34856c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34858e;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.g */
public final class C41113g implements C34856c, C34858e {

    /* renamed from: a */
    public C34860g f106975a = new C34861a();

    /* renamed from: b */
    public View f106976b;

    /* renamed from: c */
    private ViewGroup f106977c;

    /* renamed from: d */
    private View f106978d;

    /* renamed from: b */
    public final void mo74847b() {
    }

    /* renamed from: c */
    public final void mo74769c() {
        this.f106978d.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo74768d() {
        this.f106977c.removeView(this.f106976b);
    }

    /* renamed from: a */
    public final void mo74767a() {
        this.f106978d.setVisibility(4);
        this.f106976b.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo74846a(C34860g gVar) {
        this.f106975a = gVar;
    }

    /* renamed from: a */
    public final void mo74845a(C34856c cVar) {
        mo101569a(cVar, -1);
    }

    /* renamed from: b */
    public final void mo74849b(final C34856c cVar) {
        this.f106975a.mo74769c();
        mo74769c();
        cVar.mo74769c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
        duration.setInterpolator(new C10744c());
        final int measuredHeight = this.f106976b.getMeasuredHeight();
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C41113g.this.f106975a.mo74848b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                C41113g.this.mo74848b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                cVar.mo74848b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C41113g.this.f106975a.mo74768d();
                C41113g.this.mo74768d();
                cVar.mo74768d();
            }
        });
        duration.start();
    }

    /* renamed from: a */
    public final void mo101569a(final C34856c cVar, final int i) {
        this.f106976b.setAlpha(0.0f);
        if (this.f106976b.getParent() != null) {
            ((ViewGroup) this.f106976b.getParent()).removeView(this.f106976b);
        }
        this.f106977c.addView(this.f106976b);
        this.f106977c.post(new Runnable() {
            public final void run() {
                final int i;
                C41113g.this.f106975a.mo74767a();
                C41113g.this.mo74767a();
                cVar.mo74767a();
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                duration.setInterpolator(new C10744c());
                if (i == -1) {
                    i = C41113g.this.f106976b.getMeasuredHeight();
                } else {
                    i = i;
                }
                duration.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C41113g.this.f106975a.mo74844a(valueAnimator.getAnimatedFraction(), 0, i);
                        C41113g.this.mo74844a(valueAnimator.getAnimatedFraction(), 0, i);
                        cVar.mo74844a(valueAnimator.getAnimatedFraction(), 0, i);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C41113g.this.f106975a.mo74847b();
                        C41113g.this.mo74847b();
                        cVar.mo74847b();
                    }
                });
                duration.start();
            }
        });
    }

    public C41113g(ViewGroup viewGroup, View view, View view2) {
        this.f106977c = viewGroup;
        this.f106978d = view;
        this.f106976b = view2;
    }

    /* renamed from: a */
    public final void mo74844a(float f, int i, int i2) {
        this.f106976b.setTranslationY(((float) i2) + (((float) (i - i2)) * f));
        this.f106976b.setAlpha(f);
    }

    /* renamed from: b */
    public final void mo74848b(float f, int i, int i2) {
        this.f106976b.setTranslationY(((float) (i2 - i)) * f);
        this.f106976b.setAlpha(1.0f - f);
    }
}
