package android.support.transition;

import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.aa */
final class C0455aa {

    /* renamed from: a */
    private static Method f1904a;

    /* renamed from: b */
    private static boolean f1905b;

    /* renamed from: a */
    private static void m1988a() {
        if (!f1905b) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f1904a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f1905b = true;
        }
    }

    /* renamed from: a */
    static void m1989a(ViewGroup viewGroup, boolean z) {
        m1988a();
        if (f1904a != null) {
            try {
                f1904a.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException unused2) {
            }
        }
    }
}
