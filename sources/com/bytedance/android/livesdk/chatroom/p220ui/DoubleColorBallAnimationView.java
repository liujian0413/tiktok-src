package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.support.p022v4.content.C0683b;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.DoubleColorBallAnimationView */
public class DoubleColorBallAnimationView extends View {

    /* renamed from: a */
    public boolean f14510a;

    /* renamed from: b */
    private final float f14511b;

    /* renamed from: c */
    private final float f14512c;

    /* renamed from: d */
    private final float f14513d;

    /* renamed from: e */
    private final float f14514e;

    /* renamed from: f */
    private final float f14515f;

    /* renamed from: g */
    private final long f14516g;

    /* renamed from: h */
    private int f14517h;

    /* renamed from: i */
    private int f14518i;

    /* renamed from: j */
    private Paint f14519j;

    /* renamed from: k */
    private final PorterDuffXfermode f14520k;

    /* renamed from: l */
    private long f14521l;

    /* renamed from: m */
    private int f14522m;

    /* renamed from: n */
    private float f14523n;

    /* renamed from: o */
    private float f14524o;

    /* renamed from: p */
    private float f14525p;

    /* renamed from: q */
    private float f14526q;

    /* renamed from: a */
    private static float m16346a(float f) {
        return ((double) f) < 0.5d ? 2.0f * f * f : ((f * 2.0f) * (2.0f - f)) - 1.0f;
    }

    /* renamed from: b */
    private void m16349b() {
        setLayerType(0, null);
        this.f14510a = false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m16349b();
    }

    /* renamed from: a */
    private void m16347a() {
        setLayerType(1, null);
        m16351d();
        this.f14510a = true;
        postInvalidate();
    }

    /* renamed from: c */
    private static Paint m16350c() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Style.FILL);
        return paint;
    }

    /* renamed from: d */
    private void m16351d() {
        this.f14521l = -1;
        if (this.f14522m <= 0) {
            setProgressBarInfo(getContext().getResources().getDimensionPixelSize(R.dimen.ep));
        }
        int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.f14522m > min && min > 0) {
            setProgressBarInfo(min);
        }
        if (this.f14519j == null) {
            this.f14519j = m16350c();
        }
    }

    public DoubleColorBallAnimationView(Context context) {
        this(context, null);
        m16348a(context);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            m16347a();
        } else {
            m16349b();
        }
    }

    /* renamed from: a */
    private void m16348a(Context context) {
        this.f14517h = C0683b.m2912c(context, R.color.avv);
        this.f14518i = C0683b.m2912c(context, R.color.avw);
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            this.f14522m = i;
            this.f14523n = ((float) this.f14522m) / 2.0f;
            this.f14524o = ((float) (this.f14522m >> 1)) * 0.32f;
            this.f14525p = (((float) this.f14522m) * 0.16f) + this.f14524o;
            this.f14526q = ((float) this.f14522m) - (this.f14525p * 2.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        super.onDraw(canvas);
        if (this.f14510a) {
            long nanoTime = System.nanoTime() / 1000000;
            if (this.f14521l < 0) {
                this.f14521l = nanoTime;
            }
            float f2 = ((float) (nanoTime - this.f14521l)) / 400.0f;
            int i3 = (int) f2;
            boolean z = true;
            if ((i3 & 1) != 1) {
                z = false;
            }
            float a = m16346a(f2 - ((float) i3));
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) this.f14522m, (float) this.f14522m, this.f14519j, 31);
            float f3 = (this.f14526q * a) + this.f14525p;
            if (((double) a) < 0.5d) {
                f = a * 2.0f;
            } else {
                f = 2.0f - (a * 2.0f);
            }
            float f4 = (0.25f * f * this.f14524o) + this.f14524o;
            Paint paint = this.f14519j;
            if (z) {
                i = this.f14518i;
            } else {
                i = this.f14517h;
            }
            paint.setColor(i);
            canvas.drawCircle(f3, this.f14523n, f4, this.f14519j);
            float f5 = ((float) this.f14522m) - f3;
            float f6 = this.f14524o - ((f * 0.375f) * this.f14524o);
            Paint paint2 = this.f14519j;
            if (z) {
                i2 = this.f14517h;
            } else {
                i2 = this.f14518i;
            }
            paint2.setColor(i2);
            this.f14519j.setXfermode(this.f14520k);
            canvas.drawCircle(f5, this.f14523n, f6, this.f14519j);
            this.f14519j.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            postInvalidateDelayed(17);
        }
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m16348a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
        if (this.f14522m > min && min > 0) {
            setProgressBarInfo(min);
        }
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14511b = 0.25f;
        this.f14512c = 0.375f;
        this.f14513d = 0.16f;
        this.f14514e = 0.32f;
        this.f14515f = 400.0f;
        this.f14516g = 17;
        this.f14520k = new PorterDuffXfermode(Mode.DARKEN);
        this.f14510a = false;
        this.f14521l = -1;
        this.f14522m = -1;
        m16348a(context);
    }
}
