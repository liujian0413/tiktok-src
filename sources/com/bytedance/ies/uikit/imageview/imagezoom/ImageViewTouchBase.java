package com.bytedance.ies.uikit.imageview.imagezoom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.ies.uikit.imageview.imagezoom.p579a.C11039a;
import com.bytedance.ies.uikit.imageview.imagezoom.p579a.C11040b;
import com.bytedance.ies.uikit.imageview.imagezoom.p580b.C11041a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;

public class ImageViewTouchBase extends ImageView {

    /* renamed from: A */
    protected boolean f29935A = false;

    /* renamed from: B */
    protected final float f29936B = 2.5f;

    /* renamed from: C */
    protected final int f29937C = C34943c.f91127w;

    /* renamed from: D */
    protected RectF f29938D = new RectF();

    /* renamed from: E */
    protected RectF f29939E = new RectF();

    /* renamed from: F */
    protected RectF f29940F = new RectF();

    /* renamed from: G */
    protected boolean f29941G;

    /* renamed from: a */
    private C11038a f29942a;

    /* renamed from: o */
    protected C11040b f29943o = new C11039a();

    /* renamed from: p */
    protected Matrix f29944p = new Matrix();

    /* renamed from: q */
    protected Matrix f29945q = new Matrix();

    /* renamed from: r */
    protected Handler f29946r = new Handler();

    /* renamed from: s */
    protected Runnable f29947s = null;

    /* renamed from: t */
    protected float f29948t;

    /* renamed from: u */
    protected float f29949u = -1.0f;

    /* renamed from: v */
    protected final Matrix f29950v = new Matrix();

    /* renamed from: w */
    protected final float[] f29951w = new float[9];

    /* renamed from: x */
    protected int f29952x = -1;

    /* renamed from: y */
    protected int f29953y = -1;

    /* renamed from: z */
    protected boolean f29954z = false;

    /* renamed from: com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouchBase$a */
    public interface C11038a {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26652a(float f) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26653a(Drawable drawable) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26657b(float f) {
    }

    public float getRotation() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26651a() {
        setScaleType(ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26654a(Drawable drawable, boolean z, Matrix matrix, float f) {
        if (drawable != null) {
            if (this.f29954z) {
                float[] fArr = new float[1];
                m32346a(drawable, this.f29944p, fArr);
                setMinZoom(fArr[0]);
            } else if (this.f29935A) {
                m32349b(drawable, this.f29944p);
                setMinZoom(m32351c(this.f29944p));
            } else {
                m32345a(drawable, this.f29944p);
                setMinZoom(getMinZoom());
            }
            super.setImageDrawable(drawable);
        } else {
            this.f29944p.reset();
            super.setImageDrawable(null);
        }
        if (z) {
            this.f29945q.reset();
            if (matrix != null) {
                this.f29945q = new Matrix(matrix);
            }
        }
        setImageMatrix(getImageViewMatrix());
        if (f < 1.0f) {
            this.f29948t = m32350c();
        } else {
            this.f29948t = f;
        }
        mo26653a(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26681a(boolean z, boolean z2) {
        if (getDrawable() != null) {
            RectF a = mo26675a(this.f29945q, true, true);
            if (!(a.left == 0.0f && a.top == 0.0f)) {
                mo26650a(a.left, a.top);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26678a(float f, float f2, float f3) {
        if (f > this.f29948t) {
            f = this.f29948t;
        }
        m32348b(f / getScale(), f2, f3);
        mo26652a(getScale());
        mo26681a(true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26676a(double d, double d2) {
        RectF bitmapRect = getBitmapRect();
        this.f29940F.set((float) d, (float) d2, 0.0f, 0.0f);
        mo26680a(bitmapRect, this.f29940F);
        mo26650a(this.f29940F.left, this.f29940F.top);
        mo26681a(true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26680a(RectF rectF, RectF rectF2) {
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
    public final void mo26677a(float f, float f2, double d) {
        final double d2 = (double) f;
        final double d3 = (double) f2;
        final long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.f29946r;
        C110362 r0 = new Runnable(300.0d) {

            /* renamed from: a */
            double f29960a;

            /* renamed from: b */
            double f29961b;

            public final void run() {
                double min = Math.min(300.0d, (double) (System.currentTimeMillis() - currentTimeMillis));
                double d = min;
                double a = ImageViewTouchBase.this.f29943o.mo26704a(d, 0.0d, d2, 300.0d);
                double a2 = ImageViewTouchBase.this.f29943o.mo26704a(d, 0.0d, d3, 300.0d);
                ImageViewTouchBase.this.mo26676a(a - this.f29960a, a2 - this.f29961b);
                this.f29960a = a;
                this.f29961b = a2;
                if (min < 300.0d) {
                    ImageViewTouchBase.this.f29946r.post(this);
                    return;
                }
                RectF a3 = ImageViewTouchBase.this.mo26675a(ImageViewTouchBase.this.f29945q, true, true);
                if (!(a3.left == 0.0f && a3.top == 0.0f)) {
                    ImageViewTouchBase.this.mo26685c(a3.left, a3.top);
                }
            }
        };
        handler.post(r0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26679a(float f, float f2, float f3, float f4) {
        if (f > getMaxZoom()) {
            f = getMaxZoom();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final float scale = getScale();
        final float f5 = f - scale;
        Matrix matrix = new Matrix(this.f29945q);
        matrix.postScale(f, f, f2, f3);
        RectF a = mo26675a(matrix, true, true);
        final float f6 = f2 + (a.left * f);
        final float f7 = f3 + (a.top * f);
        Handler handler = this.f29946r;
        final float f8 = f4;
        C110373 r0 = new Runnable() {
            public final void run() {
                float min = Math.min(f8, (float) (System.currentTimeMillis() - currentTimeMillis));
                ImageViewTouchBase.this.mo26678a(scale + ((float) ImageViewTouchBase.this.f29943o.mo26705b((double) min, 0.0d, (double) f5, (double) f8)), f6, f7);
                if (min < f8) {
                    ImageViewTouchBase.this.f29946r.post(this);
                } else if (ImageViewTouchBase.this.f29941G) {
                    ImageViewTouchBase.this.f29941G = false;
                } else {
                    ImageViewTouchBase.this.f29941G = true;
                    ImageViewTouchBase.this.mo26657b(ImageViewTouchBase.this.getScale());
                    ImageViewTouchBase.this.mo26681a(true, true);
                }
            }
        };
        handler.post(r0);
    }

    /* renamed from: b */
    public final void mo26682b() {
        m32342a((Bitmap) null, true);
    }

    /* access modifiers changed from: protected */
    public RectF getBitmapRect() {
        return m32347b(this.f29945q);
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.f29945q);
    }

    public Matrix getImageViewMatrix() {
        return m32340a(this.f29945q);
    }

    public float getScale() {
        return m32351c(this.f29945q);
    }

    public float getMinZoom() {
        if (this.f29949u < 0.0f) {
            this.f29949u = 1.0f;
        }
        return this.f29949u;
    }

    public float getMaxZoom() {
        if (this.f29948t < 1.0f) {
            this.f29948t = m32350c();
        }
        return this.f29948t;
    }

    /* renamed from: c */
    private float m32350c() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return 1.0f;
        }
        return Math.max(((float) drawable.getIntrinsicWidth()) / ((float) this.f29952x), ((float) drawable.getIntrinsicHeight()) / ((float) this.f29953y)) * 4.0f;
    }

    public void setMinZoom(float f) {
        this.f29949u = f;
    }

    public void setOnBitmapChangedListener(C11038a aVar) {
        this.f29942a = aVar;
    }

    /* renamed from: c */
    private float m32351c(Matrix matrix) {
        return m32339a(matrix, 0);
    }

    public void setImageBitmap(Bitmap bitmap) {
        m32342a(bitmap, true);
    }

    public void setImageDrawable(Drawable drawable) {
        mo26684b(drawable, true, null, -1.0f);
    }

    public void setFitToScreen(boolean z) {
        if (z != this.f29935A) {
            this.f29935A = z;
            requestLayout();
        }
    }

    public void setFitToWidth(boolean z) {
        if (z != this.f29954z) {
            this.f29954z = z;
            requestLayout();
        }
    }

    public void setImageResource(int i) {
        setImageDrawable(getContext().getResources().getDrawable(i));
    }

    /* renamed from: a */
    private Matrix m32340a(Matrix matrix) {
        this.f29950v.set(this.f29944p);
        this.f29950v.postConcat(matrix);
        return this.f29950v;
    }

    /* renamed from: c */
    private void m32352c(float f) {
        mo26678a(f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    /* renamed from: b */
    private RectF m32347b(Matrix matrix) {
        Drawable drawable = getDrawable();
        Matrix a = m32340a(matrix);
        if (drawable != null) {
            this.f29938D.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        } else {
            this.f29938D.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        a.mapRect(this.f29938D);
        return this.f29938D;
    }

    public ImageViewTouchBase(Context context) {
        super(context);
        mo26651a();
    }

    /* renamed from: a */
    private void m32342a(Bitmap bitmap, boolean z) {
        m32343a(bitmap, true, (Matrix) null);
    }

    /* renamed from: a */
    private float m32339a(Matrix matrix, int i) {
        matrix.getValues(this.f29951w);
        return this.f29951w[0];
    }

    /* renamed from: c */
    public final void mo26685c(float f, float f2) {
        mo26676a((double) f, (double) f2);
    }

    /* renamed from: b */
    public final void mo26683b(float f, float f2) {
        mo26679a(f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, f2);
    }

    /* renamed from: a */
    private void mo26650a(float f, float f2) {
        this.f29945q.postTranslate(f, f2);
        setImageMatrix(getImageViewMatrix());
    }

    /* renamed from: b */
    private void m32349b(Drawable drawable, Matrix matrix) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        matrix.reset();
        float min = Math.min(Math.min(width / intrinsicWidth, 2.5f), Math.min(height / intrinsicHeight, 2.5f));
        matrix.postScale(min, min);
        matrix.postTranslate((width - (intrinsicWidth * min)) / 2.0f, (height - (intrinsicHeight * min)) / 2.0f);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo26651a();
    }

    /* renamed from: a */
    private void m32345a(Drawable drawable, Matrix matrix) {
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
    private void m32348b(float f, float f2, float f3) {
        this.f29945q.postScale(f, f, f2, f3);
        setImageMatrix(getImageViewMatrix());
    }

    /* renamed from: a */
    private void m32343a(Bitmap bitmap, boolean z, Matrix matrix) {
        m32344a(bitmap, z, (Matrix) null, -1.0f);
    }

    /* renamed from: a */
    private void m32346a(Drawable drawable, Matrix matrix, float[] fArr) {
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

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.RectF mo26675a(android.graphics.Matrix r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.getDrawable()
            r1 = 0
            if (r0 != 0) goto L_0x000d
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r1, r1, r1, r1)
            return r6
        L_0x000d:
            android.graphics.RectF r0 = r5.f29939E
            r0.set(r1, r1, r1, r1)
            android.graphics.RectF r6 = r5.m32347b(r6)
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
            android.graphics.RectF r7 = r5.f29939E
            r7.set(r6, r8, r1, r1)
            android.graphics.RectF r6 = r5.f29939E
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouchBase.mo26675a(android.graphics.Matrix, boolean, boolean):android.graphics.RectF");
    }

    /* renamed from: a */
    private void m32344a(Bitmap bitmap, boolean z, Matrix matrix, float f) {
        if (bitmap != null) {
            mo26684b(new C11041a(bitmap), z, matrix, -1.0f);
        } else {
            mo26684b(null, z, matrix, -1.0f);
        }
    }

    /* renamed from: b */
    public final void mo26684b(Drawable drawable, boolean z, Matrix matrix, float f) {
        if (getWidth() <= 0) {
            final Drawable drawable2 = drawable;
            final boolean z2 = z;
            final Matrix matrix2 = matrix;
            final float f2 = f;
            C110351 r1 = new Runnable() {
                public final void run() {
                    ImageViewTouchBase.this.mo26684b(drawable2, z2, matrix2, f2);
                }
            };
            this.f29947s = r1;
            return;
        }
        mo26654a(drawable, z, matrix, f);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f29952x = i3 - i;
        this.f29953y = i4 - i2;
        Runnable runnable = this.f29947s;
        if (runnable != null) {
            this.f29947s = null;
            runnable.run();
        }
        if (getDrawable() != null) {
            float f = 1.0f;
            if (this.f29954z) {
                float[] fArr = new float[1];
                m32346a(getDrawable(), this.f29944p, fArr);
                setMinZoom(fArr[0]);
            } else if (this.f29935A) {
                m32349b(getDrawable(), this.f29944p);
                setMinZoom(1.0f);
                f = getMinZoom();
            } else {
                m32345a(getDrawable(), this.f29944p);
                setMinZoom(getMinZoom());
                f = getMinZoom();
            }
            setImageMatrix(getImageViewMatrix());
            m32352c(f);
        }
    }
}
