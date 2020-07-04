package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.ugc.aweme.account.C6861a;

/* renamed from: com.ss.android.ugc.aweme.utils.ez */
public final class C43115ez {

    /* renamed from: a */
    private static long f111739a;

    /* renamed from: a */
    public static boolean m136743a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!C6861a.m21337f().isLogin() || currentTimeMillis - f111739a < 300000) {
            return false;
        }
        f111739a = currentTimeMillis;
        return true;
    }
}
