package android.support.p022v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v4.graphics.drawable.b */
public abstract class C0728b extends Drawable {

    /* renamed from: a */
    public final Bitmap f2745a;

    /* renamed from: b */
    public int f2746b = 119;

    /* renamed from: c */
    public final Paint f2747c = new Paint(3);

    /* renamed from: d */
    public float f2748d;

    /* renamed from: e */
    final Rect f2749e = new Rect();

    /* renamed from: f */
    public boolean f2750f;

    /* renamed from: g */
    private int f2751g = 160;

    /* renamed from: h */
    private final BitmapShader f2752h;

    /* renamed from: i */
    private final Matrix f2753i = new Matrix();

    /* renamed from: j */
    private final RectF f2754j = new RectF();

    /* renamed from: k */
    private boolean f2755k = true;

    /* renamed from: l */
    private int f2756l;

    /* renamed from: m */
    private int f2757m;

    /* renamed from: b */
    private static boolean m3120b(float f) {
        return f > 0.05f;
    }

    public int getIntrinsicHeight() {
        return this.f2757m;
    }

    public int getIntrinsicWidth() {
        return this.f2756l;
    }

    public int getAlpha() {
        return this.f2747c.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f2747c.getColorFilter();
    }

    /* renamed from: c */
    private void m3121c() {
        this.f2748d = (float) (Math.min(this.f2757m, this.f2756l) / 2);
    }

    /* renamed from: b */
    private void m3119b() {
        this.f2756l = this.f2745a.getScaledWidth(this.f2751g);
        this.f2757m = this.f2745a.getScaledHeight(this.f2751g);
    }

    public int getOpacity() {
        if (this.f2746b != 119 || this.f2750f) {
            return -3;
        }
        Bitmap bitmap = this.f2745a;
        if (bitmap == null || bitmap.hasAlpha() || this.f2747c.getAlpha() < 255 || m3120b(this.f2748d)) {
            return -3;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2889a() {
        if (this.f2755k) {
            if (this.f2750f) {
                int min = Math.min(this.f2756l, this.f2757m);
                mo2891a(this.f2746b, min, min, getBounds(), this.f2749e);
                int min2 = Math.min(this.f2749e.width(), this.f2749e.height());
                this.f2749e.inset(Math.max(0, (this.f2749e.width() - min2) / 2), Math.max(0, (this.f2749e.height() - min2) / 2));
                this.f2748d = ((float) min2) * 0.5f;
            } else {
                mo2891a(this.f2746b, this.f2756l, this.f2757m, getBounds(), this.f2749e);
            }
            this.f2754j.set(this.f2749e);
            if (this.f2752h != null) {
                this.f2753i.setTranslate(this.f2754j.left, this.f2754j.top);
                this.f2753i.preScale(this.f2754j.width() / ((float) this.f2745a.getWidth()), this.f2754j.height() / ((float) this.f2745a.getHeight()));
                this.f2752h.setLocalMatrix(this.f2753i);
                this.f2747c.setShader(this.f2752h);
            }
            this.f2755k = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f2750f) {
            m3121c();
        }
        this.f2755k = true;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2747c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f2747c.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f2747c.setFilterBitmap(z);
        invalidateSelf();
    }

    public void setAlpha(int i) {
        if (i != this.f2747c.getAlpha()) {
            this.f2747c.setAlpha(i);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo2890a(float f) {
        if (this.f2748d != f) {
            this.f2750f = false;
            if (m3120b(f)) {
                this.f2747c.setShader(this.f2752h);
            } else {
                this.f2747c.setShader(null);
            }
            this.f2748d = f;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f2745a;
        if (bitmap != null) {
            mo2889a();
            if (this.f2747c.getShader() == null) {
                canvas.drawBitmap(bitmap, null, this.f2749e, this.f2747c);
            } else {
                canvas.drawRoundRect(this.f2754j, this.f2748d, this.f2748d, this.f2747c);
            }
        }
    }

    C0728b(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.f2751g = resources.getDisplayMetrics().densityDpi;
        }
        this.f2745a = bitmap;
        if (this.f2745a != null) {
            m3119b();
            Bitmap bitmap2 = this.f2745a;
            TileMode tileMode = TileMode.CLAMP;
            this.f2752h = new BitmapShader(bitmap2, tileMode, tileMode);
            return;
        }
        this.f2757m = -1;
        this.f2756l = -1;
        this.f2752h = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2891a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }
}
