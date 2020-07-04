package com.p280ss.android.socialbase.downloader.p904b;

import android.text.TextUtils;

/* renamed from: com.ss.android.socialbase.downloader.b.a */
public final class C20190a {

    /* renamed from: a */
    private static int f54630a = 4;

    /* renamed from: b */
    private static C20191a f54631b;

    /* renamed from: com.ss.android.socialbase.downloader.b.a$a */
    public static abstract class C20191a {
    }

    /* renamed from: a */
    public static boolean m66501a() {
        if (f54630a <= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m66499a(int i) {
        f54630a = i;
    }

    /* renamed from: a */
    private static String m66498a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "DownloaderLogger";
        }
        StringBuilder sb = new StringBuilder("Downloader-");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m66500a(String str, String str2) {
        if (!(str2 == null || f54631b == null)) {
            m66498a(str);
        }
    }

    /* renamed from: b */
    public static void m66502b(String str, String str2) {
        if (!(str2 == null || f54631b == null)) {
            m66498a(str);
        }
    }
}
