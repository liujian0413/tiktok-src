package com.toutiao.proxyserver;

import android.content.Context;
import com.toutiao.proxyserver.C46482g.C46492a;
import com.toutiao.proxyserver.p1840b.C46463c;
import com.toutiao.proxyserver.p1841c.C46468a;
import com.toutiao.proxyserver.p1841c.C46469b;
import com.toutiao.proxyserver.p1841c.C46470c;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.toutiao.proxyserver.r */
public final class C46534r {

    /* renamed from: A */
    private static long f119893A = 0;

    /* renamed from: a */
    static volatile C46480f f119894a = null;

    /* renamed from: b */
    static volatile C46482g f119895b = null;

    /* renamed from: c */
    public static volatile C46463c f119896c = null;

    /* renamed from: d */
    public static volatile String f119897d = null;

    /* renamed from: e */
    static volatile C46506n f119898e = null;

    /* renamed from: f */
    static volatile C46505m f119899f = null;

    /* renamed from: g */
    static volatile C46504l f119900g = null;

    /* renamed from: h */
    static volatile C46503k f119901h = null;

    /* renamed from: i */
    public static volatile boolean f119902i = false;

    /* renamed from: j */
    static volatile boolean f119903j = true;

    /* renamed from: k */
    public static int f119904k = 8192;

    /* renamed from: l */
    public static int f119905l = 10;

    /* renamed from: m */
    public static volatile boolean f119906m = true;

    /* renamed from: n */
    public static boolean f119907n = false;

    /* renamed from: o */
    public static boolean f119908o = true;

    /* renamed from: p */
    public static boolean f119909p = false;

    /* renamed from: q */
    public static boolean f119910q = true;

    /* renamed from: r */
    public static boolean f119911r = false;

    /* renamed from: s */
    static volatile boolean f119912s = false;

    /* renamed from: t */
    static volatile int f119913t = 0;

    /* renamed from: u */
    static volatile C46469b f119914u = null;

    /* renamed from: v */
    public static volatile boolean f119915v = true;

    /* renamed from: w */
    public static boolean f119916w = false;

    /* renamed from: x */
    public static boolean f119917x = false;

    /* renamed from: y */
    public static volatile boolean f119918y = true;

    /* renamed from: z */
    private static volatile Context f119919z;

    /* renamed from: a */
    public static Context m146257a() {
        return f119919z;
    }

    /* renamed from: b */
    public static C46506n m146269b() {
        return f119898e;
    }

    /* renamed from: e */
    public static C46482g m146273e() {
        return f119895b;
    }

    /* renamed from: f */
    public static C46480f m146274f() {
        return f119894a;
    }

    /* renamed from: g */
    public static C46463c m146275g() {
        return f119896c;
    }

    /* renamed from: a */
    public static void m146267a(C46506n nVar) {
        f119898e = nVar;
    }

    /* renamed from: a */
    public static void m146268a(boolean z) {
        f119903j = z;
    }

    /* renamed from: d */
    public static synchronized long m146272d() {
        long j;
        synchronized (C46534r.class) {
            j = f119893A;
        }
        return j;
    }

    /* renamed from: c */
    public static synchronized long m146271c() {
        long j;
        synchronized (C46534r.class) {
            j = 1;
            if (f119893A < Long.MAX_VALUE) {
                j = 1 + f119893A;
            }
            f119893A = j;
        }
        return j;
    }

    /* renamed from: a */
    public static void m146258a(int i) {
        f119913t = 1;
    }

    /* renamed from: b */
    public static void m146270b(boolean z) {
        f119912s = z;
    }

    /* renamed from: a */
    public static void m146261a(C46468a aVar) {
        C46470c.m146082a(aVar);
    }

    /* renamed from: a */
    public static void m146262a(C46469b bVar) {
        f119914u = bVar;
    }

    /* renamed from: a */
    public static void m146264a(C46503k kVar) {
        f119901h = kVar;
    }

    /* renamed from: a */
    public static void m146265a(C46504l lVar) {
        f119900g = lVar;
    }

    /* renamed from: a */
    public static void m146266a(C46505m mVar) {
        f119899f = mVar;
    }

    /* renamed from: a */
    public static void m146259a(int i, String str) {
        if (f119901h != null) {
            f119901h.mo105060a(i, str);
        }
    }

    /* renamed from: a */
    public static void m146263a(C46482g gVar, Context context) {
        if (gVar == null || context == null) {
            throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
        }
        f119919z = context.getApplicationContext();
        if (f119895b == null) {
            C46480f fVar = f119894a;
            if (fVar == null || !fVar.f119761a.getAbsolutePath().equals(gVar.f119763a.getAbsolutePath())) {
                f119895b = gVar;
                f119896c = C46463c.m146065a(context);
                f119895b.mo115613a((C46492a) new C46492a() {
                    /* renamed from: a */
                    public final void mo115626a(String str) {
                        StringBuilder sb = new StringBuilder("new cache created: ");
                        sb.append(str);
                        C46470c.m146085b("TAG_PROXY_DiskLruCache", sb.toString());
                    }

                    /* renamed from: a */
                    public final void mo115627a(Set<String> set) {
                        C46534r.f119896c.mo115587a((Collection<String>) set, 0);
                        StringBuilder sb = new StringBuilder("cache file removed, ");
                        sb.append(set);
                        C46470c.m146085b("TAG_PROXY_DiskLruCache", sb.toString());
                        if (set != null) {
                            for (String c : set) {
                                C46456aa.m146053a().mo115582c(c);
                            }
                        }
                    }
                });
                C46536s a = C46536s.m146278a();
                a.f119926g = gVar;
                a.f119925f = f119896c;
                C46522q a2 = C46522q.m146227a();
                a2.f119864d = gVar;
                a2.f119863c = f119896c;
                return;
            }
            throw new IllegalArgumentException("DiskLruCache 和 DiskCache 不能使用相同的目录");
        }
    }

    /* renamed from: a */
    public static void m146260a(int i, String str, String str2) {
        if (f119900g != null) {
            f119900g.mo105059a(i, str, str2);
        }
    }
}
