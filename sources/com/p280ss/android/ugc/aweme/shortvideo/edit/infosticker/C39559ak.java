package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.C0052o;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ak */
public final class C39559ak {

    /* renamed from: a */
    public static final C39559ak f102724a = new C39559ak();

    /* renamed from: b */
    private static int f102725b;

    /* renamed from: c */
    private static int f102726c = 100;

    /* renamed from: d */
    private static C0052o<Integer> f102727d = new C0052o<>();

    /* renamed from: e */
    private static C0052o<Integer> f102728e = new C0052o<>();

    private C39559ak() {
    }

    /* renamed from: a */
    public static C0052o<Integer> m126366a() {
        return f102727d;
    }

    /* renamed from: b */
    public static C0052o<Integer> m126368b() {
        return f102728e;
    }

    /* renamed from: d */
    public static int m126370d() {
        return f102726c;
    }

    /* renamed from: e */
    public static int m126371e() {
        return f102725b;
    }

    /* renamed from: c */
    public static int m126369c() {
        int i = f102725b + 1;
        f102725b = i;
        if (i > f102726c) {
            f102726c += 50;
            f102727d.setValue(Integer.valueOf(f102726c));
        }
        return f102725b;
    }

    /* renamed from: a */
    public static void m126367a(int i) {
        if (i != f102726c) {
            f102725b = Math.max(i, f102725b);
        }
    }
}
