package com.p280ss.android.ugc.awemepushlib.p1713b;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.awemepushlib.b.b */
public final class C43591b {

    /* renamed from: a */
    private static int f112831a = -1;

    /* renamed from: b */
    private static int f112832b = -1;

    /* renamed from: c */
    private static final Pattern f112833c = Pattern.compile("^0-([\\d]+)$");

    /* renamed from: a */
    public static boolean m138134a() {
        if (TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "oppo")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m138135a(Context context) {
        if (VERSION.SDK_INT < 19) {
            return true;
        }
        if (VERSION.SDK_INT >= 23) {
            try {
                return Settings.canDrawOverlays(context);
            } catch (Throwable unused) {
            }
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            if (((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(AppOpsManager.class.getField("OP_SYSTEM_ALERT_WINDOW").getInt(null)), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName()})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }
}
