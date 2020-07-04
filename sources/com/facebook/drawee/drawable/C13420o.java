package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.C13303f;
import com.facebook.common.internal.C13307g;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.drawable.C13421p.C13433l;

/* renamed from: com.facebook.drawee.drawable.o */
public final class C13420o extends C13412g {

    /* renamed from: a */
    public C13423b f35586a;

    /* renamed from: b */
    Object f35587b;

    /* renamed from: c */
    public PointF f35588c = null;

    /* renamed from: d */
    int f35589d = 0;

    /* renamed from: e */
    int f35590e = 0;

    /* renamed from: f */
    Matrix f35591f;

    /* renamed from: g */
    private Matrix f35592g = new Matrix();

    /* renamed from: a */
    private void m39377a() {
        boolean z;
        boolean z2 = true;
        if (this.f35586a instanceof C13433l) {
            Object a = ((C13433l) this.f35586a).mo32875a();
            if (a == null || !a.equals(this.f35587b)) {
                z = true;
            } else {
                z = false;
            }
            this.f35587b = a;
        } else {
            z = false;
        }
        if (this.f35589d == getCurrent().getIntrinsicWidth() && this.f35590e == getCurrent().getIntrinsicHeight()) {
            z2 = false;
        }
        if (z2 || z) {
            m39378b();
        }
    }

    /* renamed from: b */
    private void m39378b() {
        float f;
        float f2;
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f35589d = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f35590e = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f35591f = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f35591f = null;
        } else if (this.f35586a == C13423b.f35593a) {
            current.setBounds(bounds);
            this.f35591f = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            C13423b bVar = this.f35586a;
            Matrix matrix = this.f35592g;
            if (this.f35588c != null) {
                f = this.f35588c.x;
            } else {
                f = 0.5f;
            }
            if (this.f35588c != null) {
                f2 = this.f35588c.y;
            } else {
                f2 = 0.5f;
            }
            bVar.mo32864a(matrix, bounds, intrinsicWidth, intrinsicHeight, f, f2);
            this.f35591f = this.f35592g;
        }
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        m39378b();
    }

    public final Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        m39378b();
        return current;
    }

    public final void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        m39377a();
        if (this.f35591f != null) {
            matrix.preConcat(this.f35591f);
        }
    }

    /* renamed from: a */
    public final void mo32862a(PointF pointF) {
        if (!C13303f.m38932a(this.f35588c, pointF)) {
            if (this.f35588c == null) {
                this.f35588c = new PointF();
            }
            this.f35588c.set(pointF);
            m39378b();
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo32863a(C13423b bVar) {
        if (!C13303f.m38932a(this.f35586a, bVar)) {
            this.f35586a = bVar;
            this.f35587b = null;
            m39378b();
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        m39377a();
        if (this.f35591f != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f35591f);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public C13420o(Drawable drawable, C13423b bVar) {
        super((Drawable) C13307g.m38940a(drawable));
        this.f35586a = bVar;
    }
}
