package com.twitter.sdk.android.core.internal.p1845a;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.TreeMap;

/* renamed from: com.twitter.sdk.android.core.internal.a.f */
public final class C46858f {
    /* renamed from: a */
    public static String m146567a(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: c */
    private static String m146571c(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public static String m146570b(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String a = m146567a(str);
        int length = a.length();
        int i = 0;
        while (i < length) {
            char charAt = a.charAt(i);
            if (charAt == '*') {
                sb.append("%2A");
            } else if (charAt == '+') {
                sb.append("%20");
            } else {
                if (charAt == '%') {
                    int i2 = i + 2;
                    if (i2 < length && a.charAt(i + 1) == '7' && a.charAt(i2) == 'E') {
                        sb.append('~');
                        i = i2;
                    }
                }
                sb.append(charAt);
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static TreeMap<String, String> m146569a(URI uri, boolean z) {
        return m146568a(uri.getRawQuery(), z);
    }

    /* renamed from: a */
    public static TreeMap<String, String> m146568a(String str, boolean z) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        if (str == null) {
            return treeMap;
        }
        for (String split : str.split("&")) {
            String[] split2 = split.split("=");
            if (split2.length == 2) {
                if (z) {
                    treeMap.put(m146571c(split2[0]), m146571c(split2[1]));
                } else {
                    treeMap.put(split2[0], split2[1]);
                }
            } else if (!TextUtils.isEmpty(split2[0])) {
                if (z) {
                    treeMap.put(m146571c(split2[0]), "");
                } else {
                    treeMap.put(split2[0], "");
                }
            }
        }
        return treeMap;
    }
}
