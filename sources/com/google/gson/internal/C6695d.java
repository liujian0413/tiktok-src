package com.google.gson.internal;

/* renamed from: com.google.gson.internal.d */
public final class C6695d {

    /* renamed from: a */
    private static final int f19152a = m20715c();

    /* renamed from: a */
    public static int m20711a() {
        return f19152a;
    }

    /* renamed from: b */
    public static boolean m20714b() {
        if (f19152a >= 9) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static int m20715c() {
        return m20712a(System.getProperty("java.version"));
    }

    /* renamed from: a */
    private static int m20712a(String str) {
        int b = m20713b(str);
        if (b == -1) {
            b = m20716c(str);
        }
        if (b == -1) {
            return 6;
        }
        return b;
    }

    /* renamed from: b */
    private static int m20713b(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt != 1 || split.length <= 1) {
                return parseInt;
            }
            return Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    private static int m20716c(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
