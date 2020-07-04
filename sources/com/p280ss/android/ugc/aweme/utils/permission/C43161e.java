package com.p280ss.android.ugc.aweme.utils.permission;

import android.support.p022v4.content.C0683b;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.utils.permission.e */
public final class C43161e {
    /* renamed from: a */
    public static int m136882a() {
        if (m136883a("android.permission.READ_CONTACTS")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: b */
    public static int m136884b() {
        if (m136883a("android.permission.ACCESS_FINE_LOCATION") || m136883a("android.permission.ACCESS_COARSE_LOCATION")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    private static boolean m136883a(String str) {
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
