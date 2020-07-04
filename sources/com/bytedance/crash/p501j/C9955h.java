package com.bytedance.crash.p501j;

import android.os.Build.VERSION;
import android.system.Os;
import android.system.OsConstants;
import java.util.LinkedList;

/* renamed from: com.bytedance.crash.j.h */
public final class C9955h {

    /* renamed from: b */
    public static long f27170b = -1;

    /* renamed from: a */
    public long f27171a;

    /* renamed from: c */
    private LinkedList<C9940c> f27172c;

    /* renamed from: d */
    private int f27173d;

    /* renamed from: e */
    private final long f27174e;

    /* renamed from: f */
    private long f27175f;

    /* renamed from: com.bytedance.crash.j.h$a */
    static class C9956a {

        /* renamed from: a */
        private static long f27176a = -1;

        /* renamed from: b */
        private static long m29464b() {
            return m29462a(100);
        }

        /* renamed from: a */
        public static long m29461a() {
            if (C9955h.f27170b == -1) {
                C9955h.f27170b = 1000 / m29464b();
            }
            return C9955h.f27170b;
        }

        /* renamed from: a */
        private static long m29462a(long j) {
            long j2;
            if (f27176a > 0) {
                return f27176a;
            }
            if (VERSION.SDK_INT >= 21) {
                j2 = Os.sysconf(OsConstants._SC_CLK_TCK);
            } else if (VERSION.SDK_INT >= 14) {
                j2 = m29463a("_SC_CLK_TCK", 100);
            } else {
                j2 = 100;
            }
            if (j2 <= 0) {
                j2 = 100;
            }
            f27176a = j2;
            return j2;
        }

        /* renamed from: a */
        private static long m29463a(String str, long j) {
            try {
                int i = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
                Class cls = Class.forName("libcore.io.Libcore");
                Class cls2 = Class.forName("libcore.io.Os");
                Object obj = cls.getField("os").get(null);
                return ((Long) cls2.getMethod("sysconf", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i)})).longValue();
            } catch (Throwable unused) {
                return j;
            }
        }
    }

    public C9955h(int i) {
        this.f27172c = new LinkedList<>();
        this.f27173d = 1;
        this.f27171a = 0;
        this.f27175f = 50;
        this.f27174e = C9956a.m29461a();
        this.f27173d = 5;
    }
}
