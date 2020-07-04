package android.support.p029v7.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.am */
final class C1351am extends Drawable {

    /* renamed from: a */
    static C1352a f5264a;

    /* renamed from: f */
    private static final double f5265f = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    public float f5266b;

    /* renamed from: c */
    public float f5267c;

    /* renamed from: d */
    public float f5268d;

    /* renamed from: e */
    public ColorStateList f5269e;

    /* renamed from: g */
    private final int f5270g;

    /* renamed from: h */
    private Paint f5271h;

    /* renamed from: i */
    private Paint f5272i;

    /* renamed from: j */
    private Paint f5273j;

    /* renamed from: k */
    private final RectF f5274k;

    /* renamed from: l */
    private Path f5275l;

    /* renamed from: m */
    private float f5276m;

    /* renamed from: n */
    private boolean f5277n = true;

    /* renamed from: o */
    private final int f5278o;

    /* renamed from: p */
    private final int f5279p;

    /* renamed from: q */
    private boolean f5280q = true;

    /* renamed from: r */
    private boolean f5281r;

    /* renamed from: android.support.v7.widget.am$a */
    interface C1352a {
        /* renamed from: a */
        void mo6353a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        if ((this.f5269e == null || !this.f5269e.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final float mo6337a() {
        return (Math.max(this.f5267c, this.f5266b + ((float) this.f5270g) + (this.f5267c / 2.0f)) * 2.0f) + ((this.f5267c + ((float) this.f5270g)) * 2.0f);
    }

    /* renamed from: c */
    private void m6684c() {
        RectF rectF = new RectF(-this.f5266b, -this.f5266b, this.f5266b, this.f5266b);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.f5276m, -this.f5276m);
        if (this.f5275l == null) {
            this.f5275l = new Path();
        } else {
            this.f5275l.reset();
        }
        this.f5275l.setFillType(FillType.EVEN_ODD);
        this.f5275l.moveTo(-this.f5266b, 0.0f);
        this.f5275l.rLineTo(-this.f5276m, 0.0f);
        this.f5275l.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f5275l.arcTo(rectF, 270.0f, -90.0f, false);
        this.f5275l.close();
        float f = this.f5266b / (this.f5266b + this.f5276m);
        Paint paint = this.f5272i;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, this.f5266b + this.f5276m, new int[]{this.f5278o, this.f5278o, this.f5279p}, new float[]{0.0f, f, 1.0f}, TileMode.CLAMP);
        paint.setShader(radialGradient);
        Paint paint2 = this.f5273j;
        LinearGradient linearGradient = new LinearGradient(0.0f, (-this.f5266b) + this.f5276m, 0.0f, (-this.f5266b) - this.f5276m, new int[]{this.f5278o, this.f5278o, this.f5279p}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
        paint2.setShader(linearGradient);
        this.f5273j.setAntiAlias(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final float mo6342b() {
        return (Math.max(this.f5267c, this.f5266b + ((float) this.f5270g) + ((this.f5267c * 1.5f) / 2.0f)) * 2.0f) + (((this.f5267c * 1.5f) + ((float) this.f5270g)) * 2.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6340a(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6339a(ColorStateList colorStateList) {
        m6682b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo6343b(float f) {
        m6679a(f, this.f5267c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo6344c(float f) {
        m6679a(this.f5268d, f);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5277n = true;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5271h.setColorFilter(colorFilter);
    }

    /* renamed from: d */
    private static int m6685d(float f) {
        int i = (int) (f + 0.5f);
        if (i % 2 == 1) {
            return i - 1;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6341a(boolean z) {
        this.f5280q = z;
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.f5271h.setAlpha(i);
        this.f5272i.setAlpha(i);
        this.f5273j.setAlpha(i);
    }

    /* renamed from: b */
    private void m6682b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f5269e = colorStateList;
        this.f5271h.setColor(this.f5269e.getColorForState(getState(), this.f5269e.getDefaultColor()));
    }

    public final void draw(Canvas canvas) {
        if (this.f5277n) {
            m6683b(getBounds());
            this.f5277n = false;
        }
        canvas.translate(0.0f, this.f5268d / 2.0f);
        m6680a(canvas);
        canvas.translate(0.0f, (-this.f5268d) / 2.0f);
        f5264a.mo6353a(canvas, this.f5274k, this.f5266b, this.f5271h);
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m6678a(this.f5267c, this.f5266b, this.f5280q));
        int ceil2 = (int) Math.ceil((double) m6681b(this.f5267c, this.f5266b, this.f5280q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        int colorForState = this.f5269e.getColorForState(iArr, this.f5269e.getDefaultColor());
        if (this.f5271h.getColor() == colorForState) {
            return false;
        }
        this.f5271h.setColor(colorForState);
        this.f5277n = true;
        invalidateSelf();
        return true;
    }

    /* renamed from: b */
    private void m6683b(Rect rect) {
        float f = this.f5267c * 1.5f;
        this.f5274k.set(((float) rect.left) + this.f5267c, ((float) rect.top) + f, ((float) rect.right) - this.f5267c, ((float) rect.bottom) - f);
        m6684c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6338a(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f5266b != f2) {
                this.f5266b = f2;
                this.f5277n = true;
                invalidateSelf();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid radius ");
        sb.append(f);
        sb.append(". Must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private void m6680a(Canvas canvas) {
        boolean z;
        boolean z2;
        float f = (-this.f5266b) - this.f5276m;
        float f2 = this.f5266b + ((float) this.f5270g) + (this.f5268d / 2.0f);
        float f3 = f2 * 2.0f;
        if (this.f5274k.width() - f3 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.f5274k.height() - f3 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        int save = canvas.save();
        canvas.translate(this.f5274k.left + f2, this.f5274k.top + f2);
        canvas.drawPath(this.f5275l, this.f5272i);
        if (z) {
            canvas.drawRect(0.0f, f, this.f5274k.width() - f3, -this.f5266b, this.f5273j);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        canvas.translate(this.f5274k.right - f2, this.f5274k.bottom - f2);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f5275l, this.f5272i);
        if (z) {
            canvas.drawRect(0.0f, f, this.f5274k.width() - f3, (-this.f5266b) + this.f5276m, this.f5273j);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.f5274k.left + f2, this.f5274k.bottom - f2);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f5275l, this.f5272i);
        if (z2) {
            canvas.drawRect(0.0f, f, this.f5274k.height() - f3, -this.f5266b, this.f5273j);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.f5274k.right - f2, this.f5274k.top + f2);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f5275l, this.f5272i);
        if (z2) {
            canvas.drawRect(0.0f, f, this.f5274k.height() - f3, -this.f5266b, this.f5273j);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: a */
    private void m6679a(float f, float f2) {
        if (f < 0.0f) {
            StringBuilder sb = new StringBuilder("Invalid shadow size ");
            sb.append(f);
            sb.append(". Must be >= 0");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 >= 0.0f) {
            float d = (float) m6685d(f);
            float d2 = (float) m6685d(f2);
            if (d > d2) {
                if (!this.f5281r) {
                    this.f5281r = true;
                }
                d = d2;
            }
            if (this.f5268d != d || this.f5267c != d2) {
                this.f5268d = d;
                this.f5267c = d2;
                this.f5276m = (float) ((int) ((d * 1.5f) + ((float) this.f5270g) + 0.5f));
                this.f5277n = true;
                invalidateSelf();
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Invalid max shadow size ");
            sb2.append(f2);
            sb2.append(". Must be >= 0");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    static float m6678a(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = 1.0d - f5265f;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    /* renamed from: b */
    static float m6681b(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - f5265f;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    C1351am(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f5278o = resources.getColor(R.color.h1);
        this.f5279p = resources.getColor(R.color.h0);
        this.f5270g = resources.getDimensionPixelSize(R.dimen.ct);
        this.f5271h = new Paint(5);
        m6682b(colorStateList);
        this.f5272i = new Paint(5);
        this.f5272i.setStyle(Style.FILL);
        this.f5266b = (float) ((int) (f + 0.5f));
        this.f5274k = new RectF();
        this.f5273j = new Paint(this.f5272i);
        this.f5273j.setAntiAlias(false);
        m6679a(f2, f3);
    }
}
