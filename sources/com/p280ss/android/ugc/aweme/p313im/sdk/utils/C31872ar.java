package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ar */
public final class C31872ar {
    /* renamed from: a */
    public static final String m103562a(String str, int i) {
        C7573i.m23587b(str, "$this$substringForGroupTitle");
        if (m103560a(str, 0, str.length()) <= 15) {
            return str;
        }
        int a = m103560a(str, 0, str.length());
        StringBuilder sb = new StringBuilder();
        sb.append(m103563b(str, 0, 11));
        sb.append("...");
        sb.append(m103563b(str, a - 4, a));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m103560a(String str, int i, int i2) {
        C7573i.m23587b(str, "$this$lengthWithEmoji");
        return str.codePointCount(i, i2);
    }

    /* renamed from: b */
    private static String m103563b(String str, int i, int i2) {
        C7573i.m23587b(str, "$this$substringWithEmoji");
        try {
            String substring = str.substring(str.offsetByCodePoints(0, i), str.offsetByCodePoints(0, i2));
            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        } catch (Exception unused) {
            return str;
        }
    }
}
