package android.support.p022v4.view;

import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.view.g */
public final class C0975g {

    /* renamed from: a */
    private static Field f3395a;

    /* renamed from: b */
    private static boolean f3396b;

    /* renamed from: a */
    public static void m4117a(LayoutInflater layoutInflater, Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (VERSION.SDK_INT < 21) {
            Factory factory = layoutInflater.getFactory();
            if (factory instanceof Factory2) {
                m4118b(layoutInflater, (Factory2) factory);
                return;
            }
            m4118b(layoutInflater, factory2);
        }
    }

    /* renamed from: b */
    private static void m4118b(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!f3396b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f3395a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3396b = true;
        }
        if (f3395a != null) {
            try {
                f3395a.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
