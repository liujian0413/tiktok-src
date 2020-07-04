package com.p280ss.android.ugc.aweme.p1168df.base.p1170ui;

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
import com.p280ss.android.ugc.aweme.p1168df.base.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.df.base.ui.DynamicFeatureCircularProgressView */
public class DynamicFeatureCircularProgressView extends View {

    /* renamed from: a */
    public boolean f69126a;

    /* renamed from: b */
    public float f69127b;

    /* renamed from: c */
    public float f69128c;

    /* renamed from: d */
    public float f69129d;

    /* renamed from: e */
    private Paint f69130e;

    /* renamed from: f */
    private int f69131f;

    /* renamed from: g */
    private RectF f69132g;

    /* renamed from: h */
    private boolean f69133h;

    /* renamed from: i */
    private float f69134i;

    /* renamed from: j */
    private float f69135j;

    /* renamed from: k */
    private int f69136k;

    /* renamed from: l */
    private int f69137l;

    /* renamed from: m */
    private int f69138m;

    /* renamed from: n */
    private int f69139n;

    /* renamed from: o */
    private int f69140o;

    /* renamed from: p */
    private int f69141p;

    /* renamed from: q */
    private ValueAnimator f69142q;

    /* renamed from: r */
    private ValueAnimator f69143r;

    /* renamed from: s */
    private AnimatorSet f69144s;

    /* renamed from: t */
    private float f69145t;

    /* renamed from: d */
    private void m86236d() {
        mo67784a();
    }

    public int getColor() {
        return this.f69137l;
    }

    public float getMaxProgress() {
        return this.f69135j;
    }

    public float getProgress() {
        return this.f69134i;
    }

    public int getThickness() {
        return this.f69136k;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m86237e();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f69133h) {
            m86236d();
        }
    }

    /* renamed from: c */
    private void m86235c() {
        this.f69130e.setColor(this.f69137l);
        this.f69130e.setStyle(Style.STROKE);
        this.f69130e.setStrokeWidth((float) this.f69136k);
        this.f69130e.setStrokeCap(Cap.ROUND);
    }

    /* renamed from: b */
    private void m86233b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f69132g.set((float) (this.f69136k + paddingLeft), (float) (this.f69136k + paddingTop), (float) ((this.f69131f - paddingLeft) - this.f69136k), (float) ((this.f69131f - paddingTop) - this.f69136k));
    }

    /* renamed from: e */
    private void m86237e() {
        if (this.f69142q != null) {
            this.f69142q.cancel();
            this.f69142q = null;
        }
        if (this.f69143r != null) {
            this.f69143r.cancel();
            this.f69143r = null;
        }
        if (this.f69144s != null) {
            this.f69144s.cancel();
            this.f69144s = null;
        }
    }

    /* renamed from: a */
    public final void mo67784a() {
        if (this.f69142q != null && this.f69142q.isRunning()) {
            this.f69142q.cancel();
        }
        if (this.f69143r != null && this.f69143r.isRunning()) {
            this.f69143r.cancel();
        }
        if (this.f69144s != null && this.f69144s.isRunning()) {
            this.f69144s.cancel();
        }
        int i = 0;
        if (!this.f69126a) {
            this.f69129d = this.f69145t;
            this.f69142q = ValueAnimator.ofFloat(new float[]{this.f69129d, this.f69129d + 360.0f});
            this.f69142q.setDuration((long) this.f69139n);
            this.f69142q.setInterpolator(new DecelerateInterpolator(2.0f));
            this.f69142q.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DynamicFeatureCircularProgressView.this.f69129d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    DynamicFeatureCircularProgressView.this.invalidate();
                }
            });
            this.f69142q.start();
            return;
        }
        this.f69127b = 15.0f;
        this.f69144s = new AnimatorSet();
        Animator animator = null;
        while (i < this.f69141p) {
            AnimatorSet a = m86231a((float) i);
            Builder play = this.f69144s.play(a);
            if (animator != null) {
                play.after(animator);
            }
            i++;
            animator = a;
        }
        this.f69144s.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a */
            boolean f69147a;

            public final void onAnimationCancel(Animator animator) {
                this.f69147a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f69147a) {
                    DynamicFeatureCircularProgressView.this.mo67784a();
                }
            }
        });
        this.f69144s.start();
    }

    public void setMaxProgress(float f) {
        this.f69135j = f;
        invalidate();
    }

    public void setProgress(float f) {
        this.f69134i = f;
        invalidate();
    }

    public DynamicFeatureCircularProgressView(Context context) {
        super(context);
        m86232a(null, 0);
    }

    public void setColor(int i) {
        this.f69137l = i;
        m86235c();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        boolean z2;
        if (this.f69126a != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f69126a = z;
            mo67784a();
        }
    }

    public void setThickness(int i) {
        this.f69136k = i;
        m86235c();
        m86233b();
        invalidate();
    }

    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i != visibility) {
            if (i == 0) {
                mo67784a();
            } else if (i == 8 || i == 4) {
                m86237e();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        isInEditMode();
        float f = (this.f69134i / this.f69135j) * 360.0f;
        if (!this.f69126a) {
            canvas.drawArc(this.f69132g, this.f69129d, f, false, this.f69130e);
            return;
        }
        canvas.drawArc(this.f69132g, this.f69129d + this.f69128c, this.f69127b, false, this.f69130e);
    }

    /* renamed from: a */
    private AnimatorSet m86231a(float f) {
        final float f2 = ((((float) (this.f69141p - 1)) * 360.0f) / ((float) this.f69141p)) + 15.0f;
        final float f3 = ((f2 - 15.0f) * f) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{15.0f, f2});
        ofFloat.setDuration((long) ((this.f69138m / this.f69141p) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DynamicFeatureCircularProgressView.this.f69127b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DynamicFeatureCircularProgressView.this.invalidate();
            }
        });
        float f4 = (0.5f + f) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(f * 720.0f) / ((float) this.f69141p), f4 / ((float) this.f69141p)});
        ofFloat2.setDuration((long) ((this.f69138m / this.f69141p) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DynamicFeatureCircularProgressView.this.f69128c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{f3, (f3 + f2) - 15.0f});
        ofFloat3.setDuration((long) ((this.f69138m / this.f69141p) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DynamicFeatureCircularProgressView.this.f69129d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DynamicFeatureCircularProgressView.this.f69127b = (f2 - DynamicFeatureCircularProgressView.this.f69129d) + f3;
                DynamicFeatureCircularProgressView.this.invalidate();
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{f4 / ((float) this.f69141p), ((f + 1.0f) * 720.0f) / ((float) this.f69141p)});
        ofFloat4.setDuration((long) ((this.f69138m / this.f69141p) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DynamicFeatureCircularProgressView.this.f69128c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    public DynamicFeatureCircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m86232a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m86232a(AttributeSet attributeSet, int i) {
        m86234b(attributeSet, i);
        this.f69130e = new Paint(1);
        m86235c();
        this.f69132g = new RectF();
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
        this.f69131f = measuredWidth;
        setMeasuredDimension(this.f69131f + paddingLeft, this.f69131f + paddingTop);
    }

    /* renamed from: b */
    private void m86234b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.DynamicFeatureCircularProgressView, i, 0);
        Resources resources = getResources();
        this.f69134i = obtainStyledAttributes.getFloat(8, (float) resources.getInteger(R.integer.s));
        this.f69135j = obtainStyledAttributes.getFloat(7, (float) resources.getInteger(R.integer.r));
        this.f69136k = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.e_));
        this.f69126a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.e));
        this.f69133h = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.d));
        this.f69145t = obtainStyledAttributes.getFloat(9, (float) resources.getInteger(R.integer.t));
        this.f69129d = this.f69145t;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.f69137l = obtainStyledAttributes.getColor(5, resources.getColor(R.color.ml));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.f69137l = typedValue.data;
        } else if (VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{16843829});
            this.f69137l = obtainStyledAttributes2.getColor(0, resources.getColor(R.color.ml));
            obtainStyledAttributes2.recycle();
        } else {
            this.f69137l = resources.getColor(R.color.ml);
        }
        this.f69138m = obtainStyledAttributes.getInteger(1, resources.getInteger(R.integer.n));
        this.f69139n = obtainStyledAttributes.getInteger(3, resources.getInteger(R.integer.p));
        this.f69140o = obtainStyledAttributes.getInteger(4, resources.getInteger(R.integer.q));
        this.f69141p = obtainStyledAttributes.getInteger(2, resources.getInteger(R.integer.o));
        obtainStyledAttributes.recycle();
    }

    public DynamicFeatureCircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m86232a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.f69131f = i;
        m86233b();
    }
}
