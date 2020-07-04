package com.p280ss.android.ugc.aweme.utils;

import com.C1642a;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.utils.eu */
public final class C43109eu {
    /* renamed from: a */
    public static String m136730a(int i) {
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C1642a.m8035a(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return C1642a.m8035a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }
}
