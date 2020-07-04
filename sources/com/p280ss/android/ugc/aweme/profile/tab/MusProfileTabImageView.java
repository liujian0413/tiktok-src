package com.p280ss.android.ugc.aweme.profile.tab;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.MusProfileTabImageView */
public class MusProfileTabImageView extends MusProfileTabView {

    /* renamed from: a */
    ImageView f94376a;

    /* renamed from: b */
    private ValueAnimator f94377b;

    /* renamed from: c */
    private ValueAnimator f94378c;

    /* renamed from: d */
    private boolean f94379d = true;

    /* renamed from: a */
    private void m116248a() {
        m116249b();
        m116250c();
    }

    /* renamed from: d */
    private void m116251d() {
        this.f94377b.start();
    }

    /* renamed from: e */
    private void m116252e() {
        this.f94378c.start();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f94376a = (ImageView) findViewById(R.id.ax9);
        this.f94376a.setAlpha(0.5f);
    }

    /* renamed from: b */
    private void m116249b() {
        this.f94377b = ValueAnimator.ofFloat(new float[]{0.5f, 1.0f});
        this.f94377b.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MusProfileTabImageView.this.mo91848a(valueAnimator);
            }
        });
        this.f94377b.setDuration(150);
    }

    /* renamed from: c */
    private void m116250c() {
        this.f94378c = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f});
        this.f94378c.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MusProfileTabImageView.this.mo91848a(valueAnimator);
            }
        });
        this.f94378c.setDuration(150);
    }

    public void setAnimationEnabled(boolean z) {
        this.f94379d = z;
    }

    public void setImageResource(int i) {
        this.f94376a.setImageResource(i);
    }

    public MusProfileTabImageView(Context context) {
        super(context);
        m116248a();
    }

    /* renamed from: a */
    public final void mo91848a(ValueAnimator valueAnimator) {
        this.f94376a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f94377b.cancel();
        this.f94378c.cancel();
        if (z) {
            if (this.f94379d) {
                m116251d();
            }
        } else if (this.f94379d) {
            m116252e();
        }
    }

    public MusProfileTabImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m116248a();
    }

    public MusProfileTabImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m116248a();
    }
}
