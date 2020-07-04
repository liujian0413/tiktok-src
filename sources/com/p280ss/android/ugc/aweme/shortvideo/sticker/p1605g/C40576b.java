package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1605g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34856c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34858e;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.g.b */
public class C40576b implements C34856c, C34858e {

    /* renamed from: a */
    protected C34860g f105429a = new C34861a();

    /* renamed from: b */
    public FrameLayout f105430b;

    /* renamed from: c */
    public View f105431c;

    /* renamed from: d */
    public View f105432d;

    /* renamed from: b */
    public final void mo74847b() {
    }

    /* renamed from: c */
    public final void mo74769c() {
    }

    /* renamed from: a */
    public final void mo74767a() {
        this.f105431c.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo74768d() {
        this.f105430b.removeView(this.f105432d);
    }

    /* renamed from: a */
    public final void mo74846a(C34860g gVar) {
        this.f105429a = gVar;
    }

    /* renamed from: a */
    public final void mo74845a(final C34856c cVar) {
        this.f105430b.removeAllViews();
        this.f105430b.addView(this.f105432d);
        this.f105430b.post(new Runnable() {
            public final void run() {
                if (C40576b.this.f105430b.indexOfChild(C40576b.this.f105432d) != -1) {
                    C40576b.this.f105429a.mo74767a();
                    C40576b.this.mo74767a();
                    cVar.mo74767a();
                    ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                    final int measuredHeight = C40576b.this.f105431c.getMeasuredHeight();
                    duration.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C40576b.this.f105429a.mo74844a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                            C40576b.this.mo74844a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                            cVar.mo74844a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        }
                    });
                    duration.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            C40576b.this.f105429a.mo74847b();
                            C40576b.this.mo74847b();
                            cVar.mo74847b();
                        }
                    });
                    duration.start();
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo74849b(final C34856c cVar) {
        this.f105429a.mo74769c();
        mo74769c();
        cVar.mo74769c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
        final int measuredHeight = this.f105431c.getMeasuredHeight();
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C40576b.this.f105429a.mo74848b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                C40576b.this.mo74848b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                cVar.mo74848b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C40576b.this.f105429a.mo74768d();
                C40576b.this.mo74768d();
                cVar.mo74768d();
            }
        });
        duration.start();
    }

    /* renamed from: a */
    public final void mo74844a(float f, int i, int i2) {
        this.f105431c.setTranslationY(((float) i2) + (((float) (i - i2)) * f));
    }

    /* renamed from: b */
    public final void mo74848b(float f, int i, int i2) {
        this.f105431c.setTranslationY(((float) (i2 - i)) * f);
    }

    public C40576b(FrameLayout frameLayout, View view, View view2) {
        this.f105430b = frameLayout;
        this.f105432d = view;
        this.f105431c = view2;
    }
}
