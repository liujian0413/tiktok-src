package com.p280ss.android.ugc.aweme.utils;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p022v4.app.C0581aa;
import com.bytedance.common.utility.reflect.C6322b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.cw */
public class C43033cw {
    /* renamed from: b */
    public static void m136552b(Context context) {
        if (context != null && !m136555e(context)) {
            m136556f(context);
        }
    }

    /* renamed from: c */
    private static int m136553c(Context context) {
        int d = m136554d(context);
        if (d == 0) {
            return 0;
        }
        if (d == 1) {
            return 1;
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m136550a(Context context) {
        try {
            if (VERSION.SDK_INT > 19) {
                return C0581aa.m2444a(context).mo2561a();
            }
            if (m136553c(context) == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m136556f(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            if (!m136551a(intent, context)) {
                return false;
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m136555e(Context context) {
        try {
            StringBuilder sb = new StringBuilder("package:");
            sb.append(context.getPackageName());
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString()));
            intent.addFlags(268435456);
            if (!m136551a(intent, context)) {
                return false;
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static int m136554d(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            C6322b a = C6322b.m19610a((Object) appOpsManager);
            if (((Integer) a.mo15158a("checkOpNoThrow", (Class<?>[]) new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Integer.valueOf(((Integer) a.mo15161b("OP_POST_NOTIFICATION", Integer.TYPE).f18556a).intValue()), Integer.valueOf(i), packageName).f18556a).intValue() == 0) {
                return 1;
            }
            return 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static boolean m136551a(Intent intent, Context context) {
        if (context == null) {
            return false;
        }
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }
}
