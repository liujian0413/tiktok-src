package android.support.p029v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.al */
final class C1350al extends Drawable {

    /* renamed from: a */
    public float f5253a;

    /* renamed from: b */
    public float f5254b;

    /* renamed from: c */
    public ColorStateList f5255c;

    /* renamed from: d */
    private final Paint f5256d;

    /* renamed from: e */
    private final RectF f5257e;

    /* renamed from: f */
    private final Rect f5258f;

    /* renamed from: g */
    private boolean f5259g;

    /* renamed from: h */
    private boolean f5260h = true;

    /* renamed from: i */
    private PorterDuffColorFilter f5261i;

    /* renamed from: j */
    private ColorStateList f5262j;

    /* renamed from: k */
    private Mode f5263k = Mode.SRC_IN;

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        if ((this.f5262j == null || !this.f5262j.isStateful()) && ((this.f5255c == null || !this.f5255c.isStateful()) && !super.isStateful())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo6326a(ColorStateList colorStateList) {
        m6674b(colorStateList);
        invalidateSelf();
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f5258f, this.f5253a);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m6673a(rect);
    }

    public final void setAlpha(int i) {
        this.f5256d.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5256d.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f5262j = colorStateList;
        this.f5261i = m6672a(this.f5262j, this.f5263k);
        invalidateSelf();
    }

    public final void setTintMode(Mode mode) {
        this.f5263k = mode;
        this.f5261i = m6672a(this.f5262j, this.f5263k);
        invalidateSelf();
    }

    /* renamed from: b */
    private void m6674b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f5255c = colorStateList;
        this.f5256d.setColor(this.f5255c.getColorForState(getState(), this.f5255c.getDefaultColor()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6324a(float f) {
        if (f != this.f5253a) {
            this.f5253a = f;
            m6673a((Rect) null);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f5256d;
        if (this.f5261i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f5261i);
            z = true;
        }
        canvas.drawRoundRect(this.f5257e, this.f5253a, this.f5253a, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        int colorForState = this.f5255c.getColorForState(iArr, this.f5255c.getDefaultColor());
        if (colorForState != this.f5256d.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f5256d.setColor(colorForState);
        }
        if (this.f5262j == null || this.f5263k == null) {
            return z;
        }
        this.f5261i = m6672a(this.f5262j, this.f5263k);
        return true;
    }

    /* renamed from: a */
    private void m6673a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f5257e.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f5258f.set(rect);
        if (this.f5259g) {
            float a = C1351am.m6678a(this.f5254b, this.f5253a, this.f5260h);
            this.f5258f.inset((int) Math.ceil((double) C1351am.m6681b(this.f5254b, this.f5253a, this.f5260h)), (int) Math.ceil((double) a));
            this.f5257e.set(this.f5258f);
        }
    }

    /* renamed from: a */
    private PorterDuffColorFilter m6672a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    C1350al(ColorStateList colorStateList, float f) {
        this.f5253a = f;
        this.f5256d = new Paint(5);
        m6674b(colorStateList);
        this.f5257e = new RectF();
        this.f5258f = new Rect();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6325a(float f, boolean z, boolean z2) {
        if (f != this.f5254b || this.f5259g != z || this.f5260h != z2) {
            this.f5254b = f;
            this.f5259g = z;
            this.f5260h = z2;
            m6673a((Rect) null);
            invalidateSelf();
        }
    }
}
