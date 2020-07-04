package android.support.transition;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.af */
class C0463af extends C0466ai {

    /* renamed from: a */
    private static Method f1918a;

    /* renamed from: b */
    private static boolean f1919b;

    /* renamed from: c */
    private static Method f1920c;

    /* renamed from: d */
    private static boolean f1921d;

    C0463af() {
    }

    /* renamed from: b */
    public final void mo2066b(View view) {
    }

    /* renamed from: c */
    public final void mo2067c(View view) {
    }

    /* renamed from: a */
    private static void m2019a() {
        if (!f1919b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f1918a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f1919b = true;
        }
    }

    /* renamed from: b */
    private static void m2020b() {
        if (!f1921d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f1920c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f1921d = true;
        }
    }

    /* renamed from: a */
    public final float mo2064a(View view) {
        m2020b();
        if (f1920c != null) {
            try {
                return ((Float) f1920c.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.mo2064a(view);
    }

    /* renamed from: a */
    public final void mo2065a(View view, float f) {
        m2019a();
        if (f1918a != null) {
            try {
                f1918a.invoke(view, new Object[]{Float.valueOf(f)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }
}
