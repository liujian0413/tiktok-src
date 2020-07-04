package com.bytedance.android.livesdk.widget;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p029v7.widget.AppCompatImageView;
import android.widget.ImageView.ScaleType;
import com.C1642a;

public class CircleImageView extends AppCompatImageView {

    /* renamed from: a */
    private static final ScaleType f24976a = ScaleType.CENTER_CROP;

    /* renamed from: b */
    private static final Config f24977b = Config.ARGB_8888;

    /* renamed from: c */
    private Bitmap f24978c;

    /* renamed from: d */
    private BitmapShader f24979d;

    /* renamed from: e */
    private Paint f24980e;

    /* renamed from: f */
    private int f24981f;

    /* renamed from: g */
    private int f24982g;

    /* renamed from: h */
    private float f24983h;

    /* renamed from: i */
    private RectF f24984i;

    /* renamed from: j */
    private Matrix f24985j;

    /* renamed from: k */
    private boolean f24986k;

    /* renamed from: l */
    private boolean f24987l;

    public ScaleType getScaleType() {
        return f24976a;
    }

    /* renamed from: a */
    private void m27341a() {
        float f;
        float f2;
        if (!this.f24986k) {
            this.f24987l = true;
        } else if (this.f24978c != null) {
            Bitmap bitmap = this.f24978c;
            TileMode tileMode = TileMode.CLAMP;
            this.f24979d = new BitmapShader(bitmap, tileMode, tileMode);
            this.f24980e.setAntiAlias(true);
            this.f24980e.setShader(this.f24979d);
            this.f24981f = this.f24978c.getWidth();
            this.f24982g = this.f24978c.getHeight();
            float f3 = 0.0f;
            this.f24984i.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f24983h = Math.min(this.f24984i.width() / 2.0f, this.f24984i.height() / 2.0f);
            this.f24985j.set(null);
            if (((float) this.f24981f) * this.f24984i.height() > ((float) this.f24982g) * this.f24984i.width()) {
                f2 = this.f24984i.height() / ((float) this.f24982g);
                f = (this.f24984i.width() - (((float) this.f24981f) * f2)) * 0.5f;
            } else {
                f2 = this.f24984i.width() / ((float) this.f24981f);
                f3 = (this.f24984i.height() - (((float) this.f24982g) * f2)) * 0.5f;
                f = 0.0f;
            }
            this.f24985j.setScale(f2, f2);
            this.f24985j.postTranslate(((float) ((int) (f + 0.5f))) + this.f24984i.left, ((float) ((int) (f3 + 0.5f))) + this.f24984i.top);
            this.f24979d.setLocalMatrix(this.f24985j);
            invalidate();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f24978c = bitmap;
        m27341a();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f24978c = m27340a(drawable);
        m27341a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (getDrawable() != null) {
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.f24983h, this.f24980e);
        }
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        this.f24978c = m27340a(getDrawable());
        m27341a();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f24978c = m27340a(getDrawable());
        m27341a();
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType != f24976a) {
            throw new IllegalArgumentException(C1642a.m8034a("ScaleType %s not supported.", new Object[]{scaleType}));
        }
    }

    /* renamed from: a */
    private static Bitmap m27340a(Drawable drawable) {
        Bitmap bitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                bitmap = Bitmap.createBitmap(2, 2, f24977b);
            } else {
                bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f24977b);
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
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m27341a();
    }
}
