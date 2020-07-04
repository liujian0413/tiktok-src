package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.common.internal.C13307g;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.drawable.l */
public final class C13417l extends Drawable implements C13415j {

    /* renamed from: a */
    final float[] f35544a = new float[8];

    /* renamed from: b */
    float[] f35545b;

    /* renamed from: c */
    final Paint f35546c = new Paint(1);

    /* renamed from: d */
    final Path f35547d = new Path();

    /* renamed from: e */
    final Path f35548e = new Path();

    /* renamed from: f */
    public int f35549f = 0;

    /* renamed from: g */
    private final float[] f35550g = new float[8];

    /* renamed from: h */
    private boolean f35551h = false;

    /* renamed from: i */
    private float f35552i = 0.0f;

    /* renamed from: j */
    private float f35553j = 0.0f;

    /* renamed from: k */
    private int f35554k = 0;

    /* renamed from: l */
    private boolean f35555l = false;

    /* renamed from: m */
    private final RectF f35556m = new RectF();

    /* renamed from: n */
    private int f35557n = NormalGiftView.ALPHA_255;

    public final int getAlpha() {
        return this.f35557n;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getOpacity() {
        return C13410e.m39333a(C13410e.m39334a(this.f35549f, this.f35557n));
    }

    /* renamed from: a */
    private void m39360a() {
        float f;
        this.f35547d.reset();
        this.f35548e.reset();
        this.f35556m.set(getBounds());
        this.f35556m.inset(this.f35552i / 2.0f, this.f35552i / 2.0f);
        if (this.f35551h) {
            this.f35548e.addCircle(this.f35556m.centerX(), this.f35556m.centerY(), Math.min(this.f35556m.width(), this.f35556m.height()) / 2.0f, Direction.CW);
        } else {
            for (int i = 0; i < this.f35544a.length; i++) {
                this.f35544a[i] = (this.f35550g[i] + this.f35553j) - (this.f35552i / 2.0f);
            }
            this.f35548e.addRoundRect(this.f35556m, this.f35544a, Direction.CW);
        }
        this.f35556m.inset((-this.f35552i) / 2.0f, (-this.f35552i) / 2.0f);
        float f2 = this.f35553j;
        if (this.f35555l) {
            f = this.f35552i;
        } else {
            f = 0.0f;
        }
        float f3 = f2 + f;
        this.f35556m.inset(f3, f3);
        if (this.f35551h) {
            this.f35547d.addCircle(this.f35556m.centerX(), this.f35556m.centerY(), Math.min(this.f35556m.width(), this.f35556m.height()) / 2.0f, Direction.CW);
        } else if (this.f35555l) {
            if (this.f35545b == null) {
                this.f35545b = new float[8];
            }
            for (int i2 = 0; i2 < this.f35545b.length; i2++) {
                this.f35545b[i2] = this.f35550g[i2] - this.f35552i;
            }
            this.f35547d.addRoundRect(this.f35556m, this.f35545b, Direction.CW);
        } else {
            this.f35547d.addRoundRect(this.f35556m, this.f35550g, Direction.CW);
        }
        float f4 = -f3;
        this.f35556m.inset(f4, f4);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m39360a();
    }

    /* renamed from: a */
    public static C13417l m39359a(ColorDrawable colorDrawable) {
        return new C13417l(colorDrawable.getColor());
    }

    /* renamed from: b */
    public final void mo32773b(float f) {
        if (this.f35553j != f) {
            this.f35553j = f;
            m39360a();
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (i != this.f35557n) {
            this.f35557n = i;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private void m39361a(int i) {
        if (this.f35549f != i) {
            this.f35549f = i;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public final void mo32774b(boolean z) {
        if (this.f35555l != z) {
            this.f35555l = z;
            m39360a();
            invalidateSelf();
        }
    }

    private C13417l(int i) {
        m39361a(i);
    }

    /* renamed from: a */
    public final void mo32768a(float f) {
        C13307g.m38944a(true, (Object) "radius should be non negative");
        Arrays.fill(this.f35550g, 0.0f);
        m39360a();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.f35546c.setColor(C13410e.m39334a(this.f35549f, this.f35557n));
        this.f35546c.setStyle(Style.FILL);
        canvas.drawPath(this.f35547d, this.f35546c);
        if (this.f35552i != 0.0f) {
            this.f35546c.setColor(C13410e.m39334a(this.f35554k, this.f35557n));
            this.f35546c.setStyle(Style.STROKE);
            this.f35546c.setStrokeWidth(this.f35552i);
            canvas.drawPath(this.f35548e, this.f35546c);
        }
    }

    /* renamed from: a */
    public final void mo32771a(boolean z) {
        this.f35551h = z;
        m39360a();
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo32772a(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.f35550g, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C13307g.m38944a(z, (Object) "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f35550g, 0, 8);
        }
        m39360a();
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo32770a(int i, float f) {
        if (this.f35554k != i) {
            this.f35554k = i;
            invalidateSelf();
        }
        if (this.f35552i != f) {
            this.f35552i = f;
            m39360a();
            invalidateSelf();
        }
    }
}
