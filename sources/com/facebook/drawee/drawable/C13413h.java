package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.drawable.h */
public final class C13413h extends C13412g {

    /* renamed from: a */
    public Matrix f35531a;

    /* renamed from: b */
    private Matrix f35532b;

    /* renamed from: c */
    private int f35533c;

    /* renamed from: d */
    private int f35534d;

    /* renamed from: a */
    private void m39349a() {
        if (this.f35533c != getCurrent().getIntrinsicWidth() || this.f35534d != getCurrent().getIntrinsicHeight()) {
            m39350b();
        }
    }

    /* renamed from: b */
    private void m39350b() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f35533c = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f35534d = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f35532b = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f35532b = this.f35531a;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m39350b();
    }

    public final Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        m39350b();
        return current;
    }

    public final void getTransform(Matrix matrix) {
        super.getTransform(matrix);
        if (this.f35532b != null) {
            matrix.preConcat(this.f35532b);
        }
    }

    public final void draw(Canvas canvas) {
        m39349a();
        if (this.f35532b != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f35532b);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }
}
