package com.p280ss.android.ugc.aweme.base.utils;

/* renamed from: com.ss.android.ugc.aweme.base.utils.k */
public final class C23483k {
    /* renamed from: a */
    public static boolean m77110a(String str) {
        if (str != null) {
            int length = str.length();
            if (length != 0) {
                for (int i = 0; i < length; i++) {
                    if (!Character.isWhitespace(str.charAt(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }
}
