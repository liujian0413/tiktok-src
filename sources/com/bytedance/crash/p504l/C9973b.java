package com.bytedance.crash.p504l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.bytedance.crash.l.b */
public final class C9973b {

    /* renamed from: a */
    private static DateFormat f27213a;

    /* renamed from: a */
    public static DateFormat m29512a() {
        if (f27213a == null) {
            f27213a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return f27213a;
    }
}
