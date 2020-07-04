package com.p280ss.android.ugc.aweme.feed.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.LineProgressBar */
public class LineProgressBar extends FrameLayout {

    /* renamed from: a */
    public View f76480a;

    /* renamed from: b */
    public ValueAnimator f76481b;

    /* renamed from: c */
    public AnimatorUpdateListener f76482c;

    /* renamed from: d */
    private View f76483d;

    /* renamed from: e */
    private View f76484e;

    /* renamed from: f */
    private float f76485f;

    /* renamed from: g */
    private ObjectAnimator f76486g;

    /* renamed from: h */
    private ObjectAnimator f76487h;

    /* renamed from: d */
    private void m95280d() {
        this.f76482c = new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float intValue = (float) ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (intValue <= 0.0f || intValue > 100.0f) {
                    if (intValue > 100.0f && intValue <= 200.0f) {
                        float f = (intValue - 100.0f) / 100.0f;
                        LineProgressBar.this.f76480a.setAlpha(1.0f - f);
                        LineProgressBar.this.f76480a.setScaleX((f * 0.2f) + 0.8f);
                    }
                    return;
                }
                float f2 = intValue / 100.0f;
                LineProgressBar.this.f76480a.setAlpha(f2);
                LineProgressBar.this.f76480a.setScaleX(f2 * 0.8f);
            }
        };
    }

    /* renamed from: f */
    private void m95282f() {
        m95281e();
        this.f76486g.start();
    }

    /* renamed from: e */
    private void m95281e() {
        if (C6307b.m19566a((Collection<T>) this.f76486g.getListeners())) {
            this.f76486g.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    if (C6307b.m19566a((Collection<T>) LineProgressBar.this.f76481b.getListeners())) {
                        LineProgressBar.this.f76481b.addUpdateListener(LineProgressBar.this.f76482c);
                    }
                    LineProgressBar.this.f76481b.start();
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo74362b() {
        this.f76487h = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
        this.f76487h.setDuration(300);
        this.f76487h.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (LineProgressBar.this.f76481b != null) {
                    LineProgressBar.this.f76481b.cancel();
                }
                LineProgressBar.this.setAlpha(1.0f);
                LineProgressBar.this.setVisibility(4);
            }
        });
        this.f76487h.start();
    }

    /* renamed from: c */
    public final void mo74363c() {
        if (this.f76481b != null) {
            this.f76481b.removeAllUpdateListeners();
            this.f76481b.cancel();
        }
        if (this.f76486g != null) {
            this.f76486g.removeAllListeners();
            this.f76486g.cancel();
        }
        if (this.f76487h != null) {
            this.f76487h.removeAllListeners();
            this.f76487h.cancel();
        }
    }

    /* renamed from: a */
    public final void mo74361a() {
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        if (this.f76481b == null) {
            this.f76481b = ValueAnimator.ofInt(new int[]{0, C34943c.f91127w});
            this.f76481b.setDuration(600);
            this.f76481b.setRepeatCount(-1);
            this.f76481b.addUpdateListener(this.f76482c);
        }
        if (this.f76486g == null) {
            this.f76486g = ObjectAnimator.ofFloat(this.f76483d, "alpha", new float[]{0.0f, 1.0f});
            this.f76486g.setDuration(300);
            m95281e();
        }
        if (this.f76487h == null || !this.f76487h.isRunning()) {
            if (!this.f76486g.isRunning() && !this.f76481b.isRunning()) {
                m95282f();
            }
            return;
        }
        this.f76487h.cancel();
        m95282f();
    }

    public LineProgressBar(Context context) {
        super(context);
        m95279a(context);
    }

    /* renamed from: a */
    private void m95279a(Context context) {
        this.f76484e = LayoutInflater.from(context).inflate(R.layout.b3g, this);
        this.f76480a = this.f76484e.findViewById(R.id.bma);
        this.f76483d = this.f76484e.findViewById(R.id.bm6);
        this.f76480a.setAlpha(0.0f);
        this.f76483d.setAlpha(0.0f);
        this.f76485f = ((float) C9738o.m28691a(getContext())) - C9738o.m28708b(getContext(), 30.0f);
        m95280d();
    }

    public LineProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m95279a(context);
    }

    public LineProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m95279a(context);
    }
}
