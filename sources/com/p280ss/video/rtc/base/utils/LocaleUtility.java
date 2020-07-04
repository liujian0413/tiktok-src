package com.p280ss.video.rtc.base.utils;

import android.content.Context;
import java.util.Locale;

/* renamed from: com.ss.video.rtc.base.utils.LocaleUtility */
public class LocaleUtility {
    public static String getLanguage(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage().toLowerCase());
        sb.append("-");
        sb.append(locale.getCountry().toUpperCase());
        return sb.toString();
    }
}
