package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend;

import android.support.p022v4.content.C0683b;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.c */
public final class C31504c {
    /* renamed from: a */
    public static int m102445a() {
        if (m102446a("android.permission.READ_CONTACTS")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: b */
    public static int m102447b() {
        if (m102446a("android.permission.ACCESS_FINE_LOCATION") || m102446a("android.permission.ACCESS_COARSE_LOCATION")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    private static boolean m102446a(String str) {
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
