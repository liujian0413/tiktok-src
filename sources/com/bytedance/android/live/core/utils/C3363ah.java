package com.bytedance.android.live.core.utils;

import com.C1642a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.bytedance.android.live.core.utils.ah */
public final class C3363ah {

    /* renamed from: a */
    private static final SimpleDateFormat f10174a = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: a */
    public static long m12540a() {
        return System.nanoTime() / 1000000;
    }

    /* renamed from: a */
    public static boolean m12542a(long j) {
        return f10174a.format(new Date(j)).equals(f10174a.format(new Date()));
    }

    /* renamed from: a */
    public static String m12541a(int i) {
        return C1642a.m8035a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i / 3600000), Integer.valueOf((i % 3600000) / 60000), Integer.valueOf((i % 60000) / 1000)});
    }
}
