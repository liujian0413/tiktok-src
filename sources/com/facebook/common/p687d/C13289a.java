package com.facebook.common.p687d;

import com.facebook.common.internal.ImmutableMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.facebook.common.d.a */
public final class C13289a {

    /* renamed from: a */
    public static final Map<String, String> f35185a = ImmutableMap.m38918of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    /* renamed from: a */
    public static boolean m38892a(String str) {
        if (str == null || !str.startsWith("video/")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m38893b(String str) {
        String c = m38894c(str);
        if (c == null) {
            return null;
        }
        String lowerCase = c.toLowerCase(Locale.US);
        String a = C13290b.m38895a(lowerCase);
        if (a == null) {
            a = (String) f35185a.get(lowerCase);
        }
        return a;
    }

    /* renamed from: c */
    private static String m38894c(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }
}
