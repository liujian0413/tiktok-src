package com.p280ss.android.ugc.aweme.account.base.widget;

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
import com.p280ss.android.ugc.aweme.account.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.base.widget.CircularProgressView */
public class CircularProgressView extends View {

    /* renamed from: a */
    public boolean f56712a;

    /* renamed from: b */
    public float f56713b;

    /* renamed from: c */
    public float f56714c;

    /* renamed from: d */
    public float f56715d;

    /* renamed from: e */
    private Paint f56716e;

    /* renamed from: f */
    private int f56717f;

    /* renamed from: g */
    private RectF f56718g;

    /* renamed from: h */
    private boolean f56719h;

    /* renamed from: i */
    private float f56720i;

    /* renamed from: j */
    private float f56721j;

    /* renamed from: k */
    private int f56722k;

    /* renamed from: l */
    private int f56723l;

    /* renamed from: m */
    private int f56724m;

    /* renamed from: n */
    private int f56725n;

    /* renamed from: o */
    private int f56726o;

    /* renamed from: p */
    private int f56727p;

    /* renamed from: q */
    private ValueAnimator f56728q;

    /* renamed from: r */
    private ValueAnimator f56729r;

    /* renamed from: s */
    private AnimatorSet f56730s;

    /* renamed from: t */
    private float f56731t;

    /* renamed from: d */
    private void m71220d() {
        mo56994a();
    }

    public int getColor() {
        return this.f56723l;
    }

    public float getMaxProgress() {
        return this.f56721j;
    }

    public float getProgress() {
        return this.f56720i;
    }

    public int getThickness() {
        return this.f56722k;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m71221e();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f56719h) {
            m71220d();
        }
    }

    /* renamed from: c */
    private void m71219c() {
        this.f56716e.setColor(this.f56723l);
        this.f56716e.setStyle(Style.STROKE);
        this.f56716e.setStrokeWidth((float) this.f56722k);
        this.f56716e.setStrokeCap(Cap.ROUND);
    }

    /* renamed from: b */
    private void m71217b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f56718g.set((float) (this.f56722k + paddingLeft), (float) (this.f56722k + paddingTop), (float) ((this.f56717f - paddingLeft) - this.f56722k), (float) ((this.f56717f - paddingTop) - this.f56722k));
    }

    /* renamed from: e */
    private void m71221e() {
        if (this.f56728q != null) {
            this.f56728q.cancel();
            this.f56728q = null;
        }
        if (this.f56729r != null) {
            this.f56729r.cancel();
            this.f56729r = null;
        }
        if (this.f56730s != null) {
            this.f56730s.cancel();
            this.f56730s = null;
        }
    }

    /* renamed from: a */
    public final void mo56994a() {
        if (this.f56728q != null && this.f56728q.isRunning()) {
            this.f56728q.cancel();
        }
        if (this.f56729r != null && this.f56729r.isRunning()) {
            this.f56729r.cancel();
        }
        if (this.f56730s != null && this.f56730s.isRunning()) {
            this.f56730s.cancel();
        }
        int i = 0;
        if (!this.f56712a) {
            this.f56715d = this.f56731t;
            this.f56728q = ValueAnimator.ofFloat(new float[]{this.f56715d, this.f56715d + 360.0f});
            this.f56728q.setDuration((long) this.f56725n);
            this.f56728q.setInterpolator(new DecelerateInterpolator(2.0f));
            this.f56728q.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f56715d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.f56728q.start();
            return;
        }
        this.f56713b = 15.0f;
        this.f56730s = new AnimatorSet();
        Animator animator = null;
        while (i < this.f56727p) {
            AnimatorSet a = m71215a((float) i);
            Builder play = this.f56730s.play(a);
            if (animator != null) {
                play.after(animator);
            }
            i++;
            animator = a;
        }
        this.f56730s.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a */
            boolean f56733a;

            public final void onAnimationCancel(Animator animator) {
                this.f56733a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f56733a) {
                    CircularProgressView.this.mo56994a();
                }
            }
        });
        this.f56730s.start();
    }

    public void setMaxProgress(float f) {
        this.f56721j = f;
        invalidate();
    }

    public void setProgress(float f) {
        this.f56720i = f;
        invalidate();
    }

    public CircularProgressView(Context context) {
        super(context);
        m71216a(null, 0);
    }

    public void setColor(int i) {
        this.f56723l = i;
        m71219c();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        boolean z2;
        if (this.f56712a != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f56712a = z;
            mo56994a();
        }
    }

    public void setThickness(int i) {
        this.f56722k = i;
        m71219c();
        m71217b();
        invalidate();
    }

    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i != visibility) {
            if (i == 0) {
                mo56994a();
            } else if (i == 8 || i == 4) {
                m71221e();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        isInEditMode();
        float f = (this.f56720i / this.f56721j) * 360.0f;
        if (!this.f56712a) {
            canvas.drawArc(this.f56718g, this.f56715d, f, false, this.f56716e);
            return;
        }
        canvas.drawArc(this.f56718g, this.f56715d + this.f56714c, this.f56713b, false, this.f56716e);
    }

    /* renamed from: a */
    private AnimatorSet m71215a(float f) {
        final float f2 = ((((float) (this.f56727p - 1)) * 360.0f) / ((float) this.f56727p)) + 15.0f;
        final float f3 = ((f2 - 15.0f) * f) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{15.0f, f2});
        ofFloat.setDuration((long) ((this.f56724m / this.f56727p) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f56713b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        float f4 = (0.5f + f) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(f * 720.0f) / ((float) this.f56727p), f4 / ((float) this.f56727p)});
        ofFloat2.setDuration((long) ((this.f56724m / this.f56727p) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f56714c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{f3, (f3 + f2) - 15.0f});
        ofFloat3.setDuration((long) ((this.f56724m / this.f56727p) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f56715d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.f56713b = (f2 - CircularProgressView.this.f56715d) + f3;
                CircularProgressView.this.invalidate();
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{f4 / ((float) this.f56727p), ((f + 1.0f) * 720.0f) / ((float) this.f56727p)});
        ofFloat4.setDuration((long) ((this.f56724m / this.f56727p) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f56714c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    public CircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m71216a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m71216a(AttributeSet attributeSet, int i) {
        m71218b(attributeSet, i);
        this.f56716e = new Paint(1);
        m71219c();
        this.f56718g = new RectF();
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
        this.f56717f = measuredWidth;
        setMeasuredDimension(this.f56717f + paddingLeft, this.f56717f + paddingTop);
    }

    /* renamed from: b */
    private void m71218b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CircularProgressView, i, 0);
        Resources resources = getResources();
        this.f56720i = obtainStyledAttributes.getFloat(8, (float) resources.getInteger(R.integer.s));
        this.f56721j = obtainStyledAttributes.getFloat(7, (float) resources.getInteger(R.integer.r));
        this.f56722k = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.e_));
        this.f56712a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.e));
        this.f56719h = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.d));
        this.f56731t = obtainStyledAttributes.getFloat(9, (float) resources.getInteger(R.integer.t));
        this.f56715d = this.f56731t;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.f56723l = obtainStyledAttributes.getColor(5, resources.getColor(R.color.ml));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.f56723l = typedValue.data;
        } else if (VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{16843829});
            this.f56723l = obtainStyledAttributes2.getColor(0, resources.getColor(R.color.ml));
            obtainStyledAttributes2.recycle();
        } else {
            this.f56723l = resources.getColor(R.color.ml);
        }
        this.f56724m = obtainStyledAttributes.getInteger(1, resources.getInteger(R.integer.n));
        this.f56725n = obtainStyledAttributes.getInteger(3, resources.getInteger(R.integer.p));
        this.f56726o = obtainStyledAttributes.getInteger(4, resources.getInteger(R.integer.q));
        this.f56727p = obtainStyledAttributes.getInteger(2, resources.getInteger(R.integer.o));
        obtainStyledAttributes.recycle();
    }

    public CircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m71216a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.f56717f = i;
        m71217b();
    }
}
