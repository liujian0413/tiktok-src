package com.bytedance.android.livesdk.feed.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.android.livesdk.feed.R$styleable;

public class RoundIndicatorView extends View {

    /* renamed from: a */
    public int f17656a;

    /* renamed from: b */
    private int f17657b;

    /* renamed from: c */
    private int f17658c;

    /* renamed from: d */
    private float f17659d;

    /* renamed from: e */
    private float f17660e;

    /* renamed from: f */
    private float f17661f;

    /* renamed from: g */
    private Paint f17662g;

    /* renamed from: h */
    private float f17663h;

    /* renamed from: i */
    private float f17664i;

    /* renamed from: j */
    private int f17665j;

    /* renamed from: k */
    private ViewPager f17666k;

    /* renamed from: com.bytedance.android.livesdk.feed.banner.RoundIndicatorView$a */
    class C5953a implements C0935e {
        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        C5953a() {
        }

        public final void onPageSelected(int i) {
            if (RoundIndicatorView.this.f17656a > 0) {
                int i2 = i % RoundIndicatorView.this.f17656a;
                if (i2 < RoundIndicatorView.this.f17656a) {
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
        m18658a(canvas);
    }

    public void setLocation(int i) {
        this.f17665j = i;
        invalidate();
    }

    /* renamed from: a */
    public final void mo14594a(C0935e eVar) {
        if (this.f17666k != null) {
            this.f17666k.addOnPageChangeListener(eVar);
        }
    }

    public void setCount(int i) {
        this.f17656a = i;
        measure(0, 0);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f17666k = viewPager;
        if (this.f17666k != null) {
            this.f17666k.addOnPageChangeListener(new C5953a());
        }
    }

    /* renamed from: a */
    private void m18658a(Canvas canvas) {
        this.f17663h = (float) getPaddingLeft();
        this.f17664i = (float) getPaddingTop();
        this.f17662g.setColor(this.f17658c);
        float f = this.f17663h;
        for (int i = 0; i < this.f17656a; i++) {
            if (this.f17665j == i) {
                this.f17662g.setColor(this.f17657b);
            } else {
                this.f17662g.setColor(this.f17658c);
            }
            canvas.drawCircle(this.f17661f + f, this.f17664i + this.f17661f, this.f17661f, this.f17662g);
            f += this.f17660e + this.f17659d;
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
            if (this.f17656a > 0) {
                size = (int) (((float) size) + (((float) this.f17656a) * this.f17660e) + (((float) (this.f17656a - 1)) * this.f17659d));
            }
            if (mode == Integer.MIN_VALUE) {
                size = Math.max(size, getSuggestedMinimumWidth());
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop();
            if (this.f17656a > 0) {
                size2 += (int) this.f17660e;
            }
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.max(size2, getSuggestedMinimumHeight());
            }
        }
        setMeasuredDimension(size, size2);
    }

    public RoundIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18657a(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m18657a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_RoundIndicatorView, i, 0);
        this.f17659d = obtainStyledAttributes.getDimension(4, 0.0f);
        this.f17660e = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f17661f = this.f17660e / 2.0f;
        this.f17658c = obtainStyledAttributes.getColor(1, -1726079458);
        this.f17657b = obtainStyledAttributes.getColor(2, -10704);
        this.f17656a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        this.f17662g = new Paint();
        this.f17662g.setAntiAlias(true);
        this.f17665j = 0;
    }
}
