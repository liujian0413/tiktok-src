package android.support.p022v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.e */
public final class C1043e {

    /* renamed from: a */
    private static Field f3645a;

    /* renamed from: b */
    private static boolean f3646b;

    /* renamed from: a */
    public static Drawable m4502a(CompoundButton compoundButton) {
        if (VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f3646b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f3645a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3646b = true;
        }
        if (f3645a != null) {
            try {
                return (Drawable) f3645a.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f3645a = null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m4503a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
            return;
        }
        if (compoundButton instanceof C1058o) {
            ((C1058o) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m4504a(CompoundButton compoundButton, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
            return;
        }
        if (compoundButton instanceof C1058o) {
            ((C1058o) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
