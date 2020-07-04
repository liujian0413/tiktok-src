package android.support.transition;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.ah */
final class C0465ah extends C0464ag {

    /* renamed from: a */
    private static Method f1926a;

    /* renamed from: b */
    private static boolean f1927b;

    C0465ah() {
    }

    /* renamed from: a */
    private static void m2029a() {
        if (!f1927b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                f1926a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f1927b = true;
        }
    }

    /* renamed from: a */
    public final void mo2070a(View view, int i, int i2, int i3, int i4) {
        m2029a();
        if (f1926a != null) {
            try {
                f1926a.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
