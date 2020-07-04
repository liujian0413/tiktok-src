package com.p280ss.android.ugc.aweme.base.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.ies.ugc.aweme.common.p575ui.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.widget.CircularProgressView */
public class CircularProgressView extends View {

    /* renamed from: a */
    public boolean f61975a;

    /* renamed from: b */
    public float f61976b;

    /* renamed from: c */
    public float f61977c;

    /* renamed from: d */
    public float f61978d;

    /* renamed from: e */
    private Paint f61979e;

    /* renamed from: f */
    private int f61980f;

    /* renamed from: g */
    private RectF f61981g;

    /* renamed from: h */
    private boolean f61982h;

    /* renamed from: i */
    private boolean f61983i;

    /* renamed from: j */
    private boolean f61984j;

    /* renamed from: k */
    private float f61985k;

    /* renamed from: l */
    private float f61986l;

    /* renamed from: m */
    private int f61987m;

    /* renamed from: n */
    private int f61988n;

    /* renamed from: o */
    private int f61989o;

    /* renamed from: p */
    private int f61990p;

    /* renamed from: q */
    private int f61991q;

    /* renamed from: r */
    private int f61992r;

    /* renamed from: s */
    private ValueAnimator f61993s;

    /* renamed from: t */
    private ValueAnimator f61994t;

    /* renamed from: u */
    private AnimatorSet f61995u;

    /* renamed from: v */
    private float f61996v;

    /* renamed from: e */
    private void m77179e() {
        mo61114a();
    }

    public int getColor() {
        return this.f61988n;
    }

    public float getMaxProgress() {
        return this.f61986l;
    }

    public float getProgress() {
        return this.f61985k;
    }

    public int getThickness() {
        return this.f61987m;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f61984j = false;
        mo61115b();
    }

    /* renamed from: d */
    private void m77178d() {
        this.f61979e.setColor(this.f61988n);
        this.f61979e.setStyle(Style.STROKE);
        this.f61979e.setStrokeWidth((float) this.f61987m);
        this.f61979e.setStrokeCap(Cap.ROUND);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f61984j = true;
        if (this.f61982h || this.f61983i) {
            m77179e();
        }
    }

    /* renamed from: c */
    private void m77177c() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f61981g.set((float) (this.f61987m + paddingLeft), (float) (this.f61987m + paddingTop), (float) ((this.f61980f - paddingLeft) - this.f61987m), (float) ((this.f61980f - paddingTop) - this.f61987m));
    }

    /* renamed from: b */
    public final void mo61115b() {
        this.f61983i = false;
        if (this.f61993s != null) {
            this.f61993s.cancel();
            this.f61993s = null;
        }
        if (this.f61994t != null) {
            this.f61994t.cancel();
            this.f61994t = null;
        }
        if (this.f61995u != null) {
            this.f61995u.cancel();
            this.f61995u = null;
        }
    }

    /* renamed from: a */
    public final void mo61114a() {
        if (!this.f61984j) {
            this.f61983i = true;
            return;
        }
        int i = 0;
        this.f61983i = false;
        if (this.f61993s != null && this.f61993s.isRunning()) {
            this.f61993s.cancel();
        }
        if (this.f61994t != null && this.f61994t.isRunning()) {
            this.f61994t.cancel();
        }
        if (this.f61995u != null && this.f61995u.isRunning()) {
            this.f61995u.cancel();
        }
        if (!this.f61975a) {
            this.f61978d = this.f61996v;
            this.f61993s = ValueAnimator.ofFloat(new float[]{this.f61978d, this.f61978d + 360.0f});
            this.f61993s.setDuration((long) this.f61990p);
            this.f61993s.setInterpolator(new DecelerateInterpolator(2.0f));
            this.f61993s.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f61978d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.f61993s.start();
            return;
        }
        this.f61976b = 15.0f;
        this.f61995u = new AnimatorSet();
        Animator animator = null;
        while (i < this.f61992r) {
            AnimatorSet a = m77174a((float) i);
            Builder play = this.f61995u.play(a);
            if (animator != null) {
                play.after(animator);
            }
            i++;
            animator = a;
        }
        this.f61995u.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a */
            boolean f61998a;

            public final void onAnimationCancel(Animator animator) {
                this.f61998a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f61998a) {
                    CircularProgressView.this.mo61114a();
                }
            }
        });
        this.f61995u.start();
    }

    public void setMaxProgress(float f) {
        this.f61986l = f;
        invalidate();
    }

    public void setProgress(float f) {
        this.f61985k = f;
        invalidate();
    }

    public CircularProgressView(Context context) {
        super(context);
        m77175a(null, 0);
    }

    public void setColor(int i) {
        this.f61988n = i;
        m77178d();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        boolean z2;
        if (this.f61975a != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f61975a = z;
            mo61114a();
        }
    }

    public void setThickness(int i) {
        this.f61987m = i;
        m77178d();
        m77177c();
        invalidate();
    }

    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i != visibility) {
            if (i == 0) {
                mo61114a();
            } else if (i == 8 || i == 4) {
                mo61115b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        isInEditMode();
        float f = (this.f61985k / this.f61986l) * 360.0f;
        if (!this.f61975a) {
            canvas.drawArc(this.f61981g, this.f61978d, f, false, this.f61979e);
            return;
        }
        canvas.drawArc(this.f61981g, this.f61978d + this.f61977c, this.f61976b, false, this.f61979e);
    }

    /* renamed from: a */
    private AnimatorSet m77174a(float f) {
        final float f2 = ((((float) (this.f61992r - 1)) * 360.0f) / ((float) this.f61992r)) + 15.0f;
        final float f3 = ((f2 - 15.0f) * f) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{15.0f, f2});
        ofFloat.setDuration((long) ((this.f61989o / this.f61992r) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f61976b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        float f4 = (0.5f + f) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(f * 720.0f) / ((float) this.f61992r), f4 / ((float) this.f61992r)});
        ofFloat2.setDuration((long) ((this.f61989o / this.f61992r) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f61977c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{f3, (f3 + f2) - 15.0f});
        ofFloat3.setDuration((long) ((this.f61989o / this.f61992r) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f61978d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.f61976b = (f2 - CircularProgressView.this.f61978d) + f3;
                CircularProgressView.this.invalidate();
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{f4 / ((float) this.f61992r), ((f + 1.0f) * 720.0f) / ((float) this.f61992r)});
        ofFloat4.setDuration((long) ((this.f61989o / this.f61992r) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f61977c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    public CircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m77175a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m77175a(AttributeSet attributeSet, int i) {
        m77176b(attributeSet, i);
        this.f61979e = new Paint(1);
        m77178d();
        this.f61981g = new RectF();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int measuredWidth = getMeasuredWidth() - paddingLeft;
        int measuredHeight = getMeasuredHeight() - paddingTop;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.f61980f = measuredWidth;
        setMeasuredDimension(this.f61980f + paddingLeft, this.f61980f + paddingTop);
    }

    /* renamed from: b */
    private void m77176b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CircularProgressView, i, 0);
        Resources resources = getResources();
        this.f61985k = obtainStyledAttributes.getFloat(8, (float) resources.getInteger(R.integer.s));
        this.f61986l = obtainStyledAttributes.getFloat(7, (float) resources.getInteger(R.integer.r));
        this.f61987m = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.e_));
        this.f61975a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.e));
        this.f61982h = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.d));
        this.f61996v = obtainStyledAttributes.getFloat(9, (float) resources.getInteger(R.integer.t));
        this.f61978d = this.f61996v;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.f61988n = obtainStyledAttributes.getColor(5, resources.getColor(R.color.ml));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.f61988n = typedValue.data;
        } else if (VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{16843829});
            this.f61988n = obtainStyledAttributes2.getColor(0, resources.getColor(R.color.ml));
            obtainStyledAttributes2.recycle();
        } else {
            this.f61988n = resources.getColor(R.color.ml);
        }
        this.f61989o = obtainStyledAttributes.getInteger(1, resources.getInteger(R.integer.n));
        this.f61990p = obtainStyledAttributes.getInteger(3, resources.getInteger(R.integer.p));
        this.f61991q = obtainStyledAttributes.getInteger(4, resources.getInteger(R.integer.q));
        this.f61992r = obtainStyledAttributes.getInteger(2, resources.getInteger(R.integer.o));
        obtainStyledAttributes.recycle();
    }

    public CircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m77175a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.f61980f = i;
        m77177c();
    }
}
