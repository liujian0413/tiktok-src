package com.bytedance.ies.uikit.imageview.imagezoom.p580b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: com.bytedance.ies.uikit.imageview.imagezoom.b.a */
public final class C11041a extends Drawable {

    /* renamed from: a */
    protected Bitmap f29974a;

    /* renamed from: b */
    protected Paint f29975b = new Paint();

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.f29974a.getHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f29974a.getWidth();
    }

    public final int getMinimumHeight() {
        return this.f29974a.getHeight();
    }

    public final int getMinimumWidth() {
        return this.f29974a.getWidth();
    }

    public final void setAlpha(int i) {
        this.f29975b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29975b.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        canvas.drawBitmap(this.f29974a, 0.0f, 0.0f, this.f29975b);
    }

    public C11041a(Bitmap bitmap) {
        this.f29974a = bitmap;
        this.f29975b.setDither(true);
        this.f29975b.setFilterBitmap(true);
    }
}
