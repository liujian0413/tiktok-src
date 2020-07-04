package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.p022v4.graphics.C0721a;

/* renamed from: android.support.design.widget.b */
public final class C0383b extends Drawable {

    /* renamed from: a */
    final Paint f1607a;

    /* renamed from: b */
    final Rect f1608b;

    /* renamed from: c */
    final RectF f1609c;

    /* renamed from: d */
    final C0384a f1610d;

    /* renamed from: e */
    float f1611e;

    /* renamed from: f */
    private int f1612f;

    /* renamed from: g */
    private int f1613g;

    /* renamed from: h */
    private int f1614h;

    /* renamed from: i */
    private int f1615i;

    /* renamed from: j */
    private ColorStateList f1616j;

    /* renamed from: k */
    private int f1617k;

    /* renamed from: l */
    private boolean f1618l;

    /* renamed from: m */
    private float f1619m;

    /* renamed from: android.support.design.widget.b$a */
    class C0384a extends ConstantState {

        /* renamed from: a */
        final /* synthetic */ C0383b f1620a;

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return this.f1620a;
        }
    }

    public final ConstantState getConstantState() {
        return this.f1610d;
    }

    public final int getOpacity() {
        if (this.f1611e > 0.0f) {
            return -3;
        }
        return -2;
    }

    public final boolean isStateful() {
        if ((this.f1616j == null || !this.f1616j.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private Shader m1673a() {
        Rect rect = this.f1608b;
        copyBounds(rect);
        float height = this.f1611e / ((float) rect.height());
        LinearGradient linearGradient = new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C0721a.m3064a(this.f1612f, this.f1617k), C0721a.m3064a(this.f1613g, this.f1617k), C0721a.m3064a(C0721a.m3067b(this.f1613g, 0), this.f1617k), C0721a.m3064a(C0721a.m3067b(this.f1615i, 0), this.f1617k), C0721a.m3064a(this.f1615i, this.f1617k), C0721a.m3064a(this.f1614h, this.f1617k)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP);
        return linearGradient;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f1618l = true;
    }

    /* renamed from: a */
    public final void mo1771a(float f) {
        if (f != this.f1619m) {
            this.f1619m = f;
            invalidateSelf();
        }
    }

    public final boolean getPadding(Rect rect) {
        int round = Math.round(this.f1611e);
        rect.set(round, round, round, round);
        return true;
    }

    public final void setAlpha(int i) {
        this.f1607a.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1607a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo1772a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f1617k = colorStateList.getColorForState(getState(), this.f1617k);
        }
        this.f1616j = colorStateList;
        this.f1618l = true;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        if (this.f1616j != null) {
            int colorForState = this.f1616j.getColorForState(iArr, this.f1617k);
            if (colorForState != this.f1617k) {
                this.f1618l = true;
                this.f1617k = colorForState;
            }
        }
        if (this.f1618l) {
            invalidateSelf();
        }
        return this.f1618l;
    }

    public final void draw(Canvas canvas) {
        if (this.f1618l) {
            this.f1607a.setShader(m1673a());
            this.f1618l = false;
        }
        float strokeWidth = this.f1607a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f1609c;
        copyBounds(this.f1608b);
        rectF.set(this.f1608b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f1619m, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f1607a);
        canvas.restore();
    }
}
