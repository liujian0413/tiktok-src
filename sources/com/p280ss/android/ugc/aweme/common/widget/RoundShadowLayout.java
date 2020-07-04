package com.p280ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.common.widget.RoundShadowLayout */
public class RoundShadowLayout extends FrameLayout {

    /* renamed from: a */
    private float[] f67832a;

    /* renamed from: b */
    private Paint f67833b;

    /* renamed from: c */
    private RectF f67834c;

    /* renamed from: d */
    private Path f67835d;

    /* renamed from: e */
    private float f67836e;

    /* renamed from: f */
    private int f67837f;

    /* renamed from: g */
    private float f67838g;

    /* renamed from: h */
    private float f67839h;

    public float getShadowDx() {
        return this.f67838g;
    }

    public float getShadowDy() {
        return this.f67839h;
    }

    public float getShadowRadius() {
        return this.f67836e;
    }

    public RoundShadowLayout(Context context) {
        this(context, null);
    }

    public RoundShadowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m84545a(int i, int i2) {
        setBackground(new BitmapDrawable(getResources(), m84544a(i, i2, this.f67836e, this.f67838g, this.f67839h, this.f67837f)));
    }

    /* renamed from: a */
    private void m84546a(Context context, AttributeSet attributeSet) {
        float f;
        float f2;
        float f3;
        AttributeSet attributeSet2 = attributeSet;
        float f4 = 0.0f;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, R$styleable.RoundShadowLayout);
            float dimension = obtainStyledAttributes.getDimension(2, 0.0f);
            f3 = obtainStyledAttributes.getDimension(7, dimension);
            f2 = obtainStyledAttributes.getDimension(8, dimension);
            f = obtainStyledAttributes.getDimension(0, dimension);
            float dimension2 = obtainStyledAttributes.getDimension(1, dimension);
            this.f67836e = (float) obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.f67837f = obtainStyledAttributes.getColor(3, -2005568139);
            this.f67838g = obtainStyledAttributes.getDimension(5, 0.0f);
            this.f67839h = obtainStyledAttributes.getDimension(6, 0.0f);
            obtainStyledAttributes.recycle();
            f4 = dimension2;
        } else {
            f3 = 0.0f;
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f67832a = new float[8];
        this.f67832a[0] = f3;
        this.f67832a[1] = f3;
        this.f67832a[2] = f2;
        this.f67832a[3] = f2;
        this.f67832a[4] = f4;
        this.f67832a[5] = f4;
        this.f67832a[6] = f;
        this.f67832a[7] = f;
        this.f67834c = new RectF();
        this.f67835d = new Path();
        this.f67833b = new Paint();
        int abs = (int) (this.f67836e + Math.abs(this.f67838g));
        int abs2 = (int) (this.f67836e + Math.abs(this.f67839h));
        setPadding(abs, abs2, abs, abs2);
    }

    public RoundShadowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m84546a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0 && this.f67836e > 0.0f) {
            m84545a(i, i2);
        }
    }

    /* renamed from: a */
    private Bitmap m84544a(int i, int i2, float f, float f2, float f3, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.f67834c.set(f, f, ((float) i) - f, ((float) i2) - f);
        if (f3 > 0.0f) {
            this.f67834c.top += f3;
            this.f67834c.bottom -= f3;
        } else if (f3 < 0.0f) {
            this.f67834c.top += Math.abs(f3);
            this.f67834c.bottom -= Math.abs(f3);
        }
        if (f2 > 0.0f) {
            this.f67834c.left += f2;
            this.f67834c.right -= f2;
        } else if (f2 < 0.0f) {
            this.f67834c.left += Math.abs(f2);
            this.f67834c.right -= Math.abs(f2);
        }
        this.f67833b.setAntiAlias(true);
        this.f67833b.setStyle(Style.FILL);
        this.f67833b.setColor(i3);
        if (!isInEditMode()) {
            this.f67833b.setShadowLayer(f, f2, f3, i3);
        }
        this.f67835d.reset();
        this.f67835d.addRoundRect(this.f67834c, this.f67832a, Direction.CW);
        canvas.drawPath(this.f67835d, this.f67833b);
        return createBitmap;
    }
}
