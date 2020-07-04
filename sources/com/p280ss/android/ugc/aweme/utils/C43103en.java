package com.p280ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41553g;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.utils.en */
public final class C43103en {
    /* renamed from: a */
    public static boolean m136722a() {
        if (!Build.MANUFACTURER.equalsIgnoreCase("samsung") || !m136723a(21, 22)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m136721a(Activity activity) {
        Field a = C41553g.m132327a(activity, "mStartedActivity");
        if (a != null) {
            try {
                a.setAccessible(true);
                a.set(activity, Boolean.valueOf(true));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static boolean m136723a(int i, int i2) {
        if (VERSION.SDK_INT < 21 || VERSION.SDK_INT > 22) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static synchronized PackageInfo m136720a(Context context, String str) {
        PackageInfo packageInfo;
        synchronized (C43103en.class) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str, 1);
            } catch (Exception unused) {
                packageInfo = null;
            }
        }
        return packageInfo;
    }
}
