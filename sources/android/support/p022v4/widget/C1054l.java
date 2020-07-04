package android.support.p022v4.widget;

import android.os.Build.VERSION;
import android.support.p022v4.view.C0972e;
import android.support.p022v4.view.C0991u;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.widget.l */
public final class C1054l {

    /* renamed from: a */
    private static Method f3657a;

    /* renamed from: b */
    private static boolean f3658b;

    /* renamed from: c */
    private static Field f3659c;

    /* renamed from: d */
    private static boolean f3660d;

    /* renamed from: a */
    public static void m4551a(PopupWindow popupWindow, int i) {
        if (VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f3658b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f3657a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f3658b = true;
        }
        if (f3657a != null) {
            try {
                f3657a.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m4553a(PopupWindow popupWindow, boolean z) {
        if (VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(z);
            return;
        }
        if (VERSION.SDK_INT >= 21) {
            if (!f3660d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f3659c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f3660d = true;
            }
            if (f3659c != null) {
                try {
                    f3659c.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m4552a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C0972e.m4109a(i3, C0991u.m4220h(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }
}
