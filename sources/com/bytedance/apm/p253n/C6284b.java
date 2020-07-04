package com.bytedance.apm.p253n;

import com.bytedance.apm.C6174c;

/* renamed from: com.bytedance.apm.n.b */
public final class C6284b {

    /* renamed from: a */
    private static C9636e f18512a = null;

    /* renamed from: b */
    private static boolean f18513b = false;

    /* renamed from: c */
    private static long f18514c = 30000;

    /* renamed from: d */
    private static int f18515d;

    /* renamed from: b */
    public static void m19500b() {
        if (f18512a != null) {
            f18512a.mo23992b();
            f18512a = null;
        }
    }

    /* renamed from: a */
    public static void m19495a() {
        f18513b = true;
        C9636e eVar = new C9636e("start_trace", "launch_stats");
        f18512a = eVar;
        eVar.mo23989a();
        C6174c.m19144c(System.currentTimeMillis());
    }

    /* renamed from: c */
    public static boolean m19502c() {
        if ((f18515d & 1) == 0 || C6174c.m19155m() == 0 || System.currentTimeMillis() - C6174c.m19155m() > f18514c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m19496a(int i) {
        f18515d = i;
    }

    /* renamed from: a */
    public static void m19498a(long j) {
        f18514c = j;
    }

    /* renamed from: b */
    public static void m19501b(String str, String str2) {
        if (f18512a != null) {
            f18512a.mo23994b(str, str2);
        }
    }

    /* renamed from: a */
    public static void m19499a(String str, String str2) {
        if (f18512a != null) {
            f18512a.mo23991a(str, str2);
        }
    }

    /* renamed from: a */
    public static void m19497a(int i, String str, long j) {
        if (f18512a != null) {
            f18512a.mo23990a(i, str, j);
        }
    }
}
