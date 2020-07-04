package com.p280ss.android.p817ad.splash.p836g;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.g.m */
public final class C19136m {
    /* renamed from: a */
    public static String m62743a(String str) {
        String str2 = "";
        if (C19132j.m62736a(str)) {
            return str2;
        }
        try {
            return new String(Base64.decode(str, 0), "utf-8");
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public static boolean m62744a(Context context, Intent intent) {
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }
}
