package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.facebook.imagepipeline.p725l.C13783b;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.drawee.drawable.k */
public final class C13416k extends C13418m {

    /* renamed from: A */
    private WeakReference<Bitmap> f35540A;

    /* renamed from: a */
    public final Paint f35541a = new Paint();

    /* renamed from: y */
    private final Paint f35542y = new Paint(1);

    /* renamed from: z */
    private final Bitmap f35543z;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo32842a() {
        if (!super.mo32842a() || this.f35543z == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m39357d() {
        if (this.f35540A == null || this.f35540A.get() != this.f35543z) {
            this.f35540A = new WeakReference<>(this.f35543z);
            this.f35541a.setFilterBitmap(true);
            Paint paint = this.f35541a;
            Bitmap bitmap = this.f35543z;
            TileMode tileMode = TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f35566g = true;
        }
        if (this.f35566g) {
            this.f35541a.getShader().setLocalMatrix(this.f35583x);
            this.f35566g = false;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f35541a.setColorFilter(colorFilter);
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.f35541a.getAlpha()) {
            this.f35541a.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("RoundedBitmapDrawable#draw");
        }
        if (!mo32842a()) {
            super.draw(canvas);
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
            return;
        }
        mo32852b();
        mo32853c();
        m39357d();
        int save = canvas.save();
        canvas.concat(this.f35580u);
        canvas.drawPath(this.f35565f, this.f35541a);
        if (this.f35564e > 0.0f) {
            this.f35542y.setStrokeWidth(this.f35564e);
            this.f35542y.setColor(C13410e.m39334a(this.f35567h, this.f35541a.getAlpha()));
            canvas.drawPath(this.f35568i, this.f35542y);
        }
        canvas.restoreToCount(save);
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }

    public C13416k(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        this.f35543z = bitmap;
        if (VERSION.SDK_INT >= 24 && (this.f35561b instanceof BitmapDrawable) && this.f35543z != null && this.f35543z.getDensity() == DisplayMetrics.DENSITY_DEVICE_STABLE) {
            ((BitmapDrawable) this.f35561b).setTargetDensity(DisplayMetrics.DENSITY_DEVICE_STABLE);
        }
        if (paint != null) {
            this.f35541a.set(paint);
        }
        this.f35541a.setFlags(1);
        this.f35542y.setStyle(Style.STROKE);
    }
}
