package android.support.p029v7.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.bc */
public final class C1385bc {

    /* renamed from: a */
    private static Method f5408a;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                f5408a = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f5408a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m6839a(View view) {
        if (C0991u.m4220h(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m6840b(View view) {
        if (VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException | InvocationTargetException unused) {
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m6838a(View view, Rect rect, Rect rect2) {
        if (f5408a != null) {
            try {
                f5408a.invoke(view, new Object[]{rect, rect2});
            } catch (Exception unused) {
            }
        }
    }
}
