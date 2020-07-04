package com.p280ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.github.p739a.p740a.C14689a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.utils.af */
public final class C42918af {
    /* renamed from: c */
    private static boolean m136259c(char c) {
        return c >= 19968 && c <= 40869;
    }

    /* renamed from: b */
    private static boolean m136258b(char c) {
        return Character.isDigit(c);
    }

    /* renamed from: a */
    private static boolean m136256a(char c) {
        if (Character.isUpperCase(c) || Character.isLowerCase(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m136260c(String str) {
        Matcher matcher = Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)").matcher(str);
        if (!matcher.find() || str.indexOf(matcher.group()) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m136261d(char c) {
        return Pattern.compile("[\\p{P}\\p{S}\\p{Z}]").matcher(String.valueOf(c)).matches();
    }

    /* renamed from: e */
    private static boolean m136262e(char c) {
        if (m136259c(c) || m136256a(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m136263f(char c) {
        if (m136258b(c) || m136261d(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m136253a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(C14689a.m42504a(str.charAt(i)).charAt(0));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m136257b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String trim = str.trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < trim.length(); i++) {
            sb.append(C14689a.m42504a(trim.charAt(i)));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m136255a(String str, boolean z) {
        String str2 = "#";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        char charAt = str.charAt(0);
        if (m136262e(charAt)) {
            String upperCase = m136257b(str).substring(0, 1).toUpperCase();
            if (TextUtils.isEmpty(upperCase)) {
                return str.substring(0, 1).toUpperCase();
            }
            return upperCase;
        } else if (m136263f(charAt) || m136260c(str)) {
            return "#";
        } else {
            return "#";
        }
    }

    /* renamed from: a */
    public static String m136254a(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || str.contains(str4)) {
            return str4;
        }
        String lowerCase = m136257b(str4).toLowerCase();
        StringBuilder sb = new StringBuilder();
        int indexOf = str3.indexOf(lowerCase);
        int indexOf2 = str2.indexOf(lowerCase);
        int i = 0;
        if (indexOf2 != -1) {
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                int length = C14689a.m42504a(str.charAt(i)).toLowerCase().length() + i3;
                if (i3 >= indexOf2 && i3 < lowerCase.length() + indexOf2) {
                    sb.append(str.charAt(i));
                    i2++;
                } else if (length > indexOf2 && length <= lowerCase.length() + indexOf2) {
                    sb.append(str.charAt(i));
                    i2++;
                } else if (indexOf2 > i3 && indexOf2 < length) {
                    sb.append(str.charAt(i));
                    i2++;
                }
                i++;
                i3 = length;
            }
            i = i2;
        }
        if (indexOf != -1 && lowerCase.length() > i) {
            return str.substring(indexOf, lowerCase.length() + indexOf);
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            return sb.toString();
        }
        return lowerCase;
    }
}
