package com.p280ss.p811a.p812a;

/* renamed from: com.ss.a.a.a */
public final class C18875a {

    /* renamed from: a */
    public static int f50873a = 255;

    /* renamed from: b */
    public static int f50874b = 0;

    /* renamed from: c */
    public static String f50875c = "";

    /* renamed from: d */
    public static String f50876d = "";

    /* renamed from: a */
    public static String m61607a() {
        String str = "";
        if (f50876d.length() > 0) {
            return f50876d;
        }
        int i = f50873a;
        if (i == 0) {
            return "https://sdfp.snssdk.com";
        }
        switch (i) {
            case 2:
                return f50874b != 1180 ? "https://sdfp-sg.byteoversea.com" : "https://sdfp-sg.tiktokv.com";
            case 3:
                return f50874b != 1233 ? "https://sdfp-va.byteoversea.com" : "https://sdfp-va.musical.ly";
            case 4:
                return "http://10.2.198.96:8888";
            default:
                return str;
        }
    }

    /* renamed from: a */
    public static synchronized void m61608a(int i) {
        synchronized (C18875a.class) {
            f50873a = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0012, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m61609a(int r1, java.lang.String r2) {
        /*
            java.lang.Class<com.ss.a.a.a> r0 = com.p280ss.p811a.p812a.C18875a.class
            monitor-enter(r0)
            switch(r1) {
                case 1025: goto L_0x000a;
                case 1026: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0011
        L_0x0007:
            f50876d = r2     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000a:
            f50875c = r2     // Catch:{ all -> 0x000e }
            monitor-exit(r0)
            return
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0011:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.p811a.p812a.C18875a.m61609a(int, java.lang.String):void");
    }

    /* renamed from: b */
    public static String m61610b() {
        String str = "";
        int i = f50873a;
        if (i == 0) {
            return "https://smr.snssdk.com";
        }
        switch (i) {
            case 2:
                return "https://smr-sg.byteoversea.com";
            case 3:
                return "https://smr-aliva.byteoversea.com";
            default:
                return str;
        }
    }

    /* renamed from: b */
    public static synchronized void m61611b(int i) {
        synchronized (C18875a.class) {
            f50874b = i;
        }
    }

    /* renamed from: c */
    public static String m61612c() {
        String str = "";
        int i = f50873a;
        if (i == 0) {
            return "https://verify.snssdk.com";
        }
        switch (i) {
            case 2:
                return f50874b != 1180 ? "https://verify-sg.byteoversea.com" : "https://verify-sg.tiktokv.com";
            case 3:
                return f50874b != 1233 ? "https://verification-va.byteoversea.com" : "https://verification-va.musical.ly";
            default:
                return str;
        }
    }

    /* renamed from: c */
    public static String m61613c(int i) {
        String str = "";
        if (f50875c.length() > 0) {
            return f50875c;
        }
        int i2 = f50873a;
        if (i2 != 0) {
            switch (i2) {
                case 2:
                    if (i == 0) {
                        str = f50874b != 1180 ? "https://xlog.byteoversea.com" : "https://xlog.tiktokv.com";
                    }
                    if (i == 1) {
                        str = "https://bds-sg.byteoversea.com";
                    }
                    return str;
                case 3:
                    if (i == 0) {
                        str = f50874b != 1233 ? "https://xlog-va.byteoversea.com" : "https://xlog-va.musical.ly";
                    }
                    if (i == 1) {
                        str = "https://bds-va.byteoversea.com";
                    }
                    return str;
                default:
                    return "";
            }
        } else {
            if (i == 0) {
                str = "https://xlog.snssdk.com";
            }
            if (i == 1) {
                str = "https://bds.snssdk.com";
            }
            return str;
        }
    }
}
