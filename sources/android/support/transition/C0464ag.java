package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.ag */
class C0464ag extends C0463af {

    /* renamed from: a */
    private static Method f1922a;

    /* renamed from: b */
    private static boolean f1923b;

    /* renamed from: c */
    private static Method f1924c;

    /* renamed from: d */
    private static boolean f1925d;

    C0464ag() {
    }

    /* renamed from: a */
    private static void m2025a() {
        if (!f1923b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f1922a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f1923b = true;
        }
    }

    /* renamed from: b */
    private static void m2026b() {
        if (!f1925d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f1924c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f1925d = true;
        }
    }

    /* renamed from: a */
    public final void mo2068a(View view, Matrix matrix) {
        m2025a();
        if (f1922a != null) {
            try {
                f1922a.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: b */
    public final void mo2069b(View view, Matrix matrix) {
        m2026b();
        if (f1924c != null) {
            try {
                f1924c.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
