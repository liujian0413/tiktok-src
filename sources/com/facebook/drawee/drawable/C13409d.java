package com.facebook.drawee.drawable;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.drawable.d */
public final class C13409d {

    /* renamed from: a */
    public int f35517a = -1;

    /* renamed from: b */
    private boolean f35518b;

    /* renamed from: c */
    private ColorFilter f35519c;

    /* renamed from: d */
    private int f35520d = -1;

    /* renamed from: e */
    private int f35521e = -1;

    /* renamed from: a */
    public final void mo32808a(boolean z) {
        this.f35520d = z ? 1 : 0;
    }

    /* renamed from: b */
    public final void mo32809b(boolean z) {
        this.f35521e = z ? 1 : 0;
    }

    /* renamed from: a */
    public final void mo32806a(ColorFilter colorFilter) {
        this.f35519c = colorFilter;
        this.f35518b = true;
    }

    /* renamed from: a */
    public final void mo32807a(Drawable drawable) {
        boolean z;
        if (drawable != null) {
            if (this.f35517a != -1) {
                drawable.setAlpha(this.f35517a);
            }
            if (this.f35518b) {
                drawable.setColorFilter(this.f35519c);
            }
            boolean z2 = false;
            if (this.f35520d != -1) {
                if (this.f35520d != 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable.setDither(z);
            }
            if (this.f35521e != -1) {
                if (this.f35521e != 0) {
                    z2 = true;
                }
                drawable.setFilterBitmap(z2);
            }
        }
    }
}
