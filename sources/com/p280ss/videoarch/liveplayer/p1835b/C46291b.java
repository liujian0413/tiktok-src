package com.p280ss.videoarch.liveplayer.p1835b;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.videoarch.liveplayer.b.b */
public class C46291b {

    /* renamed from: a */
    private static int f118940a = -1;

    /* renamed from: b */
    private static String f118941b;

    /* renamed from: c */
    private static C46291b f118942c;

    /* renamed from: d */
    private ConcurrentHashMap<String, C46292a> f118943d = new ConcurrentHashMap<>();

    /* renamed from: com.ss.videoarch.liveplayer.b.b$a */
    static class C46292a {

        /* renamed from: a */
        public String f118944a;

        /* renamed from: b */
        public long f118945b;

        /* renamed from: c */
        public boolean f118946c;

        C46292a() {
        }
    }

    /* renamed from: c */
    public static int m145325c() {
        return f118940a;
    }

    /* renamed from: d */
    public static String m145327d() {
        return f118941b;
    }

    private C46291b() {
    }

    /* renamed from: b */
    public final void mo115044b() {
        if (this.f118943d != null) {
            this.f118943d.clear();
        }
    }

    /* renamed from: a */
    public static C46291b m145323a() {
        if (f118942c == null) {
            synchronized (C46291b.class) {
                if (f118942c == null) {
                    f118942c = new C46291b();
                }
            }
        }
        return f118942c;
    }

    /* renamed from: a */
    public static void m145324a(int i) {
        f118940a = i;
    }

    /* renamed from: c */
    public static void m145326c(String str) {
        f118941b = str;
    }

    /* renamed from: a */
    public final C46292a mo115042a(String str) {
        if (this.f118943d != null) {
            return (C46292a) this.f118943d.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo115045b(String str) {
        if (str != null) {
            C46292a aVar = null;
            if (this.f118943d != null) {
                aVar = (C46292a) this.f118943d.get(str);
            }
            if (aVar != null) {
                aVar.f118946c = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo115043a(String str, C46292a aVar) {
        if (this.f118943d != null) {
            this.f118943d.put(str, aVar);
        }
    }
}
