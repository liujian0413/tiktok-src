package com.p280ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import com.p280ss.android.ugc.aweme.shortvideo.C38457aq;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.a */
public abstract class C26649a {

    /* renamed from: a */
    public Context f70272a;

    /* renamed from: b */
    public int f70273b;

    /* renamed from: c */
    protected int f70274c;

    /* renamed from: d */
    private ValueAnimator f70275d;

    /* renamed from: e */
    private ValueAnimator f70276e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo68346a(Animator animator);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo68347a(ValueAnimator valueAnimator);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo68350b(Animator animator);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo68351b(ValueAnimator valueAnimator);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo68352c(Animator animator);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo68353d(Animator animator);

    /* renamed from: a */
    public void mo68345a() {
        mo68348a(true);
    }

    /* renamed from: c */
    private boolean mo68369c() {
        if (this.f70276e != null && this.f70276e.isRunning()) {
            return true;
        }
        if (this.f70275d == null || !this.f70275d.isRunning()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo68349b() {
        long j;
        if (this.f70274c != 0 && !mo68369c()) {
            if (this.f70276e == null) {
                this.f70276e = new ValueAnimator();
                this.f70276e.setFloatValues(new float[]{0.0f, 1.0f});
                ValueAnimator valueAnimator = this.f70276e;
                if (this.f70273b == 0) {
                    j = 200;
                } else {
                    j = (long) this.f70273b;
                }
                valueAnimator.setDuration(j);
                this.f70276e.setInterpolator(new C38457aq(0.32f, 0.94f, 0.6f, 1.0f));
                this.f70276e.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C26649a.this.mo68351b(valueAnimator);
                    }
                });
                this.f70276e.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C26649a.this.mo68353d(animator);
                        C26649a.this.f70274c = 0;
                    }

                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        C26649a.this.mo68352c(animator);
                    }
                });
            }
            this.f70276e.start();
        }
    }

    public C26649a(Context context) {
        this.f70272a = context;
    }

    /* renamed from: a */
    public final void mo68348a(boolean z) {
        long j;
        if (this.f70274c != 1 && !mo68369c()) {
            if (this.f70275d == null) {
                this.f70275d = new ValueAnimator();
                this.f70275d.setFloatValues(new float[]{0.0f, 1.0f});
                if (this.f70273b == 0) {
                    j = 200;
                } else {
                    j = (long) this.f70273b;
                }
                if (!z) {
                    j = 0;
                }
                this.f70275d.setDuration(j);
                this.f70275d.setInterpolator(new C38457aq(0.32f, 0.94f, 0.6f, 1.0f));
                this.f70275d.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C26649a.this.mo68347a(valueAnimator);
                    }
                });
                this.f70275d.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C26649a.this.mo68350b(animator);
                        C26649a.this.f70274c = 1;
                    }

                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        C26649a.this.mo68346a(animator);
                    }
                });
            }
            this.f70275d.start();
        }
    }
}
