package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import com.facebook.common.internal.C13307g;

/* renamed from: com.facebook.drawee.drawable.a */
public class C13405a extends Drawable implements Callback, C13434q, C13435r {

    /* renamed from: a */
    private C13435r f35503a;

    /* renamed from: b */
    private final C13409d f35504b = new C13409d();

    /* renamed from: c */
    private final Drawable[] f35505c;

    /* renamed from: d */
    private final C13408c[] f35506d;

    /* renamed from: e */
    private final Rect f35507e = new Rect();

    /* renamed from: f */
    private boolean f35508f;

    /* renamed from: g */
    private boolean f35509g;

    /* renamed from: h */
    private boolean f35510h;

    /* renamed from: a */
    public final int mo32777a() {
        return this.f35505c.length;
    }

    public int getIntrinsicHeight() {
        int i = -1;
        for (Drawable drawable : this.f35505c) {
            if (drawable != null) {
                i = Math.max(i, drawable.getIntrinsicHeight());
            }
        }
        if (i > 0) {
            return i;
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        int i = -1;
        for (Drawable drawable : this.f35505c) {
            if (drawable != null) {
                i = Math.max(i, drawable.getIntrinsicWidth());
            }
        }
        if (i > 0) {
            return i;
        }
        return -1;
    }

    public int getOpacity() {
        if (this.f35505c.length == 0) {
            return -2;
        }
        int i = -1;
        for (int i2 = 1; i2 < this.f35505c.length; i2++) {
            Drawable drawable = this.f35505c[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
        }
        return i;
    }

    public Drawable mutate() {
        for (Drawable drawable : this.f35505c) {
            if (drawable != null) {
                drawable.mutate();
            }
        }
        this.f35510h = true;
        return this;
    }

    public boolean isStateful() {
        if (!this.f35509g) {
            this.f35508f = false;
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= this.f35505c.length) {
                    break;
                }
                Drawable drawable = this.f35505c[i];
                boolean z2 = this.f35508f;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f35508f = z2 | z;
                i++;
            }
            this.f35509g = true;
        }
        return this.f35508f;
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void setTransformCallback(C13435r rVar) {
        this.f35503a = rVar;
    }

    /* renamed from: c */
    private C13408c mo32812c(final int i) {
        return new C13408c() {
            public final Drawable getDrawable() {
                return C13405a.this.mo32778a(i);
            }

            public final Drawable setDrawable(Drawable drawable) {
                return C13405a.this.mo32779a(i, drawable);
            }
        };
    }

    public void getTransform(Matrix matrix) {
        if (this.f35503a != null) {
            this.f35503a.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    /* renamed from: a */
    public final Drawable mo32778a(int i) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        if (i < this.f35505c.length) {
            z2 = true;
        }
        C13307g.m38943a(z2);
        return this.f35505c[i];
    }

    public void draw(Canvas canvas) {
        for (Drawable drawable : this.f35505c) {
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    public void getRootBounds(RectF rectF) {
        if (this.f35503a != null) {
            this.f35503a.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        for (Drawable drawable : this.f35505c) {
            if (drawable != null) {
                drawable.setBounds(rect);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean z = false;
        for (Drawable drawable : this.f35505c) {
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (Drawable drawable : this.f35505c) {
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
        }
        return z;
    }

    public void setAlpha(int i) {
        this.f35504b.f35517a = i;
        for (Drawable drawable : this.f35505c) {
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f35504b.mo32806a(colorFilter);
        for (Drawable drawable : this.f35505c) {
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        this.f35504b.mo32808a(z);
        for (Drawable drawable : this.f35505c) {
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setFilterBitmap(boolean z) {
        this.f35504b.mo32809b(z);
        for (Drawable drawable : this.f35505c) {
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
        }
    }

    public C13405a(Drawable[] drawableArr) {
        this.f35508f = false;
        this.f35509g = false;
        this.f35510h = false;
        C13307g.m38940a(drawableArr);
        this.f35505c = drawableArr;
        for (Drawable a : this.f35505c) {
            C13410e.m39335a(a, this, this);
        }
        this.f35506d = new C13408c[this.f35505c.length];
    }

    /* renamed from: b */
    public final C13408c mo32780b(int i) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        if (i < this.f35506d.length) {
            z2 = true;
        }
        C13307g.m38943a(z2);
        if (this.f35506d[i] == null) {
            this.f35506d[i] = mo32812c(i);
        }
        return this.f35506d[i];
    }

    public boolean getPadding(Rect rect) {
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f35507e;
        for (Drawable drawable : this.f35505c) {
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
        }
        return true;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void setHotspot(float f, float f2) {
        for (Drawable drawable : this.f35505c) {
            if (drawable != null) {
                drawable.setHotspot(f, f2);
            }
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        for (Drawable drawable : this.f35505c) {
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
        }
        return visible;
    }

    /* renamed from: a */
    public final Drawable mo32779a(int i, Drawable drawable) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        if (i >= this.f35505c.length) {
            z2 = false;
        }
        C13307g.m38943a(z2);
        Drawable drawable2 = this.f35505c[i];
        if (drawable != drawable2) {
            if (drawable != null && this.f35510h) {
                drawable.mutate();
            }
            C13410e.m39335a(this.f35505c[i], null, null);
            C13410e.m39335a(drawable, null, null);
            C13410e.m39337a(drawable, this.f35504b);
            C13410e.m39336a(drawable, (Drawable) this);
            C13410e.m39335a(drawable, this, this);
            this.f35509g = false;
            this.f35505c[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
