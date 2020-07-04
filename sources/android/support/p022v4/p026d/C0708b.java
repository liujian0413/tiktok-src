package android.support.p022v4.p026d;

import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: android.support.v4.d.b */
public final class C0708b {

    /* renamed from: a */
    private static Method f2687a;

    /* renamed from: b */
    private static Method f2688b;

    static {
        if (VERSION.SDK_INT >= 21) {
            try {
                f2688b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        } else {
            try {
                Class cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f2687a = cls.getMethod("getScript", new Class[]{String.class});
                    f2688b = cls.getMethod("addLikelySubtags", new Class[]{String.class});
                }
            } catch (Exception unused) {
                f2687a = null;
                f2688b = null;
            }
        }
    }

    /* renamed from: a */
    private static String m3024a(String str) {
        try {
            if (f2687a != null) {
                return (String) f2687a.invoke(null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    /* renamed from: b */
    private static String m3026b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f2688b != null) {
                return (String) f2688b.invoke(null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }

    /* renamed from: a */
    public static String m3025a(Locale locale) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f2688b.invoke(null, new Object[]{locale})).getScript();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return locale.getScript();
            }
        } else {
            String b = m3026b(locale);
            if (b != null) {
                return m3024a(b);
            }
            return null;
        }
    }
}
