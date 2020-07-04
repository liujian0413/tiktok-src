package com.bytedance.android.live.uikit.p170a.p171a;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.ImageView;
import com.bytedance.android.live.uikit.p170a.p171a.p172a.C3503a;
import com.bytedance.android.live.uikit.p170a.p171a.p173b.C3509a;

/* renamed from: com.bytedance.android.live.uikit.a.a.b */
public class C3504b extends ImageView {

    /* renamed from: A */
    protected RectF f10327A;

    /* renamed from: B */
    protected boolean f10328B;

    /* renamed from: a */
    private C3508a f10329a;

    /* renamed from: l */
    protected C3503a f10330l;

    /* renamed from: m */
    protected Matrix f10331m;

    /* renamed from: n */
    protected Matrix f10332n;

    /* renamed from: o */
    protected Handler f10333o;

    /* renamed from: p */
    protected Runnable f10334p;

    /* renamed from: q */
    protected float f10335q;

    /* renamed from: r */
    protected float f10336r;

    /* renamed from: s */
    protected final Matrix f10337s;

    /* renamed from: t */
    protected final float[] f10338t;

    /* renamed from: u */
    protected int f10339u;

    /* renamed from: v */
    protected int f10340v;

    /* renamed from: w */
    protected boolean f10341w;

    /* renamed from: x */
    protected boolean f10342x;

    /* renamed from: y */
    protected RectF f10343y;

    /* renamed from: z */
    protected RectF f10344z;

    /* renamed from: com.bytedance.android.live.uikit.a.a.b$a */
    public interface C3508a {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10533a(float f) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10534a(Drawable drawable) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10538b(float f) {
    }

    public float getRotation() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10535a(Drawable drawable, boolean z, Matrix matrix, float f) {
        if (drawable != null) {
            if (this.f10341w) {
                float[] fArr = new float[1];
                m12911a(drawable, this.f10331m, fArr);
                setMinZoom(fArr[0]);
            } else if (this.f10342x) {
                m12914b(drawable, this.f10331m);
                setMinZoom(m12915c(this.f10331m));
            } else {
                m12910a(drawable, this.f10331m);
                setMinZoom(getMinZoom());
            }
            super.setImageDrawable(drawable);
        } else {
            this.f10331m.reset();
            super.setImageDrawable(null);
        }
        if (z) {
            this.f10332n.reset();
            if (matrix != null) {
                this.f10332n = new Matrix(matrix);
            }
        }
        setImageMatrix(getImageViewMatrix());
        if (f < 1.0f) {
            this.f10335q = m12903a();
        } else {
            this.f10335q = f;
        }
        mo10534a(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10563a(boolean z, boolean z2) {
        if (getDrawable() != null) {
            RectF a = mo10557a(this.f10332n, true, true);
            if (!(a.left == 0.0f && a.top == 0.0f)) {
                mo10532a(a.left, a.top);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.RectF mo10557a(android.graphics.Matrix r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.getDrawable()
            r1 = 0
            if (r0 != 0) goto L_0x000d
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r1, r1, r1, r1)
            return r6
        L_0x000d:
            android.graphics.RectF r0 = r5.f10344z
            r0.set(r1, r1, r1, r1)
            android.graphics.RectF r6 = r5.m12912b(r6)
            float r0 = r6.height()
            float r2 = r6.width()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x004a
            int r8 = r5.getHeight()
            float r8 = (float) r8
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0031
            float r8 = r8 - r0
            float r8 = r8 / r3
            float r0 = r6.top
            float r8 = r8 - r0
            goto L_0x004b
        L_0x0031:
            float r0 = r6.top
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            float r8 = r6.top
            float r8 = -r8
            goto L_0x004b
        L_0x003b:
            float r0 = r6.bottom
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x004a
            int r8 = r5.getHeight()
            float r8 = (float) r8
            float r0 = r6.bottom
            float r8 = r8 - r0
            goto L_0x004b
        L_0x004a:
            r8 = 0
        L_0x004b:
            if (r7 == 0) goto L_0x0072
            int r7 = r5.getWidth()
            float r7 = (float) r7
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
            float r7 = r7 - r2
            float r7 = r7 / r3
            float r6 = r6.left
            float r6 = r7 - r6
            goto L_0x0073
        L_0x005d:
            float r0 = r6.left
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
            float r6 = r6.left
            float r6 = -r6
            goto L_0x0073
        L_0x0067:
            float r0 = r6.right
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0072
            float r6 = r6.right
            float r6 = r7 - r6
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            android.graphics.RectF r7 = r5.f10344z
            r7.set(r6, r8, r1, r1)
            android.graphics.RectF r6 = r5.f10344z
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.p170a.p171a.C3504b.mo10557a(android.graphics.Matrix, boolean, boolean):android.graphics.RectF");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10560a(float f, float f2, float f3) {
        if (f > this.f10335q) {
            f = this.f10335q;
        }
        m12913b(f / getScale(), f2, f3);
        mo10533a(getScale());
        mo10563a(true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10558a(double d, double d2) {
        RectF bitmapRect = getBitmapRect();
        this.f10327A.set((float) d, (float) d2, 0.0f, 0.0f);
        mo10562a(bitmapRect, this.f10327A);
        mo10532a(this.f10327A.left, this.f10327A.top);
        mo10563a(true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10562a(RectF rectF, RectF rectF2) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        if (rectF.top >= 0.0f && rectF.bottom <= height) {
            rectF2.top = 0.0f;
        }
        if (rectF.left >= 0.0f && rectF.right <= width) {
            rectF2.left = 0.0f;
        }
        if (rectF.top + rectF2.top >= 0.0f && rectF.bottom > height) {
            rectF2.top = (float) ((int) (0.0f - rectF.top));
        }
        float f = height - 0.0f;
        if (rectF.bottom + rectF2.top <= f && rectF.top < 0.0f) {
            rectF2.top = (float) ((int) (f - rectF.bottom));
        }
        if (rectF.left + rectF2.left >= 0.0f) {
            rectF2.left = (float) ((int) (0.0f - rectF.left));
        }
        float f2 = width - 0.0f;
        if (rectF.right + rectF2.left <= f2) {
            rectF2.left = (float) ((int) (f2 - rectF.right));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10559a(float f, float f2, double d) {
        final double d2 = (double) f;
        final double d3 = (double) f2;
        final long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.f10333o;
        C35062 r0 = new Runnable(300.0d) {

            /* renamed from: a */
            double f10350a;

            /* renamed from: b */
            double f10351b;

            public final void run() {
                double min = Math.min(300.0d, (double) (System.currentTimeMillis() - currentTimeMillis));
                double d = min;
                double a = C3504b.this.f10330l.mo10555a(d, 0.0d, d2, 300.0d);
                double a2 = C3504b.this.f10330l.mo10555a(d, 0.0d, d3, 300.0d);
                C3504b.this.mo10558a(a - this.f10350a, a2 - this.f10351b);
                this.f10350a = a;
                this.f10351b = a2;
                if (min < 300.0d) {
                    C3504b.this.f10333o.post(this);
                    return;
                }
                RectF a3 = C3504b.this.mo10557a(C3504b.this.f10332n, true, true);
                if (!(a3.left == 0.0f && a3.top == 0.0f)) {
                    C3504b.this.mo10566c(a3.left, a3.top);
                }
            }
        };
        handler.post(r0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10561a(float f, float f2, float f3, float f4) {
        if (f > getMaxZoom()) {
            f = getMaxZoom();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final float scale = getScale();
        final float f5 = f - scale;
        Matrix matrix = new Matrix(this.f10332n);
        matrix.postScale(f, f, f2, f3);
        RectF a = mo10557a(matrix, true, true);
        final float f6 = f2 + (a.left * f);
        final float f7 = f3 + (a.top * f);
        Handler handler = this.f10333o;
        final float f8 = f4;
        C35073 r0 = new Runnable() {
            public final void run() {
                float min = Math.min(f8, (float) (System.currentTimeMillis() - currentTimeMillis));
                C3504b.this.mo10560a(scale + ((float) C3504b.this.f10330l.mo10556b((double) min, 0.0d, (double) f5, (double) f8)), f6, f7);
                if (min < f8) {
                    C3504b.this.f10333o.post(this);
                } else if (C3504b.this.f10328B) {
                    C3504b.this.f10328B = false;
                } else {
                    C3504b.this.f10328B = true;
                    C3504b.this.mo10538b(C3504b.this.getScale());
                    C3504b.this.mo10563a(true, true);
                }
            }
        };
        handler.post(r0);
    }

    /* access modifiers changed from: protected */
    public RectF getBitmapRect() {
        return m12912b(this.f10332n);
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.f10332n);
    }

    public Matrix getImageViewMatrix() {
        return m12905a(this.f10332n);
    }

    public float getScale() {
        return m12915c(this.f10332n);
    }

    public float getMinZoom() {
        if (this.f10336r < 0.0f) {
            this.f10336r = 1.0f;
        }
        return this.f10336r;
    }

    public float getMaxZoom() {
        if (this.f10335q < 1.0f) {
            this.f10335q = m12903a();
        }
        return this.f10335q;
    }

    /* renamed from: a */
    private float m12903a() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return 1.0f;
        }
        return Math.max(((float) drawable.getIntrinsicWidth()) / ((float) this.f10339u), ((float) drawable.getIntrinsicHeight()) / ((float) this.f10340v)) * 4.0f;
    }

    public void setMinZoom(float f) {
        this.f10336r = f;
    }

    public void setOnBitmapChangedListener(C3508a aVar) {
        this.f10329a = aVar;
    }

    /* renamed from: c */
    private float m12915c(Matrix matrix) {
        return m12904a(matrix, 0);
    }

    public void setImageBitmap(Bitmap bitmap) {
        m12907a(bitmap, true);
    }

    public void setImageDrawable(Drawable drawable) {
        mo10565b(drawable, true, null, -1.0f);
    }

    public void setFitToScreen(boolean z) {
        if (z != this.f10342x) {
            this.f10342x = z;
            requestLayout();
        }
    }

    public void setFitToWidth(boolean z) {
        if (z != this.f10341w) {
            this.f10341w = z;
            requestLayout();
        }
    }

    public void setImageResource(int i) {
        setImageDrawable(getContext().getResources().getDrawable(i));
    }

    /* renamed from: a */
    private Matrix m12905a(Matrix matrix) {
        this.f10337s.set(this.f10331m);
        this.f10337s.postConcat(matrix);
        return this.f10337s;
    }

    /* renamed from: c */
    private void m12916c(float f) {
        mo10560a(f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    /* renamed from: b */
    private RectF m12912b(Matrix matrix) {
        Drawable drawable = getDrawable();
        Matrix a = m12905a(matrix);
        if (drawable != null) {
            this.f10343y.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        } else {
            this.f10343y.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        a.mapRect(this.f10343y);
        return this.f10343y;
    }

    /* renamed from: a */
    private void m12907a(Bitmap bitmap, boolean z) {
        m12908a(bitmap, true, (Matrix) null);
    }

    /* renamed from: a */
    private float m12904a(Matrix matrix, int i) {
        matrix.getValues(this.f10338t);
        return this.f10338t[0];
    }

    /* renamed from: c */
    public final void mo10566c(float f, float f2) {
        mo10558a((double) f, (double) f2);
    }

    /* renamed from: b */
    public final void mo10564b(float f, float f2) {
        mo10561a(f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, 50.0f);
    }

    /* renamed from: a */
    private void mo10532a(float f, float f2) {
        this.f10332n.postTranslate(f, f2);
        setImageMatrix(getImageViewMatrix());
    }

    /* renamed from: b */
    private void m12914b(Drawable drawable, Matrix matrix) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        matrix.reset();
        float min = Math.min(Math.min(width / intrinsicWidth, 2.5f), Math.min(height / intrinsicHeight, 2.5f));
        matrix.postScale(min, min);
        matrix.postTranslate((width - (intrinsicWidth * min)) / 2.0f, (height - (intrinsicHeight * min)) / 2.0f);
    }

    /* renamed from: a */
    private void m12910a(Drawable drawable, Matrix matrix) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        matrix.reset();
        if (intrinsicWidth > width || intrinsicHeight > height) {
            float min = Math.min(Math.min(width / intrinsicWidth, 2.0f), Math.min(height / intrinsicHeight, 2.0f));
            matrix.postScale(min, min);
            matrix.postTranslate((width - (intrinsicWidth * min)) / 2.0f, (height - (intrinsicHeight * min)) / 2.0f);
            return;
        }
        matrix.postTranslate((width - intrinsicWidth) / 2.0f, (height - intrinsicHeight) / 2.0f);
    }

    /* renamed from: b */
    private void m12913b(float f, float f2, float f3) {
        this.f10332n.postScale(f, f, f2, f3);
        setImageMatrix(getImageViewMatrix());
    }

    /* renamed from: a */
    private void m12908a(Bitmap bitmap, boolean z, Matrix matrix) {
        m12909a(bitmap, z, (Matrix) null, -1.0f);
    }

    /* renamed from: a */
    private void m12911a(Drawable drawable, Matrix matrix, float[] fArr) {
        float width = (float) getWidth();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        matrix.reset();
        float min = Math.min(width / intrinsicWidth, 2.5f);
        matrix.postScale(min, min);
        matrix.postTranslate((width - (intrinsicWidth * min)) / 2.0f, 0.0f);
        if (min > 1.0f) {
            fArr[0] = 1.0f / min;
        } else {
            fArr[0] = 1.0f;
        }
    }

    /* renamed from: b */
    public final void mo10565b(Drawable drawable, boolean z, Matrix matrix, float f) {
        if (getWidth() <= 0) {
            final Drawable drawable2 = drawable;
            final boolean z2 = z;
            final Matrix matrix2 = matrix;
            final float f2 = f;
            C35051 r1 = new Runnable() {
                public final void run() {
                    C3504b.this.mo10565b(drawable2, z2, matrix2, f2);
                }
            };
            this.f10334p = r1;
            return;
        }
        mo10535a(drawable, z, matrix, f);
    }

    /* renamed from: a */
    private void m12909a(Bitmap bitmap, boolean z, Matrix matrix, float f) {
        if (bitmap != null) {
            mo10565b(new C3509a(bitmap), z, matrix, -1.0f);
        } else {
            mo10565b(null, z, matrix, -1.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f10339u = i3 - i;
        this.f10340v = i4 - i2;
        Runnable runnable = this.f10334p;
        if (runnable != null) {
            this.f10334p = null;
            runnable.run();
        }
        if (getDrawable() != null) {
            float f = 1.0f;
            if (this.f10341w) {
                float[] fArr = new float[1];
                m12911a(getDrawable(), this.f10331m, fArr);
                setMinZoom(fArr[0]);
            } else if (this.f10342x) {
                m12914b(getDrawable(), this.f10331m);
                setMinZoom(1.0f);
                f = getMinZoom();
            } else {
                m12910a(getDrawable(), this.f10331m);
                setMinZoom(getMinZoom());
                f = getMinZoom();
            }
            setImageMatrix(getImageViewMatrix());
            m12916c(f);
        }
    }
}
