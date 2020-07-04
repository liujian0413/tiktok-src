package com.bytedance.polaris.p634b;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import com.bytedance.common.utility.reflect.C6322b;

/* renamed from: com.bytedance.polaris.b.m */
public class C12362m {
    /* renamed from: a */
    public static int m35899a(Context context) {
        int c = m35902c(context);
        if (c == 0) {
            return 0;
        }
        if (c == 1) {
            return 1;
        }
        return -1;
    }

    /* renamed from: b */
    public static void m35901b(Context context) {
        if (context != null && !m35903d(context) && !m35904e(context)) {
            m35905f(context);
        }
    }

    /* renamed from: d */
    private static boolean m35903d(Context context) {
        try {
            Intent g = m35906g(context);
            if (m35900a(g, context)) {
                context.startActivity(g);
                return true;
            }
            Intent h = m35907h(context);
            if (!m35900a(h, context)) {
                return false;
            }
            context.startActivity(h);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m35905f(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            if (!m35900a(intent, context)) {
                return false;
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m35904e(Context context) {
        try {
            StringBuilder sb = new StringBuilder("package:");
            sb.append(context.getPackageName());
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString()));
            intent.addFlags(268435456);
            if (!m35900a(intent, context)) {
                return false;
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: g */
    private static Intent m35906g(Context context) {
        if (context == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.coloros.notificationmanager", "com.coloros.notificationmanager.AppDetailPreferenceActivity"));
        intent.putExtra("pkg_name", context.getPackageName());
        intent.putExtra("app_name", context.getResources().getString(context.getApplicationInfo().labelRes));
        intent.putExtra("class_name", C12362m.class.getName());
        intent.addFlags(268435456);
        return intent;
    }

    /* renamed from: h */
    private static Intent m35907h(Context context) {
        if (context == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.oppo.notification.center", "com.oppo.notification.center.AppDetailActivity"));
        intent.putExtra("pkg_name", context.getPackageName());
        intent.putExtra("app_name", context.getResources().getString(context.getApplicationInfo().labelRes));
        intent.putExtra("class_name", C12362m.class.getName());
        intent.addFlags(268435456);
        return intent;
    }

    /* renamed from: c */
    private static int m35902c(Context context) {
        if (context == null) {
            return -1;
        }
        if (VERSION.SDK_INT >= 24) {
            try {
                if (((Boolean) C6322b.m19610a((Object) (NotificationManager) context.getSystemService("notification")).mo15160b("areNotificationsEnabled").f18556a).booleanValue()) {
                    return 1;
                }
                return 0;
            } catch (Exception unused) {
            }
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
        } catch (Throwable unused2) {
            return -1;
        }
    }

    /* renamed from: a */
    private static boolean m35900a(Intent intent, Context context) {
        if (context == null || intent == null || context.getPackageManager().queryIntentActivities(intent, 65536).size() <= 0) {
            return false;
        }
        return true;
    }
}
