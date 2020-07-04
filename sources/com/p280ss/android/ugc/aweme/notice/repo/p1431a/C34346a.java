package com.p280ss.android.ugc.aweme.notice.repo.p1431a;

import android.support.p022v4.content.C0683b;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.a.a */
public final class C34346a {
    /* renamed from: a */
    public static int m111061a() {
        if (m111062a("android.permission.READ_CONTACTS")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: b */
    public static int m111063b() {
        if (m111062a("android.permission.ACCESS_FINE_LOCATION") || m111062a("android.permission.ACCESS_COARSE_LOCATION")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    private static boolean m111062a(String str) {
        try {
            if (C0683b.m2909b(C6399b.m19921a(), str) == 0) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
