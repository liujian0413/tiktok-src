package android.support.design.widget;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.support.p029v7.graphics.drawable.C1131b;

public class ShadowDrawableWrapper extends C1131b {

    /* renamed from: a */
    static final double f1470a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    final Paint f1471b;

    /* renamed from: c */
    final Paint f1472c;

    /* renamed from: d */
    final RectF f1473d;

    /* renamed from: e */
    public float f1474e;

    /* renamed from: f */
    Path f1475f;

    /* renamed from: g */
    float f1476g;

    /* renamed from: h */
    public float f1477h;

    /* renamed from: i */
    float f1478i;

    /* renamed from: j */
    public float f1479j;

    /* renamed from: l */
    private boolean f1480l;

    /* renamed from: m */
    private final int f1481m;

    /* renamed from: n */
    private final int f1482n;

    /* renamed from: o */
    private final int f1483o;

    /* renamed from: p */
    private boolean f1484p;

    /* renamed from: q */
    private float f1485q;

    /* renamed from: r */
    private boolean f1486r;

    public int getOpacity() {
        return -3;
    }

    /* renamed from: a */
    private void m1569a() {
        RectF rectF = new RectF(-this.f1474e, -this.f1474e, this.f1474e, this.f1474e);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.f1478i, -this.f1478i);
        if (this.f1475f == null) {
            this.f1475f = new Path();
        } else {
            this.f1475f.reset();
        }
        this.f1475f.setFillType(FillType.EVEN_ODD);
        this.f1475f.moveTo(-this.f1474e, 0.0f);
        this.f1475f.rLineTo(-this.f1478i, 0.0f);
        this.f1475f.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1475f.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1475f.close();
        float f = -rectF2.top;
        if (f > 0.0f) {
            float f2 = this.f1474e / f;
            float f3 = ((1.0f - f2) / 2.0f) + f2;
            Paint paint = this.f1471b;
            RadialGradient radialGradient = r8;
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, f, new int[]{0, this.f1481m, this.f1482n, this.f1483o}, new float[]{0.0f, f2, f3, 1.0f}, TileMode.CLAMP);
            paint.setShader(radialGradient);
        }
        Paint paint2 = this.f1472c;
        LinearGradient linearGradient = new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f1481m, this.f1482n, this.f1483o}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
        paint2.setShader(linearGradient);
        this.f1472c.setAntiAlias(false);
    }

    public void onBoundsChange(Rect rect) {
        this.f1480l = true;
    }

    /* renamed from: a */
    public final void mo1563a(float f) {
        mo1564a(f, this.f1477h);
    }

    /* renamed from: c */
    private static int m1573c(float f) {
        int round = Math.round(f);
        if (round % 2 == 1) {
            return round - 1;
        }
        return round;
    }

    /* renamed from: b */
    public final void mo1565b(float f) {
        if (this.f1485q != f) {
            this.f1485q = f;
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f1471b.setAlpha(i);
        this.f1472c.setAlpha(i);
    }

    public void draw(Canvas canvas) {
        if (this.f1480l) {
            m1571a(getBounds());
            this.f1480l = false;
        }
        m1570a(canvas);
        super.draw(canvas);
    }

    /* renamed from: a */
    private void m1571a(Rect rect) {
        float f = this.f1477h * 1.5f;
        this.f1473d.set(((float) rect.left) + this.f1477h, ((float) rect.top) + f, ((float) rect.right) - this.f1477h, ((float) rect.bottom) - f);
        this.f4068k.setBounds((int) this.f1473d.left, (int) this.f1473d.top, (int) this.f1473d.right, (int) this.f1473d.bottom);
        m1569a();
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m1568a(this.f1477h, this.f1474e, this.f1484p));
        int ceil2 = (int) Math.ceil((double) m1572b(this.f1477h, this.f1474e, this.f1484p));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* renamed from: a */
    private void m1570a(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.rotate(this.f1485q, this.f1473d.centerX(), this.f1473d.centerY());
        float f5 = (-this.f1474e) - this.f1478i;
        float f6 = this.f1474e;
        float f7 = f6 * 2.0f;
        if (this.f1473d.width() - f7 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.f1473d.height() - f7 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f8 = f6 / ((this.f1479j - (this.f1479j * 0.5f)) + f6);
        float f9 = f6 / ((this.f1479j - (this.f1479j * 0.25f)) + f6);
        float f10 = f6 / ((this.f1479j - (this.f1479j * 1.0f)) + f6);
        int save2 = canvas.save();
        canvas2.translate(this.f1473d.left + f6, this.f1473d.top + f6);
        canvas2.scale(f8, f9);
        canvas2.drawPath(this.f1475f, this.f1471b);
        if (z) {
            canvas2.scale(1.0f / f8, 1.0f);
            float f11 = -this.f1474e;
            float f12 = f11;
            i2 = save2;
            f = f10;
            i = save;
            f2 = f9;
            canvas.drawRect(0.0f, f5, this.f1473d.width() - f7, f12, this.f1472c);
        } else {
            i2 = save2;
            f = f10;
            i = save;
            f2 = f9;
        }
        canvas2.restoreToCount(i2);
        int save3 = canvas.save();
        canvas2.translate(this.f1473d.right - f6, this.f1473d.bottom - f6);
        float f13 = f;
        canvas2.scale(f8, f13);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f1475f, this.f1471b);
        if (z) {
            canvas2.scale(1.0f / f8, 1.0f);
            f3 = f2;
            f4 = f13;
            canvas.drawRect(0.0f, f5, this.f1473d.width() - f7, (-this.f1474e) + this.f1478i, this.f1472c);
        } else {
            f3 = f2;
            f4 = f13;
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        canvas2.translate(this.f1473d.left + f6, this.f1473d.bottom - f6);
        canvas2.scale(f8, f4);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f1475f, this.f1471b);
        if (z2) {
            canvas2.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f5, this.f1473d.height() - f7, -this.f1474e, this.f1472c);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas.save();
        canvas2.translate(this.f1473d.right - f6, this.f1473d.top + f6);
        float f14 = f3;
        canvas2.scale(f8, f14);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f1475f, this.f1471b);
        if (z2) {
            canvas2.scale(1.0f / f14, 1.0f);
            canvas.drawRect(0.0f, f5, this.f1473d.height() - f7, -this.f1474e, this.f1472c);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(i);
    }

    /* renamed from: a */
    public final void mo1564a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float c = (float) m1573c(f);
        float c2 = (float) m1573c(f2);
        if (c > c2) {
            if (!this.f1486r) {
                this.f1486r = true;
            }
            c = c2;
        }
        if (this.f1479j != c || this.f1477h != c2) {
            this.f1479j = c;
            this.f1477h = c2;
            this.f1478i = (float) Math.round(c * 1.5f);
            this.f1476g = c2;
            this.f1480l = true;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public static float m1568a(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = 1.0d - f1470a;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    /* renamed from: b */
    public static float m1572b(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - f1470a;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }
}
