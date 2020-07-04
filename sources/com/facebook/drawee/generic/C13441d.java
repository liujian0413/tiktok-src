package com.facebook.drawee.generic;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.C13412g;
import com.facebook.drawee.drawable.C13436s;
import com.facebook.drawee.drawable.C13437t;

/* renamed from: com.facebook.drawee.generic.d */
public final class C13441d extends C13412g implements C13436s {

    /* renamed from: a */
    Drawable f35646a;

    /* renamed from: b */
    private C13437t f35647b;

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public C13441d(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: a */
    public final void mo32876a(C13437t tVar) {
        this.f35647b = tVar;
    }

    /* renamed from: a */
    public final void mo32930a(Drawable drawable) {
        this.f35646a = drawable;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        if (isVisible()) {
            if (this.f35647b != null) {
                this.f35647b.mo32877a();
            }
            super.draw(canvas);
            if (this.f35646a != null) {
                this.f35646a.setBounds(getBounds());
                this.f35646a.draw(canvas);
            }
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f35647b != null) {
            this.f35647b.mo32878a(z);
        }
        return super.setVisible(z, z2);
    }
}
