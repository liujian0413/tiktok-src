package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* renamed from: com.facebook.drawee.drawable.e */
public final class C13410e {
    /* renamed from: a */
    public static int m39333a(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    /* renamed from: a */
    public static int m39334a(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* renamed from: a */
    public static void m39336a(Drawable drawable, Drawable drawable2) {
        if (drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    /* renamed from: a */
    public static void m39337a(Drawable drawable, C13409d dVar) {
        if (drawable != null && dVar != null) {
            dVar.mo32807a(drawable);
        }
    }

    /* renamed from: a */
    public static void m39335a(Drawable drawable, Callback callback, C13435r rVar) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof C13434q) {
                ((C13434q) drawable).setTransformCallback(rVar);
            }
        }
    }
}
