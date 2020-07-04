package com.p280ss.android.ttvecamera;

/* renamed from: com.ss.android.ttvecamera.m */
public final class C20652m {

    /* renamed from: a */
    private static String f55778a = "VESDK-";

    /* renamed from: b */
    private static byte f55779b = 1;

    /* renamed from: c */
    private static byte f55780c = 2;

    /* renamed from: d */
    private static byte f55781d = 4;

    /* renamed from: e */
    private static byte f55782e = 8;

    /* renamed from: f */
    private static byte f55783f = 16;

    /* renamed from: g */
    private static byte f55784g = 3;

    /* renamed from: h */
    private static C20653a f55785h;

    /* renamed from: com.ss.android.ttvecamera.m$a */
    public interface C20653a {
        /* renamed from: a */
        void mo55832a(byte b, String str, String str2);
    }

    /* renamed from: a */
    public static void m68432a(C20653a aVar) {
        f55785h = aVar;
    }

    /* renamed from: a */
    public static void m68433a(String str, byte b) {
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-");
            f55778a = sb.toString();
        }
        f55784g = b;
    }

    /* renamed from: a */
    public static void m68434a(String str, String str2) {
        if ((f55781d & f55784g) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f55778a);
            sb.append(str);
            String sb2 = sb.toString();
            if (f55785h != null) {
                f55785h.mo55832a(f55781d, sb2, str2);
            }
        }
    }

    /* renamed from: b */
    public static void m68435b(String str, String str2) {
        if ((f55782e & f55784g) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f55778a);
            sb.append(str);
            String sb2 = sb.toString();
            if (f55785h != null) {
                f55785h.mo55832a(f55782e, sb2, str2);
            }
        }
    }

    /* renamed from: c */
    public static void m68436c(String str, String str2) {
        if ((f55780c & f55784g) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f55778a);
            sb.append(str);
            String sb2 = sb.toString();
            if (f55785h != null) {
                f55785h.mo55832a(f55780c, sb2, str2);
            }
        }
    }

    /* renamed from: d */
    public static void m68437d(String str, String str2) {
        if ((f55779b & f55784g) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f55778a);
            sb.append(str);
            String sb2 = sb.toString();
            if (f55785h != null) {
                f55785h.mo55832a(f55779b, sb2, str2);
            }
        }
    }
}
