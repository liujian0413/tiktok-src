package com.bytedance.android.live.uikit.p170a.p171a.p173b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: com.bytedance.android.live.uikit.a.a.b.a */
public final class C3509a extends Drawable {

    /* renamed from: a */
    protected Bitmap f10364a;

    /* renamed from: b */
    protected Paint f10365b = new Paint();

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.f10364a.getHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f10364a.getWidth();
    }

    public final int getMinimumHeight() {
        return this.f10364a.getHeight();
    }

    public final int getMinimumWidth() {
        return this.f10364a.getWidth();
    }

    public final void setAlpha(int i) {
        this.f10365b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f10365b.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        canvas.drawBitmap(this.f10364a, 0.0f, 0.0f, this.f10365b);
    }

    public C3509a(Bitmap bitmap) {
        this.f10364a = bitmap;
        this.f10365b.setDither(true);
        this.f10365b.setFilterBitmap(true);
    }
}
