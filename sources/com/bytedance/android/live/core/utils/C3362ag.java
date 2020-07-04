package com.bytedance.android.live.core.utils;

/* renamed from: com.bytedance.android.live.core.utils.ag */
public final class C3362ag {
    /* renamed from: a */
    public static String m12539a(String str) {
        String str2 = "";
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public static int m12538a(String str, int i) {
        try {
            return Integer.parseInt(m12539a(str).trim());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
