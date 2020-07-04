package com.p280ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.github.p739a.p740a.C14689a;

/* renamed from: com.ss.android.ugc.aweme.utils.a */
public final class C42909a {
    /* renamed from: b */
    public static boolean m136237b(char c) {
        return c >= 19968 && c <= 40869;
    }

    /* renamed from: a */
    public static boolean m136235a(char c) {
        if (Character.isUpperCase(c) || Character.isLowerCase(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m136234a(String str) {
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
    public static String m136236b(String str) {
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
}
