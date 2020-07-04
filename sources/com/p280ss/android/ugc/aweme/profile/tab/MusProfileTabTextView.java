package com.p280ss.android.ugc.aweme.profile.tab;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.MusProfileTabTextView */
public class MusProfileTabTextView extends MusProfileTabView {

    /* renamed from: a */
    public TextView f94382a;

    /* renamed from: b */
    private TextView f94383b;

    /* renamed from: c */
    private int f94384c;

    /* renamed from: d */
    private int f94385d;

    /* renamed from: e */
    private ValueAnimator f94386e;

    /* renamed from: f */
    private ValueAnimator f94387f;

    /* renamed from: g */
    private boolean f94388g;

    /* renamed from: e */
    private void m116258e() {
        this.f94387f.start();
    }

    /* renamed from: d */
    private void m116257d() {
        this.f94382a.setVisibility(0);
        this.f94386e.start();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f94383b = (TextView) findViewById(R.id.title);
        this.f94382a = (TextView) findViewById(R.id.a7m);
    }

    /* renamed from: a */
    private void m116254a() {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f94384c = (int) (8.0f * f);
        this.f94385d = (int) (f * 3.0f);
        m116255b();
        m116256c();
    }

    /* renamed from: b */
    private void m116255b() {
        this.f94386e = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f94386e.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MusProfileTabTextView.this.mo91855a(valueAnimator);
            }
        });
        this.f94386e.setDuration(300);
    }

    /* renamed from: c */
    private void m116256c() {
        this.f94387f = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f94387f.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MusProfileTabTextView.this.mo91855a(valueAnimator);
            }
        });
        this.f94387f.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                MusProfileTabTextView.this.f94382a.setVisibility(8);
            }
        });
        this.f94387f.setDuration(300);
    }

    public void setAnimationEnabled(boolean z) {
        this.f94388g = z;
    }

    public MusProfileTabTextView(Context context) {
        super(context);
        m116254a();
    }

    public void setDescription(String str) {
        this.f94382a.setText(str);
    }

    public void setText(String str) {
        this.f94383b.setText(str);
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f94386e.cancel();
        this.f94387f.cancel();
        if (z) {
            if (this.f94388g) {
                m116257d();
            }
        } else if (this.f94388g) {
            m116258e();
        }
    }

    /* renamed from: a */
    public final void mo91855a(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = floatValue - 1.0f;
        this.f94383b.setTranslationY(((float) this.f94384c) * f);
        float f2 = 1.0f - floatValue;
        float f3 = 1.0f - (0.13f * f2);
        this.f94383b.setScaleX(f3);
        this.f94383b.setScaleY(f3);
        this.f94382a.setTranslationY(f * ((float) (this.f94384c - this.f94385d)));
        this.f94382a.setAlpha(f2);
    }

    public MusProfileTabTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m116254a();
    }

    public MusProfileTabTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m116254a();
    }
}
