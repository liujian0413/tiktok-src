package com;

import com.p280ss.android.ugc.aweme.language.C7119a;
import java.util.Locale;

/* renamed from: com.a */
public final class C1642a {
    /* renamed from: a */
    public static String m8034a(String str, Object[] objArr) {
        String str2;
        if (str == null || !str.contains("%d")) {
            return String.format(str, objArr);
        }
        try {
            str2 = String.format(C7119a.m22233a() ? Locale.ENGLISH : Locale.getDefault(), str, objArr);
        } catch (Exception unused) {
            str2 = str;
        }
        return str2;
    }

    /* renamed from: a */
    public static String m8035a(Locale locale, String str, Object[] objArr) {
        try {
            if (C7119a.m22233a()) {
                locale = Locale.ENGLISH;
            }
            return String.format(locale, str, objArr);
        } catch (Exception unused) {
            return str;
        }
    }
}
