package com.github.rahatarmanahmed.cpv;

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
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CircularProgressView extends View {

    /* renamed from: a */
    public boolean f37998a;

    /* renamed from: b */
    public float f37999b;

    /* renamed from: c */
    public float f38000c;

    /* renamed from: d */
    public List<Object> f38001d;

    /* renamed from: e */
    public float f38002e;

    /* renamed from: f */
    public float f38003f;

    /* renamed from: g */
    private Paint f38004g;

    /* renamed from: h */
    private int f38005h;

    /* renamed from: i */
    private RectF f38006i;

    /* renamed from: j */
    private boolean f38007j;

    /* renamed from: k */
    private float f38008k;

    /* renamed from: l */
    private float f38009l;

    /* renamed from: m */
    private int f38010m;

    /* renamed from: n */
    private int f38011n;

    /* renamed from: o */
    private int f38012o;

    /* renamed from: p */
    private int f38013p;

    /* renamed from: q */
    private int f38014q;

    /* renamed from: r */
    private int f38015r;

    /* renamed from: s */
    private ValueAnimator f38016s;

    /* renamed from: t */
    private ValueAnimator f38017t;

    /* renamed from: u */
    private AnimatorSet f38018u;

    /* renamed from: v */
    private float f38019v;

    /* renamed from: a */
    public final void mo37275a() {
        mo37276b();
    }

    public int getColor() {
        return this.f38011n;
    }

    public float getMaxProgress() {
        return this.f38009l;
    }

    public float getProgress() {
        return this.f38008k;
    }

    public int getThickness() {
        return this.f38010m;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo37277c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f38007j) {
            mo37275a();
        }
    }

    /* renamed from: e */
    private void m42512e() {
        this.f38004g.setColor(this.f38011n);
        this.f38004g.setStyle(Style.STROKE);
        this.f38004g.setStrokeWidth((float) this.f38010m);
        this.f38004g.setStrokeCap(Cap.BUTT);
    }

    /* renamed from: d */
    private void m42511d() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f38006i.set((float) (this.f38010m + paddingLeft), (float) (this.f38010m + paddingTop), (float) ((this.f38005h - paddingLeft) - this.f38010m), (float) ((this.f38005h - paddingTop) - this.f38010m));
    }

    /* renamed from: c */
    public final void mo37277c() {
        if (this.f38016s != null) {
            this.f38016s.cancel();
            this.f38016s = null;
        }
        if (this.f38017t != null) {
            this.f38017t.cancel();
            this.f38017t = null;
        }
        if (this.f38018u != null) {
            this.f38018u.cancel();
            this.f38018u = null;
        }
    }

    /* renamed from: b */
    public final void mo37276b() {
        if (this.f38016s != null && this.f38016s.isRunning()) {
            this.f38016s.cancel();
        }
        if (this.f38017t != null && this.f38017t.isRunning()) {
            this.f38017t.cancel();
        }
        if (this.f38018u != null && this.f38018u.isRunning()) {
            this.f38018u.cancel();
        }
        int i = 0;
        if (!this.f37998a) {
            this.f38002e = this.f38019v;
            this.f38016s = ValueAnimator.ofFloat(new float[]{this.f38002e, this.f38002e + 360.0f});
            this.f38016s.setDuration((long) this.f38013p);
            this.f38016s.setInterpolator(new DecelerateInterpolator(2.0f));
            this.f38016s.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f38002e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.f38016s.start();
            this.f38003f = 0.0f;
            this.f38017t = ValueAnimator.ofFloat(new float[]{this.f38003f, this.f38008k});
            this.f38017t.setDuration((long) this.f38014q);
            this.f38017t.setInterpolator(new LinearInterpolator());
            this.f38017t.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f38003f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.f38017t.start();
            return;
        }
        this.f37999b = 15.0f;
        this.f38018u = new AnimatorSet();
        Animator animator = null;
        while (i < this.f38015r) {
            AnimatorSet a = m42508a((float) i);
            Builder play = this.f38018u.play(a);
            if (animator != null) {
                play.after(animator);
            }
            i++;
            animator = a;
        }
        this.f38018u.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a */
            boolean f38025a;

            public final void onAnimationCancel(Animator animator) {
                this.f38025a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f38025a) {
                    CircularProgressView.this.mo37276b();
                }
            }
        });
        this.f38018u.start();
        Iterator it = this.f38001d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void setMaxProgress(float f) {
        this.f38009l = f;
        invalidate();
    }

    public CircularProgressView(Context context) {
        super(context);
        m42509a(null, 0);
    }

    public void setColor(int i) {
        this.f38011n = i;
        m42512e();
        invalidate();
    }

    public void setThickness(int i) {
        this.f38010m = i;
        m42512e();
        m42511d();
        invalidate();
    }

    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i != visibility) {
            if (i == 0) {
                mo37276b();
            } else if (i == 8 || i == 4) {
                mo37277c();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (isInEditMode()) {
            f = this.f38008k;
        } else {
            f = this.f38003f;
        }
        float f2 = (f / this.f38009l) * 360.0f;
        if (!this.f37998a) {
            canvas.drawArc(this.f38006i, this.f38002e, f2, false, this.f38004g);
            return;
        }
        canvas.drawArc(this.f38006i, this.f38002e + this.f38000c, this.f37999b, false, this.f38004g);
    }

    public void setIndeterminate(boolean z) {
        boolean z2;
        boolean z3 = this.f37998a;
        if (this.f37998a == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f37998a = z;
        if (z2) {
            mo37276b();
        }
        if (z3 != z) {
            Iterator it = this.f38001d.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setProgress(final float f) {
        this.f38008k = f;
        if (!this.f37998a) {
            if (this.f38017t != null && this.f38017t.isRunning()) {
                this.f38017t.cancel();
            }
            this.f38017t = ValueAnimator.ofFloat(new float[]{this.f38003f, f});
            this.f38017t.setDuration((long) this.f38014q);
            this.f38017t.setInterpolator(new LinearInterpolator());
            this.f38017t.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f38003f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.f38017t.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    Iterator it = CircularProgressView.this.f38001d.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
            this.f38017t.start();
        }
        invalidate();
        Iterator it = this.f38001d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    private AnimatorSet m42508a(float f) {
        final float f2 = ((((float) (this.f38015r - 1)) * 360.0f) / ((float) this.f38015r)) + 15.0f;
        final float f3 = ((f2 - 15.0f) * f) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{15.0f, f2});
        ofFloat.setDuration((long) ((this.f38012o / this.f38015r) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f37999b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        float f4 = (0.5f + f) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(f * 720.0f) / ((float) this.f38015r), f4 / ((float) this.f38015r)});
        ofFloat2.setDuration((long) ((this.f38012o / this.f38015r) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f38000c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{f3, (f3 + f2) - 15.0f});
        ofFloat3.setDuration((long) ((this.f38012o / this.f38015r) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f38002e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.f37999b = (f2 - CircularProgressView.this.f38002e) + f3;
                CircularProgressView.this.invalidate();
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{f4 / ((float) this.f38015r), ((f + 1.0f) * 720.0f) / ((float) this.f38015r)});
        ofFloat4.setDuration((long) ((this.f38012o / this.f38015r) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f38000c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    public CircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m42509a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m42509a(AttributeSet attributeSet, int i) {
        this.f38001d = new ArrayList();
        m42510b(attributeSet, i);
        this.f38004g = new Paint(1);
        m42512e();
        this.f38006i = new RectF();
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
        this.f38005h = measuredWidth;
        setMeasuredDimension(this.f38005h + paddingLeft, this.f38005h + paddingTop);
    }

    /* renamed from: b */
    private void m42510b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CircularProgressView, i, 0);
        Resources resources = getResources();
        this.f38008k = obtainStyledAttributes.getFloat(8, (float) resources.getInteger(R.integer.s));
        this.f38009l = obtainStyledAttributes.getFloat(7, (float) resources.getInteger(R.integer.r));
        this.f38010m = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.e_));
        this.f37998a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.e));
        this.f38007j = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.d));
        this.f38019v = obtainStyledAttributes.getFloat(9, (float) resources.getInteger(R.integer.t));
        this.f38002e = this.f38019v;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.f38011n = obtainStyledAttributes.getColor(5, resources.getColor(R.color.ml));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.f38011n = typedValue.data;
        } else if (VERSION.SDK_INT >= 21) {
            this.f38011n = getContext().obtainStyledAttributes(new int[]{16843829}).getColor(0, resources.getColor(R.color.ml));
        } else {
            this.f38011n = resources.getColor(R.color.ml);
        }
        this.f38012o = obtainStyledAttributes.getInteger(1, resources.getInteger(R.integer.n));
        this.f38013p = obtainStyledAttributes.getInteger(3, resources.getInteger(R.integer.p));
        this.f38014q = obtainStyledAttributes.getInteger(4, resources.getInteger(R.integer.q));
        this.f38015r = obtainStyledAttributes.getInteger(2, resources.getInteger(R.integer.o));
        obtainStyledAttributes.recycle();
    }

    public CircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m42509a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.f38005h = i;
        m42511d();
    }
}
