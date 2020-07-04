package com.p280ss.sys.ces.p1802a;

import android.content.Context;
import com.p280ss.p811a.p813b.C18888g;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.sys.ces.a.c */
public final class C45932c {
    /* renamed from: a */
    public static String m144054a() {
        String str;
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            str = null;
        }
        return C18888g.m61655a(str);
    }

    /* renamed from: a */
    public static String m144055a(Context context) {
        return C18888g.m61655a("");
    }

    /* renamed from: b */
    public static String m144056b(Context context) {
        return C18888g.m61655a(null);
    }

    /* renamed from: c */
    public static String m144057c(Context context) {
        String str;
        try {
            Locale locale = context.getResources().getConfiguration().locale;
            String language = locale.getLanguage();
            String country = locale.getCountry();
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            sb.append("_");
            sb.append(country);
            str = sb.toString();
        } catch (Throwable unused) {
            str = null;
        }
        return C18888g.m61655a(str);
    }

    /* renamed from: d */
    public static String m144058d(Context context) {
        double d;
        try {
            Class cls = Class.forName("com.android.internal.os.PowerProfile");
            Object newInstance = cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            Method declaredMethod = cls.getDeclaredMethod("getAveragePower", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            d = ((Double) declaredMethod.invoke(newInstance, new Object[]{"battery.capacity"})).doubleValue();
        } catch (Throwable unused) {
            d = 0.0d;
        }
        return Integer.toString((int) d);
    }
}
