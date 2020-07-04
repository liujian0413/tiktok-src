package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.d */
public final class C31904d {
    /* renamed from: c */
    public static String m103635c(Context context) {
        return context.getApplicationInfo().processName;
    }

    /* renamed from: a */
    public static String m103633a(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m103634b(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }
}
