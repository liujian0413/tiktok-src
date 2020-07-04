package com.bytedance.ies.dmt.p262ui.widget;

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

/* renamed from: com.bytedance.ies.dmt.ui.widget.DoubleColorBallAnimationView */
public class DoubleColorBallAnimationView extends View {

    /* renamed from: a */
    public boolean f29091a;

    /* renamed from: b */
    private final float f29092b;

    /* renamed from: c */
    private final float f29093c;

    /* renamed from: d */
    private final float f29094d;

    /* renamed from: e */
    private final float f29095e;

    /* renamed from: f */
    private final float f29096f;

    /* renamed from: g */
    private final long f29097g;

    /* renamed from: h */
    private int f29098h;

    /* renamed from: i */
    private int f29099i;

    /* renamed from: j */
    private Paint f29100j;

    /* renamed from: k */
    private final PorterDuffXfermode f29101k;

    /* renamed from: l */
    private long f29102l;

    /* renamed from: m */
    private int f29103m;

    /* renamed from: n */
    private float f29104n;

    /* renamed from: o */
    private float f29105o;

    /* renamed from: p */
    private float f29106p;

    /* renamed from: q */
    private float f29107q;

    /* renamed from: a */
    private static float m31651a(float f) {
        return ((double) f) < 0.5d ? 2.0f * f * f : ((f * 2.0f) * (2.0f - f)) - 1.0f;
    }

    /* renamed from: b */
    public final void mo25977b() {
        setLayerType(0, null);
        this.f29091a = false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo25977b();
    }

    /* renamed from: a */
    public final void mo25976a() {
        setLayerType(1, null);
        m31654d();
        this.f29091a = true;
        postInvalidate();
    }

    /* renamed from: c */
    private static Paint m31653c() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Style.FILL);
        return paint;
    }

    /* renamed from: d */
    private void m31654d() {
        this.f29102l = -1;
        if (this.f29103m <= 0) {
            setProgressBarInfo(getContext().getResources().getDimensionPixelSize(R.dimen.ep));
        }
        int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.f29103m > min && min > 0) {
            setProgressBarInfo(min);
        }
        if (this.f29100j == null) {
            this.f29100j = m31653c();
        }
    }

    public DoubleColorBallAnimationView(Context context) {
        this(context, null);
        m31652a(context);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            mo25976a();
        } else {
            mo25977b();
        }
    }

    /* renamed from: a */
    private void m31652a(Context context) {
        this.f29098h = C0683b.m2912c(context, R.color.avv);
        this.f29099i = C0683b.m2912c(context, R.color.avw);
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            this.f29103m = i;
            this.f29104n = ((float) this.f29103m) / 2.0f;
            this.f29105o = ((float) (this.f29103m >> 1)) * 0.32f;
            this.f29106p = (((float) this.f29103m) * 0.16f) + this.f29105o;
            this.f29107q = ((float) this.f29103m) - (this.f29106p * 2.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        super.onDraw(canvas);
        if (this.f29091a) {
            long nanoTime = System.nanoTime() / 1000000;
            if (this.f29102l < 0) {
                this.f29102l = nanoTime;
            }
            float f2 = ((float) (nanoTime - this.f29102l)) / 400.0f;
            int i3 = (int) f2;
            boolean z = true;
            if ((i3 & 1) != 1) {
                z = false;
            }
            float a = m31651a(f2 - ((float) i3));
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) this.f29103m, (float) this.f29103m, this.f29100j, 31);
            float f3 = (this.f29107q * a) + this.f29106p;
            if (((double) a) < 0.5d) {
                f = a * 2.0f;
            } else {
                f = 2.0f - (a * 2.0f);
            }
            float f4 = (0.25f * f * this.f29105o) + this.f29105o;
            Paint paint = this.f29100j;
            if (z) {
                i = this.f29099i;
            } else {
                i = this.f29098h;
            }
            paint.setColor(i);
            canvas.drawCircle(f3, this.f29104n, f4, this.f29100j);
            float f5 = ((float) this.f29103m) - f3;
            float f6 = this.f29105o - ((f * 0.375f) * this.f29105o);
            Paint paint2 = this.f29100j;
            if (z) {
                i2 = this.f29098h;
            } else {
                i2 = this.f29099i;
            }
            paint2.setColor(i2);
            this.f29100j.setXfermode(this.f29101k);
            canvas.drawCircle(f5, this.f29104n, f6, this.f29100j);
            this.f29100j.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            postInvalidateDelayed(17);
        }
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m31652a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
        if (this.f29103m > min && min > 0) {
            setProgressBarInfo(min);
        }
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29092b = 0.25f;
        this.f29093c = 0.375f;
        this.f29094d = 0.16f;
        this.f29095e = 0.32f;
        this.f29096f = 400.0f;
        this.f29097g = 17;
        this.f29101k = new PorterDuffXfermode(Mode.DARKEN);
        this.f29091a = false;
        this.f29102l = -1;
        this.f29103m = -1;
        m31652a(context);
    }
}
