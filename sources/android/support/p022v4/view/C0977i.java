package android.support.p022v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.support.p022v4.internal.view.C0746b;
import android.view.MenuItem;

/* renamed from: android.support.v4.view.i */
public final class C0977i {
    /* renamed from: a */
    public static MenuItem m4122a(MenuItem menuItem, C0958b bVar) {
        if (menuItem instanceof C0746b) {
            return ((C0746b) menuItem).mo2948a(bVar);
        }
        return menuItem;
    }

    /* renamed from: a */
    public static void m4124a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C0746b) {
            ((C0746b) menuItem).setIconTintList(colorStateList);
            return;
        }
        if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: b */
    public static void m4128b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0746b) {
            ((C0746b) menuItem).mo2951b(charSequence);
            return;
        }
        if (VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m4125a(MenuItem menuItem, Mode mode) {
        if (menuItem instanceof C0746b) {
            ((C0746b) menuItem).setIconTintMode(mode);
            return;
        }
        if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m4126a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0746b) {
            ((C0746b) menuItem).mo2949a(charSequence);
            return;
        }
        if (VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: a */
    public static void m4123a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0746b) {
            ((C0746b) menuItem).setNumericShortcut(c, i);
            return;
        }
        if (VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: b */
    public static void m4127b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0746b) {
            ((C0746b) menuItem).setAlphabeticShortcut(c, i);
            return;
        }
        if (VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }
}
