package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.internal.C13307g;

/* renamed from: com.facebook.drawee.drawable.b */
public final class C13407b extends C13412g implements Runnable {

    /* renamed from: a */
    public boolean f35513a;

    /* renamed from: b */
    float f35514b;

    /* renamed from: c */
    private int f35515c;

    /* renamed from: d */
    private boolean f35516d;

    /* renamed from: b */
    private int m39328b() {
        return (int) ((20.0f / ((float) this.f35515c)) * 360.0f);
    }

    /* renamed from: a */
    private void m39327a() {
        if (!this.f35516d) {
            this.f35516d = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    public final void run() {
        this.f35516d = false;
        this.f35514b += (float) m39328b();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.f35514b;
        if (!this.f35513a) {
            f = 360.0f - this.f35514b;
        }
        canvas.rotate(f, (float) (bounds.left + (i / 2)), (float) (bounds.top + (i2 / 2)));
        super.draw(canvas);
        canvas.restoreToCount(save);
        m39327a();
    }

    public C13407b(Drawable drawable, int i) {
        this(drawable, i, true);
    }

    private C13407b(Drawable drawable, int i, boolean z) {
        super((Drawable) C13307g.m38940a(drawable));
        this.f35514b = 0.0f;
        this.f35516d = false;
        this.f35515c = i;
        this.f35513a = true;
    }
}
