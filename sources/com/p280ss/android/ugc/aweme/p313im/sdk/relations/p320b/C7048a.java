package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b;

import android.text.TextUtils;
import com.github.p739a.p740a.C14689a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.a */
public final class C7048a {
    /* renamed from: d */
    private static boolean m21933d(char c) {
        return c >= 19968 && c <= 40869;
    }

    /* renamed from: b */
    public static boolean m21929b(char c) {
        return Character.isDigit(c);
    }

    /* renamed from: a */
    public static boolean m21926a(char c) {
        if (Character.isUpperCase(c) || Character.isLowerCase(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m21931c(char c) {
        return Pattern.compile("[\\p{P}\\p{S}\\p{Z}]").matcher(String.valueOf(c)).matches();
    }

    /* renamed from: e */
    private static boolean m21934e(char c) {
        if (m21933d(c) || m21926a(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m21935f(char c) {
        if (m21929b(c) || m21931c(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m21927a(String str) {
        try {
            Matcher matcher = Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)").matcher(str);
            if (!matcher.find() || str.indexOf(matcher.group()) != 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: b */
    public static String m21928b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(C14689a.m42504a(str.charAt(i)).charAt(0));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m21930c(String str) {
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

    /* renamed from: d */
    public static String m21932d(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        while (i2 < 12) {
            if (i3 < str.length()) {
                i = m21923a(str, i3);
            } else {
                i = 0;
            }
            if (i < 10) {
                sb.append("0");
            }
            if (i == 64) {
                i3++;
            }
            sb.append(String.valueOf(i));
            i2++;
            i3++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static int m21923a(String str, int i) {
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str.charAt(i) - 'A';
        }
        if (Character.isLowerCase(charAt)) {
            int charAt2 = (str.charAt(i) - 'a') + 26;
            if (i == 0) {
                return charAt2 - 26;
            }
            return charAt2;
        } else if (m21929b(charAt)) {
            return (str.charAt(i) - '0') + 52;
        } else {
            if (m21931c(charAt)) {
                return 62;
            }
            if (m21927a(str.substring(i))) {
                return 64;
            }
            return 63;
        }
    }

    /* renamed from: a */
    public static String m21925a(String str, boolean z) {
        String str2 = "#";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        char charAt = str.charAt(0);
        if (m21934e(charAt)) {
            String upperCase = m21930c(str).substring(0, 1).toUpperCase();
            if (TextUtils.isEmpty(upperCase)) {
                return str.substring(0, 1).toUpperCase();
            }
            return upperCase;
        } else if (m21935f(charAt) || m21927a(str)) {
            return "#";
        } else {
            if (z) {
                return "#";
            }
            return str.substring(0, 1);
        }
    }

    /* renamed from: a */
    public static String m21924a(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || str.contains(str4)) {
            return str4;
        }
        String lowerCase = m21930c(str4).toLowerCase();
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
