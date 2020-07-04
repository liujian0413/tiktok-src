package com.onething.xyvod;

public class XYVodSDK {

    /* renamed from: a */
    private static boolean f50297a;

    public static native String getInfoStatus();

    private static native String getInfoString(String str);

    private static native String getVersion();

    private static native int init(int i);

    private static native String playUrlRewrite(String str, boolean z);

    private static native int release();

    public static native int setLogEnable(int i);

    private static native int setLongValue(int i, String str, long j);

    private static native int setPlayPos(String str, long j);

    private static native int setStuck(String str, int i);

    private static native int stopTask(String str);

    /* renamed from: a */
    public static String m61048a() {
        try {
            return getVersion();
        } catch (UnsatisfiedLinkError unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static int m61047a(boolean z) {
        f50297a = z;
        if (!z) {
            try {
                C18612a.m61054a("xyvodsdk");
                f50297a = true;
            } catch (SecurityException | UnsatisfiedLinkError unused) {
            }
            if (!f50297a) {
                return -1;
            }
        }
        try {
            return init(0);
        } catch (UnsatisfiedLinkError unused2) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m61049a(String str) {
        try {
            return getInfoString(m61052b(str));
        } catch (UnsatisfiedLinkError unused) {
            return "";
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m61052b(java.lang.String r8) {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
            r2 = 0
        L_0x0007:
            int r3 = r8.length()
            if (r2 >= r3) goto L_0x0057
            char r3 = r8.charAt(r2)
            if (r3 < 0) goto L_0x001b
            r4 = 255(0xff, float:3.57E-43)
            if (r3 > r4) goto L_0x001b
            r0.append(r3)
            goto L_0x0054
        L_0x001b:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r4 = "utf-8"
            byte[] r3 = r3.getBytes(r4)     // Catch:{ Exception -> 0x0026 }
            goto L_0x002e
        L_0x0026:
            r3 = move-exception
            java.io.PrintStream r4 = java.lang.System.out
            r4.println(r3)
            byte[] r3 = new byte[r1]
        L_0x002e:
            r4 = 0
        L_0x002f:
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0054
            byte r5 = r3[r4]
            if (r5 >= 0) goto L_0x0038
            int r5 = r5 + 256
        L_0x0038:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "%"
            r6.<init>(r7)
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            java.lang.String r5 = r5.toUpperCase()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.append(r5)
            int r4 = r4 + 1
            goto L_0x002f
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0057:
            java.lang.String r8 = r0.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onething.xyvod.XYVodSDK.m61052b(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static void m61053b(String str, int i) {
        try {
            setStuck(m61052b(str), i);
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    /* renamed from: a */
    public static String m61050a(String str, int i) {
        boolean z;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        try {
            return playUrlRewrite(str, z);
        } catch (UnsatisfiedLinkError unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static void m61051a(String str, long j) {
        try {
            m61052b(str);
            setPlayPos(str, j);
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    /* renamed from: a */
    public static int m61046a(String str, int i, long j) {
        try {
            m61052b(str);
            return setLongValue(i, str, j);
        } catch (UnsatisfiedLinkError unused) {
            return 0;
        }
    }
}
