package android.support.p022v4.p026d;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: android.support.v4.d.f */
public final class C0720f {

    /* renamed from: a */
    private static final Locale f2716a = new Locale("", "");

    /* renamed from: b */
    private static int m3044b(Locale locale) {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
            case 1:
            case 2:
                return 1;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static int m3043a(Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(f2716a)) {
            String a = C0708b.m3025a(locale);
            if (a == null) {
                return m3044b(locale);
            }
            if (a.equalsIgnoreCase("Arab") || a.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}
