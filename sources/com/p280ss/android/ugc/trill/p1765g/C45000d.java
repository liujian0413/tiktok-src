package com.p280ss.android.ugc.trill.p1765g;

import com.p280ss.android.ugc.trill.app.TrillApplication;

/* renamed from: com.ss.android.ugc.trill.g.d */
public final class C45000d {

    /* renamed from: a */
    public int f115670a;

    /* renamed from: com.ss.android.ugc.trill.g.d$a */
    static class C45002a {

        /* renamed from: a */
        public static C45000d f115671a = new C45000d();
    }

    /* renamed from: a */
    public static C45000d m141977a() {
        return C45002a.f115671a;
    }

    private C45000d() {
        this.f115670a = m141978b();
    }

    /* renamed from: b */
    private static int m141978b() {
        int i = 0;
        try {
            if (TrillApplication.m21341a().getPackageManager().getPackageInfo("com.tencent.mm", 0) != null) {
                i = 1;
            }
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }
}
