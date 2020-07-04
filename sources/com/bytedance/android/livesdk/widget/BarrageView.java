package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class BarrageView extends RelativeLayout {

    /* renamed from: a */
    View f24970a;

    /* renamed from: b */
    View f24971b;

    /* renamed from: c */
    public boolean f24972c;

    /* renamed from: d */
    public boolean f24973d;

    public View getDanmuContainer() {
        return this.f24970a;
    }

    public View getDanmuInput() {
        return this.f24971b;
    }

    /* renamed from: a */
    private void m27333a() {
        inflate(getContext(), getLayoutId(), this);
        this.f24970a = findViewById(R.id.a66);
        this.f24971b = findViewById(R.id.a64);
    }

    private int getLayoutId() {
        if (C3519c.m12965a(getContext())) {
            return R.layout.avy;
        }
        return R.layout.avx;
    }

    public BarrageView(Context context) {
        super(context);
        m27333a();
    }

    /* renamed from: b */
    public final void mo22410b(boolean z) {
        if (!this.f24972c && !this.f24973d) {
            if (C3519c.m12965a(getContext())) {
                m27337f(true);
            } else {
                m27335d(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo22409a(boolean z) {
        if (!this.f24972c && !this.f24973d) {
            if (C3519c.m12965a(getContext())) {
                m27336e(z);
            } else {
                m27334c(z);
            }
        }
    }

    /* renamed from: c */
    private void m27334c(boolean z) {
        this.f24971b.setSelected(true);
        if (z) {
            ((TransitionDrawable) this.f24970a.getBackground()).startTransition(100);
            ((TransitionDrawable) this.f24971b.getBackground()).startTransition(100);
            this.f24971b.animate().translationXBy(C9738o.m28708b(getContext(), 22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f24970a.getBackground()).startTransition(0);
        ((TransitionDrawable) this.f24971b.getBackground()).startTransition(0);
        this.f24971b.setTranslationX(C9738o.m28708b(getContext(), 22.0f));
    }

    /* renamed from: d */
    private void m27335d(boolean z) {
        this.f24971b.setSelected(false);
        if (z) {
            ((TransitionDrawable) this.f24970a.getBackground()).reverseTransition(100);
            ((TransitionDrawable) this.f24971b.getBackground()).reverseTransition(100);
            this.f24971b.animate().translationXBy(-C9738o.m28708b(getContext(), 22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f24970a.getBackground()).reverseTransition(0);
        ((TransitionDrawable) this.f24971b.getBackground()).reverseTransition(0);
        this.f24971b.setTranslationX(0.0f);
    }

    /* renamed from: e */
    private void m27336e(boolean z) {
        this.f24971b.setSelected(true);
        if (z) {
            ((TransitionDrawable) this.f24970a.getBackground()).startTransition(100);
            ((TransitionDrawable) this.f24971b.getBackground()).startTransition(100);
            this.f24971b.animate().setListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    BarrageView.this.f24972c = false;
                }

                public final void onAnimationStart(Animator animator) {
                    BarrageView.this.f24972c = true;
                }
            }).translationXBy(C9738o.m28708b(getContext(), -22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f24970a.getBackground()).startTransition(0);
        ((TransitionDrawable) this.f24971b.getBackground()).startTransition(0);
        this.f24971b.setTranslationX(C9738o.m28708b(getContext(), -22.0f));
    }

    /* renamed from: f */
    private void m27337f(boolean z) {
        this.f24971b.setSelected(false);
        if (z) {
            ((TransitionDrawable) this.f24970a.getBackground()).reverseTransition(100);
            ((TransitionDrawable) this.f24971b.getBackground()).reverseTransition(100);
            this.f24971b.animate().setListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    BarrageView.this.f24973d = true;
                }

                public final void onAnimationEnd(Animator animator) {
                    BarrageView.this.f24973d = false;
                    BarrageView.this.f24971b.setTranslationX(0.0f);
                }
            }).translationXBy(C9738o.m28708b(getContext(), 22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f24970a.getBackground()).reverseTransition(0);
        ((TransitionDrawable) this.f24971b.getBackground()).reverseTransition(0);
        this.f24971b.setTranslationX(0.0f);
    }

    public BarrageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m27333a();
    }

    public BarrageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m27333a();
    }

    public BarrageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m27333a();
    }
}
