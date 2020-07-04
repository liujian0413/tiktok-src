package p1874it.sephiroth.android.library.imagezoom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import p1874it.sephiroth.android.library.easing.C47871a;
import p1874it.sephiroth.android.library.easing.C47872b;
import p1874it.sephiroth.android.library.imagezoom.p1875a.C47882a;

/* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouchBase */
public abstract class ImageViewTouchBase extends ImageView {

    /* renamed from: a */
    private float f122699a;

    /* renamed from: b */
    private float f122700b;

    /* renamed from: c */
    private boolean f122701c;

    /* renamed from: d */
    private boolean f122702d;

    /* renamed from: e */
    private int f122703e;

    /* renamed from: f */
    private int f122704f;

    /* renamed from: g */
    private PointF f122705g;

    /* renamed from: h */
    private boolean f122706h;

    /* renamed from: i */
    private boolean f122707i;

    /* renamed from: j */
    private C47880a f122708j;

    /* renamed from: k */
    private C47881b f122709k;

    /* renamed from: m */
    protected C47872b f122710m;

    /* renamed from: n */
    protected Matrix f122711n;

    /* renamed from: o */
    protected Matrix f122712o;

    /* renamed from: p */
    protected Matrix f122713p;

    /* renamed from: q */
    protected Handler f122714q;

    /* renamed from: r */
    protected Runnable f122715r;

    /* renamed from: s */
    protected boolean f122716s;

    /* renamed from: t */
    protected final Matrix f122717t;

    /* renamed from: u */
    protected final float[] f122718u;

    /* renamed from: v */
    protected DisplayType f122719v;

    /* renamed from: w */
    protected final int f122720w;

    /* renamed from: x */
    protected RectF f122721x;

    /* renamed from: y */
    protected RectF f122722y;

    /* renamed from: z */
    protected RectF f122723z;

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouchBase$DisplayType */
    public enum DisplayType {
        NONE,
        FIT_TO_SCREEN,
        FIT_IF_BIGGER
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouchBase$a */
    public interface C47880a {
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouchBase$b */
    public interface C47881b {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo119935a(float f) {
    }

    /* access modifiers changed from: protected */
    public PointF getCenter() {
        return this.f122705g;
    }

    public DisplayType getDisplayType() {
        return this.f122719v;
    }

    public float getRotation() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo119937a(Drawable drawable, Matrix matrix, float f, float f2) {
        if (drawable != null) {
            super.setImageDrawable(drawable);
        } else {
            this.f122711n.reset();
            super.setImageDrawable(null);
        }
        if (f == -1.0f || f2 == -1.0f) {
            this.f122700b = -1.0f;
            this.f122699a = -1.0f;
            this.f122702d = false;
            this.f122701c = false;
        } else {
            float min = Math.min(f, f2);
            float max = Math.max(min, f2);
            this.f122700b = min;
            this.f122699a = max;
            this.f122702d = true;
            this.f122701c = true;
            if (this.f122719v == DisplayType.FIT_TO_SCREEN || this.f122719v == DisplayType.FIT_IF_BIGGER) {
                if (this.f122700b >= 1.0f) {
                    this.f122702d = false;
                    this.f122700b = -1.0f;
                }
                if (this.f122699a <= 1.0f) {
                    this.f122701c = true;
                    this.f122699a = -1.0f;
                }
            }
        }
        if (matrix != null) {
            this.f122713p = new Matrix(matrix);
        }
        this.f122707i = true;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119965a(boolean z, boolean z2) {
        if (getDrawable() != null) {
            RectF a = mo119958a(this.f122712o, true, true);
            if (!(a.left == 0.0f && a.top == 0.0f)) {
                mo119934a(a.left, a.top);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119962a(float f, float f2, float f3) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        m148802b(f / getScale(), f2, f3);
        getScale();
        mo119965a(true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119960a(double d, double d2) {
        RectF bitmapRect = getBitmapRect();
        this.f122723z.set((float) d, (float) d2, 0.0f, 0.0f);
        mo119964a(bitmapRect, this.f122723z);
        mo119934a(this.f122723z.left, this.f122723z.top);
        mo119965a(true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119964a(RectF rectF, RectF rectF2) {
        if (rectF != null) {
            if (rectF.top >= 0.0f && rectF.bottom <= ((float) this.f122704f)) {
                rectF2.top = 0.0f;
            }
            if (rectF.left >= 0.0f && rectF.right <= ((float) this.f122703e)) {
                rectF2.left = 0.0f;
            }
            if (rectF.top + rectF2.top >= 0.0f && rectF.bottom > ((float) this.f122704f)) {
                rectF2.top = (float) ((int) (0.0f - rectF.top));
            }
            if (rectF.bottom + rectF2.top <= ((float) (this.f122704f + 0)) && rectF.top < 0.0f) {
                rectF2.top = (float) ((int) (((float) (this.f122704f + 0)) - rectF.bottom));
            }
            if (rectF.left + rectF2.left >= 0.0f) {
                rectF2.left = (float) ((int) (0.0f - rectF.left));
            }
            if (rectF.right + rectF2.left <= ((float) (this.f122703e + 0))) {
                rectF2.left = (float) ((int) (((float) (this.f122703e + 0)) - rectF.right));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119961a(float f, float f2, double d) {
        final double d2 = (double) f;
        final double d3 = (double) f2;
        final long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.f122714q;
        C478782 r0 = new Runnable(300.0d) {

            /* renamed from: a */
            double f122729a;

            /* renamed from: b */
            double f122730b;

            public final void run() {
                double min = Math.min(300.0d, (double) (System.currentTimeMillis() - currentTimeMillis));
                double d = min;
                double a = ImageViewTouchBase.this.f122710m.mo119932a(d, 0.0d, d2, 300.0d);
                double a2 = ImageViewTouchBase.this.f122710m.mo119932a(d, 0.0d, d3, 300.0d);
                ImageViewTouchBase.this.mo119960a(a - this.f122729a, a2 - this.f122730b);
                this.f122729a = a;
                this.f122730b = a2;
                if (min < 300.0d) {
                    ImageViewTouchBase.this.f122714q.post(this);
                    return;
                }
                RectF a3 = ImageViewTouchBase.this.mo119958a(ImageViewTouchBase.this.f122712o, true, true);
                if (!(a3.left == 0.0f && a3.top == 0.0f)) {
                    ImageViewTouchBase.this.mo119968c(a3.left, a3.top);
                }
            }
        };
        handler.post(r0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119963a(float f, float f2, float f3, float f4) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final float scale = getScale();
        final float f5 = f - scale;
        Matrix matrix = new Matrix(this.f122712o);
        matrix.postScale(f, f, f2, f3);
        RectF a = mo119958a(matrix, true, true);
        final float f6 = f2 + (a.left * f);
        final float f7 = f3 + (a.top * f);
        Handler handler = this.f122714q;
        final float f8 = f4;
        C478793 r0 = new Runnable() {
            public final void run() {
                float min = Math.min(f8, (float) (System.currentTimeMillis() - currentTimeMillis));
                ImageViewTouchBase.this.mo119962a(scale + ((float) ImageViewTouchBase.this.f122710m.mo119933b((double) min, 0.0d, (double) f5, (double) f8)), f6, f7);
                if (min < f8) {
                    ImageViewTouchBase.this.f122714q.post(this);
                    return;
                }
                ImageViewTouchBase.this.mo119935a(ImageViewTouchBase.this.getScale());
                ImageViewTouchBase.this.mo119965a(true, true);
            }
        };
        handler.post(r0);
    }

    public float getBaseScale() {
        return m148804c(this.f122711n);
    }

    public RectF getBitmapRect() {
        return m148800b(this.f122712o);
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.f122712o);
    }

    public Matrix getImageViewMatrix() {
        return m148795a(this.f122712o);
    }

    public float getScale() {
        return m148804c(this.f122712o);
    }

    /* renamed from: c */
    private float m148803c() {
        if (getDrawable() == null) {
            return 1.0f;
        }
        return Math.min(1.0f, 1.0f / m148804c(this.f122711n));
    }

    public float getMaxScale() {
        if (this.f122699a == -1.0f) {
            this.f122699a = m148799b();
        }
        return this.f122699a;
    }

    public float getMinScale() {
        if (this.f122700b == -1.0f) {
            this.f122700b = m148803c();
        }
        return this.f122700b;
    }

    /* renamed from: b */
    private float m148799b() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return 1.0f;
        }
        return Math.max(((float) drawable.getIntrinsicWidth()) / ((float) this.f122703e), ((float) drawable.getIntrinsicHeight()) / ((float) this.f122704f)) * 8.0f;
    }

    /* renamed from: a */
    public final void mo119959a() {
        this.f122712o = new Matrix();
        float a = m148794a(this.f122719v);
        setImageMatrix(getImageViewMatrix());
        if (a != getScale()) {
            m148801b(a);
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void setMaxScale(float f) {
        this.f122699a = f;
    }

    /* access modifiers changed from: protected */
    public void setMinScale(float f) {
        this.f122700b = f;
    }

    public void setOnDrawableChangedListener(C47880a aVar) {
        this.f122708j = aVar;
    }

    public void setOnLayoutChangeListener(C47881b bVar) {
        this.f122709k = bVar;
    }

    public ImageViewTouchBase(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private float m148804c(Matrix matrix) {
        return m148793a(matrix, 0);
    }

    public void setImageBitmap(Bitmap bitmap) {
        m148797a(bitmap, (Matrix) null, -1.0f, -1.0f);
    }

    public void setImageDrawable(Drawable drawable) {
        mo119967b(drawable, null, -1.0f, -1.0f);
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType == ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    public void setDisplayType(DisplayType displayType) {
        if (displayType != this.f122719v) {
            this.f122716s = false;
            this.f122719v = displayType;
            this.f122706h = true;
            requestLayout();
        }
    }

    public void setImageResource(int i) {
        setImageDrawable(getContext().getResources().getDrawable(i));
    }

    /* renamed from: a */
    private float m148794a(DisplayType displayType) {
        if (displayType == DisplayType.FIT_TO_SCREEN) {
            return 1.0f;
        }
        if (displayType == DisplayType.FIT_IF_BIGGER) {
            return Math.min(1.0f, 1.0f / m148804c(this.f122711n));
        }
        return 1.0f / m148804c(this.f122711n);
    }

    public void setImageMatrix(Matrix matrix) {
        Matrix imageMatrix = getImageMatrix();
        if ((matrix != null || imageMatrix.isIdentity()) && matrix != null) {
            imageMatrix.equals(matrix);
        }
        super.setImageMatrix(matrix);
    }

    /* renamed from: a */
    private Matrix m148795a(Matrix matrix) {
        this.f122717t.set(this.f122711n);
        this.f122717t.postConcat(matrix);
        return this.f122717t;
    }

    /* renamed from: b */
    private RectF m148800b(Matrix matrix) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        Matrix a = m148795a(matrix);
        this.f122721x.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        a.mapRect(this.f122721x);
        return this.f122721x;
    }

    /* renamed from: b */
    private void m148801b(float f) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        if (f < getMinScale()) {
            f = getMinScale();
        }
        PointF center = getCenter();
        mo119962a(f, center.x, center.y);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private float m148793a(Matrix matrix, int i) {
        matrix.getValues(this.f122718u);
        return this.f122718u[0];
    }

    /* renamed from: c */
    public final void mo119968c(float f, float f2) {
        mo119960a((double) f, (double) f2);
    }

    /* renamed from: b */
    public final void mo119966b(float f, float f2) {
        PointF center = getCenter();
        mo119963a(f, center.x, center.y, 50.0f);
    }

    /* renamed from: a */
    private void mo119934a(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.f122712o.postTranslate(f, f2);
            setImageMatrix(getImageViewMatrix());
        }
    }

    /* renamed from: a */
    private void m148798a(Drawable drawable, Matrix matrix) {
        float f = (float) this.f122703e;
        float f2 = (float) this.f122704f;
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        matrix.reset();
        if (intrinsicWidth > f || intrinsicHeight > f2) {
            float min = Math.min(f / intrinsicWidth, f2 / intrinsicHeight);
            matrix.postScale(min, min);
            matrix.postTranslate((f - (intrinsicWidth * min)) / 2.0f, (f2 - (intrinsicHeight * min)) / 2.0f);
            return;
        }
        float min2 = Math.min(f / intrinsicWidth, f2 / intrinsicHeight);
        matrix.postScale(min2, min2);
        matrix.postTranslate((f - (intrinsicWidth * min2)) / 2.0f, (f2 - (intrinsicHeight * min2)) / 2.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo119936a(Context context, AttributeSet attributeSet, int i) {
        setScaleType(ScaleType.MATRIX);
    }

    /* renamed from: b */
    private void m148802b(float f, float f2, float f3) {
        this.f122712o.postScale(f, f, f2, f3);
        setImageMatrix(getImageViewMatrix());
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f122710m = new C47871a();
        this.f122711n = new Matrix();
        this.f122712o = new Matrix();
        this.f122714q = new Handler();
        this.f122715r = null;
        this.f122716s = false;
        this.f122699a = -1.0f;
        this.f122700b = -1.0f;
        this.f122717t = new Matrix();
        this.f122718u = new float[9];
        this.f122703e = -1;
        this.f122704f = -1;
        this.f122705g = new PointF();
        this.f122719v = DisplayType.NONE;
        this.f122720w = C34943c.f91127w;
        this.f122721x = new RectF();
        this.f122722y = new RectF();
        this.f122723z = new RectF();
        mo119936a(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.RectF mo119958a(android.graphics.Matrix r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.getDrawable()
            r1 = 0
            if (r0 != 0) goto L_0x000d
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r1, r1, r1, r1)
            return r6
        L_0x000d:
            android.graphics.RectF r0 = r5.f122722y
            r0.set(r1, r1, r1, r1)
            android.graphics.RectF r6 = r5.m148800b(r6)
            float r0 = r6.height()
            float r2 = r6.width()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x0046
            int r8 = r5.f122704f
            float r8 = (float) r8
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x002f
            float r8 = r8 - r0
            float r8 = r8 / r3
            float r0 = r6.top
            float r8 = r8 - r0
            goto L_0x0047
        L_0x002f:
            float r0 = r6.top
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            float r8 = r6.top
            float r8 = -r8
            goto L_0x0047
        L_0x0039:
            float r0 = r6.bottom
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0046
            int r8 = r5.f122704f
            float r8 = (float) r8
            float r0 = r6.bottom
            float r8 = r8 - r0
            goto L_0x0047
        L_0x0046:
            r8 = 0
        L_0x0047:
            if (r7 == 0) goto L_0x006c
            int r7 = r5.f122703e
            float r7 = (float) r7
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            float r7 = r7 - r2
            float r7 = r7 / r3
            float r6 = r6.left
            float r6 = r7 - r6
            goto L_0x006d
        L_0x0057:
            float r0 = r6.left
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
            float r6 = r6.left
            float r6 = -r6
            goto L_0x006d
        L_0x0061:
            float r0 = r6.right
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x006c
            float r6 = r6.right
            float r6 = r7 - r6
            goto L_0x006d
        L_0x006c:
            r6 = 0
        L_0x006d:
            android.graphics.RectF r7 = r5.f122722y
            r7.set(r6, r8, r1, r1)
            android.graphics.RectF r6 = r5.f122722y
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p1874it.sephiroth.android.library.imagezoom.ImageViewTouchBase.mo119958a(android.graphics.Matrix, boolean, boolean):android.graphics.RectF");
    }

    /* renamed from: a */
    private void m148797a(Bitmap bitmap, Matrix matrix, float f, float f2) {
        if (bitmap != null) {
            mo119967b(new C47882a(bitmap), null, -1.0f, -1.0f);
        } else {
            mo119967b(null, null, -1.0f, -1.0f);
        }
    }

    /* renamed from: b */
    public final void mo119967b(Drawable drawable, Matrix matrix, float f, float f2) {
        if (getWidth() <= 0) {
            final Drawable drawable2 = drawable;
            final Matrix matrix2 = matrix;
            final float f3 = f;
            final float f4 = f2;
            C478771 r1 = new Runnable() {
                public final void run() {
                    ImageViewTouchBase.this.mo119967b(drawable2, matrix2, f3, f4);
                }
            };
            this.f122715r = r1;
            return;
        }
        mo119937a(drawable, matrix, f, f2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        if (r3 != getScale()) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            r0 = 0
            if (r7 == 0) goto L_0x0029
            int r1 = r6.f122703e
            int r2 = r6.f122704f
            int r10 = r10 - r8
            r6.f122703e = r10
            int r11 = r11 - r9
            r6.f122704f = r11
            int r8 = r6.f122703e
            int r8 = r8 - r1
            int r9 = r6.f122704f
            int r9 = r9 - r2
            android.graphics.PointF r10 = r6.f122705g
            int r11 = r6.f122703e
            float r11 = (float) r11
            r1 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r1
            r10.x = r11
            android.graphics.PointF r10 = r6.f122705g
            int r11 = r6.f122704f
            float r11 = (float) r11
            float r11 = r11 / r1
            r10.y = r11
            goto L_0x002b
        L_0x0029:
            r8 = 0
            r9 = 0
        L_0x002b:
            java.lang.Runnable r10 = r6.f122715r
            r11 = 0
            if (r10 == 0) goto L_0x0035
            r6.f122715r = r11
            r10.run()
        L_0x0035:
            android.graphics.drawable.Drawable r10 = r6.getDrawable()
            if (r10 == 0) goto L_0x0106
            if (r7 != 0) goto L_0x0045
            boolean r1 = r6.f122706h
            if (r1 != 0) goto L_0x0045
            boolean r1 = r6.f122707i
            if (r1 == 0) goto L_0x0112
        L_0x0045:
            it.sephiroth.android.library.imagezoom.ImageViewTouchBase$DisplayType r1 = r6.f122719v
            r6.m148794a(r1)
            android.graphics.Matrix r1 = r6.f122711n
            float r1 = r6.m148804c(r1)
            float r2 = r6.getScale()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r3 / r1
            float r4 = java.lang.Math.min(r3, r4)
            android.graphics.Matrix r5 = r6.f122711n
            r6.m148798a(r10, r5)
            android.graphics.Matrix r10 = r6.f122711n
            float r10 = r6.m148804c(r10)
            boolean r5 = r6.f122707i
            if (r5 != 0) goto L_0x00af
            boolean r5 = r6.f122706h
            if (r5 == 0) goto L_0x0070
            goto L_0x00af
        L_0x0070:
            if (r7 == 0) goto L_0x00e0
            boolean r7 = r6.f122702d
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r7 != 0) goto L_0x007a
            r6.f122700b = r11
        L_0x007a:
            boolean r7 = r6.f122701c
            if (r7 != 0) goto L_0x0080
            r6.f122699a = r11
        L_0x0080:
            android.graphics.Matrix r7 = r6.getImageViewMatrix()
            r6.setImageMatrix(r7)
            int r7 = -r8
            float r7 = (float) r7
            int r8 = -r9
            float r8 = (float) r8
            r6.mo119934a(r7, r8)
            boolean r7 = r6.f122716s
            if (r7 != 0) goto L_0x009a
            it.sephiroth.android.library.imagezoom.ImageViewTouchBase$DisplayType r7 = r6.f122719v
            float r7 = r6.m148794a(r7)
            r3 = r7
            goto L_0x00dd
        L_0x009a:
            float r7 = r2 - r4
            float r7 = java.lang.Math.abs(r7)
            double r7 = (double) r7
            r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x00dd
            float r1 = r1 / r10
            float r1 = r1 * r2
            r3 = r1
            goto L_0x00dd
        L_0x00af:
            android.graphics.Matrix r7 = r6.f122713p
            if (r7 == 0) goto L_0x00c2
            android.graphics.Matrix r7 = r6.f122712o
            android.graphics.Matrix r8 = r6.f122713p
            r7.set(r8)
            r6.f122713p = r11
            float r7 = r6.getScale()
        L_0x00c0:
            r3 = r7
            goto L_0x00ce
        L_0x00c2:
            android.graphics.Matrix r7 = r6.f122712o
            r7.reset()
            it.sephiroth.android.library.imagezoom.ImageViewTouchBase$DisplayType r7 = r6.f122719v
            float r7 = r6.m148794a(r7)
            goto L_0x00c0
        L_0x00ce:
            android.graphics.Matrix r7 = r6.getImageViewMatrix()
            r6.setImageMatrix(r7)
            float r7 = r6.getScale()
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x00e0
        L_0x00dd:
            r6.m148801b(r3)
        L_0x00e0:
            r6.f122716s = r0
            float r7 = r6.getMaxScale()
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x00f2
            float r7 = r6.getMinScale()
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f5
        L_0x00f2:
            r6.m148801b(r3)
        L_0x00f5:
            r7 = 1
            r6.mo119965a(r7, r7)
            boolean r7 = r6.f122706h
            if (r7 == 0) goto L_0x00ff
            r6.f122706h = r0
        L_0x00ff:
            boolean r7 = r6.f122707i
            if (r7 == 0) goto L_0x0105
            r6.f122707i = r0
        L_0x0105:
            return
        L_0x0106:
            boolean r7 = r6.f122707i
            if (r7 == 0) goto L_0x010c
            r6.f122707i = r0
        L_0x010c:
            boolean r7 = r6.f122706h
            if (r7 == 0) goto L_0x0112
            r6.f122706h = r0
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1874it.sephiroth.android.library.imagezoom.ImageViewTouchBase.onLayout(boolean, int, int, int, int):void");
    }
}
