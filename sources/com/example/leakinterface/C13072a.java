package com.example.leakinterface;

import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;

/* renamed from: com.example.leakinterface.a */
public final class C13072a {

    /* renamed from: a */
    public static final C13072a f34608a = new C13072a();

    /* renamed from: b */
    private static boolean f34609b;

    /* renamed from: c */
    private static int f34610c = VETransitionFilterParam.TransitionDuration_DEFAULT;

    /* renamed from: d */
    private static int f34611d = 20;

    /* renamed from: e */
    private static long f34612e = 60000;

    private C13072a() {
    }

    /* renamed from: a */
    public static boolean m38218a() {
        return f34609b;
    }

    /* renamed from: a */
    public static void m38215a(int i) {
        f34610c = i;
    }

    /* renamed from: b */
    public static void m38219b(int i) {
        f34611d = i;
    }

    /* renamed from: a */
    public static void m38216a(long j) {
        f34612e = j;
    }

    /* renamed from: a */
    public static void m38217a(boolean z) {
        f34609b = z;
    }
}
