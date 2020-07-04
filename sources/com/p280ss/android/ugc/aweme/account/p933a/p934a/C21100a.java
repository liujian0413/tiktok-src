package com.p280ss.android.ugc.aweme.account.p933a.p934a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.account.a.a.a */
public final class C21100a {
    /* renamed from: a */
    private static boolean m71155a() {
        if (!TextUtils.equals("vivo", Build.BRAND.toLowerCase())) {
            return false;
        }
        try {
            Class cls = Class.forName("android.util.FtFeature");
            return ((Boolean) cls.getDeclaredMethod("isFeatureSupport", new Class[]{Integer.TYPE}).invoke(cls, new Object[]{Integer.valueOf(32)})).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m71156a(Context context) {
        if (m71157b(context) || m71155a() || m71158c(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m71157b(Context context) {
        if (TextUtils.equals("oppo", Build.BRAND.toLowerCase())) {
            return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m71158c(Context context) {
        if (!TextUtils.equals("huawei", Build.BRAND.toLowerCase())) {
            return false;
        }
        try {
            Class loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | Exception | NoSuchMethodException unused) {
            return false;
        }
    }
}
