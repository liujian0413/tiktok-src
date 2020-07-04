package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import com.C1642a;
import com.bytedance.ies.dmt.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.CircleImageView */
public class CircleImageView extends AppCompatImageView {

    /* renamed from: a */
    private static final ScaleType f107044a = ScaleType.CENTER_CROP;

    /* renamed from: b */
    private static final Config f107045b = Config.ARGB_8888;

    /* renamed from: c */
    private final RectF f107046c;

    /* renamed from: d */
    private final RectF f107047d;

    /* renamed from: e */
    private final Matrix f107048e;

    /* renamed from: f */
    private final Paint f107049f;

    /* renamed from: g */
    private final Paint f107050g;

    /* renamed from: h */
    private int f107051h;

    /* renamed from: i */
    private int f107052i;

    /* renamed from: j */
    private Bitmap f107053j;

    /* renamed from: k */
    private BitmapShader f107054k;

    /* renamed from: l */
    private int f107055l;

    /* renamed from: m */
    private int f107056m;

    /* renamed from: n */
    private float f107057n;

    /* renamed from: o */
    private float f107058o;

    /* renamed from: p */
    private boolean f107059p;

    /* renamed from: q */
    private boolean f107060q;

    public int getBorderColor() {
        return this.f107051h;
    }

    public int getBorderWidth() {
        return this.f107052i;
    }

    public ScaleType getScaleType() {
        return f107044a;
    }

    /* renamed from: b */
    private void m131331b() {
        float f;
        float f2;
        this.f107048e.set(null);
        float f3 = 0.0f;
        if (((float) this.f107055l) * this.f107046c.height() > this.f107046c.width() * ((float) this.f107056m)) {
            f2 = this.f107046c.height() / ((float) this.f107056m);
            f = (this.f107046c.width() - (((float) this.f107055l) * f2)) * 0.5f;
        } else {
            f2 = this.f107046c.width() / ((float) this.f107055l);
            f3 = (this.f107046c.height() - (((float) this.f107056m) * f2)) * 0.5f;
            f = 0.0f;
        }
        this.f107048e.setScale(f2, f2);
        this.f107048e.postTranslate((float) (((int) (f + 0.5f)) + this.f107052i), (float) (((int) (f3 + 0.5f)) + this.f107052i));
        this.f107054k.setLocalMatrix(this.f107048e);
    }

    /* renamed from: a */
    private void m131330a() {
        if (!this.f107059p) {
            this.f107060q = true;
        } else if (this.f107053j != null) {
            Bitmap bitmap = this.f107053j;
            TileMode tileMode = TileMode.CLAMP;
            this.f107054k = new BitmapShader(bitmap, tileMode, tileMode);
            this.f107049f.setAntiAlias(true);
            this.f107049f.setShader(this.f107054k);
            this.f107050g.setStyle(Style.STROKE);
            this.f107050g.setAntiAlias(true);
            this.f107050g.setColor(this.f107051h);
            this.f107050g.setStrokeWidth((float) this.f107052i);
            this.f107056m = this.f107053j.getHeight();
            this.f107055l = this.f107053j.getWidth();
            this.f107047d.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f107058o = Math.min((this.f107047d.height() - ((float) this.f107052i)) / 2.0f, (this.f107047d.width() - ((float) this.f107052i)) / 2.0f);
            this.f107046c.set((float) this.f107052i, (float) this.f107052i, this.f107047d.width() - ((float) this.f107052i), this.f107047d.height() - ((float) this.f107052i));
            this.f107057n = Math.min(this.f107046c.height() / 2.0f, this.f107046c.width() / 2.0f);
            m131331b();
            invalidate();
        }
    }

    public void setBorderWidth(int i) {
        if (i != this.f107052i) {
            this.f107052i = i;
            m131330a();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f107053j = bitmap;
        m131330a();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f107053j = m131329a(drawable);
        m131330a();
    }

    public void setBorderColor(int i) {
        if (i != this.f107051h) {
            this.f107051h = i;
            this.f107050g.setColor(this.f107051h);
            invalidate();
        }
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        this.f107053j = m131329a(getDrawable());
        m131330a();
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType != f107044a) {
            throw new IllegalArgumentException(C1642a.m8034a("ScaleType %s not supported.", new Object[]{scaleType}));
        }
    }

    public CircleImageView(Context context) {
        super(context);
        this.f107046c = new RectF();
        this.f107047d = new RectF();
        this.f107048e = new Matrix();
        this.f107049f = new Paint();
        this.f107050g = new Paint();
        this.f107051h = -16777216;
        this.f107052i = 0;
    }

    /* renamed from: a */
    private static Bitmap m131329a(Drawable drawable) {
        Bitmap bitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                bitmap = Bitmap.createBitmap(1, 1, f107045b);
            } else {
                bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f107045b);
            }
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (getDrawable() != null) {
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.f107057n, this.f107049f);
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.f107058o, this.f107050g);
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f107046c = new RectF();
        this.f107047d = new RectF();
        this.f107048e = new Matrix();
        this.f107049f = new Paint();
        this.f107050g = new Paint();
        this.f107051h = -16777216;
        this.f107052i = 0;
        super.setScaleType(f107044a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CircleImageView, i, 0);
        this.f107052i = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f107051h = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        this.f107059p = true;
        if (this.f107060q) {
            m131330a();
            this.f107060q = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m131330a();
    }
}
