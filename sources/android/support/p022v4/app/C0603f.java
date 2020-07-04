package android.support.p022v4.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.app.f */
public final class C0603f {

    /* renamed from: android.support.v4.app.f$a */
    static class C0604a {

        /* renamed from: a */
        private static Method f2386a;

        /* renamed from: b */
        private static boolean f2387b;

        /* renamed from: c */
        private static Method f2388c;

        /* renamed from: d */
        private static boolean f2389d;

        /* renamed from: a */
        public static IBinder m2531a(Bundle bundle, String str) {
            if (!f2387b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f2386a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f2387b = true;
            }
            if (f2386a != null) {
                try {
                    return (IBinder) f2386a.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f2386a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m2532a(Bundle bundle, String str, IBinder iBinder) {
            if (!f2389d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f2388c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f2389d = true;
            }
            if (f2388c != null) {
                try {
                    f2388c.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f2388c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m2529a(Bundle bundle, String str) {
        if (VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C0604a.m2531a(bundle, str);
    }

    /* renamed from: a */
    public static void m2530a(Bundle bundle, String str, IBinder iBinder) {
        if (VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0604a.m2532a(bundle, str, iBinder);
        }
    }
}
