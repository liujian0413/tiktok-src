package com.bytedance.android.live.wallet.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.android.live.wallet.R$styleable;

public class RoundIndicatorView extends View {

    /* renamed from: a */
    public int f11412a;

    /* renamed from: b */
    private int f11413b;

    /* renamed from: c */
    private int f11414c;

    /* renamed from: d */
    private float f11415d;

    /* renamed from: e */
    private float f11416e;

    /* renamed from: f */
    private float f11417f;

    /* renamed from: g */
    private Paint f11418g;

    /* renamed from: h */
    private float f11419h;

    /* renamed from: i */
    private float f11420i;

    /* renamed from: j */
    private int f11421j;

    /* renamed from: k */
    private ViewPager f11422k;

    /* renamed from: com.bytedance.android.live.wallet.view.RoundIndicatorView$a */
    class C3827a implements C0935e {
        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        C3827a() {
        }

        public final void onPageSelected(int i) {
            if (RoundIndicatorView.this.f11412a > 0) {
                int i2 = i % RoundIndicatorView.this.f11412a;
                if (i2 < RoundIndicatorView.this.f11412a) {
                    RoundIndicatorView.this.setLocation(i2);
                    return;
                }
                RoundIndicatorView.this.setLocation(0);
            }
        }
    }

    public RoundIndicatorView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m13586a(canvas);
    }

    public void setLocation(int i) {
        this.f11421j = i;
        invalidate();
    }

    public void setCount(int i) {
        this.f11412a = i;
        measure(0, 0);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f11422k = viewPager;
        if (this.f11422k != null) {
            this.f11422k.addOnPageChangeListener(new C3827a());
        }
    }

    /* renamed from: a */
    private void m13586a(Canvas canvas) {
        this.f11419h = (float) getPaddingLeft();
        this.f11420i = (float) getPaddingTop();
        this.f11418g.setColor(this.f11414c);
        float f = this.f11419h;
        for (int i = 0; i < this.f11412a; i++) {
            if (this.f11421j == i) {
                this.f11418g.setColor(this.f11413b);
            } else {
                this.f11418g.setColor(this.f11414c);
            }
            canvas.drawCircle(this.f11417f + f, this.f11420i + this.f11417f, this.f11417f, this.f11418g);
            f += this.f11416e + this.f11415d;
        }
    }

    public RoundIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = getPaddingLeft() + getPaddingRight();
            if (this.f11412a > 0) {
                size = (int) (((float) size) + (((float) this.f11412a) * this.f11416e) + (((float) (this.f11412a - 1)) * this.f11415d));
            }
            if (mode == Integer.MIN_VALUE) {
                size = Math.max(size, getSuggestedMinimumWidth());
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop();
            if (this.f11412a > 0) {
                size2 += (int) this.f11416e;
            }
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.max(size2, getSuggestedMinimumHeight());
            }
        }
        setMeasuredDimension(size, size2);
    }

    public RoundIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13585a(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m13585a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_RoundIndicatorView, i, 0);
        this.f11415d = obtainStyledAttributes.getDimension(9, 0.0f);
        this.f11416e = obtainStyledAttributes.getDimension(8, 0.0f);
        this.f11417f = this.f11416e / 2.0f;
        this.f11414c = obtainStyledAttributes.getColor(6, -1726079458);
        this.f11413b = obtainStyledAttributes.getColor(7, -10704);
        this.f11412a = obtainStyledAttributes.getInt(5, 0);
        obtainStyledAttributes.recycle();
        this.f11418g = new Paint();
        this.f11418g.setAntiAlias(true);
        this.f11421j = 0;
    }
}
