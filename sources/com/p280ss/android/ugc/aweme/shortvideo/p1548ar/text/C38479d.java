package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.d */
public final class C38479d {
    /* renamed from: a */
    public static String m123016a(Context context) {
        Locale locale;
        if (context == null) {
            return "zh-CN";
        }
        try {
            if (VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = context.getResources().getConfiguration().locale;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage());
            sb.append("-");
            sb.append(locale.getCountry());
            return sb.toString();
        } catch (Exception unused) {
            return "zh-CN";
        }
    }
}
