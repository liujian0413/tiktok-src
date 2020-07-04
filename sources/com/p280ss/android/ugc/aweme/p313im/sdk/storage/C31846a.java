package com.p280ss.android.ugc.aweme.p313im.sdk.storage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.storage.a */
public final class C31846a {
    /* renamed from: a */
    public static String m103343a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleDateFormat.format(time));
        sb.append(str);
        return sb.toString();
    }
}
