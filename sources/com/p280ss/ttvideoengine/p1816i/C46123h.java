package com.p280ss.ttvideoengine.p1816i;

import android.text.TextUtils;

/* renamed from: com.ss.ttvideoengine.i.h */
public final class C46123h {

    /* renamed from: a */
    public static int f118017a = 112;

    /* renamed from: b */
    public static C46124i f118018b;

    /* renamed from: a */
    public static final void m144545a(String str, String str2) {
        m144548d(str, str2);
    }

    /* renamed from: b */
    public static final void m144546b(String str, String str2) {
        m144548d(str, str2);
    }

    /* renamed from: c */
    public static void m144547c(String str, String str2) {
        m144548d(str, str2);
    }

    /* renamed from: a */
    public static final void m144544a(int i, int i2) {
        int i3 = f118017a & -3;
        f118017a = i3;
        f118017a = i3 | (i2 << 1);
    }

    /* renamed from: d */
    private static void m144548d(String str, String str2) {
        if (f118018b != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("TTVideoEngine: tag = ");
            sb.append(str);
            sb.append(";  ");
            sb.append(str2);
            sb.append("\n");
        }
    }
}
