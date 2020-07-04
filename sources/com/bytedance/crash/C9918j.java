package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import com.bytedance.crash.p501j.C9919a;
import com.bytedance.crash.p501j.C9938b;
import com.bytedance.crash.p501j.C9960j;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.crash.j */
public final class C9918j {

    /* renamed from: a */
    private static Context f27054a = null;

    /* renamed from: b */
    private static Application f27055b = null;

    /* renamed from: c */
    private static long f27056c = 0;

    /* renamed from: d */
    private static String f27057d = "default";

    /* renamed from: e */
    private static boolean f27058e;

    /* renamed from: f */
    private static C9919a f27059f;

    /* renamed from: g */
    private static C9938b f27060g = new C9938b();

    /* renamed from: h */
    private static C9854b f27061h = new C9854b();

    /* renamed from: i */
    private static volatile ConcurrentHashMap<Integer, String> f27062i;

    /* renamed from: j */
    private static C9960j f27063j = null;

    /* renamed from: k */
    private static volatile String f27064k = null;

    /* renamed from: l */
    private static Object f27065l = new Object();

    /* renamed from: m */
    private static volatile int f27066m = 0;

    /* renamed from: n */
    private static volatile String f27067n;

    /* renamed from: o */
    private static int f27068o = 0;

    /* renamed from: a */
    public static C9919a m29332a() {
        return f27059f;
    }

    /* renamed from: b */
    public static C9854b m29337b() {
        return f27061h;
    }

    /* renamed from: g */
    public static Context m29342g() {
        return f27054a;
    }

    /* renamed from: h */
    public static Application m29343h() {
        return f27055b;
    }

    /* renamed from: i */
    public static C9938b m29344i() {
        return f27060g;
    }

    /* renamed from: j */
    public static long m29345j() {
        return f27056c;
    }

    /* renamed from: k */
    public static String m29346k() {
        return f27057d;
    }

    /* renamed from: l */
    public static int m29347l() {
        return f27068o;
    }

    /* renamed from: m */
    public static boolean m29348m() {
        return f27058e;
    }

    /* renamed from: n */
    public static ConcurrentHashMap<Integer, String> m29349n() {
        return f27062i;
    }

    /* renamed from: o */
    public static int m29350o() {
        return f27066m;
    }

    /* renamed from: p */
    public static String m29351p() {
        return f27067n;
    }

    /* renamed from: c */
    public static C9960j m29338c() {
        if (f27063j == null) {
            synchronized (C9918j.class) {
                f27063j = new C9960j(f27054a);
            }
        }
        return f27063j;
    }

    /* renamed from: d */
    public static boolean m29339d() {
        if (!m29344i().f27126l || !m29352q().contains("local_test")) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private static String m29352q() {
        Object obj = m29332a().mo24525a().get("channel");
        if (obj == null) {
            return "unknown";
        }
        return String.valueOf(obj);
    }

    /* renamed from: e */
    public static String m29340e() {
        StringBuilder sb = new StringBuilder();
        sb.append(m29341f());
        sb.append('_');
        sb.append(Long.toHexString(new Random().nextLong()));
        return sb.toString();
    }

    /* renamed from: f */
    public static String m29341f() {
        if (f27064k == null) {
            synchronized (f27065l) {
                if (f27064k == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Long.toHexString(new Random().nextLong()));
                    sb.append("U");
                    f27064k = sb.toString();
                }
            }
        }
        return f27064k;
    }

    /* renamed from: a */
    static void m29336a(boolean z) {
        f27058e = true;
    }

    /* renamed from: a */
    static void m29334a(int i, String str) {
        f27066m = i;
        f27067n = str;
    }

    /* renamed from: a */
    public static String m29333a(long j, CrashType crashType) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("_");
        sb.append(crashType.getName());
        sb.append('_');
        sb.append(m29341f());
        sb.append('_');
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append("U");
        return sb.toString();
    }

    /* renamed from: a */
    static void m29335a(Application application, Context context, C9895f fVar) {
        f27056c = System.currentTimeMillis();
        f27054a = context;
        f27055b = application;
        f27059f = new C9919a(f27054a, fVar);
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append("U");
        f27064k = sb.toString();
    }
}
