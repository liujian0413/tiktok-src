package com.soundcloud.android.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

abstract class ImageViewTouchBase extends ImageView {

    /* renamed from: a */
    private final Matrix f50587a = new Matrix();

    /* renamed from: b */
    private final float[] f50588b = new float[9];

    /* renamed from: c */
    private Runnable f50589c;

    /* renamed from: d */
    protected Matrix f50590d = new Matrix();

    /* renamed from: e */
    protected Matrix f50591e = new Matrix();

    /* renamed from: f */
    protected final C18744d f50592f = new C18744d(null, 0);

    /* renamed from: g */
    int f50593g = -1;

    /* renamed from: h */
    int f50594h = -1;

    /* renamed from: i */
    float f50595i;

    /* renamed from: j */
    protected Handler f50596j = new Handler();

    /* renamed from: k */
    private C18734a f50597k;

    /* renamed from: com.soundcloud.android.crop.ImageViewTouchBase$a */
    public interface C18734a {
        /* renamed from: a */
        void mo49234a(Bitmap bitmap);
    }

    /* renamed from: a */
    public void mo49247a(Bitmap bitmap, boolean z) {
        mo49249a(new C18744d(bitmap, 0), z);
    }

    /* renamed from: a */
    public void mo49249a(final C18744d dVar, final boolean z) {
        if (getWidth() <= 0) {
            this.f50589c = new Runnable() {
                public final void run() {
                    ImageViewTouchBase.this.mo49249a(dVar, z);
                }
            };
            return;
        }
        if (dVar.f50641a != null) {
            m61336a(dVar, this.f50590d, true);
            m61335a(dVar.f50641a, dVar.f50642b);
        } else {
            this.f50590d.reset();
            setImageBitmap(null);
        }
        if (z) {
            this.f50591e.reset();
        }
        setImageMatrix(getImageViewMatrix());
        this.f50595i = m61339d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49258a(float f, float f2, float f3, float f4) {
        final float scale = (f - getScale()) / 300.0f;
        final float scale2 = getScale();
        final long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.f50596j;
        final float f5 = f2;
        final float f6 = f3;
        C187332 r0 = new Runnable(300.0f) {
            public final void run() {
                float min = Math.min(300.0f, (float) (System.currentTimeMillis() - currentTimeMillis));
                ImageViewTouchBase.this.mo49246a(scale2 + (scale * min), f5, f6);
                if (min < 300.0f) {
                    ImageViewTouchBase.this.f50596j.post(this);
                }
            }
        };
        handler.post(r0);
    }

    /* renamed from: c */
    private void m61338c() {
        setScaleType(ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    public float getScale() {
        return m61331a(this.f50591e);
    }

    /* access modifiers changed from: protected */
    public Matrix getImageViewMatrix() {
        this.f50587a.set(this.f50590d);
        this.f50587a.postConcat(this.f50591e);
        return this.f50587a;
    }

    public Matrix getUnrotatedMatrix() {
        Matrix matrix = new Matrix();
        m61336a(this.f50592f, matrix, false);
        matrix.postConcat(this.f50591e);
        return matrix;
    }

    /* renamed from: d */
    private float m61339d() {
        if (this.f50592f.f50641a == null) {
            return 1.0f;
        }
        return Math.max(((float) this.f50592f.mo49281c()) / ((float) this.f50593g), ((float) this.f50592f.mo49280b()) / ((float) this.f50594h)) * 4.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo49259b() {
        Bitmap bitmap = this.f50592f.f50641a;
        if (bitmap != null) {
            Matrix imageViewMatrix = getImageViewMatrix();
            RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
            imageViewMatrix.mapRect(rectF);
            float height = rectF.height();
            float width = rectF.width();
            mo49245a(m61337b(rectF, width, 0.0f), m61333a(rectF, height, 0.0f));
            setImageMatrix(getImageViewMatrix());
        }
    }

    /* renamed from: a */
    public void mo49244a() {
        mo49247a((Bitmap) null, true);
    }

    public void setRecycler(C18734a aVar) {
        this.f50597k = aVar;
    }

    /* renamed from: a */
    private float m61331a(Matrix matrix) {
        return m61332a(matrix, 0);
    }

    public void setImageBitmap(Bitmap bitmap) {
        m61335a(bitmap, 0);
    }

    /* renamed from: a */
    private void m61334a(float f) {
        mo49246a(1.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    public ImageViewTouchBase(Context context) {
        super(context);
        m61338c();
    }

    /* renamed from: a */
    private float m61332a(Matrix matrix, int i) {
        matrix.getValues(this.f50588b);
        return this.f50588b[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo49260b(float f, float f2) {
        mo49245a(f, f2);
        setImageMatrix(getImageViewMatrix());
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4 || !keyEvent.isTracking() || keyEvent.isCanceled() || getScale() <= 1.0f) {
            return super.onKeyUp(i, keyEvent);
        }
        m61334a(1.0f);
        return true;
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m61338c();
    }

    /* renamed from: a */
    private void m61335a(Bitmap bitmap, int i) {
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
        }
        Bitmap bitmap2 = this.f50592f.f50641a;
        this.f50592f.f50641a = bitmap;
        this.f50592f.f50642b = i;
        if (bitmap2 != null && bitmap2 != bitmap && this.f50597k != null) {
            this.f50597k.mo49234a(bitmap2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo49245a(float f, float f2) {
        this.f50591e.postTranslate(f, f2);
    }

    /* renamed from: a */
    private float m61333a(RectF rectF, float f, float f2) {
        float height = (float) getHeight();
        if (f < height) {
            return ((height - f) / 2.0f) - rectF.top;
        }
        if (rectF.top > 0.0f) {
            return -rectF.top;
        }
        if (rectF.bottom < height) {
            return ((float) getHeight()) - rectF.bottom;
        }
        return f2;
    }

    /* renamed from: b */
    private float m61337b(RectF rectF, float f, float f2) {
        float width = (float) getWidth();
        if (f < width) {
            return ((width - f) / 2.0f) - rectF.left;
        }
        if (rectF.left > 0.0f) {
            return -rectF.left;
        }
        if (rectF.right < width) {
            return width - rectF.right;
        }
        return f2;
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m61338c();
    }

    /* renamed from: a */
    private void m61336a(C18744d dVar, Matrix matrix, boolean z) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float c = (float) dVar.mo49281c();
        float b = (float) dVar.mo49280b();
        matrix.reset();
        float min = Math.min(Math.min(width / c, 3.0f), Math.min(height / b, 3.0f));
        if (z) {
            matrix.postConcat(dVar.mo49279a());
        }
        matrix.postScale(min, min);
        matrix.postTranslate((width - (c * min)) / 2.0f, (height - (b * min)) / 2.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo49246a(float f, float f2, float f3) {
        if (f > this.f50595i) {
            f = this.f50595i;
        }
        float scale = f / getScale();
        this.f50591e.postScale(scale, scale, f2, f3);
        setImageMatrix(getImageViewMatrix());
        mo49259b();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f50593g = i3 - i;
        this.f50594h = i4 - i2;
        Runnable runnable = this.f50589c;
        if (runnable != null) {
            this.f50589c = null;
            runnable.run();
        }
        if (this.f50592f.f50641a != null) {
            m61336a(this.f50592f, this.f50590d, true);
            setImageMatrix(getImageViewMatrix());
        }
    }
}
