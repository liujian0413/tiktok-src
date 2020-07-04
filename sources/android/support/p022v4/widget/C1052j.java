package android.support.p022v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.j */
public final class C1052j {
    /* renamed from: a */
    public static ColorStateList m4545a(ImageView imageView) {
        if (VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof C1059p) {
            return ((C1059p) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* renamed from: b */
    public static Mode m4548b(ImageView imageView) {
        if (VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof C1059p) {
            return ((C1059p) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* renamed from: a */
    public static void m4546a(ImageView imageView, ColorStateList colorStateList) {
        boolean z;
        if (VERSION.SDK_INT >= 21) {
            imageView.setImageTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                if (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof C1059p) {
            ((C1059p) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m4547a(ImageView imageView, Mode mode) {
        boolean z;
        if (VERSION.SDK_INT >= 21) {
            imageView.setImageTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                if (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof C1059p) {
            ((C1059p) imageView).setSupportImageTintMode(mode);
        }
    }
}
