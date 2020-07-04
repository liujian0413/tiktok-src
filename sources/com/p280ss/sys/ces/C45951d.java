package com.p280ss.sys.ces;

/* renamed from: com.ss.sys.ces.d */
public final class C45951d {

    /* renamed from: a */
    private static int f117453a;

    /* renamed from: b */
    private static int f117454b;

    /* renamed from: c */
    private static int f117455c;

    /* renamed from: d */
    private static int f117456d;

    /* renamed from: e */
    private static int f117457e;

    /* renamed from: f */
    private static int f117458f;

    /* renamed from: a */
    public static void m144110a(int i) {
        if (i > 0) {
            int i2 = i / 60;
            if (i2 <= 0) {
                i2 = 1;
            }
            f117453a = i2;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m144111a() {
        boolean z;
        synchronized (C45951d.class) {
            z = true;
            int i = f117456d + 1;
            f117456d = i;
            if (i > m144116d()) {
                f117456d = 0;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public static void m144112b(int i) {
        if (i > 0) {
            int i2 = i / 60;
            if (i2 <= 0) {
                i2 = 1;
            }
            f117454b = i2;
        }
    }

    /* renamed from: b */
    public static synchronized boolean m144113b() {
        boolean z;
        synchronized (C45951d.class) {
            z = true;
            int i = f117457e + 1;
            f117457e = i;
            if (i > m144117e()) {
                f117457e = 0;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public static void m144114c(int i) {
        if (i > 0) {
            int i2 = i / 60;
            if (i2 <= 0) {
                i2 = 1;
            }
            f117455c = i2;
        }
    }

    /* renamed from: c */
    public static synchronized boolean m144115c() {
        boolean z;
        synchronized (C45951d.class) {
            z = true;
            int i = f117458f + 1;
            f117458f = i;
            if (i > m144118f()) {
                f117458f = 0;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: d */
    private static int m144116d() {
        return f117453a;
    }

    /* renamed from: e */
    private static int m144117e() {
        return f117454b;
    }

    /* renamed from: f */
    private static int m144118f() {
        return f117455c;
    }
}
