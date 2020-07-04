package com.p280ss.android.medialib.common;

/* renamed from: com.ss.android.medialib.common.c */
public final class C19706c {

    /* renamed from: a */
    private static String f53436a = "VESDK-";

    /* renamed from: b */
    private static byte f53437b = 1;

    /* renamed from: c */
    private static byte f53438c = 2;

    /* renamed from: d */
    private static byte f53439d = 4;

    /* renamed from: e */
    private static byte f53440e = 8;

    /* renamed from: f */
    private static byte f53441f = 16;

    /* renamed from: g */
    private static byte f53442g = 3;

    /* renamed from: a */
    private static byte m64965a(int i) {
        switch (i) {
            case 2:
                return 31;
            case 3:
                return 15;
            case 4:
                return 7;
            case 5:
                return 3;
            case 6:
                return 1;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static int m64966a(byte b) {
        if (b == 1) {
            return 6;
        }
        if (b == 3) {
            return 5;
        }
        if (b == 7) {
            return 4;
        }
        if (b != 15) {
            return b != 31 ? 0 : 2;
        }
        return 3;
    }

    /* renamed from: a */
    public static void m64968a(String str, int i) {
        m64967a((String) null, m64965a(i));
    }

    /* renamed from: b */
    public static void m64970b(String str, String str2) {
        if ((f53440e & f53442g) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f53436a);
            sb.append(str);
        }
    }

    /* renamed from: c */
    public static void m64971c(String str, String str2) {
        if ((f53438c & f53442g) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f53436a);
            sb.append(str);
        }
    }

    /* renamed from: d */
    public static void m64972d(String str, String str2) {
        if ((f53437b & f53442g) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f53436a);
            sb.append(str);
        }
    }

    /* renamed from: a */
    private static void m64967a(String str, byte b) {
        if (str != null && str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-");
            f53436a = sb.toString();
        }
        f53442g = b;
    }

    /* renamed from: a */
    public static void m64969a(String str, String str2) {
        if ((f53439d & f53442g) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f53436a);
            sb.append(str);
        }
    }
}
