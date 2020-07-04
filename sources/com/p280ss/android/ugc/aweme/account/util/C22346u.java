package com.p280ss.android.ugc.aweme.account.util;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: com.ss.android.ugc.aweme.account.util.u */
public final class C22346u {
    /* renamed from: a */
    public static synchronized PackageInfo m73992a(Context context, String str) {
        PackageInfo packageInfo;
        synchronized (C22346u.class) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str, 1);
            } catch (Exception unused) {
                packageInfo = null;
            }
        }
        return packageInfo;
    }
}
