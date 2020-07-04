package com.bytedance.android.livesdk.gift.honor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.utils.C3358ac;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

public class LiveGiftHonorProgressView extends View {

    /* renamed from: a */
    public float f22084a;

    /* renamed from: b */
    public ArrayList<ValueAnimator> f22085b = new ArrayList<>();

    /* renamed from: c */
    public ValueAnimator f22086c;

    /* renamed from: d */
    public C8088a f22087d;

    /* renamed from: e */
    private GradientDrawable f22088e;

    /* renamed from: f */
    private GradientDrawable f22089f;

    /* renamed from: g */
    private GradientDrawable f22090g;

    /* renamed from: h */
    private ClipDrawable f22091h;

    /* renamed from: i */
    private float f22092i;

    /* renamed from: j */
    private float f22093j;

    /* renamed from: k */
    private float f22094k;

    /* renamed from: com.bytedance.android.livesdk.gift.honor.LiveGiftHonorProgressView$a */
    interface C8088a {
        /* renamed from: a */
        void mo21206a(float f);
    }

    private int getHighlightHeight() {
        return C3358ac.m12526d(R.dimen.q4);
    }

    private int getHighlightMargin() {
        return C3358ac.m12526d(R.dimen.q5);
    }

    /* renamed from: a */
    public final void mo21198a() {
        this.f22092i = 0.0f;
        postInvalidate();
    }

    /* renamed from: b */
    private void m24852b() {
        m24853c();
        m24855e();
        m24854d();
    }

    private int getHighlightWidth() {
        return getWidth() - (C3358ac.m12526d(R.dimen.q5) * 2);
    }

    /* renamed from: c */
    private void m24853c() {
        this.f22088e = new GradientDrawable();
        this.f22088e.setShape(0);
        this.f22088e.setColor(C3358ac.m12521b((int) R.color.amw));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f22086c != null) {
            this.f22086c.cancel();
            this.f22086c.removeAllUpdateListeners();
            this.f22086c.removeAllListeners();
        }
    }

    /* renamed from: d */
    private void m24854d() {
        Drawable c = C3358ac.m12524c(R.drawable.br9);
        if (c instanceof GradientDrawable) {
            this.f22089f = (GradientDrawable) c;
            return;
        }
        this.f22089f = new GradientDrawable();
        this.f22089f.setColor(Color.parseColor("#face15"));
        this.f22089f.setShape(0);
    }

    /* renamed from: e */
    private void m24855e() {
        this.f22090g = new GradientDrawable();
        this.f22090g.setShape(0);
        this.f22090g.setColor(Color.parseColor("#55ffffff"));
        Drawable c = C3358ac.m12524c(R.drawable.br8);
        if (c instanceof ClipDrawable) {
            this.f22091h = (ClipDrawable) c;
        }
    }

    public void setProgressAnimatorFinishCallBack(C8088a aVar) {
        this.f22087d = aVar;
    }

    public LiveGiftHonorProgressView(Context context) {
        super(context);
        m24852b();
    }

    /* renamed from: a */
    public final void mo21199a(float f) {
        float f2 = 1.0f;
        if (this.f22084a + f <= 1.0f) {
            f2 = f + this.f22084a;
        }
        this.f22093j = f2;
        this.f22092i = f;
        postInvalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21201a(ValueAnimator valueAnimator) {
        this.f22094k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (this.f22092i > 0.0f) {
            float f = 1.0f;
            if (this.f22094k + this.f22092i <= 1.0f) {
                f = this.f22092i + this.f22094k;
            }
            this.f22093j = f;
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f22088e.setCornerRadius((float) (getHeight() / 2));
        this.f22088e.setBounds(0, 0, getWidth(), getHeight());
        this.f22089f.setBounds(getHighlightMargin(), getHighlightMargin(), ((int) (((float) getHighlightWidth()) * this.f22094k)) + getHighlightMargin(), getHighlightMargin() + getHighlightHeight());
        this.f22089f.setCornerRadius((float) (getHighlightHeight() / 2));
        this.f22090g.setBounds(0, 0, (int) (((float) getWidth()) * this.f22093j), getHeight());
        this.f22090g.setCornerRadius((float) (getHeight() / 2));
        if (this.f22091h != null) {
            this.f22091h.setBounds(getHighlightMargin(), getHighlightMargin(), getHighlightWidth() + getHighlightMargin(), getHighlightMargin() + getHighlightHeight());
            this.f22091h.setLevel((int) (this.f22093j * 10000.0f));
        }
        this.f22088e.draw(canvas);
        if (this.f22092i > 0.0f) {
            this.f22090g.draw(canvas);
        }
        this.f22089f.draw(canvas);
    }

    public LiveGiftHonorProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24852b();
    }

    /* renamed from: a */
    private void m24851a(float f, final float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(500);
        ofFloat.addUpdateListener(new C8108t(this));
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (LiveGiftHonorProgressView.this.f22087d != null) {
                    LiveGiftHonorProgressView.this.f22087d.mo21206a(f2);
                }
                if (!LiveGiftHonorProgressView.this.f22085b.isEmpty()) {
                    LiveGiftHonorProgressView.this.f22086c = (ValueAnimator) LiveGiftHonorProgressView.this.f22085b.remove(0);
                    LiveGiftHonorProgressView.this.f22086c.start();
                }
            }
        });
        if (this.f22086c == null || !this.f22086c.isRunning()) {
            this.f22086c = ofFloat;
            this.f22086c.start();
            return;
        }
        this.f22085b.add(ofFloat);
    }

    /* renamed from: a */
    public final void mo21200a(float f, boolean z) {
        if (!z || f == this.f22084a) {
            this.f22094k = f;
            if (this.f22086c != null) {
                this.f22086c.cancel();
            }
            this.f22085b.clear();
        } else {
            m24851a(this.f22084a, f);
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.f22084a = f;
        postInvalidate();
    }

    public LiveGiftHonorProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24852b();
    }
}
